package basic_p;

import java.util.ArrayList;

public class StudMain {

	public static void main(String[] args) {
		String [] name = {"장동건","장서건","장남건","장중건","북두신건"};
		String [] kor = {"71","68","49","93","87"};
		String [] eng = {"74","66","48","92","86"};
		String [] mat = {"75","64","46","91","84"};
		
		ArrayList<Stud> arr = new ArrayList<>();
		
		for (int i = 0; i < mat.length; i++) {
			arr.add(new Stud(name[i], kor[i], eng[i],mat[i]));
		}
		
		for (Stud stud : arr) {
			stud.calcRank(arr);
		}
		
		for (int i = 1; i <= mat.length; i++) {
			for (Stud stud : arr) {
				if(stud.rank==i) {
				System.out.println(stud);
				}
			}
		}
		
	}

}
