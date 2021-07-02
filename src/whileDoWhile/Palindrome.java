package whileDoWhile;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int temp= n;
		int reversedNumber= 0;
				while(temp>0) {
					int lastDigit= temp%10;
					reversedNumber=  reversedNumber *10 +lastDigit;
					temp/= 10;
					System.out.println("Number= " +n +" last Number= " +lastDigit +"temp= " +temp  );
				}
				if (reversedNumber ==n) {
				System.out.println("N is a palindrome number");
				} else {
				System.out.println("n is not");
	}

}
}