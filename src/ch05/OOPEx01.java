package ch05;

// ���� ������ = default ����������, public ���� ������, private ���� ������
class Player{
	// ���� = �ʵ�
	String name; // �̸�
	private int thirsty; // �񸶸� (0 ~ 100) // �ܺ� Ŭ�������� ���� �Ұ���

	public Player(String name,int thirsty) {
		this.name = name;
		this.thirsty = thirsty;
	}
	
	// ���� = �޼��� = ���� ����
	void �����ñ�() {
		System.out.println("�����ñ� ����");
		this.thirsty = this.thirsty - 50;
		
	}
	int �񸶸�����Ȯ��() {
		return this.thirsty;
	}
}

public class OOPEx01 {

	public static void main(String[] args) {
		Player p1 = new Player("ȫ�浿",100);
		System.out.println("�̸��� :" + p1.name);
		System.out.println("�������� :" + p1.�񸶸�����Ȯ��());
		
		// 1. ù��° �ó����� = ���� (x)
		// p1.thirsty = 50; // ���ξ��� �������� ���� = ����
		// System.out.println("�������� : " + p1.thirsty);
		
		// 2. �ι�° �ó����� = ���°� ������ ������ (x) - �Ǽ��� �� ����(����)
		// p1.�����ñ�();
		// System.out.println("�������� : " + p1.thirsty);
		
		// 3. ����° �ó�����
		p1.�����ñ�(); // �Ǽ��� �� ����
		System.out.println("�������� :" + p1.�񸶸�����Ȯ��());
	}

}
