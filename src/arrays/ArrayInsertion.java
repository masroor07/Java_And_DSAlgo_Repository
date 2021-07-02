package arrays;

import java.util.Scanner;

public class ArrayInsertion {
	
	public static void insertion(int arr[], int n) {
		Scanner sc= new Scanner(System.in);
		int array[]= new int[n];
		
		
		System.out.println("enter the index ar which element is to be inserted: ");
		int index= sc.nextInt();
		
		System.out.println("enter the element which is to be inserted: ");
		int number= sc.nextInt();
		
		
		for(int i= array.length-1; i>index;i--) {
			array[i]= array[i-1];
		}
		array[index]= number;
		
		for(int i: array) {
			System.out.println(i +" ");
	}
		
	}
	
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
		for (int i=0; i<n; i++) {
			System.out.print(a[i]+ " ");;
//			System.out.println();
			
			
			
			
			System.out.println("enter the element which is to be inserted: ");
			int number= sc.nextInt();
			System.out.println("enter the index ar which element is to be inserted: ");
			int index= sc.nextInt();
			
			
			for( i= n; i>index;i--) {
				a[i]= a[i-1];
			}
			a[index]= number;
			++n;
			
			for(i=0; i< n; i++) {
				System.out.println(a[i] + " ");
			}
//				System.out.println(i +" ");
			
//			insertion(a, n);
//			
//			System.out.println(a);
//			
//			System.out.println();
		
		
		


}}}