package day1122;

/**
 *	Variable Arguments	
 *	�Ű�����(parameter)�� �ϳ��ε� �μ�(argument)�� ������ ���� �� �ִ� ���.<br>
 *	method �������� �迭�� ó���ȴ�.<br>
 *	���� ) "�������� ... �Ķ���͸�" �������� ����<br>
 * @author owner
 */
public class VariableArguments {

	/**
	 * 	���� ������������ �Ǿ��ִ� �μ� ���� ������ ����� ��.
	 * @param param	���� ������
	 */
	public void Test(int ... param) {
		System.out.println("=====================");
		for(int val : param) { // ���� for, Ȥ�� ������ for
			System.out.print(val+"  ");
		}//end for
		System.out.println();
		System.out.println("test method called!!!");
		System.out.println("---------------------------------");
	}//Test
	
	/**
	 * 	���� �μ��� �ޱ����� �Ű������� ���� ���������� ���� �� �� �ִ�.
	 * @param i ����
	 * @param d �Ǽ�
	 * @param j ���� �迭��
	 */
	public void test1(int i, double d, int ... j) { //Variable Arguments�� parameter���� ���ڸ��� ��ġ�ؾ� �Ѵ�.
		System.out.println("ù��° �Ű����� : "+i);
		System.out.println("�ι�° �Ű����� : "+d);
		System.out.println("����° �Ű����� : "+j); //Variable Arguments ��½� �ּҰ� ��µȴ�.
		System.out.println("����° �Ű�����[0] : "+j[0]);
		System.out.println("����° �Ű�����[1] : "+j[1]);
		System.out.println("����° �Ű�����[2] : "+j[2]);
		for(int idx=0; idx < j.length; idx++) {
			System.out.println(j[idx]);
		}//end for
	}//test1
	
	//���ڿ��� �Է¹��� �� �ִ� �Ű������� ����
	public void printName(String name) {
		System.out.println(name+"�� �ȳ��ϼ���?");	
	}//printName
	
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		
		va.Test(1);
		va.Test(1, 2, 3, 4);
		va.Test(1, 200, 400, 20, 10, 89, 012);
		
//		va.test(1,2,3,4);
		va.test1(1, 3.14, 10, 20, 30);
		
		String name = "������";
		va.printName(name);
		
		va.printName("������");
		
//		String path="c:\temp\kkk-file.txt"; //
		String path="c:\temp\new-file.txt";
		System.out.println(path);
		
		System.out.println("'�ȳ��ϼ���.'");
		System.out.println("\"�ȳ��ϼ���.\"");
	}//main

}//class
