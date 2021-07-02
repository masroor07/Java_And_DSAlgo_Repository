package conditionalstatements;
import java.util.Scanner;

public class IfElseTernery {

	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		//Shorthand for if else
		//syntax:  variable=(condition)? trueExpression :falseExpression
		int a= sc.nextInt();
		int b= sc.nextInt();
		int maxOfBoth= 0;
		maxOfBoth= a>b? a:b;
		System.out.println("Max of two is"+ " " + maxOfBoth);
	}

}
