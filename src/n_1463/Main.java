package n_1463;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int cnt = 0;
		while (x != 1) {
			
			if (x % 6 == 0) {
				x /= 6;
				cnt += 2;
			} 
			else if ((x - 1) % 3 == 0) {
				x--;
				cnt++;
			} 
			else if (x % 3 == 0) {
				x /= 3;
				cnt++;
			} 
			
			else if ((x - 1) % 2 == 0) {
				x--;
				cnt++;
			} 
			else if (x % 2 == 0) {
				x /= 2;
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
