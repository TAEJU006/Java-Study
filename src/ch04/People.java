package ch04;

// this�� heap������ ����Ŵ
public class People {
	// �پ缺�� ���ؼ� �ʱ�ȭ ���� ����
	String name;
	int age;
	
	// ����Ʈ ������ ������? ���� -> .java -> .class �������Ҷ� �ڹٰ� �ڵ����� �ڵ� �������
	// ���� ���� �����ڸ� �����Ͽ��� ������ ����Ʈ ������ ����
	public People(String name, int age) { // �μ� ȫ�浿, 16�� �Ѱܼ� �Ű����� name, age�� ����
		System.out.println("People �޼��� ���� name : "+name);
		System.out.println("People �޼��� ���� age : "+age);
		this.name=name;
		this.name=name; 
	}
}
