package n_7572;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] sipez = {"J","K","L","A","B","C","D","E","F","G","H","I"};
		String[] sipgan = {"7","8","9","0","1","2","3","4","5","6"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int x = num%60;
		int i=0,j=0;
		String str="";
		while(true){
			if(num%60==0){
				System.out.println("I6"); return;
			}
			if(x==0){
				System.out.println(str);
				return;
			}
			if(i==sipez.length) i=0;
			if(j==sipgan.length) j=0;
			str = sipez[i]+sipgan[j];
			i++;j++;
			x--;
		}
	}
}
