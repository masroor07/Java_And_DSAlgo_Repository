package arrays;

import java.util.Scanner;

public class ArrSub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int n= sc.nextInt();
		
		int array[]= new int[n];
		System.out.println("Enter 5 elements of array: ");
		for(int i=0; i<n; i++) {
			array[i]= sc.nextInt();
		}
		
		int arrayz[]= new int[n];
		System.out.println("Enter 5 elements of array 2: ");
		for(int i=0; i<n; i++) {
			arrayz[i]= sc.nextInt();
			}
		int store[]= new int[n];
		for(int i=0; i<n; i++) {
			store[i]= array[i] - arrayz[i];
		}
		for(int i=0; i<n;i++) {
			System.out.println(store[i]);
		}

	}

}
