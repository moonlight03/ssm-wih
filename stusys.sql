/*
 Navicat Premium Data Transfer

 Source Server         : mysql1
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : stusys

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 07/01/2020 19:17:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `classid` varchar(11) COLLATE utf8_bin NOT NULL,
  `classname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`classid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT COMMENT='班级信息表';

-- ----------------------------
-- Records of class
-- ----------------------------
BEGIN;
INSERT INTO `class` VALUES ('001', 'java 1 班');
INSERT INTO `class` VALUES ('002', 'java 2 班');
INSERT INTO `class` VALUES ('003', 'java 3 班');
COMMIT;

-- ----------------------------
-- Table structure for jobdemand
-- ----------------------------
DROP TABLE IF EXISTS `jobdemand`;
CREATE TABLE `jobdemand` (
  `jid` varchar(255) COLLATE utf8_bin NOT NULL,
  `context` varchar(500) COLLATE utf8_bin DEFAULT NULL,
  `deadline` date DEFAULT NULL,
  `jobtype` int(10) DEFAULT '0',
  PRIMARY KEY (`jid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='作业要求表';

-- ----------------------------
-- Records of jobdemand
-- ----------------------------
BEGIN;
INSERT INTO `jobdemand` VALUES ('1577945778861', '高数积分题', '2020-01-02', 2);
INSERT INTO `jobdemand` VALUES ('1578050364074', '英语阅读题', '2020-01-03', 2);
COMMIT;

-- ----------------------------
-- Table structure for jobrecord
-- ----------------------------
DROP TABLE IF EXISTS `jobrecord`;
CREATE TABLE `jobrecord` (
  `jreid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'job record id',
  `jid` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `tid` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `cid` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`jreid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='教师班级作业对应表';

-- ----------------------------
-- Records of jobrecord
-- ----------------------------
BEGIN;
INSERT INTO `jobrecord` VALUES (15, '1577945778861', '123456', '001');
INSERT INTO `jobrecord` VALUES (16, '1577945778861', '123456', '002');
INSERT INTO `jobrecord` VALUES (17, '1578050364074', '123456', '001');
INSERT INTO `jobrecord` VALUES (18, '1578050364074', '123456', '002');
COMMIT;

-- ----------------------------
-- Table structure for sjrecord
-- ----------------------------
DROP TABLE IF EXISTS `sjrecord`;
CREATE TABLE `sjrecord` (
  `jsrid` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `jid` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `status` int(10) DEFAULT NULL,
  `path` varchar(500) COLLATE utf8_bin DEFAULT '',
  `sid` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `score` int(11) DEFAULT '0',
  PRIMARY KEY (`jsrid`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='学生作业记录表';

-- ----------------------------
-- Records of sjrecord
-- ----------------------------
BEGIN;
INSERT INTO `sjrecord` VALUES (59, '李祥', '1577945778861', 2, '/image/418dcc74-e1a5-4440-a000-77544bd00130.jpg', '2016000', 77);
INSERT INTO `sjrecord` VALUES (60, '李祥', '1577945778861', 2, '', '201606', 44);
INSERT INTO `sjrecord` VALUES (61, '李祥', '1577945778861', 2, '', '201607', 55);
INSERT INTO `sjrecord` VALUES (62, '李祥', '1577945778861', 2, '', '201610', 66);
INSERT INTO `sjrecord` VALUES (63, '李祥', '1577945778861', 2, '', '201611', 66);
INSERT INTO `sjrecord` VALUES (64, '李祥', '1577945778861', 0, '', '201613', 0);
INSERT INTO `sjrecord` VALUES (65, '李祥', '1577945778861', 0, '', '201614', 0);
INSERT INTO `sjrecord` VALUES (66, '李祥', '1577945778861', 0, '', '201616', 0);
INSERT INTO `sjrecord` VALUES (67, '李祥', '1577945778861', 0, '', '201618', 0);
INSERT INTO `sjrecord` VALUES (68, '李祥', '1577945778861', 0, '', '201619', 0);
INSERT INTO `sjrecord` VALUES (69, '李祥', '1577945778861', 0, '', '2016207311', 0);
INSERT INTO `sjrecord` VALUES (70, '李祥', '1577945778861', 0, '', '201621', 0);
INSERT INTO `sjrecord` VALUES (71, '李祥', '1577945778861', 0, '', '201623', 0);
INSERT INTO `sjrecord` VALUES (72, '李祥', '1577945778861', 0, '', '201625', 0);
INSERT INTO `sjrecord` VALUES (73, '李祥', '1577945778861', 0, '', '201628', 0);
INSERT INTO `sjrecord` VALUES (74, '李祥', '1577945778861', 0, '', '201629', 0);
INSERT INTO `sjrecord` VALUES (75, '李祥', '1577945778861', 0, '', '2916207314', 0);
INSERT INTO `sjrecord` VALUES (76, '李祥', '1577945778861', 0, '', '8765444', 0);
INSERT INTO `sjrecord` VALUES (77, '李祥', '1577945778861', 1, '', '201603', 1);
INSERT INTO `sjrecord` VALUES (78, '李祥', '1577945778861', 1, '', '201604', 55);
INSERT INTO `sjrecord` VALUES (79, '李祥', '1577945778861', 0, '', '201605', 0);
INSERT INTO `sjrecord` VALUES (80, '李祥', '1577945778861', 0, '', '201609', 0);
INSERT INTO `sjrecord` VALUES (81, '李祥', '1577945778861', 0, '', '201612', 0);
INSERT INTO `sjrecord` VALUES (82, '李祥', '1577945778861', 0, '', '201615', 0);
INSERT INTO `sjrecord` VALUES (83, '李祥', '1577945778861', 0, '', '201617', 0);
INSERT INTO `sjrecord` VALUES (84, '李祥', '1577945778861', 0, '', '201620', 0);
INSERT INTO `sjrecord` VALUES (85, '李祥', '1577945778861', 0, '', '201622', 0);
INSERT INTO `sjrecord` VALUES (86, '李祥', '1577945778861', 0, '', '201624', 0);
INSERT INTO `sjrecord` VALUES (87, '李祥', '1577945778861', 0, '', '201627', 0);
INSERT INTO `sjrecord` VALUES (88, '李祥', '1578050364074', 1, '/image/0fde32e0-ca5b-40d8-80c3-d08c4b144b94.jpg', '2016000', 0);
INSERT INTO `sjrecord` VALUES (89, '李祥', '1578050364074', 0, '', '201606', 0);
INSERT INTO `sjrecord` VALUES (90, '李祥', '1578050364074', 0, '', '201607', 0);
INSERT INTO `sjrecord` VALUES (91, '李祥', '1578050364074', 0, '', '201610', 0);
INSERT INTO `sjrecord` VALUES (92, '李祥', '1578050364074', 0, '', '201611', 0);
INSERT INTO `sjrecord` VALUES (93, '李祥', '1578050364074', 0, '', '201613', 0);
INSERT INTO `sjrecord` VALUES (94, '李祥', '1578050364074', 0, '', '201614', 0);
INSERT INTO `sjrecord` VALUES (95, '李祥', '1578050364074', 0, '', '201616', 0);
INSERT INTO `sjrecord` VALUES (96, '李祥', '1578050364074', 0, '', '201618', 0);
INSERT INTO `sjrecord` VALUES (97, '李祥', '1578050364074', 0, '', '201619', 0);
INSERT INTO `sjrecord` VALUES (98, '李祥', '1578050364074', 0, '', '2016207311', 0);
INSERT INTO `sjrecord` VALUES (99, '李祥', '1578050364074', 0, '', '201621', 0);
INSERT INTO `sjrecord` VALUES (100, '李祥', '1578050364074', 0, '', '201623', 0);
INSERT INTO `sjrecord` VALUES (101, '李祥', '1578050364074', 0, '', '201625', 0);
INSERT INTO `sjrecord` VALUES (102, '李祥', '1578050364074', 0, '', '201628', 0);
INSERT INTO `sjrecord` VALUES (103, '李祥', '1578050364074', 0, '', '201629', 0);
INSERT INTO `sjrecord` VALUES (104, '李祥', '1578050364074', 0, '', '2916207314', 0);
INSERT INTO `sjrecord` VALUES (105, '李祥', '1578050364074', 0, '', '8765444', 0);
INSERT INTO `sjrecord` VALUES (106, '李祥', '1578050364074', 0, '', '201603', 0);
INSERT INTO `sjrecord` VALUES (107, '李祥', '1578050364074', 0, '', '201604', 0);
INSERT INTO `sjrecord` VALUES (108, '李祥', '1578050364074', 0, '', '201605', 0);
INSERT INTO `sjrecord` VALUES (109, '李祥', '1578050364074', 0, '', '201609', 0);
INSERT INTO `sjrecord` VALUES (110, '李祥', '1578050364074', 0, '', '201612', 0);
INSERT INTO `sjrecord` VALUES (111, '李祥', '1578050364074', 0, '', '201615', 0);
INSERT INTO `sjrecord` VALUES (112, '李祥', '1578050364074', 0, '', '201617', 0);
INSERT INTO `sjrecord` VALUES (113, '李祥', '1578050364074', 0, '', '201620', 0);
INSERT INTO `sjrecord` VALUES (114, '李祥', '1578050364074', 0, '', '201622', 0);
INSERT INTO `sjrecord` VALUES (115, '李祥', '1578050364074', 0, '', '201624', 0);
INSERT INTO `sjrecord` VALUES (116, '李祥', '1578050364074', 0, '', '201627', 0);
COMMIT;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` varchar(11) COLLATE utf8_bin NOT NULL,
  `sname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `gender` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `classid` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT COMMENT='学生信息表';

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES ('2016000', '林俊杰', '男', '001', '222@qq.com', '17561841398');
INSERT INTO `student` VALUES ('201603', '白居易', '男', '002', '456@bb.com', NULL);
INSERT INTO `student` VALUES ('201604', '李清照', '女', '002', '456@bb.com', NULL);
INSERT INTO `student` VALUES ('201605', '李清照', '女', '002', '456@bb.com', NULL);
INSERT INTO `student` VALUES ('201606', '李s隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201607', '李商隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201609', '李a隐', '男', '002', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201610', '李商隐', '女', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201611', '李r隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201612', '李商隐', '男', '002', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201613', '李f隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201614', '李商隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201615', '李h隐', '男', '002', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201616', '李j隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201617', '李商隐', '女', '002', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201618', '李商隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201619', '李商隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201620', '李商隐', '男', '002', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('2016207311', '李祥先', '男', '001', '2@qq.com', '17516841398');
INSERT INTO `student` VALUES ('201621', '李s隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201622', '李商隐', '女', '002', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201623', '李v隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201624', '李商隐', '男', '002', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201625', '李o隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201627', '李商隐', '男', '002', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201628', '李n隐', '女', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('201629', '李商隐', '男', '001', '123@qq.com', NULL);
INSERT INTO `student` VALUES ('2916207314', 'lx', '男', '001', '1739781578@qq.com', NULL);
INSERT INTO `student` VALUES ('8765444', '657', '男', '001', '1@qq.com', '17661841398');
COMMIT;

-- ----------------------------
-- Table structure for tcrecord
-- ----------------------------
DROP TABLE IF EXISTS `tcrecord`;
CREATE TABLE `tcrecord` (
  `tcid` int(11) NOT NULL AUTO_INCREMENT,
  `tid` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `cid` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`tcid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='教师班级对应表';

-- ----------------------------
-- Records of tcrecord
-- ----------------------------
BEGIN;
INSERT INTO `tcrecord` VALUES (1, '123456', '001');
INSERT INTO `tcrecord` VALUES (2, '123456', '002');
INSERT INTO `tcrecord` VALUES (3, '654321', '002');
INSERT INTO `tcrecord` VALUES (4, '654321', '003');
COMMIT;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tid` varchar(50) COLLATE utf8_bin NOT NULL,
  `tname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `gender` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='教师信息表';

-- ----------------------------
-- Records of teacher
-- ----------------------------
BEGIN;
INSERT INTO `teacher` VALUES ('123456', '李祥', '男', '1@qq.com', '17561841398');
INSERT INTO `teacher` VALUES ('654321', '周杰伦', '男', '12@qq.com', '17561841396');
COMMIT;

-- ----------------------------
-- Table structure for user1
-- ----------------------------
DROP TABLE IF EXISTS `user1`;
CREATE TABLE `user1` (
  `uid` varchar(255) COLLATE utf8_bin NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `level` int(10) DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户信息表';

-- ----------------------------
-- Records of user1
-- ----------------------------
BEGIN;
INSERT INTO `user1` VALUES ('123123', '管理员', '123123', 3);
INSERT INTO `user1` VALUES ('123456', '李祥', '123456', 2);
INSERT INTO `user1` VALUES ('2016000', '林俊杰', '123456', 1);
INSERT INTO `user1` VALUES ('2016001', '李成达', '123456', 1);
INSERT INTO `user1` VALUES ('2016002', '黄奔驰', '123456', 1);
INSERT INTO `user1` VALUES ('2016003', '周湘博', '123456', 1);
INSERT INTO `user1` VALUES ('654321', '周杰伦', '654321', 2);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
