package n_6359;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i =0; i<T;i++){
			int room = sc.nextInt();
			boolean[] arr = new boolean[room+1];
			Arrays.fill(arr, true);// 1에서 모든 방을 열어둔다.
			int sum=0;
			
			for(int j=2;j<=room;j++){	//2배수 3배수 4배수 ....
				for(int k=1;k<=room;k++){	//k배수
					if(j*k<=room){
						arr[j*k] = !arr[j*k];
					}else{
						break;
					}
				}
			}
			for(int j=1;j<=room;j++){
				if(arr[j]){
					sum++;
				}
			}
			System.out.println(sum);
			sum=0;
		}
		sc.close();
	}
}
