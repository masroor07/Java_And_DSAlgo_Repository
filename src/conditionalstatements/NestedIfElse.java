package conditionalstatements;

public class NestedIfElse {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int result= 0;
		
		if (a>b) {
			if(a>c) {
				result= a;
			}else {
				result= c;
			}
		} else {
			if(b>c) {
				result= b;
			}else {
				result= c;
			}
			
		}
		System.out.println("Largest Number="+ result);

	}

}
