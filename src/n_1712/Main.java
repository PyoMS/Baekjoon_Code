package n_1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			//A 고정비용 , B 가변비용, C 제품가격
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int result = 0;
			
			if(c<=b){
				result = -1;
			}
			else{
				result = (a/(c-b))+1;
			}
			System.out.println(result);
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
