package ch05;

class 프로토스유닛{
	String name = "프로토스유닛";
	void 기본공격(프로토스유닛 e1) {} // 무효화
		
	String 이름확인() { // 무효화
		return "?";
	}
}
class 질럿 extends 프로토스유닛{
	String name = "질럿";
	
	// 오버라이드 = 부모의 메서드를 무효화하다
	void 기본공격(프로토스유닛 e1) {
		// System.out.println("질럿 메서드");
		System.out.println(this.name + e1.이름확인() + "을 공격합니다");
	}
	
	//오버라이드 부모의 메서드를 무효화 하다
	String 이름확인() {
		return name;
	}
}

class 드라군 extends 프로토스유닛{
	String name = "드라군";
	
	// 오버라이드 = 부모의 메서드를 무효화하다
		void 기본공격(프로토스유닛 e1) {
			// System.out.println("질럿 메서드");
			System.out.println(this.name + e1.이름확인() + "을 공격합니다");
		}
	
	//오버라이드 부모의 메서드를 무효화 하다
		String 이름확인() {
			return name;
		}
}
class 다크템플러 extends 프로토스유닛{
	String name = "다크템플러";
	
	// 오버라이드 = 부모의 메서드를 무효화하다
			void 기본공격(프로토스유닛 e1) {
				// System.out.println("질럿 메서드");
				System.out.println(this.name + e1.이름확인() + "을 공격합니다");
			}
	
	//오버라이드 부모의 메서드를 무효화 하다
		String 이름확인() {
			return name;
		}
}

// 신입 -> 리버라는 유닛을 하나 만들어 (오버라이드 해서 만들어)
// 팀장 -> 프로토스유닛으로 상속 (공격메서드, 이름을 확인하는 메서드 필요해)
//	  -> name이라는 변수 하나 만들어! - 리버
// 누구를 공격하라는 거죠? -> 프로토스 유닛
// 테스트 해봐 -> 질럿으로 리버한번 공격해봐
// 팀장님 ?가 뜨는데요?
// 아 그거 너 메서드 이름 머라고 지었어? -> 이름체크
// 기본공격이라고 이름을 바꿔봐! -> 잉 잘되네요 히우웅ㅜ
class 리버 extends 프로토스유닛{
	String name = "리버";
	
	void 기본공격(프로토스유닛 e1){
		System.out.println(this.name + "이" + e1.이름확인()+"을 공격합니다");
	}
	
	// 오버라이딩이 안됐네 -> 무효화가 안되자나
	String 이름확인() {
		return name;
	}
}

public class OOPEx06 {

	public static void main(String[] args) {
		프로토스유닛 u1 = new 질럿(); // (질럿, 프로토스유닛v)
		프로토스유닛 u2 = new 드라군();// (드라군, 프로토스유닛v)
		프로토스유닛 u3 = new 다크템플러();// (다크템플러, 프로토스유닛v)
		프로토스유닛 u4 = new 리버(); // (
		
		u1.기본공격(u2);
		u2.기본공격(u1);
		u2.기본공격(u3);
		u1.기본공격(u4);
	}

}
