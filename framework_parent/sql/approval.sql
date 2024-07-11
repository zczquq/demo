/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : approval

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 11/07/2024 23:24:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '员工主键ID',
  `account_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '员工账户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '员工密码',
  `nick_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '系统昵称',
  `real_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '员工真实姓名',
  `sex` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '员工性别',
  `hiredate` datetime NULL DEFAULT NULL COMMENT '入职日期',
  `role` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '员工角色',
  `status` int NULL DEFAULT 0 COMMENT '员工状态',
  `is_delete` int NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 51 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '员工信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, 'quq', '12345', 'zzz', '黄渤', '男', '2023-01-01 00:00:00', '经理', 0, 1);
INSERT INTO `employee` VALUES (2, 'ym123', '12345', '洛晴川', '杨幂', '女', '2022-12-01 00:00:00', '财务', 0, 0);
INSERT INTO `employee` VALUES (3, 'hg123', '12345', '李逍遥', '胡歌', '男', '2023-02-01 00:00:00', '人事', 1, 0);
INSERT INTO `employee` VALUES (4, 'zcz1231', '123456', '张三', '李四', '男', '2024-03-14 16:34:08', '职员', 1, 0);
INSERT INTO `employee` VALUES (5, '1212', '99999', 'zzz', 'javv', '女', '2024-03-14 16:43:45', '财务', 1, 0);
INSERT INTO `employee` VALUES (6, 'jlfs', '1234', 'pupu', '王五', '男', '2024-03-15 16:03:11', '人事', 1, 0);
INSERT INTO `employee` VALUES (7, 'qqq', '1234334', 'nxnd', '张三', '女', '2023-11-22 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (8, 'hijsdflkn', '123456', 'psmf', 'php', '女', '2024-03-01 00:00:00', '财务', 1, 0);
INSERT INTO `employee` VALUES (9, 'jljfsd', '123456', 'lixiaoyao', 'java', '男', '2024-01-03 16:21:22', '人事', 0, 0);
INSERT INTO `employee` VALUES (10, 'zhg81', '123456', 'nxnd', 'phg', '女', '2024-02-14 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (11, 'jhy1231', '123456', 'ppp', '殷', '男', '2024-02-06 16:24:54', '人事', 1, 0);
INSERT INTO `employee` VALUES (12, 'msms', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (13, 'mss', '123456', 'jhs', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (14, 'msms', '123456', 'jhh', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (15, 'ph', '123456', 'jht', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (16, 'mms', '123456', 'jh2', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (17, 'mos', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 0, 0);
INSERT INTO `employee` VALUES (18, 'asdfjowj', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 0, 0);
INSERT INTO `employee` VALUES (19, 'jonas', '123456', 'jhj', 'zczp', '女', '2023-08-01 00:00:00', '职员', 0, 0);
INSERT INTO `employee` VALUES (20, 'msadfs', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (21, 'one', '123456', 'jhj', 'zczp', '女', '2023-08-01 00:00:00', '职员', 0, 0);
INSERT INTO `employee` VALUES (22, 'two', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (23, 'three', '123456', 'jhj', 'zczp', '女', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (24, 'four', '123456', 'jhj', 'zczp', '女', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (25, 'five', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (26, 'six', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 0, 0);
INSERT INTO `employee` VALUES (27, 'size', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 0, 0);
INSERT INTO `employee` VALUES (28, 'seven', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 0, 0);
INSERT INTO `employee` VALUES (29, 'eight', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (30, 'nine', '123456', 'jhj', 'zczp', '女', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (31, 'ten', '123456', 'jhj', 'zczp', '女', '2023-08-01 00:00:00', '职员', 0, 0);
INSERT INTO `employee` VALUES (32, 'eleven', '123456', 'jhj', 'zczp', '女', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (33, 'twelve', '123456', 'jhj', 'zczp', '女', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (34, 'thirteen', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (35, 'forteen', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (36, 'fifteen', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 0, 0);
INSERT INTO `employee` VALUES (37, 'sixteen', '123456', 'jhj', 'zczp', '男', '2023-08-01 00:00:00', '职员', 1, 0);
INSERT INTO `employee` VALUES (45, 'qqqqqqq', '123456', 'zcz', NULL, NULL, NULL, '经理', 0, 0);
INSERT INTO `employee` VALUES (46, 'qqqqqqq', '123456', 'zcz', NULL, NULL, NULL, '经理', 0, 0);
INSERT INTO `employee` VALUES (47, 'qqqqqqq', '123456', 'zcz', '12312', NULL, NULL, '经理', NULL, 0);
INSERT INTO `employee` VALUES (48, 'qqqqqqq', '123456', 'zcz', '12312', NULL, NULL, '经理', NULL, 0);
INSERT INTO `employee` VALUES (49, 'qqqqqqq', '123456', 'zcz', '12312', NULL, NULL, '经理', NULL, 0);
INSERT INTO `employee` VALUES (50, '若男', '123456', '1111', '123123', '女', NULL, '职员', 0, 0);
INSERT INTO `employee` VALUES (51, '若男', '123456', '1111', '123123', '女', '2001-01-09 00:00:00', '职员', 0, 0);

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `studentId` int NULL DEFAULT NULL,
  `course` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `score` double NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES (1, 1, '科目1', 88);
INSERT INTO `exam` VALUES (2, 1, '科目2', 88);
INSERT INTO `exam` VALUES (3, 1, '科目3', 88);
INSERT INTO `exam` VALUES (4, 2, '科目1', 88);
INSERT INTO `exam` VALUES (5, 2, '科目2', 88);
INSERT INTO `exam` VALUES (6, 3, '科目1', 88);
INSERT INTO `exam` VALUES (7, 3, '科目2', 88);

-- ----------------------------
-- Table structure for expense_detail
-- ----------------------------
DROP TABLE IF EXISTS `expense_detail`;
CREATE TABLE `expense_detail`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '报销详情主键ID',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '报销说明',
  `expense_type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '报销类型',
  `expense_amount` decimal(10, 2) NOT NULL COMMENT '报销金额',
  `attachment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '报销附件',
  `expense_record_id` int NULL DEFAULT NULL COMMENT '报销记录ID',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `expense_detail_ibfk_2`(`expense_record_id` ASC) USING BTREE,
  CONSTRAINT `expense_detail_ibfk_1` FOREIGN KEY (`expense_record_id`) REFERENCES `expense_record` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `expense_detail_ibfk_2` FOREIGN KEY (`expense_record_id`) REFERENCES `expense_record` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '报销详情记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of expense_detail
-- ----------------------------
INSERT INTO `expense_detail` VALUES (4, '住宿费', '住宿', 50.50, 'receipt4.jpg', 2);
INSERT INTO `expense_detail` VALUES (5, '交通费', '交通', 70.25, 'receipt5.jpg', 3);
INSERT INTO `expense_detail` VALUES (6, '餐饮费', '餐饮', 30.80, 'receipt6.jpg', 3);
INSERT INTO `expense_detail` VALUES (7, '餐饮费', '餐饮', 25.60, 'receipt7.jpg', 4);
INSERT INTO `expense_detail` VALUES (8, '交通费', '交通', 40.25, 'receipt8.jpg', 5);
INSERT INTO `expense_detail` VALUES (9, '办公用品', '日常用品', 30.30, 'receipt9.jpg', 5);
INSERT INTO `expense_detail` VALUES (10, '住宿费', '住宿', 65.75, 'receipt10.jpg', 6);
INSERT INTO `expense_detail` VALUES (11, '餐饮费', '餐饮', 40.20, 'receipt11.jpg', 7);
INSERT INTO `expense_detail` VALUES (12, '交通费', '交通', 60.00, 'receipt12.jpg', 7);
INSERT INTO `expense_detail` VALUES (13, '住宿费', '住宿', 70.50, 'receipt13.jpg', 8);
INSERT INTO `expense_detail` VALUES (14, '餐饮费', '餐饮', 25.75, 'receipt14.jpg', 8);
INSERT INTO `expense_detail` VALUES (15, '交通费', '交通', 35.20, 'receipt15.jpg', 9);
INSERT INTO `expense_detail` VALUES (16, '办公用品', '日常用品', 30.20, 'receipt16.jpg', 9);
INSERT INTO `expense_detail` VALUES (17, '住宿费', '住宿', 80.00, 'receipt17.jpg', 10);
INSERT INTO `expense_detail` VALUES (18, '交通费', '交通', 50.50, 'receipt18.jpg', 10);
INSERT INTO `expense_detail` VALUES (19, '餐饮费', '餐饮', 200.00, NULL, NULL);
INSERT INTO `expense_detail` VALUES (20, '住宿费', '住宿', 300.00, NULL, NULL);
INSERT INTO `expense_detail` VALUES (21, '餐饮费', '餐饮', 200.00, NULL, NULL);
INSERT INTO `expense_detail` VALUES (22, '住宿费', '住宿', 300.00, NULL, NULL);
INSERT INTO `expense_detail` VALUES (23, '交通费', '交通', 50.00, NULL, NULL);
INSERT INTO `expense_detail` VALUES (24, '住宿费', '住宿', 300.00, NULL, NULL);
INSERT INTO `expense_detail` VALUES (25, '交通费', '交通', 50.00, NULL, NULL);
INSERT INTO `expense_detail` VALUES (26, '住宿费', '住宿', 300.00, NULL, NULL);
INSERT INTO `expense_detail` VALUES (27, '交通费', '交通', 300.00, NULL, 18);
INSERT INTO `expense_detail` VALUES (31, '餐饮费', '住宿', 300.00, NULL, 18);
INSERT INTO `expense_detail` VALUES (32, '办公用品', '日常用品', 200.00, NULL, 18);

-- ----------------------------
-- Table structure for expense_record
-- ----------------------------
DROP TABLE IF EXISTS `expense_record`;
CREATE TABLE `expense_record`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '报销记录主键ID',
  `expense_amount` decimal(10, 2) NOT NULL COMMENT '报销金额',
  `submit_date` datetime NOT NULL COMMENT '报销提交日期',
  `approval_date` datetime NULL DEFAULT NULL COMMENT '报销审批日期',
  `applicant_id` int NULL DEFAULT NULL COMMENT '申请人ID',
  `approver_id` int NULL DEFAULT NULL COMMENT '审批人ID',
  `approval_status` int NULL DEFAULT 0 COMMENT '审批状态',
  `approval_comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '审批说明',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `expense_record_ibfk_1`(`applicant_id` ASC) USING BTREE,
  INDEX `expense_record_ibfk_2`(`approver_id` ASC) USING BTREE,
  CONSTRAINT `expense_record_ibfk_1` FOREIGN KEY (`applicant_id`) REFERENCES `employee` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `expense_record_ibfk_2` FOREIGN KEY (`approver_id`) REFERENCES `employee` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '报销记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of expense_record
