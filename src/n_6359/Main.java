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
			Arrays.fill(arr, true);// 1���� ��� ���� ����д�.
			int sum=0;
			
			for(int j=2;j<=room;j++){	//2��� 3��� 4��� ....
				for(int k=1;k<=room;k++){	//k���
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
