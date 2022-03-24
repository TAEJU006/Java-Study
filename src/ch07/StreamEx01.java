package ch07;

import java.io.InputStream;

public class StreamEx01 {

	public static void main(String[] args) {
		InputStream in = System.in; // System.im(키보드)
		
		// 1. 키보드는 A를 인코딩해서 01000001 으로 컴퓨터에게 전송
		// 2. ByteStream으로 흘러들어간다(Input)
		// 3. read() 메서드로 01000001 => 65로 디코딩 함
		// 4. 65를 문자로 부호화시킨다
		try {
			int data = in.read();
			System.out.println((char)data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
