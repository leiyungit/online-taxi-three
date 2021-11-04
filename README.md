# 项目创建

### 1、使用maven创建父工程：online-taxi-three

​			删除src

### 2、使用SpringBoot创建 cloud-eureka

​			选择：Lombok; Eureka Server

### 创建项目慢，切换：https://start.aliyun.com

### 3、使用springboot创建：api-passenger

​			选择：Lombok；Eureka Client；Spring Web

## 客户端配置注册中心时，需要随机把server的url打乱
   ````java
    eureka:
      client:
        service-url:
          defaultZone: http://localhost:7900/eureka/
   ````



| 项目   | module                    | 依赖                              |
| ------ | ------------------------- | --------------------------------- |
| 公共   | internal-common           | lombok                            |
| 验证码 | service-verification-code | eureka-client，lombok，web，redis |
| 短信   | service-sms               | eureka-client，lombok，web        |





验证码服务接口

| 接口       | url                                                    |
| ---------- | ------------------------------------------------------ |
| 生成验证码 | http://localhost:9001/verify-code/generate/1/123456789 |

