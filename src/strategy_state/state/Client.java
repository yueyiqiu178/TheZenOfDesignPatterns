package strategy_state.state;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//����һ����ͨ����
		Human human = new Human();
		//����һ���˵ĳ�ʼ״̬
		human.setState(new ChildState());
		System.out.println("====��ͯ����Ҫ����=====");
		human.work();
		System.out.println("\n====�����˵���Ҫ����=====");
		human.work();
		System.out.println("\n====�����˵���Ҫ����=====");
		human.work();
	}
}