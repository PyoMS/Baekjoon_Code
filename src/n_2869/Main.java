package n_2869;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int day = Integer.parseInt(st.nextToken());
			int night = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			System.out.println( ((v-night-1)/(day-night)) +1);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
