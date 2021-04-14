package n_1120;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuffer A = new StringBuffer().append(sc.next());
		StringBuffer B = new StringBuffer().append(sc.next());
		if(A.length() > B.length()){
			return;
		}else{
			int min = 50;
			for(int i=0;i<=B.length()-A.length();i++){
				int cnt = 0;
				for(int j=0;j<A.length();j++){
					if(A.charAt(j)!=B.charAt(j+i)){
						cnt++;
					}
				}
				min = Math.min(min, cnt);
			}
			System.out.println(min);
		}
		sc.close();
	}
}
