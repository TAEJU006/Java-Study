package ch04;

// 값을 초기화 하지 않는 이유는 new 할때마다 다른 상태를 갖는 고양이를 만들기 위해서
public class Cat {
	String name;
	String color;
	
	//Cat() 생성자를 디폴트(기본) 생성자라고 한다
	// 개발자가 생략 가능한 코드
	public Cat() {
	}
	
	// 개발자 직접 생성자 구현 = 디폴트 생성자 생기지 않음
	public Cat(String n, String c) { // 생성자(메서드)
		System.out.println("고양이 탄생함");
		System.out.println("n: "+n);
		System.out.println("c:" +c);
		
		//String n, String c는 지역변수 = Cat() 이라는 생성자(메서드)가 가진 지역변수
		name = n;
		color = c;
	}
}
