package ch05;

interface MoveAble{
	// public abstract�� ����
	void ��();
	void �Ʒ�();
	void ����();
	void ������();
	void �����ñ�();
}

interface MoveAble2{
	// public abstract�� ����
	void ��();
	void �Ʒ�();
	void ����();
	void ������();
	void ���ٴڼ���();
}


abstract class �糪��� implements MoveAble{
	abstract void ����(); // �̿ϼ� �޼���
	@Override
	public void ��() {
		System.out.println("���� �̵�");
		
	}
	@Override
	public void �Ʒ�() {
		System.out.println("�Ʒ��� �̵�");
		
	}
	@Override
	public void ������() {
		System.out.println("���������� �̵�");
		
	}
	@Override
	public void ����() {
		System.out.println("�������� �̵�");
		
	}
	@Override
	public void �����ñ�() {
		System.out.println("���� �ñ�");
		
	}
}

abstract class �¼��ѵ��� implements MoveAble2{
	abstract void ä��();
	@Override
	public void ���ٴڼ���() {
		System.out.println("���ٴ����μ���");
		
	}
	@Override
	public void �Ʒ�() {
		System.out.println("�Ʒ��� �̵�");
		
	}
	@Override
	public void ������() {
		System.out.println("���������� �̵�");
		
	}
	@Override
	public void ����() {
		System.out.println("�������� �̵�");
		
	}
	@Override
	public void ��() {
		System.out.println("���� �̵�");
		
	}
	
}

// ������ �ڽ� Ŭ������ ����(��, �Ʒ�, ����, ������)
class ������ extends �¼��ѵ��� implements MoveAble2{

	@Override // ������̼� = JVM�� ����ÿ� �м��ؼ� Ȯ�� = JVM�� ��Ʈ
	void ä��() {
		System.out.println("�ٳ��� ä��");
		
}
}
class �� extends �¼��ѵ��� implements MoveAble2{

	@Override
	void ä��() {
		System.out.println("Ǯ ä��");
		
	}
}
class ȣ���� extends �糪���{

	@Override
	void ����() {
		System.out.println("�̻��� ����");
		
	}
	
}
class �ڻԼ� extends �糪���{

	@Override
	void ����() {
		System.out.println("������ ����");
		
	}
		
}

// ���Ծ� �� (��� �¼��� ����)
class �� extends �¼��ѵ���{

	@Override
	void ä��() {
		System.out.println("Ǯ�� �Դ�");
		
	}
	
}

public class OOPEx09 {
	
	static void ���̽�ƽ(�¼��ѵ��� u1) {
		u1.ä��();
		u1.���ٴڼ���();
		u1.��();
		u1.�Ʒ�();
		u1.������();
		u1.����();
	}
	
	static void ���̽�ƽ(�糪��� u1) {
		u1.����();
		u1.��();
		u1.�Ʒ�();
		u1.������();
		u1.����();
		u1.�����ñ�();
	}

	public static void main(String[] args) {
		�� u1 = new ��();
		���̽�ƽ(u1);
		������ u2 = new ������();
		���̽�ƽ(u2);
		ȣ���� u3 = new ȣ����();
		���̽�ƽ(u3);
		�ڻԼ� u4 = new �ڻԼ�();
		���̽�ƽ(u4);
	}

}
