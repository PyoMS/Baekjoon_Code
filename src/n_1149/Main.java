package n_1149;

/**
 * 첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 
 * 둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다. 
 * 집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.
 * 
 * */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) {
		try {
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); 
			int[][] house = new int[n+1][3];
			int[][] d = new int[n+1][3];

			d[0][0] = d[0][1] = d[0][2] = house[0][0] = house[0][1] = house[0][2] = 0;
			
			//1.rgb input
			for (int i = 1; i <= n; i++){
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<3;j++){
					house[i][j] = Integer.parseInt(st.nextToken()); 
				}
			}
			
			for(int i=1; i<=n ; i++){
				d[i][0] = Math.min(d[i-1][1],  d[i-1][2]) + house[i][0];
				d[i][1] = Math.min(d[i-1][0],  d[i-1][2]) + house[i][1];
				d[i][2] = Math.min(d[i-1][0],  d[i-1][1]) + house[i][2];
			}
			bw.write(sb.append(Math.min(Math.min(d[n][0], d[n][1]), d[n][2])).toString());
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
