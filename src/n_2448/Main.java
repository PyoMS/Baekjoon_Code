package n_2448;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = null;
		arr = new int[n+1];
		
		arr[0] = arr[1] = 0;	//1자체는 횟수가 0번이므로.
		
		for(int i=2;i<=n;i++){
			arr[i] = arr[i-1] + 1;
			if(i%2==0)arr[i] = Math.min(arr[i], arr[i/2]+1);
			if(i%3==0)arr[i] = Math.min(arr[i], arr[i/3]+1);
			
		}
		System.out.println(arr[n]);
		
		sc.close();
	}
}
