package maths;

import java.util.Scanner;

public class Mulof3And5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int result= 0;
		for (int i=3; i<1000; i++) {
			if(i%3==0 || i%5==0) {
				result+=i;
			}
		}
		
		System.out.println(result);
		
		
//		int a= 0;
//		int b= 1;
//		int c=0;
//		int n= sc.nextInt();
//		System.out.print(a+" ");
//		System.out.print(b+" ");
//		for(int i= 0; i<= n-2; i++) {
//			c= a+b;
//			a=b;
//			b=c;
//			System.out.print(c+ " ");
//		}
		
//		int resultoff= 0;
//		for (int i=5; i<1000; i++) {
//			if(i%5==0) {
//				resultoff+=i;	
//			}
//		}
//		System.out.println(resultoff);
//		int resultoft= 0;
//		for (int i=3; i<1000; i++) {
//			if(i%3==0) {
//				resultoft+=i;
//			}
//		
//	}
//		System.out.println(resultoft);
//		System.out.println(resultoft+ resultoff );
}
}
