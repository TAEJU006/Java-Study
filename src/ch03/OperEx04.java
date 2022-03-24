package ch03;

public class OperEx04 {
	public static void main(String[] args) {
		System.out.println(1==1 && 1==2); // true and false
		System.out.println(1==1 || 1==2); // true or false
		//or은 한쪽만 나와도 true 그래서 앞 true면 뒤에 뭐가 나와도 상관 no
		
		int n1=1;
		int n2=2;
		System.out.println(n1==n1 || n1==n2);
		
		// 상수 = 변하지 않는 수(1)
		// 변수 = 변하는 수 (n1)
	}
}
