package day1203;

public class UseDefaultMethod implements UseDefault {

	@Override
	public void test() {
		System.out.println("Override method");
	}//test

	public static void main(String[] args) {
		//자식 클래스로 객체화 할 수 있다.
		UseDefaultMethod udm = new UseDefaultMethod();
		udm.test();
		udm.temp();
		
		//is a 관계로 객체화 할 수 있다.
		UseDefault ud = new UseDefaultMethod();
		ud.test(); // Override한 method가 호출
		ud.temp();
	}//main

}//class
