
public class Shirt {

//	private String color;
//	private char size;
	
	public static void putOn() {
		System.out.println("Shirt is now on!");
    }
	
	public static void takeOff() {
		   System.out.println("Shirt is now off!");
	}
	
	public static void main(String[] args) {
		putOn();
		 System.out.println("interruption");
		takeOff();
	}	
}
