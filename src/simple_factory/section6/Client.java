package simple_factory.section6;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product product1 = Factory.createProduct("Product1"); 
		Product product2 = Factory.createProduct("Product2");
		product1.doSomething();
		product2.doSomething();
	}

}
