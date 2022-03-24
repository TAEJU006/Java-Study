package ch02;


/*
 * 정리 : Stack(지역변수 = 메서드가 실행될때 메모리에 할당 = 메서드가 종료될때 메모리에서 사라짐)
 * 	   : Heap(전역변수 = new 할때 메모리에 할당 = 더이상 참조하지 않을때 메모리에서 사라짐)
 * 	   : Static(전역변수 = main 메서드가 실행되기 전에 메모리에 할당 = main 메서드가 종료되면 메모리에서 사라짐)
 */

public class StackEx02 {
	
	static int sum = 20; // 전역변수 (static) main 메서드가 시작되기전 sum이 할당
	int value = 50; // 전역변수 (heap) // 더이상 참조하지 않을때 자동으로 사라짐
	
	static void a() {
		// a 메서드가 실행될때 stack 공간에 n1이 할당, a메서드가 종료되면 메모리에서 사라짐
		int n1 = 1; // a 메서드의 stack 영역에 저장 (지역변수) (stack)
		System.out.println(n1);
		
		//21번 라인이 실행되려고 할때 static 공간에 할당해야 하는데 불가능, static 공간 할당은 main 실행 전에만 가능
		//static int n3 = 2;
	
	}
	
	public static void main(String[] args) {
		a(); // 메서드 호출
		System.out.println(sum);
		StackEx02 s = new StackEx02();
		System.out.println(s.value);
		System.out.println("test1 - 더이상 s 변수를 참조하지 않기 때문에 메모리에서 사라짐");
		System.out.println("test2");
		
	}
}
