package com.msb.serviceverificationcode.service.impl;

import com.msb.internalcommon.constant.CommonStatusEnum;
import com.msb.internalcommon.constant.IdentityConstant;
import com.msb.internalcommon.constant.RedisKeyPrefixConstant;
import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.serviceverificationcode.response.VerifyCodeResponse;
import com.msb.serviceverificationcode.service.VerifyCodeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class VerifyCodeServiceImpl implements VerifyCodeService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;


    /**
     * 根据身份和手机号 生成6位数验证码
     *
     * @param identity
     * @param phoneNumber
     * @return
     */
    @Override
    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber) {
        // 校验 三挡验证。乌云 安全检测。业务方控制，不能无限制发短信。
        // redis，1分钟3次，5分钟不发，1小时10次24小时内不发，不同验证码错误
        String code = String.valueOf((int) ((Math.random() * 9 + 1) * Math.pow(10, 5)));

        // 生成redis key
        String keyPre = generateKeyPreByIdentity(identity);
        String key = keyPre+phoneNumber;
        //存redis，2分钟过期
        BoundValueOperations<String, String> codeRedis = redisTemplate.boundValueOps(key);
        codeRedis.set(code,30, TimeUnit.MINUTES);
        // 返回
        VerifyCodeResponse data = new VerifyCodeResponse();
        data.setCode(code);
        return ResponseResult.success(data);
    }

    /**
     * 用户 传进里来的验证码 和 redis 中 验证码 一直 ，校验通过，否则不过。
     * @param identity
     * @param phoneNumber
     * @param code
     * @return
     */
    public ResponseResult verify(int identity,String phoneNumber,String code){
        // 生成redis key
        String keyPre = generateKeyPreByIdentity(identity);
        String key = keyPre + phoneNumber;
        BoundValueOperations<String, String> codeRedis = redisTemplate.boundValueOps(key);
        String redisCode = codeRedis.get();

        if(StringUtils.isNotBlank(code)
                && StringUtils.isNotBlank(redisCode)
                && code.trim().equals(redisCode.trim())) {
            return ResponseResult.success("");
        }else {
            return ResponseResult.fail(CommonStatusEnum.VERIFY_CODE_ERROR.getCode(), CommonStatusEnum.VERIFY_CODE_ERROR.getValue());
        }
    }

    /**
     * 根据身份类型生成对应的缓存key
     * @param identity
     * @return
     */
    private String generateKeyPreByIdentity(int identity){
        String keyPre="";
        if(identity == IdentityConstant.PASSENGER){
            keyPre = RedisKeyPrefixConstant.PASSENGER_LOGIN_CODE_KEY_PRE;
        }else if(identity == IdentityConstant.DRIVER){
            keyPre = RedisKeyPrefixConstant.DRIVER_LOGIN_CODE_KEY_PRE;
        }
        return keyPre;
    }

    /*public static void main(String[] args) {

        int sum = 10_0000;
        String code;
        System.out.println(Math.random());
        System.out.println(Math.pow(10,5));
        *//*long start = System.currentTimeMillis();
        for (int i = 0; i < sum; i++) {
            code = new Random().nextInt(1000_000)+"";
            if(code.length()<6){
                // System.out.println(code);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("nextInt 耗时：" + (end - start));*//*

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < sum; i++) {
            code = (Math.random()+"").substring(2,8);
            if(code.length()<6){
                System.out.println(code);
            }
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Math.random 耗时：" + (end1 - start1));

        start1 = System.currentTimeMillis();
        for (int i = 0; i < sum; i++) {
            code = String.valueOf((int)((Math.random()*9+1)*Math.pow(10,5)));
            if(code.length()!=6){
                System.out.println(code);
            }
        }

        end1 = System.currentTimeMillis();
        System.out.println("Math.pow 耗时：" + (end1 - start1));
        System.out.println(code = String.valueOf((int)((Math.random()*9+1)*Math.pow(10,5))));
    }*/

    /**
     * 估算线程数
     * 16核 应该开几个线程。
     *  线程数 = cpu 可用核数 / 1-阻塞系数（io密集型接近1， 计算密集型 接近0）
     *
     *  提升QPS：
     *  提高并发数
     *      1、能用多线程用多线程
     *      2、增加各种连接数：tomcat，mysql，redis等待
     *      3、服务无状态，便于横向扩展，扩机器
     *      4、让服务能力对等（serviceUrl：打乱顺序）
     *  减少响应时间。
     *      1、异步（最终一致性，不需要及时返回的），流量削峰
     *      2、缓存（减少db读取，减少磁盘IO，读多写少的）
     *      3、数据库优化
     *      4、多的数据，分批次返回
     *      5、微服务中减少调用链
     *      6、需要实时获得的，尽量用长连接（websocket，sse,netty），不要轮询
     *
     */
}
