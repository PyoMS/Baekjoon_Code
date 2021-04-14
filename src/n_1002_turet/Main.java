package n_1002_turet;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		cnt = sc.nextInt();
		int x1, y1, r1, x2, y2, r2;

		for (int i = 0; i < cnt; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();

			double d = Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2))); // �Ÿ���

//			System.out.println("distance : " + d);
			
			if (Math.abs(r1 - r2) < d && d < Math.abs(r1 + r2)) {	// �� ��
				System.out.println(2);
			} 
			else if (Math.abs(r1 + r2) == d || (Math.abs(r1 - r2) == d && d != 0)) {	//�� �� (���� , ����)
				System.out.println(1);
			} 
			else if (Math.abs(r1 - r2) > d) {	//�ϳ��� ���� �ٸ� ���� ����.
				System.out.println(0);
			} 
			else if (Math.abs(r1 + r2) < d) {	//�� ���� �ָ� ������ ������ �ʴ� ���
				System.out.println(0);
			}
			else if (d == 0 && r1 == r2) {
				System.out.println(-1);
			}
		}

		sc.close();

	}
}
