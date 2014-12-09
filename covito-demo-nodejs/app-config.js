var _domain = 'conode.cn';
module.exports = {
	replaceCookie : true,
	domain : _domain,
	httpClientConfigs : {
		appName : 'covito-node',
		route : [ {
			host : '127.0.0.1',
			port : 8080,
			live : true
		} ]
	},
	context : "/",
	debug : false,
	port : 3000,
	title : "covito-node"
}