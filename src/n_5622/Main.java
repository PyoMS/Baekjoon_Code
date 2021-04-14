package n_5622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "ABC DEF GHI JKL MNO PQRS TUV WXYZ";
		String[] strArr = str.split(" ");
		String str2 = br.readLine().trim().toUpperCase();
		String[] input = new String[str2.length()];
		for(int i=0;i<str2.length();i++) {
			input[i] = str2.charAt(i)+"";
		}
		int sum =0;
		for(int i=0;i<strArr.length;i++) {
			for(int j=0;j<input.length;j++) {
				if(strArr[i].indexOf(input[j]) != -1) {
					sum += i;
				}
			}
		}
		System.out.println(sum+3*str2.length());
	}
}
