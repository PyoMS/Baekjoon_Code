package n_10844;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
    		int N;
            StringBuilder sb = new StringBuilder();	//String vs StringBuilder
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//br이 쓰일 때 마다 읽어오는 원리.
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //StringBuilder에 빌드된 문자를 한꺼번에 입력받는다.

            StringTokenizer st = new StringTokenizer(br.readLine()); //N을 읽어오고,

            N = Integer.parseInt(st.nextToken());
            long[] arr = new long[N+1];
            arr[1] = 9;
            arr[2] = 17;
            
            
            
            for (int i = 3; i <= N; i++) {
            	//점화식
            	arr[i] = (arr[i-1] + (2*arr[i-2]) - i) % 1000000000;
			}
            
            bw.write(sb.append(arr[N]).toString());
            bw.flush();
            bw.close();
		} 
    	catch (Exception e) {
			e.printStackTrace();
		}
	}
}
