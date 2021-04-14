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
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//br�� ���� �� ���� �о���� ����.
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //StringBuilder�� ����� ���ڸ� �Ѳ����� �Է¹޴´�.

            StringTokenizer st = new StringTokenizer(br.readLine()); //N�� �о����,

            N = Integer.parseInt(st.nextToken());
            long[] arr = new long[N+1];
            arr[1] = 9;
            arr[2] = 17;
            
            
            
            for (int i = 3; i <= N; i++) {
            	//��ȭ��
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