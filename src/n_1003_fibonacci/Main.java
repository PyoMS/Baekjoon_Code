package n_1003_fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test_case = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < test_case; i++) {
			arr.add(sc.nextInt());
		}
		sc.close();

		int[][] f = new int[41][2];
		f[0][0] = 1;
		f[1][1] = 1;

		for (int i = 2; i < 41; i++) {
			for (int j = 0; j < 2; j++) {
				f[i][j] = f[i - 1][j] + f[i - 2][j];
			}
		}

		for (int i = 0; i < test_case; i++) {
			System.out.println(f[arr.get(i)][0] + " " + f[arr.get(i)][1]);
		}
		
	}
}
