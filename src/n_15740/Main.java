package n_15740;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int maxSize = 0;
	static StringBuffer a = new StringBuffer();
	static StringBuffer b = new StringBuffer();
	static StringBuffer result = new StringBuffer();
	static int aFlag = 0;
	static int bFlag = 0; 
	
	public static StringBuffer zero(){
		StringBuffer data = new StringBuffer();
		int count = 0;
		int i = result.length() - 1;
	 
		while (i > 0) {
			if (result.charAt(i) == '0') {
				++count;
				--i;
				continue;
			}
			break;
		}
		data.append(result.substring(0, result.length() - count));
		return data;
	}
	public static void sum(StringBuffer a, StringBuffer b){
		
		int carry = 0;
		int data = 0;
		
		for (int i = 0; i < a.length(); i++) {
			data = (Integer.parseInt(a.charAt(i)+"") + Integer.parseInt(b.charAt(i)+"") + carry) % 10;
			result.append(data);
			carry = (Integer.parseInt(a.charAt(i)+"") + Integer.parseInt(b.charAt(i)+"") + carry) / 10;
		}
		if (carry != 0) {
			result.append(carry);
		}
		if (aFlag == 1 && bFlag == 1) {
			result.append('-');
		}
		
	}
	
	public static void sub(StringBuffer a, StringBuffer b){
		int borrow = 0;
		int data = 0;
		
		for(int i=0; i<b.length();i++){
			
			if(maxSize==2){
				data = Integer.parseInt(b.charAt(i)+"") - Integer.parseInt(a.charAt(i)+"") - borrow;
				
			}else{
				data = Integer.parseInt(a.charAt(i)+"") - Integer.parseInt(b.charAt(i)+"") - borrow;
			}
			
			borrow = 0;
			if(data<0){
				borrow=1;
				data += 10;
			}
			result.append(data);
		}
		
		result = zero();
		
		if (maxSize == 2 && bFlag == 1) {
			result.append('-');
		}
		else if (maxSize == 1 && aFlag == 1) {
			result.append('-');
		}
	}
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			a.append(st.nextToken());
			b.append(st.nextToken());
			
			if(a.charAt(0)=='-'){
				aFlag = 1;
				a.deleteCharAt(0);
			}
			if(b.charAt(0)=='-'){
				bFlag = 1;
				b.deleteCharAt(0);
			}
			
			a.reverse();
			b.reverse();
			
//			System.out.println(a.toString());
			while(a.length() < b.length()){
				a.append(0);
				maxSize = 2;
			}
			while(a.length() > b.length()){
				b.append(0);
				maxSize = 1;
			}
			
			if(maxSize == 0){
				for(int i=0;i<a.length();i++){
					if(a.charAt(i)<b.charAt(i)){
						maxSize = 2;
					}
					else if(a.charAt(i)>b.charAt(i)){
						maxSize = 1;
					}
				}
			}
			
			if( (aFlag+bFlag)%2 == 0){
				sum(a,b);
			}else{
				sub(a,b);
			}
			result.reverse();
			if (result.toString() == "") {
				result.append(0);
			}
			System.out.println(result.toString());
			
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}