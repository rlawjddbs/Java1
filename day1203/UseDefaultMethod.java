package day1203;

public class UseDefaultMethod implements UseDefault {

	@Override
	public void test() {
		System.out.println("Override method");
	}//test

	public static void main(String[] args) {
		//�ڽ� Ŭ������ ��üȭ �� �� �ִ�.
		UseDefaultMethod udm = new UseDefaultMethod();
		udm.test();
		udm.temp();
		
		//is a ����� ��üȭ �� �� �ִ�.
		UseDefault ud = new UseDefaultMethod();
		ud.test(); // Override�� method�� ȣ��
		ud.temp();
	}//main

}//class
