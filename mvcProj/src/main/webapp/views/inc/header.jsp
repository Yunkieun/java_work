<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table>
	<tr>
		<td colspan="4" width="900px">
			<!-- 설정된 mainTitle 값으로 출력됨 -->
			<h1><%=request.getAttribute("mainTitle") %></h1>
		</td>
	</tr>
	<tr align="center">
		<td><a href="/mvcProf/info">회사소개</a></td>
		<td><a href="/mvcProf/product">제품</a></td>
		<td><a href="/mvcProf/gallery">갤러리</a></td>
		<td><a href="/mvcProf/board/BList">게시판</a></td>
	</tr>
</table>