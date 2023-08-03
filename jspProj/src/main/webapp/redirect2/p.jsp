<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주민등록번호</title>
</head>
<body>
	<h3>회원가입</h3>
	<form action="f.jsp" method="post">
	    
		<label for="name">이름:</label>
		<input type="text" id="name" name="pname" value="윤토리" required>
		<br>
		<p>주민번호: <input type="text" name="rrn1" size="10" maxlength="6">
		 - <input type="text" name="rrn2" size="10" maxlength="7"></p>

<!--         <label for="s">성별:</label>
        <input type="text" id="s" name="s" required>
        <br> -->
        <input type="submit" value="가입">
    </form>
    
    <%
   		request.setAttribute("pname", "aaa");
    
    	/* response.sendRedirect("f.jsp"); */
    %>
</body>
</html>