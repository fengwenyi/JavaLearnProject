/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : learn

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 24/06/2018 17:47:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_enum
-- ----------------------------
DROP TABLE IF EXISTS `t_enum`;
CREATE TABLE `t_enum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of t_enum
-- ----------------------------
BEGIN;
INSERT INTO `t_enum` VALUES (1, 200);
INSERT INTO `t_enum` VALUES (2, 200);
INSERT INTO `t_enum` VALUES (3, 100);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
