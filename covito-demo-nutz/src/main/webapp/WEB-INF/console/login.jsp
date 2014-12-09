<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>login</title>
		<meta charset="UTF-8"/>
		<script src="/public/jquery/jquery-1.11.0.min.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body>
		<div id="tip"></div>
		<h2>后台用户登录</h2>
		用户名：<input type="text" id="username" value="" /><br />
		密　码：<input type="password" id="password" value="" />
		<input type="button" id="submit" value="登录" />
	</body>
	<script type="text/javascript">
		$('#submit').click(function () {
			$.ajax({
				type:"post",
				url:"login",
				async:true,
				data:{username:$("#username").val(),password:$("#password").val()},
				dataType: "json",
				success: function(data){
					if(data.ok){
						document.location.href='login';
					}else{
						$('#tip').html(data.msg);
					}
				}
			});
		});
	</script>
</html>