-- ----------------------------
INSERT INTO `expense_record` VALUES (2, 150.50, '2024-03-12 10:30:00', '2024-03-14 15:34:36', 1, 2, 0, NULL);
INSERT INTO `expense_record` VALUES (3, 200.75, '2024-03-11 11:45:00', '2024-03-14 15:34:36', 1, 2, 0, NULL);
INSERT INTO `expense_record` VALUES (4, 75.25, '2024-03-10 13:20:00', '2024-03-14 15:34:36', 1, 2, 0, NULL);
INSERT INTO `expense_record` VALUES (5, 120.80, '2024-03-09 14:15:00', '2024-03-14 15:34:36', 1, 2, 0, NULL);
INSERT INTO `expense_record` VALUES (6, 90.60, '2024-03-08 15:10:00', '2024-03-14 15:34:36', 1, 2, 0, NULL);
INSERT INTO `expense_record` VALUES (7, 180.25, '2024-03-07 16:05:00', '2024-03-14 15:34:36', 1, 2, 0, NULL);
INSERT INTO `expense_record` VALUES (8, 210.30, '2024-03-06 17:00:00', '2024-03-14 15:34:36', 1, 2, 0, NULL);
INSERT INTO `expense_record` VALUES (9, 95.75, '2024-03-05 18:00:00', '2024-03-14 15:34:36', 1, 2, 0, NULL);
INSERT INTO `expense_record` VALUES (10, 160.20, '2024-03-04 19:00:00', '2024-03-14 15:34:36', 1, 2, 0, NULL);
INSERT INTO `expense_record` VALUES (12, 210.00, '2024-03-26 10:24:04', NULL, NULL, NULL, 0, NULL);
INSERT INTO `expense_record` VALUES (13, 210.00, '2024-03-26 10:42:53', NULL, NULL, NULL, 0, NULL);
INSERT INTO `expense_record` VALUES (16, 210.00, '2024-03-26 10:51:41', '2024-03-26 15:24:02', 9, NULL, 0, '');
INSERT INTO `expense_record` VALUES (17, 210.00, '2024-03-26 10:55:48', '2024-03-26 15:33:27', 9, 2, 0, '');
INSERT INTO `expense_record` VALUES (18, 800.00, '2024-04-09 12:00:54', '2024-04-11 12:00:59', 1, 1, 0, NULL);

