package mediator.section3;

public class Client {

	public static void main(String[] args) {
		
		Mediator mediator = new ConcreteMediator();
		
		mediator.setC1(new ConcreteColleague1(mediator));
		mediator.setC2(new ConcreteColleague2(mediator));
		
		ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 c2 = new ConcreteColleague2(mediator);
		
		c1.selfMethod1();
		c1.depMethod1();
		
		c2.selfMethod2();
		c2.depMethod2();
	}

}
