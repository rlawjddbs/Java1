package day1126;

/**
 * this를 사용한 생성자 호출
 * 
 * @author owner
 *
 */
public class ThisConstructor {
	public ThisConstructor() {
//		this(26); //주석을 비활성화할 경우 재귀호출이 되어버리므로 어느 순간 호출이 끝나지 않고 호출을 무한반복하게 된다.
		System.out.println("기본 생성자");
	}// ThisConstructor

	public ThisConstructor(int i) {
		this();
		System.out.println("인자있는 생성자");
//		this(); // 규칙 - 디스는 생성자의 첫번째 줄에서만 위치할 수 있다.
	}// ThisConstructor

	public static void main(String[] args) {
		// 객체화 하지않고 new 생성자()를 입력하면 한번만 불러온다.
		// 객체를 저장해서 사용할 일이 없을 때 이런 인스턴스화를 하게된다.
		new ThisConstructor(22);
	}// main

}// class
