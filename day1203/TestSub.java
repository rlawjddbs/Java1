package day1203;

public class TestSub extends TestSuper {
	int i;
	public TestSub(){
		System.out.println("자식의 생성자");
	}//TestSub
	
	public void subMethod() {
		System.out.println("자식의 subMethod");
	}//subMethod
	
	@Override
	public void printI() {
		System.out.println("자식이 Override한 method "+this.i+", 부모의 i "+super.i);
	}//printI
	
	public static void main(String[] args) {
		// 상속 관계에서는 자식클래스로 객체화를 한다.
		
	}//main

}//class
