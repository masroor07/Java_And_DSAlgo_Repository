package oOPS;

public class MaxN_usingMethods {

	public static void main(String[] args) {
		//passing args
		int firstNumber =32;
		int secondnumber= 23;
		//calling an array
		
		float result= maxOf(100, 4);
		
		float i= maxOf(firstNumber, secondnumber);
		System.out.println("Greater number among these two= ");
		System.out.println(result);
		System.out.println("Greater number among these two= ");
		System.out.println(i);
		sayhi();
	}
	//defining a function
 static float maxOf(int a, int b) {
	if(a>b) {
		return a;
	} else {
			return b;
		
	}
 }
 static void sayhi() {
	 System.out.println("Hi bebe!");
 }
}

