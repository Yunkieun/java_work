package basic_p;

public class ArrSortMain {

	public static void main(String[] args) {
		String [] name = {"장동건","장서건","장남건","장중건","북두신건"};
		String [] kor = {"71","68","49","93","87"};
		String [] eng = {"74","66","48","92","86"};
		String [] mat = {"75","64","46","91","84"};
		
		int [] tot = new int [name.length];
		int [] rank = new int [name.length];
		
		for (int i = 0; i < tot.length; i++) {
			tot[i] = Integer.parseInt(kor[i])+
					Integer.parseInt(eng[i])+
					Integer.parseInt(mat[i]);
		}
		
		for (int me = 0; me < rank.length; me++) {
			rank[me] = 1;
			for (int you = 0; you < rank.length; you++) {
				if(tot[me] < tot[you]) {
					rank[me]++;
				}
				
			}
		}
		
		for (int r = 1; r <= name.length; r++) {
			
			for (int i = 0; i < name.length; i++) {
				if(r== rank[i]) {
					String ttt = name[i]+"\t";
					ttt += kor[i]+"\t";
					ttt += eng[i]+"\t";
					ttt += mat[i]+"\t";
					ttt += rank[i]+"\t";
					System.out.println(ttt);
					break;
				}
				
				
			}
		}
		
				
	}

}