-- ----------------------------
-- Table structure for interface_call_record
-- ----------------------------
DROP TABLE IF EXISTS `interface_call_record`;
CREATE TABLE `interface_call_record`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `interface_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `request_ip` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `method` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '0',
  `has_error` int NULL DEFAULT NULL,
  `error_Message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `start_call_time` bigint NULL DEFAULT NULL,
  `end_call_time` bigint NULL DEFAULT NULL,
  `duration` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of interface_call_record
-- ----------------------------
INSERT INTO `interface_call_record` VALUES (1, 'm2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `interface_call_record` VALUES (2, 'm1', '0:0:0:0:0:0:0:1', 'http://localhost:8888/hello/m1', 'GET', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `interface_call_record` VALUES (3, 'm4', '0:0:0:0:0:0:0:1', 'http://localhost:8888/hello/m4', 'GET', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `interface_call_record` VALUES (4, 'm4', '0:0:0:0:0:0:0:1', 'http://localhost:8888/hello/m4', 'GET', 0, NULL, 1713452866949, 1713452866949, 0);
INSERT INTO `interface_call_record` VALUES (5, 'm1', '0:0:0:0:0:0:0:1', 'http://localhost:8888/hello/m1', 'GET', 0, NULL, 1713491051250, 1713491051260, 10);
INSERT INTO `interface_call_record` VALUES (6, 'm1', '0:0:0:0:0:0:0:1', 'http://localhost:8888/hello/m1', 'GET', 0, NULL, 1713491177760, 1713491177760, 0);
INSERT INTO `interface_call_record` VALUES (7, 'm1', '0:0:0:0:0:0:0:1', 'http://localhost:8888/hello/m1', 'GET', 0, NULL, 1713491207954, 1713491207961, 7);
INSERT INTO `interface_call_record` VALUES (8, 'm1', '0:0:0:0:0:0:0:1', 'http://localhost:8888/hello/m1', 'GET', 0, NULL, 1713491856953, 1713491856965, 12);
INSERT INTO `interface_call_record` VALUES (9, 'save', '0:0:0:0:0:0:0:1', 'http://localhost:8888/student/save', 'POST', 0, NULL, 1713496386581, 1713496386782, 201);

-- ----------------------------
-- Table structure for leave_record
-- ----------------------------
DROP TABLE IF EXISTS `leave_record`;
CREATE TABLE `leave_record`  (
  `id` int NOT NULL COMMENT '请假记录主键ID',
  `reason` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '请假原因',
  `leave_type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '请假类型',
  `attachment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '请假附件',
  `start_time` datetime NOT NULL COMMENT '请假开始时间',
  `end_time` datetime NOT NULL COMMENT '请假结束时间',
  `duration` int NOT NULL COMMENT '请假时长',
  `submit_date` datetime NOT NULL COMMENT '请假提交日期',
  `approval_date` datetime NULL DEFAULT NULL COMMENT '请假审批日期',
  `applicant_id` int NULL DEFAULT NULL COMMENT '申请人ID',
  `approver_id` int NULL DEFAULT NULL COMMENT '审批人ID',
  `approval_status` int NULL DEFAULT 0 COMMENT '审批状态',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `leave_record_ibfk_1`(`applicant_id` ASC) USING BTREE,
  INDEX `leave_record_ibfk_2`(`approver_id` ASC) USING BTREE,
  CONSTRAINT `leave_record_ibfk_1` FOREIGN KEY (`applicant_id`) REFERENCES `employee` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `leave_record_ibfk_2` FOREIGN KEY (`approver_id`) REFERENCES `employee` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '请假记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of leave_record
-- ----------------------------
INSERT INTO `leave_record` VALUES (1, '去医院看病', '病假', NULL, '2023-07-01 08:00:00', '2023-07-01 17:00:00', 9, '2023-06-30 10:00:00', '2024-03-14 15:34:36', 1, 3, 1);
INSERT INTO `leave_record` VALUES (2, '朋友结婚', '事假', NULL, '2023-07-05 08:00:00', '2023-07-05 12:00:00', 4, '2023-07-04 15:00:00', '2024-03-14 15:34:36', 2, 3, 0);
INSERT INTO `leave_record` VALUES (3, '休年假', '年假', NULL, '2023-07-10 00:00:00', '2023-07-15 23:59:59', 120, '2023-07-08 14:00:00', '2024-03-14 15:34:36', 3, 3, 2);
INSERT INTO `leave_record` VALUES (4, '调休', '调休', NULL, '2023-07-18 08:00:00', '2023-07-18 17:00:00', 9, '2023-07-17 09:00:00', '2024-03-14 15:34:36', 4, 3, 1);
INSERT INTO `leave_record` VALUES (5, '培训', '其他', NULL, '2023-07-20 09:00:00', '2023-07-20 17:00:00', 8, '2023-07-19 16:00:00', '2024-04-06 17:24:27', 5, 3, 0);
INSERT INTO `leave_record` VALUES (6, '家庭原因', '事假', NULL, '2023-07-22 08:00:00', '2023-07-23 17:00:00', 18, '2023-07-21 11:00:00', '2024-03-14 15:34:36', 6, 3, 1);
INSERT INTO `leave_record` VALUES (7, '参加婚礼', '事假', NULL, '2023-07-25 00:00:00', '2023-07-26 23:59:59', 48, '2023-07-24 10:00:00', '2024-03-14 15:34:36', 7, 3, 2);
INSERT INTO `leave_record` VALUES (8, '陪家人', '事假', NULL, '2023-07-30 08:00:00', '2023-07-31 17:00:00', 18, '2023-07-29 15:00:00', '2024-04-06 17:24:22', 8, 3, 0);
INSERT INTO `leave_record` VALUES (9, '个人原因', '事假', NULL, '2023-08-01 08:00:00', '2023-08-01 12:00:00', 4, '2023-07-31 17:00:00', '2024-03-14 15:34:36', 9, 3, 1);
INSERT INTO `leave_record` VALUES (10, '出差', '其他', NULL, '2023-08-05 00:00:00', '2023-08-10 23:59:59', 120, '2023-08-03 12:00:00', '2024-03-14 15:34:36', 10, 3, 2);
INSERT INTO `leave_record` VALUES (11, '生病', '病假', NULL, '2024-02-23 00:00:00', '2024-02-26 00:00:00', 4, '2024-03-26 11:57:53', '2024-03-26 16:33:30', 6, NULL, 0);
INSERT INTO `leave_record` VALUES (12, '111', '事假', NULL, '2024-04-02 00:00:00', '2024-04-04 00:00:00', 2, '2024-04-02 15:57:41', '2024-04-07 21:35:47', NULL, NULL, 0);
INSERT INTO `leave_record` VALUES (13, '生病', '病假', 'D:\\desktop\\upload\\leave\\10\\138D54553DC342A4A74E776CC64EED481712127527624.pdf', '2024-04-02 00:00:00', '2024-04-04 00:00:00', 3, '2024-04-03 14:58:58', '2024-04-06 17:24:11', NULL, NULL, 0);

-- ----------------------------
-- Table structure for product_inventory
-- ----------------------------
DROP TABLE IF EXISTS `product_inventory`;
CREATE TABLE `product_inventory`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '库存物品主键id',
  `product_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品信息',
  `submit_date` datetime NULL DEFAULT NULL COMMENT '提交库存日期',
  `approval_date` datetime NULL DEFAULT NULL COMMENT '审批库存日期',
  `vendor` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '供应商信息',
  `quantity` int NULL DEFAULT NULL COMMENT '库存数量',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '产品单价',
  `total_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '产品总价',
  `approval_status` int NULL DEFAULT 0 COMMENT '审批状态',
  `is_delete` int NULL DEFAULT 0 COMMENT '是否被逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 98 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '产品库存表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of product_inventory
-- ----------------------------
INSERT INTO `product_inventory` VALUES (1, '鼠标', '2023-11-01 16:15:58', '2024-04-10 19:03:23', '供应商1', 100, 99.00, 9900.00, 1, 0);
INSERT INTO `product_inventory` VALUES (2, '罗技GPW2鼠标', '2024-04-12 13:29:41', '2024-04-11 14:12:58', '供应商1', 200, 350.00, 70000.00, 1, 0);
INSERT INTO `product_inventory` VALUES (3, '机箱', '2023-01-11 16:15:58', '2024-04-11 15:51:00', '供应商4', 150, 400.00, 60000.00, 1, 0);
INSERT INTO `product_inventory` VALUES (4, '主板', '2023-11-01 16:15:58', '2024-04-11 15:13:22', '供应商1', 1000, 99.00, 99000.00, 1, 0);
INSERT INTO `product_inventory` VALUES (5, '键盘', '2024-01-01 16:15:58', '2024-04-11 16:45:27', '供应商2', 150, 80.00, 12000.00, 1, 0);
INSERT INTO `product_inventory` VALUES (6, '金士顿内存条', '2024-11-01 16:15:58', '2024-04-11 16:45:25', '供应商5', 500, 90.00, 45000.00, 1, 0);
INSERT INTO `product_inventory` VALUES (7, '显示器', '2023-08-18 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (8, '三星固态', '2023-11-01 16:15:58', '2024-04-11 16:45:28', '供应商2', 100, 100.00, 10000.00, 1, 0);
INSERT INTO `product_inventory` VALUES (9, '键盘', '2023-11-01 16:15:58', NULL, '供应商5', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (10, '键盘', '2023-11-01 16:15:58', '2024-04-11 16:45:24', '供应商1', 100, 99.00, 9900.00, 1, 0);
INSERT INTO `product_inventory` VALUES (11, '键盘', '2023-11-12 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (12, '键盘', '2023-11-01 16:15:58', NULL, '供应商6', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (13, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (14, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (15, '键盘', '2021-08-01 16:15:58', NULL, '供应商3', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (16, 'F87键盘', '2023-11-01 16:15:58', NULL, '供应商2', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (17, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (18, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (19, '键盘', '2023-11-01 16:15:58', NULL, '供应商4', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (20, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (21, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (22, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (23, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (24, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (25, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (26, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (27, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (28, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (29, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (30, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (31, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (32, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (33, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (34, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (35, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (36, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (37, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (38, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (39, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (40, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (41, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (42, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (43, '键盘', '2023-11-01 16:15:58', NULL, '供应商1', 100, 99.00, 9900.00, 0, 0);
INSERT INTO `product_inventory` VALUES (44, '先马650W电源', '2024-04-09 19:49:02', NULL, '供应商1', 500, 550.00, 275000.00, 0, 0);
INSERT INTO `product_inventory` VALUES (45, '1231', '2024-04-01 12:00:00', NULL, '1231', 100, 10.00, 1000.00, 0, 0);
INSERT INTO `product_inventory` VALUES (46, '1111', '2024-04-01 12:00:00', NULL, '1111', 100, 10.00, 1000.00, 0, 0);
INSERT INTO `product_inventory` VALUES (47, '1111', '2024-04-01 12:00:00', NULL, '1111', 100, 10.00, 1000.00, 0, 0);
INSERT INTO `product_inventory` VALUES (48, '1111', '2024-04-01 12:00:00', NULL, '1111', 100, 10.00, 1000.00, 0, 0);
INSERT INTO `product_inventory` VALUES (49, '1111', '2024-04-01 12:00:00', NULL, '1111', 100, 10.00, 1000.00, 0, 0);
INSERT INTO `product_inventory` VALUES (50, '1231', '2024-04-02 12:00:00', NULL, '供应商2', 1231, 1231.00, 12312.00, 0, 0);
INSERT INTO `product_inventory` VALUES (51, '123', '2024-04-01 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (62, '123', '2024-04-02 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (63, '123', '2024-04-03 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (64, '123', '2024-04-03 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (65, '123', '2024-04-03 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (66, '123', '2024-04-01 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (67, '123', '2024-04-04 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (68, '123', '2024-04-04 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (69, '123', '2024-04-04 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (70, '123', '2024-04-04 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (71, '123', '2024-04-04 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (72, '123', '2024-04-04 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (73, '123', '2024-04-04 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (74, '123', '2024-04-04 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 0);
INSERT INTO `product_inventory` VALUES (75, '123', '2024-04-04 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 1);
INSERT INTO `product_inventory` VALUES (76, '12333123', '2024-04-04 12:00:00', '2024-04-12 01:05:53', '1233', 123123, 123.00, 123.00, 1, 1);
INSERT INTO `product_inventory` VALUES (77, 'zmzm', '2024-04-05 12:00:00', NULL, '1111', 11111, 111.00, 111.00, 0, 1);
INSERT INTO `product_inventory` VALUES (78, '123', '2024-04-04 12:00:00', '2024-04-12 01:05:52', '123', 123, 123.00, 123.00, 1, 1);
INSERT INTO `product_inventory` VALUES (79, '123', '2024-04-02 12:00:00', NULL, '123111', 123, 123.00, 123.00, 0, 1);
INSERT INTO `product_inventory` VALUES (80, '123', '2024-04-02 12:00:00', NULL, '123111', 123, 123.00, 123.00, 0, 1);
INSERT INTO `product_inventory` VALUES (81, '123', '2024-04-03 12:00:00', NULL, '123', 213, 123.00, 1233123.00, 0, 1);
INSERT INTO `product_inventory` VALUES (82, '123', '2024-04-03 12:00:00', NULL, '123', 213, 123.00, 1233123.00, 0, 1);
INSERT INTO `product_inventory` VALUES (83, '12345678', '2022-03-03 12:00:00', NULL, '123', 123, 123.00, 2142.00, 0, 1);
INSERT INTO `product_inventory` VALUES (84, '123', '2024-04-05 12:00:00', NULL, '123', 123, 123.00, 12312313.00, 0, 1);
INSERT INTO `product_inventory` VALUES (85, '123', '2024-04-05 12:00:00', NULL, '123', 123, 123.00, 12312313.00, 0, 1);
INSERT INTO `product_inventory` VALUES (86, '123', '2024-04-05 12:00:00', NULL, '123', 123, 123.00, 12312313.00, 0, 1);
INSERT INTO `product_inventory` VALUES (87, '123', '2024-04-05 12:00:00', NULL, '123', 123, 123.00, 12312313.00, 0, 1);
INSERT INTO `product_inventory` VALUES (88, '123', '2024-04-05 12:00:00', NULL, '123', 123, 123.00, 12312313.00, 0, 1);
INSERT INTO `product_inventory` VALUES (89, '123', '2024-04-05 12:00:00', NULL, '123', 123, 123.00, 12312313.00, 0, 1);
INSERT INTO `product_inventory` VALUES (90, '123', '2024-04-04 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 1);
INSERT INTO `product_inventory` VALUES (91, '123', '2024-04-04 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 1);
INSERT INTO `product_inventory` VALUES (92, '999', '2024-04-05 12:00:00', NULL, '999', 999, 99.00, 9999.00, 0, 1);
INSERT INTO `product_inventory` VALUES (93, '999', '2024-04-05 12:00:00', NULL, '999', 999, 99.00, 9999.00, 0, 1);
INSERT INTO `product_inventory` VALUES (94, '123', '2024-04-27 12:00:00', '2024-04-12 10:52:02', '123', 123, 123.00, 123.00, 1, 1);
INSERT INTO `product_inventory` VALUES (96, '123', '2024-04-05 12:00:00', '2024-04-12 11:44:00', '123', 123, 123.00, 123.00, 1, 1);
INSERT INTO `product_inventory` VALUES (97, '123', '2024-04-03 12:00:00', NULL, '123', 123, 123.00, 123.00, 0, 1);
INSERT INTO `product_inventory` VALUES (98, '00099', '2024-04-04 12:00:00', NULL, 'vendor1', 12321, 123.00, 1232.00, 0, 1);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '张飞', '男', 22);
INSERT INTO `student` VALUES (2, '关羽', '男', 23);
INSERT INTO `student` VALUES (3, '赵云', '男', 24);
INSERT INTO `student` VALUES (4, '李云', '男', 23);
INSERT INTO `student` VALUES (5, '黄忠', '男', 23);
INSERT INTO `student` VALUES (6, '莉莉', '女', 23);
INSERT INTO `student` VALUES (7, '枳', '女', 23);
INSERT INTO `student` VALUES (8, 'xxx', '男', 22);

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `school` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `subject` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES (1, '学校a', '专业a', '地址a');
INSERT INTO `student_info` VALUES (2, '学校b', '专业b', '地址b');
INSERT INTO `student_info` VALUES (3, '学校c', '专业c', '地址c');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `isDelete` tinyint NULL DEFAULT 0 COMMENT '是否被删除 0-未删除 1-已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'zzz', '123456', 0);
INSERT INTO `user` VALUES (2, 'zadsfa', '123456', 0);
INSERT INTO `user` VALUES (3, 'zadsfa', '1231231231', 0);
INSERT INTO `user` VALUES (4, '王五', '1231231231', 0);
INSERT INTO `user` VALUES (5, '丁一', '1231231231', 0);
INSERT INTO `user` VALUES (6, '张三', '123', 0);
INSERT INTO `user` VALUES (7, '123', '123', 0);
INSERT INTO `user` VALUES (8, '123', '123', 0);
INSERT INTO `user` VALUES (10, '123', '123', 0);

SET FOREIGN_KEY_CHECKS = 1;
