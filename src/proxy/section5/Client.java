package proxy.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public class Client {

	public static void main(String[] args) {
		//�������Ϸ�Ľ�ɫ
		IGamePlayer player = new GamePlayer("����");
		
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2009-8-25 10:45");
		player.login("zhangSan", "password");
		//��ʼɱ��
		player.killBoss();
		//����
		player.upgrade();
		//��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ�2009-8-26 03:40");
		
	}

}