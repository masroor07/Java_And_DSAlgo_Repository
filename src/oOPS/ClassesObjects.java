package oOPS;
//defining a class phone 
class phone {
	//various states of the class(properties)
	String model;
	boolean hasportrait;
	float CamRes, iOSversion;
	//various behavious of the class(various functions)
	public void camera() {
		System.out.println( model+ " has a "+ CamRes +" MegaPixel Camera." );
	}
	public void description() {
		System.out.println(model+ "runs on an IOS version "+ iOSversion +" and has a portrait mode " +hasportrait);
	}
}
public class ClassesObjects {

	public static void main(String[] args) {
		//we create classes from the object phone
		phone phone1= new phone();
		phone phone2= new phone();
		//we define various states of the objects
		phone1.model= "Iphone 7 ";
		phone1.hasportrait= false;
		phone1.iOSversion = 14.2f;
		phone2.model= "Iphone 11";
		phone2.hasportrait= true;
		phone2.CamRes= 16;
		//here we execute behaviour of the objects
		phone1.description();
		phone2.camera();
				
		

	}

}
