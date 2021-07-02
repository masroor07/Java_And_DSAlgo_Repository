package loops;

import java.util.Scanner;

public class TableUsingFloop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to print its table");
		int n= sc.nextInt();
		System.out.println("Table of " +n +"= " );
		for(int i=1; i<=10; i+=1) {
		System.out.print(n+ " x " +i +"= "+i*n);
		System.out.println();
		}
	}

}

