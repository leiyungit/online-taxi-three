package com.msb.serviceverificationcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class ServiceVerificationCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceVerificationCodeApplication.class, args);
	}

    @GetMapping("/test")
    public Integer test(){
        return new Random().nextInt(100);
    }
}
