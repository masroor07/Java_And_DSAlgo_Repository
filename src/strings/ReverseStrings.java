package strings;

import java.util.Scanner;

public class ReverseStrings {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int n= s.length();
        String ans="";
        for(int i=n -1; i>=0;i--) {
        	ans= ans +s.charAt(i)  ;
        	
        }
        if(s.equals(ans))
        	System.out.println("Yes");
        else
        	System.out.println("No");
       
        
       

        
        
    }

}
