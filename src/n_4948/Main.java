package n_4948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()){	
				int num = Integer.parseInt(st.nextToken());
				if(num==0) break;
				int[] arr = new int[num*2+1];
				int cnt = 0;
				
				//arr √ ±‚»≠
				for (int i = 2; i <= num*2; i++) {
					arr[i] = i;
				}
				
				for (int i = 2; i <= num*2; i++) {
					if(arr[i]==0){
						continue;
					}
					for (int j = i+i; j <= num*2; j += i) {
						arr[j] = 0;
					}
				}
				
				for (int i = num+1; i <= num*2; i++) {
					if(arr[i]!=0){
						cnt++;
					}
				}
				
				sb.append(cnt+"\n");
				st = new StringTokenizer(br.readLine());
				if(cnt==10){
					break;
				}
			}
			bw.write(sb.toString());
			bw.flush();
		} 
		catch (Exception e) {
		}
		
	}
}
