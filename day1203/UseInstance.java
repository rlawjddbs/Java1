package day1203;

import javax.jws.soap.SOAPBinding.Use;

public class UseInstance {

	public TestSuper test1() {
		// is a ������ ��üȭ : �θ��� �ڿ��� �ڽ��� Override�� method�� �� �� ����.
		// �θ� Ŭ������ ��ü�� = new �ڽ� Ŭ������ ������;
		TestSuper ts = new TestSub();
		return ts;
	}//test1
	public TestSuper test2() {
		// is a ������ ��üȭ : �θ��� �ڿ��� �ڽ��� Override�� method�� �� �� ����.��
		// �θ� Ŭ������ ��ü�� = new �ڽ� Ŭ������ ������;
		TestSuper ts = new TestSub2();
		return ts;
	}//test2
	
	public static void main(String[] args) {
		
		//�ڽ�Ŭ������ ��ü�� �����Ͽ� ���.
		//�ڽ� Ŭ������ ��ü�� = new �ڽ��� ������();
		//��ü�� ��� : �θ� Ŭ������ ����, method, �ڽ� Ŭ������ ����, method
		TestSub ts = new TestSub();
		ts.i = 100; // �θ�� ���� �̸��� ������ ������ �ڽ��� ���� ����ϰ� ��.
		ts.pMethod(); // �θ��� method�� ����� �� ����.
		ts.subMethod(); // �ڽ��� method
		ts.printI();	// �ڽ��� Override �� method�� ��� �ڽ��� method ȣ��
		
		System.out.println("--------------------- �θ��� �̸����� ��üȭ : ��ü ������ -------------------");
		// ��ü ������ : ���� �̸��� Ŭ������ �پ��ϰ� ����ϴ� ��
		// ���� : �θ� ����� �� ������ �ȴ�.
		UseInstance ui = new UseInstance();
		TestSuper ts1 = ui.test1();
		TestSuper ts2 = ui.test2();
		
		//Override �� method ȣ��
		ts1.printI(); 
		ts2.printI();
		
	}//main

}//UseInstance
