package conditionalstatements;

import java.util.Scanner;

public class SwitchCaseEx1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 to enter the quiz, 0 to not participate");
		int EntNum= sc.nextInt();
		if(EntNum==1) {
			System.out.println("Welcome to the quiz");
			System.out.println("Q1. What is the sum of 2 and 5");
			int ans= sc.nextInt();
			switch(ans) {
				
			case 7 :
					System.out.println("Correct answer");
					break;
			default:
				System.out.println("Wrong answer");
			}
			System.out.println("You progress to the Next round:");
			System.out.println("Enter 1 to continue to the next round and 0 to exit");
			int SecondR= sc.nextInt();
			if(SecondR==1) {
				System.out.println("Your question for the second round is: ");
				System.out.println("What is 10 multiple 7?");
				int SecQS= sc.nextInt();
				switch(SecQS) {
				case 70:
					System.out.println("Correct answer");
					System.out.println("You have completed the quiz");
					break;
				default:
					System.out.println("Wrong answer!");
					System.out.println("Better luck next time");
				}
			}else {
				System.out.println("Hope to see you again");}
			
			
			
		} else if(EntNum==0) 
				System.out.println("Hope you return again");
		
		

	}
	

}
