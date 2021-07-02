package bitManupilation;

public class ExorQ1 {
	
	static int FindOne(int arr[], int arr_size) {
		int res= arr[0];
		for(int i=1; i<arr_size; i++) {
			res= res^ arr[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int array[]= {1,2,3,4,1,2,4};
		int n= array.length;
		System.out.println("Non repeating element= " +FindOne(array, n));
	}

}



















//int x= 5;
//int y=5;
//int z=6;
//int result= 5^5^6;
//System.out.println(result);

//
//int x[]= {2,2,4,4,3};
//int n= x.length;
//int result=0;
//int i=0;
//for(int i=0; i<x.length-1; i++) {
//	for(int j=0; j<x.length; j++) {
//		result= x[i]^ x[i+1]^ x[i+2] ^ x[i+3] ^x[x.length-1];
//System.out.println(result);
//}

