-- 建库
CREATE DATABASE  `online-taxi-three` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE `online-taxi-three`;
-- ----------------------------
-- Table structure for tbl_passenger_info
-- ----------------------------
DROP TABLE IF EXISTS `passenger_user_info`;
CREATE TABLE `service_passenger_user_info` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `register_date` DATE DEFAULT NULL COMMENT '注册日期',
  `passenger_phone` VARCHAR(16) NOT NULL DEFAULT '' COMMENT '乘客手机号',
  `passenger_name` VARCHAR(16) NOT NULL DEFAULT '' COMMENT '乘客名称',
  `passenger_gender` TINYINT(2) UNSIGNED NOT NULL DEFAULT '1' COMMENT '0：女，1：男',
  `user_state` TINYINT(2) UNSIGNED NOT NULL DEFAULT '1' COMMENT '用户状态：1：有效，0：失效',
  `last_login_method` TINYINT(3) UNSIGNED NOT NULL DEFAULT '0' COMMENT '上次登陆方式:1,验证码,2密码',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uqe_passenger_phone` (`passenger_phone`)
) ENGINE=INNODB AUTO_INCREMENT=222 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


SELECT * FROM service_passenger_user_info;

SELECT
        id, register_date, passenger_phone, passenger_name, passenger_gender, user_state,
        create_time, update_time
        FROM service_passenger_user_info
    WHERE passenger_phone
