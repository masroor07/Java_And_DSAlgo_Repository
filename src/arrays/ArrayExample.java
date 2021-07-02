package arrays;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a[][]= { {1,2,3,4,5,6},{
	    5,6,7,8,9,10	
		}
		};
			for (int i=0; i<2; i++) {
				int sum = 0 ;
				for(int j=0; j<6;j++)
				sum+=a[i][j];
				System.out.println("Row " + (i+1) +" = " +sum);
				
			}
				
						
			
		}
		}
		
		
		

	

