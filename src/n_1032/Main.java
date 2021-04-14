package n_1032;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			int num = Integer.parseInt(br.readLine());
			char[] ch = null;
			for (int i = 0; i < num; i++) {
				String str = br.readLine();
				if(i==0){
					ch = new char[str.length()];
				}
				for (int j = 0; j < str.length(); j++) {
					if(i==0){
						ch[j] = str.charAt(j);
					}
					else{
						if(ch[j]!=str.charAt(j)){
							ch[j]='?';
						}
					}
				}
			}
			for (int i = 0; i < ch.length; i++) {
				sb.append(ch[i]);
			}
			System.out.println(sb.toString());
			
			br.close();
			
		} catch (Exception e) {	}
	}
}