package bitManupilation;

public class B_Masking_Find {

	public static void main(String[] args) {
		//Find program in bit masking
		int N= 12;
		int F= 1;
		//
		F=F<<3;
		int result= N&F;
		if(result==0) {
			System.out.println("False");
			}else 
				System.out.println("True");

	}

}
