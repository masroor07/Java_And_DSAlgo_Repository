package arrays;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int a[]= new int[n];

	System.out.println("Enter the " +n +" elements of the array: ");
		for (int i=0;i<=a.length-1;i++) {
			a[i]= sc.nextInt();
		}
		System.out.println("Current array= ");
		for (int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println("Sum of elements of the array= ");
		int sum=0;
		for (int i=0;i<=a.length-1;i++) {
			sum= sum+a[i];
		}
		
		System.out.println(sum);
	}

}
