package ch06;

import java.util.ArrayList;

public class CollectionEx01 {

	public static void main(String[] args) {
		// int,double,char,boolean => 기본자료형(값)
		// String, 커스텀자료형(클래스) => 래퍼런스자료형(주소)
		// 래핑 클래스 = Integer, Double, Character, Boolean
		ArrayList<Integer> c1 = new ArrayList<>();
		
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
		c1.add(6);
		
		// for문 (반복문) = 리팩토링
		int size = c1.size();
		System.out.println("사이즈 :" + c1.size());
		for(int i=0; i<size; i++) {
			System.out.println(c1.get(i));
		}
	}

}
