package ch05;

// �߻�Ŭ����
abstract class Animal{
	abstract void speak(); // �߻�޼��� (��ü��{} ����)
}

class Dog extends Animal{
	// �������̵�(Animal�� speak() ��ȿȭ)
	void speak() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	void speak() {
		System.out.println("�߿�");
	}
}

// ���Ծ� Bird�� �����, Animal�� ����ؼ� ����� // sysou ±±

class Bird extends Animal{

	// �߻�޼��带 �θ� ������ ������ �ڽ��� �߻�޼��带 �ݵ�� �����ؾ��Ѵ�
	@Override
	void speak() {
		System.out.println("±±");
		
	}
	
}

public class OOPEx07 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Bird();
		a1.speak(); // ���� ���ε� ��? �θ��� �޼��� ��ȿȭ
		a2.speak();
		a3.speak();	
	}

}
