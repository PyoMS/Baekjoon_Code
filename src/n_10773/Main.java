package n_10773;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			Stack<Integer> stack = new Stack<>();
			
			int k = Integer.parseInt(st.nextToken());
			int sum = 0;
				
			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				int temp = Integer.parseInt(st.nextToken());
				if(temp==0){
					int temp2 = stack.pop();
					sum -= temp2;
				}else{
					sum += temp;
					stack.add(temp);
				}
			}
			
			System.out.println(sum);
		
			br.close();
		} catch (Exception e) {
		}
		
	}
}
