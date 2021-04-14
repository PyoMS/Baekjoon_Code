package n_2884;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(b-45<0){
				a= a-1;
				if(a<0){
					a= 23;
				}
				b = b + 15;
			}else{
				b-=45;
			}
			sb.append(a+" "+b);
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
