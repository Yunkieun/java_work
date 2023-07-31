<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examReg2</title>
</head>
<body>
<h1>examReg2</h1>

<%

	//초기화
	String [] pname = request.getParameterValues("pname");
	String [] title = "kor,eng,mat,soc,sci".split(",");
	// title = [kor, eng, mat]
			    //0   1    2
	int [][] arr = new int[title.length][pname.length];
	
	//   ? 각 사람
	//res[?][0] - 총점
	//res[?][1] - 평균
	//res[?][2] - 등수
	//res[?][3] - 등급
	int [][] res = new int[pname.length][3];
	
	
	// 입력부
	for(int i = 0; i<title.length; i++){
		String [] jj = request.getParameterValues(title[i]);
		for(int j = 0; j<jj .length; j++){
			arr[i][j] = Integer.parseInt(jj[j]);
		}
	}
	
	
	//연산부
	// p : 사람
	for(int p = 0; p<res.length; p++){
		
		//총점
		res[p][0] = 0;
		
		//점수 : j 과목
		for(int j = 0; j<arr.length; j++){
			res[p][0] += arr[j][p];
		}
		
		//평균
		res[p][1] = res[p][0]/arr.length;
		
	} 
	
	//분석
	for(int me = 0; me<res.length; me++){
		res[me][2] = 1;	
		
		for(int you = 0; you<res.length; you++){
			
			if(res[me][1] < res[you][1] ){
				res[me][2]++;	
			}
		}
	}
	
	
%>


<!-- 출력부 -->
<table border="">
		<tr>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			<td>사회</td>
			<td>과학</td>
			<td>총점</td>
			<td>평균</td>	
			<td>등수</td>			
			<td>등급</td>

			
		</tr>
<%-- <% 
//학생의 순서를 나타내는 'r'변수를 1부터 'pname'배열의 길이까지 반복
for(int r = 1; r<=pname.length; r++){
	//'pname'배열의 길이만큼 반복하여, 학생 정보를 출력
	for(int i = 0; i<pname.length; i++){ 
		//'r'변수와 'res' 3번째 열에 해당하는 값이 같은 경우 학생 정보를 출력
		if(r == res[i][2]) {%>	 
		<tr>
			<!-- 학생의 이름, 순위 출력 -->
			<td><%=pname[i] %> <%=r %></td> 
			<% for(int j = 0; j<arr.length; j++){ %>				
				<td><%=arr[j][i] %></td>
			<%} 
			 for(int j = 0; j<res[i].length; j++){ %>				
				<td><%=res[i][j] %></td>
			<%} %>		
		</tr>
<%}}}%>	 --%>
<% 
for(int r = 1; r<=pname.length; r++){
	for(int i = 0; i<pname.length; i++){ 
		if(r == res[i][2]) {	
            String grade = "";
            int avg = res[i][1];
            if (avg >= 90) {
                grade = "수";
            } else if (avg >= 80) {
                grade = "우";
            } else if (avg >= 70) {
                grade = "미";
            } else if (avg >= 60) {
                grade = "양";
            } else{
            	grade = "가";
            }
        %>
		<tr>
			<td><%=pname[i] %> <%=r %></td> 
			<% for(int j = 0; j<arr.length; j++){ %>				
				<td><%=arr[j][i] %></td>
			<%} 
			 for(int j = 0; j<res[i].length; j++){ %>				
				<td><%=res[i][j] %></td>
			<%} %>	
			<td><%=grade %></td>	
		</tr>
<%}}}%>


</table>
</body>
</html>