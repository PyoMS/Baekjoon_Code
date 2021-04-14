package n_11052;
/*
 * ī��� ī������ ���·θ� ������ �� �ְ�, ī������ ������ ī�� 1���� ���Ե� ī����, ī�� 2���� ���Ե� ī����, ... ī�� N���� ���Ե� ī���Ѱ� ���� �� N������ �����Ѵ�.

�αԴ� ī���� ������ ���� ���̴��� ������ ��θ� ���� ����� ī�尡 ���� ������� ���̶�� �̽��� �ϰ� �ִ�. ����, �αԴ� ���� �ִ��� ���� �����ؼ� ī�� N�� �����Ϸ��� �Ѵ�. ī�尡 i�� ���Ե� ī������ ������ Pi���̴�.
���� ���, ī������ �� 4���� ������ �ְ�, P1 = 1, P2 = 5, P3 = 6, P4 = 7�� ��쿡 �α԰� ī�� 4���� ���� ���� �����ؾ� �ϴ� �ݾ��� �ִ��� 10���̴�. 2�� ����ִ� ī������ 2�� ��� �ȴ�.

P1 = 5, P2 = 2, P3 = 8, P4 = 10�� ��쿡�� ī�尡 1�� ����ִ� ī������ 4�� ��� 20���̰�, �� ��찡 �α԰� �����ؾ� �ϴ� �ݾ��� �ִ��̴�.

����������, P1 = 3, P2 = 5, P3 = 15, P4 = 16�� ��쿡�� 3�� ����ִ� ī���Ѱ� 1�� ����ִ� ī������ ������ 18���� �����ϴ� ���� �ִ��̴�.

ī�� ���� ������ �־����� ��, N���� ī�带 �����ϱ� ���� �α԰� �����ؾ� �ϴ� �ݾ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. N������ ���� ������ ī�带 �� ����, ������ ī�带 ������ N���� ����� ���� �Ұ����ϴ�. ��, ������ ī���ѿ� ���ԵǾ� �ִ� ī�� ������ ���� N�� ���ƾ� �Ѵ�.


�ϴ�, ���̽� ������ �����غ���.
ī�� i���� �����ϴ� �����?
ī�� 1���� ����ִ� ī������ �����ϰ�, ī�� i-1���� �����Ѵ�.
ī�� 2���� ����ִ� ī������ �����ϰ�, ī�� i-2���� �����Ѵ�.
ī�� 3���� ����ִ� ī������ �����ϰ�, ī�� i-3���� �����Ѵ�.
...

�Ϲ�ȭ ��Ű�� D[i] = P[n] + D[i-n] �̴�. 
n�� 1, 2, 3 ... n�̰�, P[n]�� �����̴�.

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			StringBuilder sb = new StringBuilder();	
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 

	        StringTokenizer st = new StringTokenizer(br.readLine()); 
	        
	        int N = Integer.parseInt(st.nextToken());
	        int[] arr = new int[N+1];
	        int[] D = new int[N+1];
	        
	        arr[0] = 0;
	        D[0] = 0;
	        
	        //1. ������
	        st = new StringTokenizer(br.readLine()); 
	        for (int i = 1; i <=N; i++) {
	        	arr[i] = Integer.parseInt(st.nextToken());
			}
	        
	        for(int i = 1; i<= N;i++){
	        	for (int j = 1; j <= i; j++) {
					D[i] = Math.max(D[i], arr[j]+D[i-j]);
				}
	        }
	        
	        
	        bw.write(sb.append(D[N]).toString());
	        bw.flush();
	        bw.close();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
