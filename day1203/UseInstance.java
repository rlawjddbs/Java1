package day1203;

import javax.jws.soap.SOAPBinding.Use;

public class UseInstance {

	public TestSuper test1() {
		// is a 관계의 객체화 : 부모의 자원과 자식이 Override한 method만 쓸 수 있음.
		// 부모 클래스명 객체명 = new 자식 클래스의 생성자;
		TestSuper ts = new TestSub();
		return ts;
	}//test1
	public TestSuper test2() {
		// is a 관계의 객체화 : 부모의 자원과 자식이 Override한 method만 쓸 수 있음.ㄴ
		// 부모 클래스명 객체명 = new 자식 클래스의 생성자;
		TestSuper ts = new TestSub2();
		return ts;
	}//test2
	
	public static void main(String[] args) {
		
		//자식클래스를 객체로 생성하여 사용.
		//자식 클래스명 객체명 = new 자식의 생성자();
		//객체로 사용 : 부모 클래스의 변수, method, 자식 클래스의 변수, method
		TestSub ts = new TestSub();
		ts.i = 100; // 부모와 같은 이름의 변수는 무조건 자식의 것을 사용하게 됨.
		ts.pMethod(); // 부모의 method도 사용할 수 있음.
		ts.subMethod(); // 자식의 method
		ts.printI();	// 자식이 Override 한 method인 경우 자식의 method 호출
		
		System.out.println("--------------------- 부모의 이름으로 객체화 : 객체 다형성 -------------------");
		// 객체 다형성 : 같은 이름의 클래스를 다양하게 사용하는 것
		// 장점 : 부모만 사용할 수 있으면 된다.
		UseInstance ui = new UseInstance();
		TestSuper ts1 = ui.test1();
		TestSuper ts2 = ui.test2();
		
		//Override 한 method 호출
		ts1.printI(); 
		ts2.printI();
		
	}//main

}//UseInstance
