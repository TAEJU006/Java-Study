package ch05;


class 임꺽정{
	void 달리기() {
		System.out.println("달리기1");
	}
	// 오버로딩
	void 달리기(int speed) {
		System.out.println("달리기2");
	}
	// 오버로딩
	void 달리기(double speed) {
		System.out.println("달리기3");
	}
	void 달리기(int speed,double power) {
		System.out.println("달리기4");
	}
}

//오버로딩의 문법은 끝!
public class OOPEx04 {

	public static void main(String[] args) {
		임꺽정 e = new 임꺽정();
		e.달리기();
		e.달리기(1);
		e.달리기(5.0);
		e.달리기(1,5.0);
	}

}
