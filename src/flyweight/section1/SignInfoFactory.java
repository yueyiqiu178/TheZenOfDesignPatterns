package flyweight.section1;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SignInfoFactory {
	//报名信息的对象工厂
	public static SignInfo getSignInfo(){
		return new SignInfo();
	}
}
