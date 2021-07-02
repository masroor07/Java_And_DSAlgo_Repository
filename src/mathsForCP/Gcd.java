package mathsForCP;

public class Gcd {

	public static void main(String[] args) {
		
		
		System.out.println(gcd(15, 0));

	}
	
	static int gcd(int a, int b) {
		if(b==0) return a;
		
		return gcd(b, a%b);
	}

}
