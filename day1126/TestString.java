package day1126;

/**
 *	���ڿ��� ���� ��
 * @author owner
 */
public class TestString {

	public static void main(String[] args) {
		String str = "ABC"; 					//�⺻�� ������ ���
		// �⺻�� �������� ������ ���ڿ��� ���ڿ� ������� �ּҸ� �����ϱ� ������
		// == �񱳷� �� ���ڿ��� �������� ���� �񱳸� ������ �� �ִ�.
		if (str == "ABC") {
			System.out.println("�⺻�� ����");
		} else {
			System.out.println("�⺻�� �ٸ�");
		}//end if
		
		String str1 = new String("ABC"); //������ ������ ���
		// ������ �������� ����ϸ� ������ heap�ּҸ� �����ϰ�
		// heap�� ������� ��ü�� ���ڿ� ������� �ּҸ� �����Ѵ�.
		if (str1 == "ABC") {
			System.out.println("������ ����");
		}else {
			System.out.println("������ �ٸ�");
		}//end if
		
		if (str1 == "ABC") {
			System.out.println("������ ����");
		}else {
			System.out.println("������ �ٸ�");
		}//end if
		
		System.out.println("-------------------------------------------------------------------");
		
		if (str.equals("ABC")) {
			System.out.println("�⺻�� equals �� ����");
		}else {
			System.out.println("�⺻�� equals �� �ٸ�");
		}//end if
		
		if (str1.equals("ABC")) {
			System.out.println("������ equals �� ����");
		}else {
			System.out.println("������ equals �� �ٸ�");
		}//end if
		
	}//main
}//main
