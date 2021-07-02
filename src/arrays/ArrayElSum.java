package arrays;



public class ArrayElSum {
	
	

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		int sum=0;
//		int n= ar.length;
		for (int i=0; i<= ar.length-1; i++) {
			sum= sum+ar[i];
		}
		System.out.println(sum);
		System.out.println(ar.length);

	}

}
