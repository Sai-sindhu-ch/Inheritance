import java.util.Scanner;
interface AdvancedArithmetic{
	Scanner sc=new Scanner(System.in);
	abstract int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
	
		public int divisor_sum(int n) {
			int j=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					j=j+i;
				}
			}
			return j;
		}
		public static void main(String args[]) {
		MyCalculator mc=new MyCalculator();
		int k=mc.divisor_sum(10);
		System.out.println(k);	
		}
		
}

	
	
	

