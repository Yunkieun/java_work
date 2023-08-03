<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>입력정보:</h2>
<%--     <p>이름: <%= request.getParameter("name") %></p>
    <p>나이: <%= request.getParameter("age") %></p> --%>
    <p>주민등록번호: <%= request.getParameter("rrn1") %>- <%= request.getParameter("rrn2") %></p>
	<%
	    String rrn2 = request.getParameter("rrn2");
	    String nat = "";
	
	    if (rrn2.charAt(0) == '5' || rrn2.charAt(0) == '6') {
	        //nat = "외국인";
	        response.sendRedirect("nat.jsp");
	    } else {
	        //nat = "국내인";
	        response.sendRedirect("k.jsp");
	    }
	%>

<h2>결과:</h2>
<p>국적: <%= nat %></p>
    
</body>
</html>