package day1203;

/**
 * ����� �������� ����� �θ� Ŭ����<br>
 * ��üȭ�� ���� �ʴ´�.<br>
 * �ڽ�Ŭ������ �ݵ�� �����ؾ��� absctract method�� ������ Ŭ����.
 * 
 * @author owner
 */
public abstract class AbstractSuper {
	int i;

	public AbstractSuper() {
		// �ڽ� Ŭ������ ������ ���� ȣ�� �ȴ�.
		System.out.println("AbstractSuper �θ� ������");
	}// AbstractSuper

	public void method() {
		System.out.println("�θ� ���� �ϴ� �Ϲ� method");
	}// method

	// abstract method�� �ڽ��� �ݵ�� �����ؾ��� ���� ���
	public abstract void absMethod();// �߻�method

	public abstract String absMethod1(int i);// �߻�method

//	public static void main(String[] args) {
//		new AbstractSuper();
//		// �� Ŭ������ �߻�Ŭ����(abstract class)�� �Ǵ� �������� ��üȭ�� �� �� ���� �ȴ�.
//	}//main

}// AbstractSuper
