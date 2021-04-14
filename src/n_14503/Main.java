package n_14503;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	static int cnt = 0;
	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int[][] arr = null;
		int x = sc.nextInt();
		int y = sc.nextInt();
		arr = new int[x][y];
		int r = sc.nextInt();	//x�� ����
		int c = sc.nextInt();	//y�� ����
		int d = sc.nextInt();	//����(�� ���� ����)
		
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		oneMethod(arr, r, c, d);
		sc.close();
		
	}
	public static void oneMethod(int[][] arr, int r, int c, int d){
//		System.out.println("current : "+r+", "+c+", d : "+d);
		//���� ��ġ���� �ش��ϴ� Ÿ�� 0->1�� ����
		if(arr[r][c]==0){
			arr[r][c] = 2;	//���� Ÿ���� 2�� ����
			cnt++;
		}
		twoMethod(arr, r, c, d);
	}
	public static void twoMethod(int[][] arr, int r, int c, int d){
//		System.out.println("current : "+r+", "+c+", d : "+d);
		if(arr[r][c-1]!=0&&arr[r-1][c]!=0&&arr[r][c+1]!=0&&arr[r+1][c]!=0){
			cMethod(arr, r, c, d);
		}else{
			switch(d){
			case 0 :	//d�� 0�� ��� ���� ����
				if(arr[r][c-1]==0){
					aMethod(arr, r, c, d);
				}else{
					twoMethod(arr, r, c, turn(d));
				}
				break;
			case 3 :	//d�� 3�� ��� ����
				if(arr[r+1][c]==0){
					aMethod(arr, r, c, d);
				}else{
					twoMethod(arr, r, c, turn(d));
				}
				break;
			case 2 :	
				if(arr[r][c+1]==0){
					aMethod(arr, r, c, d);
				}else{
					twoMethod(arr, r, c, turn(d));
				}
				break;
			case 1 :
				if(arr[r-1][c]==0){
					aMethod(arr, r, c, d);
				}else{
					twoMethod(arr, r, c, turn(d));
				}
				break;
			}
		}
		
		
	}
	public static void aMethod(int[][] arr, int r, int c, int d){	//r �� ��
//		System.out.println("current : "+r+", "+c+", d : "+d);
		d = turn(d);
		
		switch(d){
			case 0:
				r--;break;
			case 1:
				c++;break;
			case 2:
				r++;break;
			case 3:
				c--;break;
		}
		oneMethod(arr, r, c, d);
		
	}
	public static void bMethod(int[][] arr, int r, int c, int d){
//		System.out.println("current : "+r+", "+c+", d : "+d);
		d=turn(d);
		twoMethod(arr, r, c, d);
	}
	public static void cMethod(int[][] arr, int r, int c, int d){
//		System.out.println("current : "+r+", "+c+", d : "+d);
		switch(d){
			case 0:
				r++;
				break;
			case 1:
				c--;
				break;
			case 2:
				r--;
				break;
			case 3:
				c++;
				break;
		}
		if(arr[r][c]==1){
			dMethod(arr, r, c, d);
		}else{
			twoMethod(arr, r, c, d);
		}
	}
	public static void dMethod(int[][] arr, int r, int c, int d){
//		System.out.println("current : "+r+", "+c+", d : "+d);
		System.out.println(cnt);
	}
	public static int turn(int d){
		return --d<0?3:d;
	}
}
