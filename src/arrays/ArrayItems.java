package arrays;

import java.util.Scanner;

public class ArrayItems {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=7;
		int a []= new int[n];
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0; i<n; i++) {
		System.out.print(a[i]);
		
		}
	}

	
}
