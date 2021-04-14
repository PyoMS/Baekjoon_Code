package n_1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = 0;
		int sum=0;
		
		for(int i=1;i<=x;i++){
			sum += i;
			if(x<=sum){
				y = i;
				break;
			}
		}
		sum -= y;
		int p = y;
		int q = 1;
		
		for(int a = sum+1; a<x;a++){
			p--;
			q++;
		}
		if(y%2==1){ //Ȧ
			System.out.println(p+"/"+q);
		}else{ //¦
			System.out.println(q+"/"+p);
		}
		sc.close();
	}
}
