<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_third</title>
</head>
<body>
	<h1>03_third</h1>
	
	<%!
		//delcaration : 클래스 정의부
		
		//멤버변수
		String name = "나는무너";
		int age = 49;
		boolean marriage = true;
		
		void meth_1(){
			System.out.println("meth_1() 실행");
		}
		//System.out.print("정의부에서 실행구문 불가");
		
		public void jspInit(){
			System.out.println("jspInit() 실행");
			//out.println("str:" +str);
		}
		public void jspDestroy(){
			System.out.println("jspDestroy() 실행");
		}
	%>
	
	<%!
		// int age = 23;  멤버변수 중첩 불가
		int [] arr = {11,22,33,44,55};
	%>
	
	<%
		//scriptlet :: _jspService()
		System.out.println("scriptlet 실행:" + age);
		int age = 23;  //지역변수 ::> 멤버변수와 중첩 가능
		System.out.println("scriptlet 실행:" + age);
		//int age = 17; 지역변수 중첩불가
		String str = "아기상어";
		
		/* 		
		메소드 정의 불가 --> scriptlet은 _jspService()인 메서드이므로 메서드 중첩 정의 불가
		void meth_2() {
			System.out.println("meth_1() 실행");
		} */
		
		out.println("str:" +str);
	%>
</body>
</html>