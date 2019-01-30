package day1122;

/**
 *	method의 4가지 형태<br>
 * @author owner
 */
public class MethodType {

	/**
	 * 반환형이 없고 매개변수도 없는 method 형 - 같은 일을 수행할 때 사용
	 */
	public void typeA() {
		System.out.println("안녕하세요?");
	}//typeA

	/**
	 * 반환형이 없고 매개변수는 있는 method 형 - 가변적인 일을 수행할 때 사용
	 * @param i : 출력하고 싶은 값
	 */
	public void typeB(int i) {
		System.out.println(i+"번 안녕?");
	}//typeB
	
	/**
	 * 반환형이 있고, 매개변수는 없는 method 형 - 고정 값<br>
	 * 값을 받아 사용하는 코드가 필요.
	 * @return 년.월을 실수형으로 반환
	 */
	public double typeC() {
		return 2018.11;
//		System.out.println("|||");	return 구문 아래에 코드가 정의 될 수 없다.
	}//typeC
	
	/**
	 * 반환형이 있고 매개변수도 있는 method 형 - 가변적인 값을 받을 때 사용한다.
	 * @param d 정수로 만들고 싶은 실수값
	 * @return 정수로 변환된 값
	 */
	public int typeD(double d) {
		
		int i=(int)d;
		
		return i;
	}//typeD
	
	
	public static void main(String[] args) {
		MethodType mt=new MethodType();
		// 1. 고정된 일을 하는 method 호출
		mt.typeA();
		
		// 2. 가변적인 일을 하는 method 호출
		mt.typeB(2);
		mt.typeB(21);
		mt.typeB(222);
		
		// 3. 고정 값을 반환하는 method 호출 - 반환형과 일치하는 변수를 만들어서 값을 저장해야 함!
		double i = mt.typeC()+1; // 2018.11 + 1.0 = 2019.11
		System.out.println("고정값 "+i);
		
		// 4. 가변 값 method 호출 - 반환형과 일치하는 변수를 만들어서 값 저장
		int j = mt.typeD(300.003);
		System.out.println("가변값 "+j);
	}//main
}//class
