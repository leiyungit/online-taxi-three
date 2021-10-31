# 项目创建

### 1、使用maven创建父工程：online-taxi-three

​			删除src

### 2、使用SpringBoot创建 cloud-eureka

​			选择：Lombox; Eureka Server

### 创建项目慢，切换：https://start.aliyun.com

### 3、使用springboot创建：api-passenger

​			选择：Lombox；Eureka Client；Spring Web

## 客户端配置注册中心时，需要随机把server的url打乱
    ```
    eureka:
  client:
    service-url:
      defaultZone: http://localhost:7900/eureka/
   ```
   
