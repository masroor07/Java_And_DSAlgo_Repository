package conditionalstatements;
import java.util.Scanner;

public class SimCalcSwitchCase {

	public static void main(String[] args) {
		 Scanner sc= new  Scanner(System.in);
		 
		 System.out.println("Enter first Number:");
		 int a= sc.nextInt();
		 System.out.println("Enter operation: ");
		//yet to understand strings, will cover it later(the next two lines)
		 sc.nextLine();
		 char operation = sc.nextLine().charAt(0);
		 System.out.println("Enter second Number");
		 int b= sc.nextInt();

		 int result=0;
		 
		 
		
		
		
			 switch(operation) {
		 
		 
		 case '+':
			 result= a+b;
			 System.out.println(result);
			 break;
			 
		 case '-':
			 result= a-b;
			 System.out.println(result);
			 break;
			 
		 case '*':
			 result= a*b;
			 System.out.println(result);
			 break;
			 
		 case '/':
			 result= a/b;
			 System.out.println(result);
			 break;
		 }
//		 System.out.println("Enter 1 to continue and 2 to exit");
//		 int option= sc.nextInt();	
//		 
//		 if(option==1) {
//			break 
//		 }
		 }
	}

		 
		 