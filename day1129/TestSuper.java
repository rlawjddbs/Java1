package day1129;

/**
 *	��Ӱ����� �θ� Ŭ���� : ��� �ڽ��� �������� ���� Ư¡����
 *	�θ𿡰� ���ǵ� �ڵ�� �ڽĿ��� ����� �� �ִ�.
 * @author owner
 */
public class TestSuper {

	public int pub_i;			// ��� �ִ� �ڽ��̵�, �ڽĿ��� ��밡��
	protected int pro_i;		// ���� ��Ű���� �ڽ�, �ٸ� ��Ű���� �ڽĿ��� ��밡��
	private int pri_i;			// �θ�Ŭ�����ȿ����� ��밡��
	int def_i;						// ���� ��Ű���� �ڽĿ��� ��밡��, ��Ű���� �ٸ��� ���Ұ�.
	
	public TestSuper() {
		System.out.println("�θ�Ŭ���� �⺻������");
	}//TestSuper
	
	public void superMethod() {
		System.out.println("�θ�Ŭ������ method");
	}//superMethod
	
}//class
