package n_10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringBuffer a = new StringBuffer();
	static StringBuffer b = new StringBuffer();
	static StringBuffer result = new StringBuffer();
	
	public static void sum(){
		int carry = 0;
		int data = 0;
		
		for(int i=0;i<a.length();i++){
			data = ( Integer.parseInt(a.charAt(i)+"") + Integer.parseInt(b.charAt(i)+"") + carry ) % 10;
			result.append(data);
			carry = ( Integer.parseInt(a.charAt(i)+"") + Integer.parseInt(b.charAt(i)+"") + carry ) / 10;
		}
		if (carry != 0) {
			result.append(carry);
		}
	}
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			a.append(st.nextToken());
			b.append(st.nextToken());
			
			a.reverse();
			b.reverse();
			
			while(a.length()>b.length()){
				b.append('0');
				
			}
			while(a.length()<b.length()){
				a.append('0');
			}
			sum();
			result.reverse();
			System.out.println(result.toString());
			
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
