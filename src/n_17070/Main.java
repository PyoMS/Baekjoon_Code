package n_17070;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	 private static int maps[][] = new int [6][6];      //DFS 인접행렬
	 private static boolean visit[] = new boolean[6];   //방문했나 안했나 판단할 변수
	 private static Stack stack = new Stack<>();

	public static void inputData(int i,int j){
        //데이터를 집어넣는 함수
        //i,j를 넣으면 인접행렬에 값을 넣어준다.
        //무방향 그래프이므로 대칭해서 넣어준다.
        maps[i][j] = 1;
        maps[j][i] = 1;
         
    }
	
	public static void DFS(int v,int goal){
        //DFS 구현 부분
        visit[v] = true;
        stack.push(v); //스택에 값을 넣어준다.
         
        if(v == goal){ //목표노드에 왔으면
             
            //// 스택값 출력
            int count=stack.size(); //스택의 크기를 받을 변수
            for(int i=0; i<count;i++){
                System.out.print(stack.elementAt(i)+" ");
            }
            System.out.println("출력완료");
            //// 스택값 출력
             
            stack.pop(); //DFS에서 빠져나올땐  pop을 합니다.
            return;
        }
     
         
        for(int i=0;i<6;i++){
            if(maps[v][i]==1 && !visit[i]){
                //노드가 이어져있고 방문을 하지 않았으면
                DFS(i,goal);   
                visit[i]=false; //DFS에서 빠져나오면 해당노드는 방문하지 않은 것으로 한다.
            }          
        }
         
        stack.pop(); //DFS에서 빠져나올땐 pop을 합니다.
         
    }



	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[][] arr = new int[n+1][n+1];
			int preR = 1; int preC = 1; // (1,1) 부터 시작.
			int curR = 1; int curC = 2; // (1,2) 부터 시작.
			
			for (int i = 1; i <= n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			arr[preR][preC] = 2; arr[curR][curC] = 2; // '1'은 '벽'  / '2'는 경로 
			
//			Q) pre 노드에 대한 값을 어떻게 표현???
			for (int i = 1; i <= n; i++) {
				for (int j = 2; j <= n; j++) {
					// 도착 지점까지의 모든 경로를 표시한다.
					//1. 현 위치값 저장.
					if(arr[i][j]==2){
						arr[preR][preC] = 2; arr[curR][curC] = 2; // '1'은 '벽'  / '2'는 경로 
						
						if(curC+1 <= n && curR+1 <= n){ // 아직 갈 경로가 있는 경우
							//1-1. 갈 수 있는 경로 수.
							if(preR!=curR && preC != curC){ // 대각선 방향으로 놓여있을 경우
								//0. preR = curR , preC = curC // 꼬리는 머리의 값을 갖는다.
								preR = curR; preC = curC;
								
								arr[curR][curC+1] = 2;
								arr[curR+1][curC] = 2;
								arr[curR+1][curC+1] = 2;
							}
							else if(preR == curR){ // 가로 방향으로 놓여있을 경우
								preR = curR; preC = curC;
								
								arr[curR][curC+1] = 2;
								arr[curR+1][curC+1] = 2;
							}
							else if(preC == curC) { // 세로 방향으로 놓여있을 경우
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
