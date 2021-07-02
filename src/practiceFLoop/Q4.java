package practiceFLoop;

import java.math.*;

//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
//(Do not use Java built-in method)

public class Q4 {
	static int power(int base, int exp) {
		int count, result = 1;  
		  
	    for(count = 1; count <= exp; count++)  
	    {  
	        result = result * base;  
	    }  
	  
	    return(result);
	}

	public static void main(String[] args) {
	
		System.out.println(	power(2, 4));
		
		//using java built-in method
		System.out.println((int)Math.pow(5, 3));

	}

}
