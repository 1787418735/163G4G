<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'filedown.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <a href="filedownAction.action?filename=L5.txt%>">L5�ϻ�����.txt</a>
  <br> <a href="filedownAction.action?filename=L6.txt">L6�ϻ�����.txtt</a>
  <br> <a href="filedownAction.action?filename=IPlayNext.java">IPlayNext.java</a>
   <br><a href="filedownAction.action?filename=HibernatL5�ϻ�����.txt">HibernatL5�ϻ�����.txt</a>
   
  </body>
</html>
