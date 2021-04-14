package n_4673;

public class Main {
	static int d[] = new int[10036];

	public static void main(String[] args) {
		for (int i = 1; i < 10000; i++) {
			if(d[i]!=1){
				dn(i);
			}
		}
		for(int i=1;i<=10000;i++){
			if(d[i]==0){
				System.out.println(i);
			}
		}
	}

	static void dn(int i) {
		int res = i;
		if(res<=10000){
			if (1 <= i && i <= 9) {
				res += i;
				d[res] = 1;
				dn(res);
			} 
			else if (10 <= i && i <= 99) {
				res += i/10 + i % 10;
				d[res] = 1;
				dn(res);
			} 
			else if (100 <= i && i <= 999) {
				res += i/100 + (i/10)%10 + i%10;
				d[res] = 1;
				dn(res);
			} 
			else if (1000 <= i && i <= 9999) {
				res += i/1000 + (i/100)%10 + (i/10)%10 + i%10;
				d[res] = 1;
				dn(res);
			}
		}
	}
}