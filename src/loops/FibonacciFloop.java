package loops;
import java.util.Scanner;

public class FibonacciFloop {

	public static void main(String[] args) {
		System.out.println("enter a number: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int a= 0;
		
		int b= 1;
		System.out.print(a+ " ");
		System.out.print(b+" ");		
		
		for (int i=0; i<n-2; i++ ) {
			int c= a+b;
			a=b;
			b=c;
			System.out.print(c+ " ");
		}

	}

}
