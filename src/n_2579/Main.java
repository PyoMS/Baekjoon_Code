package n_2579;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//ex
/*
6
10
20
15
25
10
20
*/

public class Main {
    public static void main(String[] args){
    	try {
    		int N;
            StringBuilder sb = new StringBuilder();	//String vs StringBuilder
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//br이 쓰일 때 마다 읽어오는 원리.
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //StringBuilder에 빌드된 문자를 한꺼번에 입력받는다.

            StringTokenizer st = new StringTokenizer(br.readLine()); //N을 읽어오고,

            N = Integer.parseInt(st.nextToken());

            int[] arr = new int[N];
            int[] D = new int[N];

            for(int i = 0; i < N; i++) {
            	st = new StringTokenizer(br.readLine());
            	arr[i] = Integer.parseInt(st.nextToken());
            }

            D[0] = arr[0]; 
            if(N>1)
            	D[1] = Math.max(arr[1]+D[0], arr[1]);
            if(N>2)
            	D[2] = Math.max(arr[2]+arr[1], arr[2]+D[0]);
            if(N>3){
            	for (int i = 3; i < N; i++) {
                	D[i] = Math.max(arr[i]+arr[i-1]+D[i-3], arr[i]+D[i-2]);
                }
            }
            
            bw.write(sb.append(D[N-1]).toString());
//            System.out.println(sb.toString());
            bw.flush();
            bw.close();
		} 
    	catch (Exception e) {
			e.printStackTrace();
		}
    }
}
