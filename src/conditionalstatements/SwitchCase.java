package conditionalstatements;

public class SwitchCase {

	public static void main(String[] args) {
		int dayOfWeek= 2;
		
		switch(dayOfWeek) {
		//to avoid repetition of a case with sameoutput we use case 1: case 2: line of code
		case 1: case 2:
			System.out.println("I am on leave");
			break;
		 case 3:
			System.out.println("Shit");
			break;
		}

	}

}
