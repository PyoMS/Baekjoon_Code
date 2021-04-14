package n_1260;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int soinsu = 2;

		while(true){
			if (num % soinsu == 0) {
				System.out.println(soinsu);
				num /= soinsu;
				soinsu = 2;
			}
			
			if(soinsu > num){
				break;
			}
		}
		System.out.println(num);

		sc.close();
	}
}