<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户登陆 </title>
</head>
<body>
	<form action="users/login.do" method="post">
		用户名:	<input type="text" name="userName" />
		密码:	<input type="text" name="passWord" />
		<button type="submit">提交</button>
	</form>
</body>
</html>
