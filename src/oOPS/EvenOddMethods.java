package oOPS;

import java.util.Scanner;

public class EvenOddMethods {
	
	public static boolean EvenOdd(int a){
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number= sc.nextInt();
		System.out.println(EvenOdd(number));
		
	}

}
