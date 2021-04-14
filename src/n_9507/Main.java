package n_9507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			long num = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < num; i++) {
				int n = Integer.parseInt(br.readLine());
				sb.append(koong(n)+"\n");
			}
				
			System.out.println(sb.toString());
			br.close();
		} 
		catch (Exception e) {}
	}
	public static long koong(int n){
		long[] arr = new long[n+1];	//�ִ밪 : n
		if(n<2){
			return 1;
		}
		else if(n==2){
			return 2;
		}
		else if(n==3){
			return 4;
		}
		else{
			arr[0] = 1;
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 4;
			
			for(int i=4;i<arr.length;i++){
				arr[i] = arr[i-1] + arr[i-2] + arr[i-3] + arr[i-4]; 
			}
			return arr[n];
		}
	}
}