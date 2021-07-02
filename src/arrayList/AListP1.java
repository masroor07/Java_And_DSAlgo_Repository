package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AListP1 {

	public static void main(String[] args) {
		//adding Generics using<datatype> in these 
		List<String> fruits =new LinkedList();
		List<String> vegetables =new ArrayList();
		
		fruits.add("Apple");
		fruits.add("Mango");
		
		
		vegetables.add("tomato");
		vegetables.add("potato");
		
		
	//sets the neew value to the index
		fruits.set(1, "AAm");
		
		//removes the particular element
		fruits.remove(0);
		
		
		
		
		
		
		//adds a collection to one collection
		fruits.addAll(vegetables);
		
		
		System.out.println(fruits);
		
		//gets the element at a particular index
		
		System.out.println(fruits.get(2));
		
		
		
		
		ArrayList<Integer> marks= new ArrayList();
		
		marks.add(95);
		marks.add(25);
		marks.add(65);
		
//		List<String> toRemove = new ArrayList();
//		toRemove.add("Apple");
//		toRemove.add("Hi");
//		fruits.removeAll(toRemove);
//		
//		System.out.println(fruits);
		
		
		
		
//		to clear the whole arraylist
//		marks.clear();
		System.out.println("Size of Marks ArrayList: ");
		System.out.println(marks.size());
		System.out.println("And the elements are: ");
		System.out.println(marks);
		
//		whether the element is there or not
		
		System.out.println(fruits.contains("Guava"));
		

		
		

	}

}
