package n_1037;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int arr[] = new int[num];
			for (int i = 0; i < num; i++) {
				arr[i]= Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			System.out.println(arr[0]*arr[num-1]);
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}