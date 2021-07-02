package loops;

import java.util.Scanner;

public class ForLoopEx1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows= sc.nextInt();
		System.out.println("Enter the number of Cols: ");
		int cols= sc.nextInt();
		
	for(int i=0; i<=rows-1;i++) {
		for(int j=1; j<=cols-i;j++) {
			System.out.print("*");
		}
		System.out.println();
		
		
	}
	
	}

}
