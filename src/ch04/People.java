package ch04;

// this는 heap공간을 가르킴
public class People {
	// 다양성을 위해서 초기화 하지 않음
	String name;
	int age;
	
	// 디폴트 생성자 있을까? 있음 -> .java -> .class 컴파일할때 자바가 자동으로 코드 만들어줌
	// 내가 직접 생성자를 정의하였기 때문에 디폴트 생성자 없음
	public People(String name, int age) { // 인수 홍길동, 16을 넘겨서 매개변수 name, age가 받음
		System.out.println("People 메서드 스택 name : "+name);
		System.out.println("People 메서드 스택 age : "+age);
		this.name=name;
		this.name=name; 
	}
}
