package day1126;

/**
 * this�� ����� ������ ȣ��
 * 
 * @author owner
 *
 */
public class ThisConstructor {
	public ThisConstructor() {
//		this(26); //�ּ��� ��Ȱ��ȭ�� ��� ���ȣ���� �Ǿ�����Ƿ� ��� ���� ȣ���� ������ �ʰ� ȣ���� ���ѹݺ��ϰ� �ȴ�.
		System.out.println("�⺻ ������");
	}// ThisConstructor

	public ThisConstructor(int i) {
		this();
		System.out.println("�����ִ� ������");
//		this(); // ��Ģ - �𽺴� �������� ù��° �ٿ����� ��ġ�� �� �ִ�.
	}// ThisConstructor

	public static void main(String[] args) {
		// ��üȭ �����ʰ� new ������()�� �Է��ϸ� �ѹ��� �ҷ��´�.
		// ��ü�� �����ؼ� ����� ���� ���� �� �̷� �ν��Ͻ�ȭ�� �ϰԵȴ�.
		new ThisConstructor(22);
	}// main

}// class
