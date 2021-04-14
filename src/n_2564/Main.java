package n_2564;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 필드 크기
		int x = sc.nextInt();
		int y = sc.nextInt();

		int arr[][] = null;
		arr = new int[x][y]; // 필드 배열

		int store_num = sc.nextInt(); // 상점의 수


		for (int i = 0; i < store_num; i++) { 
			// 상점이 위치한 지점
			int A = sc.nextInt(); // 동서남북에 대한 값 저장
			int B = sc.nextInt(); // 북위로부터 위치값 저장
			
			if (A == 1) {	//북쪽이고, 왼쪽에서 부터의 위치
				arr[B][y-1] = 1;	
			} 
			else if (A == 2) {	//남
				arr[B][0] = 1;	
			}
			else if (A == 3) {	//서
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