-- 建库
CREATE DATABASE  `online-taxi-three` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE `online-taxi-three`;
-- ----------------------------
-- Table structure for tbl_passenger_info
-- ----------------------------
DROP TABLE IF EXISTS `service_passenger_user_info`;
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
) ENGINE=INNODB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- 短信发送记录
DROP TABLE IF EXISTS `service_sms_record`;
CREATE TABLE `service_sms_record` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `phone_number` VARCHAR(16) NOT NULL DEFAULT '' COMMENT '乘客手机号',
  `sms_content` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '短信内容',
  `send_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '发送时间',
  `operator_name` VARCHAR(16) NOT NULL DEFAULT '' COMMENT '操作人',
  `send_flag` TINYINT(1) UNSIGNED NOT NULL DEFAULT '1' COMMENT '发送状态：1：成功，0：失效',
  `send_number` INT NOT NULL DEFAULT '0' COMMENT '发送失败次数',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uqe_phone_number` (`phone_number`,`sms_content`)
) ENGINE=INNODB AUTO_INCREMENT=202 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- 短信模板
DROP TABLE IF EXISTS `service_sms_template`;
CREATE TABLE `service_sms_template` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `template_id` VARCHAR(16) NOT NULL DEFAULT '' COMMENT '短信模板ID',
  `template_name` VARCHAR(128) DEFAULT NULL COMMENT '模板名称',
  `template_content` VARCHAR(512) NOT NULL DEFAULT '' COMMENT '模板内容',
  `template_type` TINYINT(1) NOT NULL DEFAULT '3' COMMENT '模板类型（1：营销；2：通知；3：订单）',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uqe_template_id` (`template_id`)
) ENGINE=INNODB AUTO_INCREMENT=202 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

INSERT INTO `service_sms_template` VALUES ('5', 'SMS_144145499', '登录验证码', '手机验证码：${code}，10分钟内有效。如非本人操作，请忽略。', '3', '2018-09-07 15:00:11', '2018-09-12 13:24:14');


SELECT * FROM service_passenger_user_info;
SELECT * FROM service_sms_template;

SELECT
        id, register_date, passenger_phone, passenger_name, passenger_gender, user_state,
        create_time, update_time
        FROM service_passenger_user_info
    WHERE passenger_phone
