package dataStructures;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
//		sum of numbers from 1 to n
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n= sc.nextInt();
//				using simple formula
				int sum= n*(n+1)/2;
				System.out.println("Sum o numbers from a to " +n +  " = " +sum);
		//second method using for loop
//		int sum=0;
//		for(int i=1; i<n;i++) {
//			sum= sum + i ;
//		}
//		System.out.println("Sum of numbers from 1 to " +n +  " = " +sum);
		
	}

}
