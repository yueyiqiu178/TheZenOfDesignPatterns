package proxy.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		Subject subject = new RealSubject();		
		Proxy proxy = new Proxy(subject);
		proxy.request();
	}
}
