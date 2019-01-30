package day1203;

/**
 *	default method : 인터페이스에서 업무(자바코드)를 처리할 수 있는(일을 할 수 있는) method<br>
 *	default method를 호출하려면 구현 클래스로 is a 관계의 객체화를 해야만 한다.
 * @author owner
 */
public interface UseDefault {
	public void test();
	
	public default void temp() {
		// 접근지정자를 default로 입력하면 인터페이스 내에서도 body("{ }")를 가진 method를
		// 작성할 수 있다.
		System.out.println("업무처리 코드 정의");
	}//temp
}//interface
