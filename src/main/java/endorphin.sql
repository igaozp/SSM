CREATE DATABASE IF NOT EXISTS endorphin CHARACTER SET utf8mb4;
USE endorphin;

-- 用户信息表
CREATE TABLE IF NOT EXISTS user
(
    user_id     INT(10)     NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    user_name   VARCHAR(30) NOT NULL COMMENT '用户名',
    password    VARCHAR(30) NOT NULL DEFAULT '' COMMENT '密码',
    user_email  VARCHAR(30) NOT NULL UNIQUE COMMENT '用户邮箱',
    user_sex    VARCHAR(30) NOT NULL COMMENT '用户性别',
    user_phone  VARCHAR(11)          DEFAULT NULL COMMENT '电话号码',
    create_time DATETIME    NOT NULL COMMENT '用户创建时间',
    user_type   INT(2)      NOT NULL DEFAULT '1' COMMENT '用户类型 0:管理员 1:普通用户',
    user_state  INT(2)      NOT NULL DEFAULT '0' COMMENT '用户状态 0:正常 1:冻结',
    credit      INT(10)     NOT NULL DEFAULT '100' COMMENT '用户积分',
    PRIMARY KEY (`user_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET utf8mb4
  COLLATE utf8_general_ci;

-- 论坛板块表
CREATE TABLE IF NOT EXISTS board
(
    board_id   INT(10)      NOT NULL AUTO_INCREMENT COMMENT '论坛板块id',
    board_name VARCHAR(150) NOT NULL DEFAULT '' COMMENT '论坛板块名称',
    board_desc VARCHAR(300) NOT NULL DEFAULT '' COMMENT '论坛板块描述',
    PRIMARY KEY (`board_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET utf8mb4
  COLLATE utf8_general_ci;

-- 登录日志表
CREATE TABLE IF NOT EXISTS login_log
(
    login_log_id   BIGINT(20)  NOT NULL AUTO_INCREMENT COMMENT '日志ID',
    user_id        INT(10)     NOT NULL COMMENT '用户ID',
    login_ip       VARCHAR(30) NOT NULL DEFAULT '' COMMENT '登录IP',
    login_datetime DATETIME    NOT NULL COMMENT '登录时间',
    PRIMARY KEY (`login_log_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET utf8mb4
  COLLATE utf8_general_ci;

-- 帖子表
CREATE TABLE IF NOT EXISTS post
(
    post_id     INT(10)     NOT NULL AUTO_INCREMENT COMMENT '帖子ID',
    board_id    INT(10)     NOT NULL default '0' COMMENT '论坛板块ID',
    title       VARCHAR(50) NOT NULL COMMENT '帖子名称',
    content     TEXT        NOT NULL COMMENT '帖子内容',
    `like`      INT(10)     NOT NULL DEFAULT '0' COMMENT '点赞',
    un_like     INT(10)     NOT NULL DEFAULT '0' COMMENT '踩数',
    view_count  INT(10)     NOT NULL DEFAULT '0' COMMENT '游览次数',
    post_status INT(2)      NOT NULL default '0' COMMENT '帖子状态:0:正常 1:锁定',
    create_time DATETIME    NOT NULL COMMENT '创建时间',
    update_time DATETIME COMMENT '更新时间',
    PRIMARY KEY (`post_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET utf8mb4
  COLLATE utf8_general_ci;

-- 回复表
CREATE TABLE IF NOT EXISTS reply
(
    reply_id    INT(10)  NOT NULL AUTO_INCREMENT COMMENT '回复ID',
    post_id     INT(10)  NOT NULL COMMENT '所回复帖子的ID',
    content     TEXT     NOT NULL COMMENT '回复内容',
    `like`      INT(10)  NOT NULL DEFAULT '0' COMMENT '点赞',
    un_like     INT(10)  NOT NULL DEFAULT '0' COMMENT '踩数',
    create_time DATETIME NOT NULL COMMENT '回复时间',
    PRIMARY KEY (`reply_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET utf8mb4
  COLLATE utf8_general_ci;
