package n_10886;

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
			
			int len = Integer.parseInt(st.nextToken());
			int y =0, n=0;
			for (int i = 0; i < len; i++) {
				st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken());
				if(num==1){
					y++;
				}else{
					n++;
				}
				
			}
			
			if(y>n)
				sb.append("Junhee is cute!");
			else
				sb.append("Junhee is not cute!");
			
			bw.write(sb.toString());
			bw.flush();
		} catch (Exception e) {	}
	}
}
