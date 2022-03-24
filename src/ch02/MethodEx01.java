package ch02;

class 손님{
	
	// 손님의 행위
	void 커피마시기() { // 함수의 내부
		System.out.println("손님이 커피를 마셔요");
	}
}

public class MethodEx01 {
	
	// 메서드 = MethodEx01 클래스의 행위
	static void start() {
		System.out.println("만나서 반가워요용"); // String 타입
		System.out.println("START 메서드 종료");
		
	}
	
	public static void main(String[] args) {
		MethodEx01.start();
		손님 s = new 손님();
		s.커피마시기(); // 함수의 내부 실행
	}

}
