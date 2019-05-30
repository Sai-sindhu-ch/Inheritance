import java.util.*;
import java.io.*;
public class DecToBin {
	public static void main(String args[]) {
		int n;
		int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a decimal number:");
		n=sc.nextInt();
		int i=0;
		while(n!=0) {
			a[i++]=n%2;
			n=n/2;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.println(a[j]);
		}
	}

}
