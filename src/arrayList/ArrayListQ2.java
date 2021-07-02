package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListQ2 {
//	public static int simpleArraySum(List<Integer> ar) {
//        int sum=0;
//    for(int i= 0; i<=ar.size(); i++ ){
//    	sum= ar[i]+ sum;
//           
//           
//    }
//    return sum;
//    }  

	public static void main(String[] args) {
		List<Integer> Marks= new LinkedList();
		Marks.add(1);
		Marks.add(1);
		Marks.add(1);
		Marks.add(1);
		Marks.add(0,2);
		
		System.out.println(Marks);
		//sum of all the elements of an array
		int sum = 0;
		for(int i = 0; i < Marks.size(); i++)
		    sum += Marks.get(i);
		System.out.println(sum);
		
		//prints all the elements of the array
		for(int i = 0; i < Marks.size(); i++) {
			System.out.print(Marks.get(i)+" " );
		}
		List<Integer> MarksRev= new ArrayList();
		for(int i = Marks.size(); i <0 ; i++) {
			System.out.println(MarksRev.get(i));
		}
		

	}
	
	

}
