package day1123;

/**
 *	1. �ݿ��Ͽ� ���� ��� Ŭ������ �⺻�����ڿ� �����ִ� �����ڸ� ������ ��,
 *	�ش� �����ڸ� ����Ͽ� ��ü�� �����ϰ� ����� ��.
 *	
 *	2. ���� å �б� 182 ~ 207p String �迭�� �ʱ�ȭ����
 *		214 ~ 220p ������ �迭�� Ȱ�� ������
 * @author owner
 */
public class Work22 {

	public static void main(String[] args) {
		Noodle nd = new Noodle();
		
		System.out.println(nd.baking());
		
		Noodle nd1 = new Noodle("�Ŷ��", "���", 2, 4, 850);
		System.out.println(nd1.baking());
	}

}
