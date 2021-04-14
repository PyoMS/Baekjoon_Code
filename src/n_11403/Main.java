package n_11403;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int[][] g  = new int[n][n];
		
		for(int i = 0; i<n ; i++){
			for(int j=0; j<n; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<n ; i++){
			for(int j=0; j<n; j++){
				System.out.print(g[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	public static void ploid(int n){
		int[][] arr = new int[n][n];
		
		for(int i = 0; i<n ; i++){
			for(int j=0; j<n; j++){
				if(arr[i][j]==1){
					
				}
			}
		}
	}
}