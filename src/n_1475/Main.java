package n_1475;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[10];
		
		String str ="";
		str += n;
		for(int i=0; i<str.length();i++){
			if(Integer.parseInt(str.charAt(i)+"")==9){
				arr[6]++; 
			}else
				arr[Integer.parseInt(str.charAt(i)+"")]++;
		}
		arr[6] = arr[6]/2 + arr[6]%2;
		
		Arrays.sort(arr);
		
		
		System.out.println(arr[9]);
		sc.close();
	}
}