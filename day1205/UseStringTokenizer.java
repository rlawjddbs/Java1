package day1205;

import java.util.StringTokenizer;

/**
 *	���ڿ��� ª�� ����� �����ϴ� StringTokenizer�� ���.
 * @author owner
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String msg="������ ������ �Դϴ�. ������ -5�Դϴ�. �����ٰ� �սô�.";

		// �������� ���� : �Ű����� �ϳ��� ������ ���.
		StringTokenizer stk = new StringTokenizer(msg);
		
		System.out.println( stk.countTokens() + "��");
		while(stk.hasMoreTokens()) {//��ū�� �����ϴ���?
			System.out.println(stk.nextToken());//��ū�� ��� �����͸� �������� �̵�
		}//end while
		
		String names="������, ������~���ü�, ����ö, ������~������, ������";
		
		//Ư�� ���ڷ� ��ū�� ���� �Ҷ��� : �Ű����� �ΰ��� �����ڸ� Ȱ��
//		StringTokenizer stk1 = new StringTokenizer(names, ",");
//		StringTokenizer stk1 = new StringTokenizer(names, "��");
		StringTokenizer stk1 = new StringTokenizer(names, ",~ "); // �ι�° ���ڰ�(������ ���ڿ�)�� or ����� �־� ���� �ڵ�ó�� ",~ " �� �ۼ��� ��ǥ, ����ǥ, ���� �� ��� ���� �����Ѵ�.
		
		System.out.println("---------------------------------------");
		System.out.println("��ū�� �� : "+ stk1.countTokens());
		
		
		while(stk1.hasMoreTokens()) {
			System.out.println(stk1.nextToken());
		}//end while
		
		//Ư�����ڷ� ��ū ����, ���е� ���ڿ��� ��ū���� ó�� :
		//�Ű����� ������ �����ڸ� Ȱ��
		StringTokenizer stk2 = new StringTokenizer(names, ",.~ ", true); 
		// ����° ���ڰ�(���е� ���ڿ��� �������� ��ȣ�� ����)�� true�� �����ϸ� ���е� ���ڿ��� �������� �ʰ� ���� ���еǾ� ���´�.
		// ����° ���ڰ�(���е� ���ڿ��� �������� ��ȣ�� ����)�� false�� �����ϸ� ���е� ���ڿ��� �������� ������ ���ڿ����� ���еǾ� ���´�.
		while(stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());
//			System.out.println(stk2.nextToken()); //�ѹ��� �ϳ��� ó���ϴ°��� ����(���еǾ� ��µ� ������ ���еǾ�� ��)
		}//end while
		
		
		
		
	}//UseStringTokenizer
	public static void main(String[] args) {
		new UseStringTokenizer();
	}//main

}//class
