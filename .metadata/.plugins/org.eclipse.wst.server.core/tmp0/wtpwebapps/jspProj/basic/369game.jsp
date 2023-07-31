<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>369게임입니다.</title>
</head>
<body>
	<%
/* 		for(int i=1; i<11; i++){
			if(i<11 & i%3==0){
				out.println("짝!</br>");
			}else{
				out.println(i + "</br>");
			}
		}
		for(int j=11; j<21; j++){	
			if(j<21 & j%3==1){
				out.println("짝!</br>");
			}else{
				out.println(j + "</br>");
			}
		}
		
		out.println("..."); */
		
		System.out.println("1 -> 20 ");
		for (int i = 1; i <=20; i++) {
			int one = i % 10;
			if(one%3==0 && one!=0) {
				System.out.println("짝");
			}else {
				System.out.println(i+" , "+one);
			}
		}
		
		System.out.println("1 ->  100 >>>>>>>>>>>> ");
		for (int i = 1; i <=100; i++) {
			int one = i % 10;
			int ten = i/10;
			
			String ttt = "";
			if(ten%3==0 && ten!=0) {
				ttt += "짝";
			}
			if(one%3==0 && one!=0) {
				ttt += "짝";
			}
			if(ttt.equals("")) {
				ttt += i;
			}
			System.out.println(ttt);
		}
		
		
/* 		System.out.println("1 ->  ? >>>>>>>>>>>> ");
		
		int no = 93246;
		for (int i = 1; i <=no; i++) {
			
			int buf = i;
			String ttt = "";
			
			while(true) {
				int one = buf % 10;
				buf /= buf;
				
				if(one%3==0 && one!=0) {
					ttt += "짝";
				}
				
				if(buf < 10) {
					break;
				}
				
			}
			
			
			if(ttt.equals("")) {
				ttt += i;
			}
			System.out.println(ttt);
		} */
	%>
</body>
</html>