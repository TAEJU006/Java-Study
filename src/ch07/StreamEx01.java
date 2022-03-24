package ch07;

import java.io.InputStream;

public class StreamEx01 {

	public static void main(String[] args) {
		InputStream in = System.in; // System.im(Ű����)
		
		// 1. Ű����� A�� ���ڵ��ؼ� 01000001 ���� ��ǻ�Ϳ��� ����
		// 2. ByteStream���� �귯����(Input)
		// 3. read() �޼���� 01000001 => 65�� ���ڵ� ��
		// 4. 65�� ���ڷ� ��ȣȭ��Ų��
		try {
			int data = in.read();
			System.out.println((char)data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
