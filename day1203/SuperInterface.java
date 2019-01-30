package day1203;

/**
 * ����Ŭ����(�ڽ�Ŭ����)���� �ݵ�� �����ؾ� �ϴ� ��(== Override �ؾ��ϴ� ��)�� ��ϸ� �����ϴ� interface ����.
 * (������ ������)
 * 
 * @author owner
 */
//interface�� extends �� ���� �θ� ������ ���� �� �ִ�. (Ŭ������ �θ� �ϳ��ۿ� �� ����)
public interface SuperInterface extends InterA, InterB {
	// constant : ������ ���ó�� ���.
	public static final int FLAG_VALUE = 12;
//	int i; // ������ �ۼ��� �� ����.

	// �߻� method ����
	// �Ϲ� method(){}�� ���� �� ����. (�߻� method�� body ("{ }")�� ����.)
	public void test();
	
	// �������̽��� ��ӿ��� �߻� method�� Override ���� �ʴ´�.
//	@Override
//	public String msg();
	// interface �� �߻�޼ҵ�� abstract�� ������� �ʾƵ� �ȴ�.
	public void methodA(); 
	// ���� abstract�� ����ص� �ȴ�.
	public abstract void methodB(int i); 
}// interface
