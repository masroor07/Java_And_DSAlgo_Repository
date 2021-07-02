package checking.java;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for principal: ");
		int principal= sc.nextInt();
		System.out.println("Rate= ");
		double rate= sc.nextFloat();
		System.out.println("Time= ");
		int time= sc.nextInt();
		float SimpleInterest=  principal * (float) rate * time / 100;
		System.out.println("The simple interest for this principal, time and rate= "+ SimpleInterest);

	}

}
