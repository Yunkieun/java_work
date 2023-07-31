package basic_p;

import java.util.Arrays;

public class ArgsMain {

	public static void main(String[] args) {
		System.out.println("내가 argsMain  이다 : "+args.length);

		System.out.println(Arrays.toString(args));
		
		int tot = 0;
		for (String str : args) {
			System.out.println(str);
			
			try {
				int i = Integer.parseInt(str);
				
				//짝수냐?
				if(i % 2 == 0) {
					tot += i;
					System.out.println("짝수만:"+i+","+tot);
				}
				
			} catch (Exception e) {
				
				System.out.println("에러 글자였다:"+str);
			}
			
		}
		
		System.out.println("argsMain 끝: "+ tot);
		
		
		/*
		 * 합계, 평균, 최대 = 0 , 최소 = 0
		 * 
		 * 
		 * */
		
	}

}
