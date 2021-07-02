package oOPS;

import java.util.Scanner;

public class Methods {
public static int Sum(int a, int b) {
	
		return a+b;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1: ");
    int number= sc.nextInt();
	System.out.println("Enter number 2: ");
    int number2= sc.nextInt();
    
   int result= Sum(number, number2);
   System.out.println("Sum =" +result);
	}
	
	

}
