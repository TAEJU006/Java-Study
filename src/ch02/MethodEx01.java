package ch02;

class �մ�{
	
	// �մ��� ����
	void Ŀ�Ǹ��ñ�() { // �Լ��� ����
		System.out.println("�մ��� Ŀ�Ǹ� ���ſ�");
	}
}

public class MethodEx01 {
	
	// �޼��� = MethodEx01 Ŭ������ ����
	static void start() {
		System.out.println("������ �ݰ������"); // String Ÿ��
		System.out.println("START �޼��� ����");
		
	}
	
	public static void main(String[] args) {
		MethodEx01.start();
		�մ� s = new �մ�();
		s.Ŀ�Ǹ��ñ�(); // �Լ��� ���� ����
	}

}
