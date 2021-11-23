package com.msb.testmybatis.contorller;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/cache")
public class CacheController {
    /**
     * redis guava
     */
    LoadingCache<String,String> cache = CacheBuilder.newBuilder()
            .expireAfterWrite(15, TimeUnit.SECONDS)
            .build(new CacheLoader<String, String>() {
                @Override
                public String load(String s) throws Exception {
                    return "load:"+new Random().nextInt(100);
                }
            });

    @RequestMapping("/test-set/{id}")
    public String testSet(@PathVariable("id") String id){
        cache.put(id,"set:"+new Random().nextInt(100));
        return "success";
    }

    @GetMapping("/test-get/{id}")
    public String testGet(@PathVariable("id") String id){
        String value = null;
        try {
            value = cache.get(id).toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return value;
    }
}
