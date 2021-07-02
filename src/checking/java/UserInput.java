package checking.java;
//import the scanner function library
import java.util.Scanner;

public class UserInput {

	
	    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string and number");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.println(s1 +" " +x);            }
//            System.out.println(s1 +" " +x);
		
	}

}
