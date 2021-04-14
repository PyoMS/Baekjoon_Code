package n_1966;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int test=0; test<test_case;test++){
			int N = sc.nextInt();	//문서 수
			int M = sc.nextInt();	//궁금한 문서의 위치
			Queue<Queue_set> que = new LinkedList<>();
			
			for(int i=0;i<N;i++){
				Queue_set qs = new Queue_set();
				if(i==M){
					qs.index = "target";
				}
				qs.importance = sc.nextInt();
				que.offer(qs);
			}
			
			int cnt = 0;
			int max = Max_Method(que);
			
			while(true){
				Queue_set qs = que.poll();
				if(qs.index=="target"&&qs.importance==max){
					cnt++;
					System.out.println(cnt);
					break;
				}
				if(qs.importance==max){
					max = Max_Method(que);
					cnt++;
				}else{
					que.offer(qs);
				}
			}
		}
		
		sc.close();
	}
	public static int Max_Method(Queue<Queue_set> que){	//큐 안에 있는 max값 추출
		int max = -999;
		for(int i=0;i<que.size();i++){
			Queue_set qs = que.poll();
			max = Math.max(max, qs.importance);
			que.offer(qs);
		}
		return max;
	}
}
class Queue_set{
	String index;
	int importance;
}