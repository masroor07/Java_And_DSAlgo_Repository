package oOPS;

//creating a class vehicle
class vehicle{
	int wheels;
	int headLights;
// passing a no  arg constructor
vehicle(){
	wheels=4;
}
}

public class Constructors {

	public static void main(String[] args) {
		vehicle ferrari= new vehicle();
		System.out.println(ferrari.wheels +" " +ferrari.headLights);

	}

}
