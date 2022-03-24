package ch02;


/*
 * ���� : Stack(�������� = �޼��尡 ����ɶ� �޸𸮿� �Ҵ� = �޼��尡 ����ɶ� �޸𸮿��� �����)
 * 	   : Heap(�������� = new �Ҷ� �޸𸮿� �Ҵ� = ���̻� �������� ������ �޸𸮿��� �����)
 * 	   : Static(�������� = main �޼��尡 ����Ǳ� ���� �޸𸮿� �Ҵ� = main �޼��尡 ����Ǹ� �޸𸮿��� �����)
 */

public class StackEx02 {
	
	static int sum = 20; // �������� (static) main �޼��尡 ���۵Ǳ��� sum�� �Ҵ�
	int value = 50; // �������� (heap) // ���̻� �������� ������ �ڵ����� �����
	
	static void a() {
		// a �޼��尡 ����ɶ� stack ������ n1�� �Ҵ�, a�޼��尡 ����Ǹ� �޸𸮿��� �����
		int n1 = 1; // a �޼����� stack ������ ���� (��������) (stack)
		System.out.println(n1);
		
		//21�� ������ ����Ƿ��� �Ҷ� static ������ �Ҵ��ؾ� �ϴµ� �Ұ���, static ���� �Ҵ��� main ���� ������ ����
		//static int n3 = 2;
	
	}
	
	public static void main(String[] args) {
		a(); // �޼��� ȣ��
		System.out.println(sum);
		StackEx02 s = new StackEx02();
		System.out.println(s.value);
		System.out.println("test1 - ���̻� s ������ �������� �ʱ� ������ �޸𸮿��� �����");
		System.out.println("test2");
		
	}
}
