package ch07;

class 총{
	void shoot() {
		System.out.println("총을 발사했습니다");
	}
}

public class ExceptionEx01 {

	public static void main(String[] args) {
		// 컴파일 예외 (JVM이 알수 있음)
		try {
			System.out.println("잠자기 시작");
			Thread.sleep(1000); // 메인 스레드 1초동안 잠을 잔다!!!
			System.out.println("잠자기 끝");
		} catch (Exception e) { // 방해!!!
			e.printStackTrace();
		}

		// 런타임 예외 (개발자가 알 수 있다)
		int[] nums = {1,2,3};
		try {
			System.out.println(nums[3]); // 강제로 종료!!~
		} catch (RuntimeException e) {
			// catch의 역할은 try(시도) 하다가 예외가 발생하면 어떻게 처리할지를 정의하는 영역
			System.out.println("괜찮아 그냥 진행해");
			System.out.println(e.getMessage()); // 로그 파일 남겨 놔야 함
			e.printStackTrace();
		}
		
		총 s = null;
		try {	
			s.shoot();
		} catch (RuntimeException e) {
			System.out.println("총이 없어서 총을 만들고 다시 시도하겠습니다");
			s = new 총();
			s.shoot();
		} 
		
		
		System.out.println("메인 스레드 종료");
		
	}

}
