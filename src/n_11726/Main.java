package n_11726;

//����
//2��n ũ���� ���簢���� 1��2, 2��1 Ÿ�Ϸ� ä��� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Ʒ� �׸��� 2��5 ũ���� ���簢���� ä�� �� ���� ����� ���̴�.
//
//�Է�
//ù° �ٿ� n�� �־�����. (1 �� n �� 1,000)
//
//���
//ù° �ٿ� 2��n ũ���� ���簢���� ä��� ����� ���� 10,007�� ���� �������� ����Ѵ�..

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		
		long[] arr = new long[(n+1)];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<=n;i++){
			arr[i] = (arr[i-1]*2 + arr[i-2])%10007;
		}
		System.out.println(arr[n]);
		sc.close();
	}
}
