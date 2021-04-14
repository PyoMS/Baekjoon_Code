package n_2447;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	int cnt = 0;
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int num = Integer.parseInt(br.readLine());
			
			star(num);
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void star(int num){
		if(num>3){
			star(num/3);
		}
		else{
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					if(i==num/2 && j==num/2){
						System.out.print(" ");
					}
					else{
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
	}
}
