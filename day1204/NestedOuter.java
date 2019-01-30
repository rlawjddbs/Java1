package day1204;

/**
 *	내부 클래스를 static 변수처럼 사용할 수 있는 중첩 클래스.
 * @author owner
 */
public class NestedOuter {

	int i;
	static int j;
	
	public NestedOuter() {
		System.out.println("바깥 클래스의 생성자");
	}//NestedOuter
	
	public void outInstMethod() {
		System.out.println("바깥 클래스의 인스턴스 method");
	}//outInstMethod
	
	public static void outStatMethod() {
		System.out.println("바깥 클래스의 static method");
	}//outStatMethod()

	/////////////////////////// Nested class 시작 /////////////////////////////////////////
	static class NestedInner{
		int in_i; // 인스턴스 영역
		static int in_j; // static 변수
		
//		public NestedInner() {
//		}
		public void inMethod() {
			System.out.println("안쪽 클래스의 인스턴스 Method");
		}//inMethod
		
		public static void inStatMethod() {
			System.out.println("안쪽클래스의 static method");
			System.out.println("바깥 클래스의 자원 사용 i=사용불가 , j="+j);
			System.out.println("바깥 클래스의 자원 사용 i=사용불가 , j="+NestedOuter.j);
//			outInstMethod();// instance 영역의 method이므로 사용할 수 없다.
			NestedOuter.outStatMethod(); // static 은 공용이므로 어디서나 부를 수 있지만 앞에 소속된 클래스명을 붙여 출처를 보여주는 것이 좋다.
		}//inStatMethod
	}//class
	/////////////////////////// Nested class 끝 ///////////////////////////////////////////

	public static void main(String[] args) {
		//static 영역을 사용할 때에는 객체화없이 클래스명.변수명,
		//클래스명.method명으로 사용한다.
		NestedInner.inStatMethod(); // static 메소드라도 앞에 클래스명을 붙여줘야 한다.
		
	}//main

}//class
