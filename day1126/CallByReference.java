package day1126;

/**
 *	method�� �Ű������� ��������������(class, ���ڿ�, array)�� ���
 *	arguments�� ������ �ϳ��� �ּҰ� �Ҵ�ȴ�.
 *	(�ּҰ� �ϳ��� ���� ���� �����ϸ� ������ ��ü�� ���� ���� ����ȴ�.)
 * @author owner
 */
public class CallByReference {
	private int i;
	private int j;
	
	public void swap(CallByReference asdf) {
		int temp=0;
		temp = asdf.i;
		asdf.i=asdf.j;
		asdf.j=temp;
		System.out.println("swap method �� i="+i+", j="+j);
	}//swap
	
	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		cbr.i=11;
		cbr.j=26;
		
		System.out.println("swap �� �� i="+cbr.i+", j="+cbr.j); //static ���������� instance method�� ���� �� �� ����.
		cbr.swap(cbr); //�ּҰ� �״�� ���޵ȴ�.
		System.out.println("swap �� �� i="+cbr.i+", j="+cbr.j); //static ���������� instance method�� ���� �� �� ����.
		
		
	}//main

}//class
