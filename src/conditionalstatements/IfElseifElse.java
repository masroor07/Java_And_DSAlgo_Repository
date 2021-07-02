package conditionalstatements;
//Import scanner function library
import java.util.Scanner;


public class IfElseifElse {

	public static void main(String[] args) {
		//canner variable object call
		Scanner sc= new Scanner(System.in);
		// If elseif and  else statement in java
		float num= sc.nextFloat();
				if(num<100) {
					System.out.println("Number is less than 100");
				} else if(num>100 && num<=200) {
					System.out.println("Number is greater than 100 but less than 200");
				}else if(num/2 ==150) {
					System.out.println("Number is divisible by 2");
				}else {
					System.out.println("doesnt satisfy any condition");
				}

	}

}
