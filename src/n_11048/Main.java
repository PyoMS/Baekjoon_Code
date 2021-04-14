package n_11048;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		try {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int[][] arr = new int[a][b];
			int[][] d = new int[a][b];
			
			for(int i=0;i<a;i++){
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < b; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if(i==0&&j==0){
						d[i][j] = arr[i][j];
					}
					else if(i!=0&&j==0){
						d[i][j] = arr[i][j] + d[i-1][j];
					}
					else if(i==0&&j!=0){
						d[i][j] = arr[i][j] + d[i][j-1];
					}
					else{
						d[i][j] = arr[i][j] + Math.max(d[i-1][j-1], Math.max(d[i-1][j], d[i][j-1]));
					}
				}
			}
			System.out.println(d[a-1][b-1]);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
