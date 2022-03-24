package ch02;

public class MethodEx02 {
	
	//void는 리턴하지 않겠다
	static int add() { //호출이 되면 중괄호 내부가 실행, 이때 Stack 공간이 메모리에 생성
			int sum = 5+6;
			// system.out.println(sum);
			return sum;
	}
	
	public static void main(String[] args) {
		int result = add();
		System.out.println(result);
	}

}
