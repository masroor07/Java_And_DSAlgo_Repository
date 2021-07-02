package oOPS;

class mobiles{
	String brand;
	int series;
	int camera;
	//passong a constructor with args
	mobiles(String model, int s){
		brand= model;
		series= s;
		
	}
	mobiles(int reso, String model){
		camera= reso;
		
	}
}


public class ContructorsWithArgs {

	public static void main(String[] args) {
		//creating objects with predefined parameters
		mobiles phone1= new mobiles ("iphone", 8);
		phone1.camera= 16;
		mobiles phone2= new mobiles("Samsung S", 20);
		System.out.println(phone1.camera);
		

	}

}
