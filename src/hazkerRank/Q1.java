package hazkerRank;
//  Staircase
import java.util.Scanner;

public class Q1 {
	 public static void staircase(int n) {
		   
		        int c = n - 1;
		        for(int i = 0; i < n; i++)
		        {
		            for(int j = 0; j < n; j++)
		            {
		                if(j < c)
		                {
		                    System.out.print(" ");
		                }
		                else
		                {
		                    System.out.print("#");
		                }
		            }
		              System.out.println();
		              c = c - 1;
		        }

		    }

	public static void main(String[] args) {

		staircase(6);
		
		
		
		
		
		
		
		
					
			
	}
	}


