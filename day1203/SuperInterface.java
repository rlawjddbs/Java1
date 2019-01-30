package day1203;

/**
 * 구현클래스(자식클래스)에서 반드시 구현해야 하는 일(== Override 해야하는 일)의 목록만 정의하는 interface 사용법.
 * (구현의 강제성)
 * 
 * @author owner
 */
//interface는 extends 를 통해 부모를 여러개 가질 수 있다. (클래스는 부모를 하나밖에 못 가짐)
public interface SuperInterface extends InterA, InterB {
	// constant : 변수를 상수처럼 사용.
	public static final int FLAG_VALUE = 12;
//	int i; // 변수는 작성할 수 없다.

	// 추상 method 구성
	// 일반 method(){}는 가질 수 없다. (추상 method는 body ("{ }")가 없다.)
	public void test();
	
	// 인터페이스간 상속에는 추상 method를 Override 하지 않는다.
//	@Override
//	public String msg();
	// interface 의 추상메소드는 abstract을 사용하지 않아도 된다.
	public void methodA(); 
	// 물론 abstract을 사용해도 된다.
	public abstract void methodB(int i); 
}// interface
