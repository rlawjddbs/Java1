package day1203;

/**
 * �߻�Ŭ������ �θ�� �ϴ� �ڽ�Ŭ����<br>
 * �ڽ�Ŭ������ �ݵ�� �θ�Ŭ������ �߻�method�� Override �ؾ��Ѵ�.
 * 
 * @author owner
 */
public class AbstractSub extends AbstractSuper {

	public void subMethod() {
		System.out.println("�ڽ� method!!!!!");
	}// subMethod

	@Override
	// Override ��Ģ : ���������ڴ� �޶� �ǰ�(������) ��ȯ���� method��,
	// �Ű������� ���ƾ� �Ѵ�.
	public void absMethod() {
		// �߻�method�� super�� ȣ���� �� ����.
//		super.absMethod(); // Error. ȣ���ص� body�� ��� ���� ����
		System.out.println("Override�� �ڽ��� absMethod");
	}// absMethod

	@Override
	public String absMethod1(int pram_i) {
		return String.valueOf(pram_i).concat(" - �ڽ�");
	}// absMethod

//	@Override
//	public void method() {
//		System.out.println("�ڽ��� ���� �ϴ� �Ϲ� method");
//	}

	// �ڽ� Ŭ������ ��üȭ �Ǹ� �߻�Ŭ������ ��üȭ�� �ȴ�.
	public static void main(String[] args) {
		AbstractSub as = new AbstractSub();
		// �ڽ�Ŭ���� ��üȭ : �θ��� ����, method, �ڽ��� ����, method
		as.i = 12;// �θ� ����
		as.method();// �θ� method
		// Override�� method �ڽĿ��� ������ ���̹Ƿ� �ڽ��� method ȣ��
		as.absMethod();// ���� �̸����� �����Ѵٸ� �ڽ��� method ȣ��
		// �ڽ��� method (override �� ���̴� �ᱹ �ڽ��� method�� �� �� ����)
		System.out.println(as.absMethod1(3)); // ���� �̸����� �����Ѵٸ� �ڽ��� method ȣ��
		as.subMethod();

		// is a ������ ��üȭ : ��ü ������
		// �θ�Ŭ������ ��ü�� = new �ڽĻ�����();
		// ���� �̸��� Ŭ������ �پ��ϰ� �� �� �ִ�.
		AbstractSuper as1 = new AbstractSub();
		// �θ��� �ڿ� ȣ�� ����
		// ��, Override�� method�� �����Ѵٸ� �ڽ��� �ڿ��� ȣ���Ѵ�.
		as1.i = 100;
		as1.method();
		// �߻� method�� body�� ������ ȣ���ϰԵǸ� �ڽ��� method��
		// Overriding �Ǿ����� ��� ȣ��ȴ�.
		as1.absMethod();
		System.out.println(as1.absMethod1(2018));

		// is a ����� ��üȭ�ϸ� �ڽ��� ���� method�� ȣ�� �Ұ��ϴ�.
		// overriding �� ������ �޼ҵ常 ȣ�� �����ϴ�.
//		as1.subMethod();
	}// main

}// class
