package loops;

import java.util.Scanner;

public class SumOfNNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum= sum+i;
			
		}
System.out.println(sum);
System.out.println(add(30, 40));
	}
	
	static int add(int x, int y) {
		System.out.println("The sum of two numbers = ");
		return x+y;
		
	}
}
