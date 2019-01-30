package day1203;

/**
 * 상속을 목적으로 만드는 부모 클래스<br>
 * 객체화가 되지 않는다.<br>
 * 자식클래스가 반드시 구현해야할 absctract method를 가지는 클래스.
 * 
 * @author owner
 */
public abstract class AbstractSuper {
	int i;

	public AbstractSuper() {
		// 자식 클래스가 생성될 때만 호출 된다.
		System.out.println("AbstractSuper 부모 생성자");
	}// AbstractSuper

	public void method() {
		System.out.println("부모 일을 하는 일반 method");
	}// method

	// abstract method는 자식이 반드시 구현해야할 일의 목록
	public abstract void absMethod();// 추상method

	public abstract String absMethod1(int i);// 추상method

//	public static void main(String[] args) {
//		new AbstractSuper();
//		// 본 클래스가 추상클래스(abstract class)가 되는 순간부터 객체화는 할 수 없게 된다.
//	}//main

}// AbstractSuper
