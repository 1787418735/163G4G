<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'updatePwd.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style type="text/css">
#d1 {
	position: absolute;
	left: 35%;
	top: 10%;
}

.txt {
	width: 250px;
	height: 23px;
}

#sub {
	background-color: #008CBA;
	border: none;
	color: white;
	padding: 2px 5px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 25px;
}
</style>
</head>
<body>
	<div id="d1">
		<form method="post" action="user?cmd=updatePwd">
			请输入旧密码:&emsp;<input class="txt" type="password" name="oldpswd"><br>
			<br> 
			请输入新密码:&emsp;<input class="txt" type="password" name="newpswd"><br>
			<br>
			<center>
				<input id="sub" type="submit" onclick="" value="确认修改">
			</center>
		</form>
	</div>
</body>
</html>
