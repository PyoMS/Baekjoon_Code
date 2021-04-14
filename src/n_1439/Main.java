package n_1439;

import java.util.Scanner;

// 1 ) 0001100 - >1110011 ->  1111111 (2번만에 완성)
// 2 ) 0001100 -> 0000000 (1번만에 완성)

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(minCountLinkedString(str));
		sc.close();
	}
	public static int minCountLinkedString(String str){	//뒤집어야 될 숫자 탐색
		int cnt_0 = 0, cnt_1 = 0;
		
		if(str==""||str.equals(null)) return -1;
		
		if(str.length()==1)return 0;
		
		if(str.charAt(0)=='0') cnt_0++;
		else cnt_1++;
		
		for(int i=1;i<str.length();i++){
			if(str.charAt(i-1)!=str.charAt(i)){
				if(str.charAt(i)=='0')
					cnt_0++;
				else
					cnt_1++;
			}
		}
		System.out.println("cnt_0 : "+cnt_0);
		System.out.println("cnt_1 : "+cnt_1);
		return cnt_0>cnt_1? cnt_1 : cnt_0;
	}
}
