package n_4949;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		try {
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String str ="";
			while(true){
				Stack<String> bracket = new Stack<>();
				str = br.readLine();
				if(str.equals(".")){
					break;
				}
				boolean isStack = true;
				for (int i = 0; i < str.length(); i++) {
					if(str.charAt(i)=='('){
						bracket.add(")");
					}
					else if(str.charAt(i)==')'){
						if(bracket.size()!=0){
							String temp = bracket.pop();
							if(!temp.equals(str.charAt(i)+"")){
								isStack = false;
							}
						}else{
							isStack = false;
						}
					}
					else if(str.charAt(i)=='['){
						bracket.add("]");
					}
					else if(str.charAt(i)==']'){
						if(bracket.size()!=0){
							String temp = bracket.pop();
							if(!temp.equals(str.charAt(i)+"")){
								isStack = false;
							}
						}else{
							isStack = false;
						}
					}
				}
				
				if(bracket.size()==0&&isStack){
					sb.append("yes\n");
				}
				else{
					sb.append("no\n");
				}
			}
			bw.write(sb.toString());
			bw.flush();
			
		} 
		catch (Exception e) {
		}
	}
}
