package n_2564;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �ʵ� ũ��
		int x = sc.nextInt();
		int y = sc.nextInt();

		int arr[][] = null;
		arr = new int[x][y]; // �ʵ� �迭

		int store_num = sc.nextInt(); // ������ ��


		for (int i = 0; i < store_num; i++) { 
			// ������ ��ġ�� ����
			int A = sc.nextInt(); // �������Ͽ� ���� �� ����
			int B = sc.nextInt(); // �����κ��� ��ġ�� ����
			
			if (A == 1) {	//�����̰�, ���ʿ��� ������ ��ġ
				arr[B][y-1] = 1;	
			} 
			else if (A == 2) {	//��
				arr[B][0] = 1;	
			}
			else if (A == 3) {	//��
				arr[0][y-B] = 1;
			}
			else if (A == 4) {
				arr[x-1][y-B] = 1;
			}
		}

		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				if(arr[i][j] ==1){
					System.out.println("arr["+i+"]["+j+"]");
				}
			}
		}
//		int dong[] = new int[2];
//		dong[0] = sc.nextInt();
//		dong[1] = sc.nextInt();

		sc.close();
	}
}