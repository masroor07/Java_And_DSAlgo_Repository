package oOPS;

import java.util.Scanner;


class CalcUsingMethods {
	
		public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		System.out.println("Simple Calculator");

        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.print("\nWhat would you like to do?: ");
        int choice = sc.nextInt();
        System.out.println();

        
        if (choice == 1){
            Addition();
        }
        else if (choice == 2){
            Subtraction();
        }
        else if (choice == 3){
            Division();
        }
        else if (choice == 4){
            Multiplication();
        }

        System.out.println();
        sc.close();
	}
		static void Addition() {
			
			int number, number2; 
			Scanner sc= new  Scanner(System.in);
			System.out.println("Enter Ist number: ");
			number= sc.nextInt();
			System.out.println("Enter 2nd number: ");
			number2= sc.nextInt();
			sc.close();
			System.out.println("Sum of " +number +" and " +number2 +" = " +(number+ number2));
			
			
		}
		static void Subtraction() {
			int number, number2; 
			Scanner sc= new  Scanner(System.in);
			System.out.println("Enter Ist number: ");
			number= sc.nextInt();
			System.out.println("Enter 2nd number: ");
			number2= sc.nextInt();
			sc.close();
			System.out.println("Subtract of " +number +" and " +number2 +" = " +(number- number2));}



		static void Multiplication() {
	int number, number2; 
	Scanner sc= new  Scanner(System.in);
	System.out.println("Enter Ist number: ");
	number= sc.nextInt();
	System.out.println("Enter 2nd number: ");
	number2= sc.nextInt();
	sc.close();
	System.out.println("Multiple of " +number +" and " +number2 +" = " +(number* number2));}

		static void Division() {
			int number, number2; 
			Scanner sc= new  Scanner(System.in);
			System.out.println("Enter Ist number: ");
			number= sc.nextInt();
			System.out.println("Enter 2nd number: ");
			number2= sc.nextInt();
			sc.close();
			System.out.println("Division of " +number +" and " +number2 +" = " +(number/ number2));}

}

