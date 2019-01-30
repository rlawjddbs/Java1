package day1122;

/**
 *	method�� 4���� ����<br>
 * @author owner
 */
public class MethodType {

	/**
	 * ��ȯ���� ���� �Ű������� ���� method �� - ���� ���� ������ �� ���
	 */
	public void typeA() {
		System.out.println("�ȳ��ϼ���?");
	}//typeA

	/**
	 * ��ȯ���� ���� �Ű������� �ִ� method �� - �������� ���� ������ �� ���
	 * @param i : ����ϰ� ���� ��
	 */
	public void typeB(int i) {
		System.out.println(i+"�� �ȳ�?");
	}//typeB
	
	/**
	 * ��ȯ���� �ְ�, �Ű������� ���� method �� - ���� ��<br>
	 * ���� �޾� ����ϴ� �ڵ尡 �ʿ�.
	 * @return ��.���� �Ǽ������� ��ȯ
	 */
	public double typeC() {
		return 2018.11;
//		System.out.println("|||");	return ���� �Ʒ��� �ڵ尡 ���� �� �� ����.
	}//typeC
	
	/**
	 * ��ȯ���� �ְ� �Ű������� �ִ� method �� - �������� ���� ���� �� ����Ѵ�.
	 * @param d ������ ����� ���� �Ǽ���
	 * @return ������ ��ȯ�� ��
	 */
	public int typeD(double d) {
		
		int i=(int)d;
		
		return i;
	}//typeD
	
	
	public static void main(String[] args) {
		MethodType mt=new MethodType();
		// 1. ������ ���� �ϴ� method ȣ��
		mt.typeA();
		
		// 2. �������� ���� �ϴ� method ȣ��
		mt.typeB(2);
		mt.typeB(21);
		mt.typeB(222);
		
		// 3. ���� ���� ��ȯ�ϴ� method ȣ�� - ��ȯ���� ��ġ�ϴ� ������ ���� ���� �����ؾ� ��!
		double i = mt.typeC()+1; // 2018.11 + 1.0 = 2019.11
		System.out.println("������ "+i);
		
		// 4. ���� �� method ȣ�� - ��ȯ���� ��ġ�ϴ� ������ ���� �� ����
		int j = mt.typeD(300.003);
		System.out.println("������ "+j);
	}//main
}//class
