package n_1075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer N = new StringBuffer();
		N.append(br.readLine());
		
		int F = Integer.parseInt(br.readLine());
		replaceMethod(N, F, 0);
	}
	public static void replaceMethod(StringBuffer str, int F, int cnt){
		if(cnt<10){
			str.replace(str.length()-2, str.length(), "0"+cnt);
		}else{
			str.replace(str.length()-2, str.length(), ""+cnt);
		}
		int N = Integer.parseInt(str.toString());
		if(N%F==0){
			String a = cnt+"";
			if(a.length()==1){
				System.out.println("0"+cnt);
			}else
				System.out.println(cnt);
		}else{
			cnt++;
			replaceMethod(str, F, cnt);
		}
	}
}
