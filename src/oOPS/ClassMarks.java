package oOPS;

import java.util.Scanner;

class Marks{
	String name;
	int total, english, math, Science, computer, rollNo;
	public void result(){
		if(total>=60) {
			System.out.println("Student, namely " +name +" with roll number "+rollNo +" has scored " +total +" and has passed the test");
		}else {
			System.out.println("Student has failed the test");
		}
	}
}
public class ClassMarks {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Marks student1= new Marks();
		System.out.println("Enter student's name= ");
		student1.name= sc.nextLine();
		System.out.println(student1.name);
		
		student1.rollNo= 107;
		System.out.println("Enter students Marks in English= ");
		student1.english= sc.nextInt();
		System.out.println("Enter students Marks in Maths= ");
		student1.math= sc.nextInt();
		System.out.println("Enter students Marks in Science= ");
		student1.Science= sc.nextInt();
		System.out.println("Enter students Marks in Computer= ");
		student1.computer= sc.nextInt();
		student1.total= student1.english+ student1.math +student1.computer+ student1.Science;
		student1.result();

	}

}
