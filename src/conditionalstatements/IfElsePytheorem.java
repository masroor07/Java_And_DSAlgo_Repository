package conditionalstatements;

import java.util.Scanner;

public class IfElsePytheorem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float AB= sc.nextFloat();
		float BC= sc.nextFloat();
		float CA= sc.nextFloat();
				if(AB*AB== BC*BC+ CA*CA) {
					System.out.println("is a right angle triangle");
				}
				else { 
					System.out.println("is not a right angle triangle");
				}
				
	}

}
