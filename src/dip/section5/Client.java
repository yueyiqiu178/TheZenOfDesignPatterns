package dip.section5;

public class Client {

	public static void main(String[] args) {
		
		IDriver driver1 = new Driver();
		driver1.setCar(new BMW());
		IDriver driver2 = new Driver();
		driver2.setCar(new Benz());
		
		driver1.drive();
		driver2.drive();
	}

}
