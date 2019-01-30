package day1203;

/**
 *	interface�� �����ϴ� class (�ڽ�Ŭ�����̰� interface�� ��� �߻� method�� Override�ϴ� Ŭ����)
 *	���� interface�� �θ� interface�� �����ٸ� �������� �ڽ�Ŭ����������
 *	��� �߻� method�� �����ؾ� �Ѵ�.
 * @author owner
 */
public class InterfaceImpl /*extends SuperInterface*/implements SuperInterface{
	// extends �ڿ��� Ŭ������ �� �� ������, �������̽��� Ŭ������ �ƴϹǷ� ��ӵ��� �ʴ´�.
	// extends ��� implements �� ����Ͽ� �������̽��� ��ӹ޾ƾ� �Ѵ�.
	
	public String msg() {//InterA
		return "������ ȭ����";
	}//msg
	
	public String msgB() {//InterB
		return "������ ������";
	}//msgB
	
	
	@Override
	public void methodA() {//SuperInterface
		System.out.println("methodA");
	}//methodA
	
	@Override
	public void methodB(int i) {//SuperInterface
		System.out.println("methodB");
	}//methodB
	
	public void test() {
	}
	
	public static void main(String[] args) {
		//�ڽ� Ŭ������ ��üȭ : ��� method�� ȣ���� �� �ִ�.
		// ii.msg(), ii.msgB(), ii.methodA, ii.methodB, ii.test()
		InterfaceImpl ii = new InterfaceImpl();
		ii.methodB(12);
		
		// is a ������ ��üȭ
		// SuperInterface�� ��üȭ�� �ϸ� Override�� method�� ȣ��ȴ�.
		// �θ��� method�� ��� ȣ�� ����
		//si.msg(), si.msgB(), si.methodA(), si.methodB()
		SuperInterface si = new InterfaceImpl();
		System.out.println(si.msg());
		
		// InterA�� ��üȭ�ϸ� : InterA �������̽��� msg()�� ȣ�� ����
		// ��ü�� ���� ���������� ���� ȣ�Ⱑ���� �޼ҵ嵵 �޶���
		InterA ia = new InterfaceImpl();
		System.out.println(ia.msg());

		// InterB�� ��üȭ�ϸ� : ib.msg()�� ȣ�Ⱑ��.
		InterB ib = new InterfaceImpl();
		System.out.println(ib.msgB());
		
		// Object o = new InterfaceImpl(); // Object�� �޷��ִ� method�� �� �� ����.
		// interface�� ��üȭ���� �ʴ´�.
		// �ڽ��� ���ؼ��� ��üȭ�� �� �� �ִ�.
		
//		InterA ia1 = new InterA(); //Error
//		SuperInterface si1 = new SuperInterface();
		
		
	}//main

}//class
