package n_1100;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = new String[8];
		for(int i=0;i<arr.length;i++){
			arr[i]=br.readLine();
		}
		int cnt = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length();j++){
				if(i%2==1 && j%2==1 && arr[i].charAt(j)=='F'){
					cnt++;
				}else if(i%2==0 && j%2==0 && arr[i].charAt(j)=='F'){
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}