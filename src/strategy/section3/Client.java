package strategy.section3;

import java.util.Arrays;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//�������������������
		int a = Integer.parseInt(args[0]);
		String symbol = args[1];  //����
		int b = Integer.parseInt(args[2]);
		System.out.println("����Ĳ���Ϊ��"+Arrays.toString(args));
		
		//����һ��������
		Calculator cal = new Calculator();
		System.out.println("���н��Ϊ��"+a + symbol + b + "=" + cal.exec(a, b, symbol));
		
		
	}
}