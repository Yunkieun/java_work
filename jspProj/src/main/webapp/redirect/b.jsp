<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect > b</title>
</head>
<body>
	<!-- 특별한거 안해도 b페이지로 넘어가게 함 -->
	<h1>redirect > b</h1> 
	pname:<%=request.getAttribute("aaa") %><br />
	age:<%=request.getParameter("age") %><br />
	nick:<%=request.getParameter("nick") %><br />
</body>
</html>