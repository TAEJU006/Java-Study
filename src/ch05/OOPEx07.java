package ch05;

// 추상클래스
abstract class Animal{
	abstract void speak(); // 추상메서드 (몸체가{} 없다)
}

class Dog extends Animal{
	// 오버라이드(Animal의 speak() 무효화)
	void speak() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	void speak() {
		System.out.println("야옹");
	}
}

// 신입아 Bird를 만들어, Animal을 상속해서 만들어 // sysou 짹짹

class Bird extends Animal{

	// 추상메서드를 부모가 가지고 있으면 자식은 추상메서드를 반드시 구현해야한다
	@Override
	void speak() {
		System.out.println("짹짹");
		
	}
	
}

public class OOPEx07 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Bird();
		a1.speak(); // 동적 바인딩 왜? 부모의 메서드 무효화
		a2.speak();
		a3.speak();	
	}

}
