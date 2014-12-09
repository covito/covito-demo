/*
 * 本配置文件声明了整个应用的数据库连接部分。
 */
var ioc = {
	dao : {
		type : "org.nutz.dao.impl.NutDao",
		args : [ {
			refer : "dataSource"
		} ]
	},
	dataSource : {
		type : "com.alibaba.druid.pool.DruidDataSource",
		events : {
			depose : "close"
		},
		fields : {
			driverClassName : {
				java : '$conf.get("jdbc.driver")'
			},
			url : {
				java : '$conf.get("jdbc.url")'
			},
			username : {
				java : '$conf.get("jdbc.username")'
			},
			password : {
				java : '$conf.get("jdbc.password")'
			},
			filters : "stat"
		}
	},
	conf : {
		type : "org.nutz.ioc.impl.PropertiesProxy",
		fields : {
			paths : [ "db-common.properties" ]
		}
	}
};