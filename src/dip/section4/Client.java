package dip.section4;

public class Client {

	public static void main(String[] args) {
		
		IDriver driver1 = new Driver(new BMW());
		IDriver driver2 = new Driver(new Benz());
		
		driver1.drive();
		driver2.drive();
	}

}
