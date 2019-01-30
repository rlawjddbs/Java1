package day1121;

/**
 *	method : 업무를 구분하여 정의하며, 중복코드를 최소화할 때 사용.<br>
 *	작성법 ) 접근지정자	반환형	method명(parameter){ 실행할 업무처리 내용들; }
 * @author owner
 */
public class UseMethod {
	
	//instance method
	public void instanceMethod() {
		System.out.println("객체화하여 사용하는 method");
	}//instance method
	
	//static method
	public static void staticMethod() {
		System.out.println("객체화없이 직접 호출하여 사용하는 method");
	}//static method
	
	public static void main(String[] args) {
//		instanceMethod();//객체화 이후에 객체명.메소드명 으로 호출할 수 있다.
		UseMethod um = new UseMethod();
		um.instanceMethod();

		System.out.println("===============================");
		
//		um.staticMethod(); // static method는 특정객체에 속해있는 method가 아니므로 객체명으로 호출하지 않는다. 
		// static method 또한 instance method처럼 객체명.메소드명() 으로 호출은 되지만 올바른 방법이 아니다. 클래스명.메소드명()이나, 메소드명()으로 호출하는 것을 권장한다.
		staticMethod(); //UseMethod.staticMethod() 로 쓰는 것을 권장
		UseMethod.staticMethod(); // 가장 권장되는 static method 호출 방법. 		클래스명.메소드명();
				
	}//main

}//class
