package ch03;

public class CastEx01 {

	public static void main(String[] args) {
		// 캐스팅 (다운캐스팅, 업캐스팅)
		int n1 = 100; // 4Byte
		double d1 = n1; // 8Byte (8Byte <- 4Byte)
		System.out.println(d1); // 업캐스팅 (묵시적)
		
		double d2 = 100.6;
		
		int n2 = (int)d2; // double을 int로 변환 x
		System.out.println(n2); // 다운캐스팅 (명시적) 데이터 유실이 될 수 있다
		
		int money = 130;
		System.out.println(130/100);
		System.out.println(money/100);
		System.out.println(money/100.0); // int/double => double

	}

}
