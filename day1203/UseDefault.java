package day1203;

/**
 *	default method : �������̽����� ����(�ڹ��ڵ�)�� ó���� �� �ִ�(���� �� �� �ִ�) method<br>
 *	default method�� ȣ���Ϸ��� ���� Ŭ������ is a ������ ��üȭ�� �ؾ߸� �Ѵ�.
 * @author owner
 */
public interface UseDefault {
	public void test();
	
	public default void temp() {
		// ���������ڸ� default�� �Է��ϸ� �������̽� �������� body("{ }")�� ���� method��
		// �ۼ��� �� �ִ�.
		System.out.println("����ó�� �ڵ� ����");
	}//temp
}//interface
