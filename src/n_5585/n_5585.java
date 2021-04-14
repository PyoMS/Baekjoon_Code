package n_5585;

import java.util.*;

public class n_5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.close();
		
		int cnt=0;
		
		x = 1000 - x;
		if(x/500!=0){
			cnt += x/500;
			x = x%500;
		} 
		if(x/100!=0){
			cnt += x/100;
			x = x%100;
		} 
		if(x/50!=0){
			cnt += x/50;
			x = x%50;
		} 
		if(x/10!=0){
			cnt += x/10;
			x = x%10;
		}
		if(x/5!=0){
			cnt += x/5;
			x = x%5;
		}
		if(x/1!=0){
			cnt += x/1;
			x = x%1;
		}
		System.out.println(cnt);
	}
}
