package arrays;
import java.util.Arrays;
public class SortingArray {

	public static void main(String[] args) {
		//Sorting an array using array.sort();

		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
		Arrays.sort(array);
		System.out.println("Elements of sorted array are: ");
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		

	}

}
