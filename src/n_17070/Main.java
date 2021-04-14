package n_17070;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	 private static int maps[][] = new int [6][6];      //DFS �������
	 private static boolean visit[] = new boolean[6];   //�湮�߳� ���߳� �Ǵ��� ����
	 private static Stack stack = new Stack<>();

	public static void inputData(int i,int j){
        //�����͸� ����ִ� �Լ�
        //i,j�� ������ ������Ŀ� ���� �־��ش�.
        //������ �׷����̹Ƿ� ��Ī�ؼ� �־��ش�.
        maps[i][j] = 1;
        maps[j][i] = 1;
         
    }
	
	public static void DFS(int v,int goal){
        //DFS ���� �κ�
        visit[v] = true;
        stack.push(v); //���ÿ� ���� �־��ش�.
         
        if(v == goal){ //��ǥ��忡 ������
             
            //// ���ð� ���
            int count=stack.size(); //������ ũ�⸦ ���� ����
            for(int i=0; i<count;i++){
                System.out.print(stack.elementAt(i)+" ");
            }
            System.out.println("��¿Ϸ�");
            //// ���ð� ���
             
            stack.pop(); //DFS���� �������ö�  pop�� �մϴ�.
            return;
        }
     
         
        for(int i=0;i<6;i++){
            if(maps[v][i]==1 && !visit[i]){
                //��尡 �̾����ְ� �湮�� ���� �ʾ�����
                DFS(i,goal);   
                visit[i]=false; //DFS���� ���������� �ش���� �湮���� ���� ������ �Ѵ�.
            }          
        }
         
        stack.pop(); //DFS���� �������ö� pop�� �մϴ�.
         
    }



	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[][] arr = new int[n+1][n+1];
			int preR = 1; int preC = 1; // (1,1) ���� ����.
			int curR = 1; int curC = 2; // (1,2) ���� ����.
			
			for (int i = 1; i <= n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			arr[preR][preC] = 2; arr[curR][curC] = 2; // '1'�� '��'  / '2'�� ��� 
			
//			Q) pre ��忡 ���� ���� ��� ǥ��???
			for (int i = 1; i <= n; i++) {
				for (int j = 2; j <= n; j++) {
					// ���� ���������� ��� ��θ� ǥ���Ѵ�.
					//1. �� ��ġ�� ����.
					if(arr[i][j]==2){
						arr[preR][preC] = 2; arr[curR][curC] = 2; // '1'�� '��'  / '2'�� ��� 
						
						if(curC+1 <= n && curR+1 <= n){ // ���� �� ��ΰ� �ִ� ���
							//1-1. �� �� �ִ� ��� ��.
							if(preR!=curR && preC != curC){ // �밢�� �������� �������� ���
								//0. preR = curR , preC = curC // ������ �Ӹ��� ���� ���´�.
								preR = curR; preC = curC;
								
								arr[curR][curC+1] = 2;
								arr[curR+1][curC] = 2;
								arr[curR+1][curC+1] = 2;
							}
							else if(preR == curR){ // ���� �������� �������� ���
								preR = curR; preC = curC;
								
								arr[curR][curC+1] = 2;
								arr[curR+1][curC+1] = 2;
							}
							else if(preC == curC) { // ���� �������� �������� ���
								preR = curR; preC = curC;
								
								arr[curR+1][curC] = 2;
								arr[curR+1][curC+1] = 2;
							}
						}
					}
				}
			}
			
			
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
