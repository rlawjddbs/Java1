package day1218;

public class UseTest {

	public void useTest(Test test) {
		
		if(test instanceof TestImpl) { //instanceof 의 좌항은 객체, 우항은 클래스를 넣어야만 한다.
			String date = test.getDate();
			System.out.println(date);
		} else {
			System.out.println("TestImpl 만 처리합니다.");
		}//end else
		
	}//useTest
	
	public static void main(String[] args) {
		TestImpl ti = new TestImpl();
		TestImpl2 ti2 = new TestImpl2();
		
		UseTest ut = new UseTest();
		ut.useTest(ti);
		ut.useTest(ti2);
	}//main

}//class
