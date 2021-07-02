package practiceFLoop;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		//Write a program that prompts the user to input a positive integer.
		//It should then print the multiplication table of that number.
		
		Scanner sc= new Scanner(System.in);
		//Enter a number to print its table
		int n= sc.nextInt();
		int mul=0;
		for(int i=1; i<=10;i++) {
			mul= n*i;
			System.out.println(n+ " x " +i +" = " +mul);
		}

	}

}
