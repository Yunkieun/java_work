<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward > a</title>
</head>
<body>
<h1>forward > a</h1>
<script type="text/javascript">
	alert("돌아왔구나 육태식이")
	/* JavaScript 코드로, 현재 웹 페이지를 새로운 위치로 리디렉션하는 역할 */
	//location.href="b.jsp";
</script>
<%
	/* 데이터를 서블릿에서 JSP로 전달하는 데 사용되는 메서드.
       서블릿에서 생성된 데이터를 JSP 페이지에서 사용할 수 있다*/
	request.setAttribute("pname", "ddd");

	/* 웹 브라우저를 다른 URL로 리디렉션하는 데 사용(alert 안띄우고 바로 실행) */
%>
<jsp:forward page="b.jsp?age=17"></jsp:forward>
</body>
</html>