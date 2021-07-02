package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		//here we learn arithmetic operators in Java and thier syntaxs
		
		int a= 30;
		int b= 40;
		int c= a+b;
		//by adding ++ before the number, increments in the sam e line else, increments in the next line. Same goes for the --
		int g= ++b;
		//Manual type casting, by explicitely declaring a and b as double
		double d= (double)a / (double)b;
		int f= b%a;
		System.out.println("Sum="+c);
		System.out.println("Division="+d);
		System.out.println("Modulo="+f);	
		System.out.println(g);
	}

}
