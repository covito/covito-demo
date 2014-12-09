
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `no` int(11) DEFAULT NULL COMMENT '工号',
  `name` varchar(40) DEFAULT NULL COMMENT '名字',
  `nick_name` varchar(40) DEFAULT NULL COMMENT '昵称',
  `email` varchar(40) NOT NULL COMMENT '邮箱',
  `login_name` varchar(50) NOT NULL COMMENT '登录用户名',
  `pwd` varchar(128) NOT NULL COMMENT '密码',
  `mobile` varchar(32) DEFAULT NULL COMMENT '手机号',
  `phone` varchar(32) DEFAULT NULL COMMENT '电话',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `org_id` tinyint(7) DEFAULT NULL COMMENT '机构id',
  `role_type` tinyint(7) DEFAULT NULL COMMENT '角色类型',
  `portrait` varchar(255) DEFAULT NULL COMMENT '头像地址',
  `type` varchar(4) DEFAULT NULL COMMENT '用户类型',
  `portrait_update` datetime DEFAULT NULL COMMENT '头象更新日期',
  `add_time` datetime DEFAULT NULL COMMENT '添加日期',
  `updatetime` datetime DEFAULT NULL COMMENT '更新时间',
  `this_login_time` datetime DEFAULT NULL COMMENT '本次登录时间',
  `this_login_ip` datetime DEFAULT NULL COMMENT '本次登录ip',
  `last_login_time` datetime DEFAULT NULL COMMENT '上次登录时间',
  `last_login_ip` datetime DEFAULT NULL COMMENT '上次登录ip',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_key` (`email`),
  UNIQUE KEY `login_name_key` (`login_name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统用户';