package day1130;

/**
 * 	Override(Overriding)<br>
 *	부모 클래스가 제공하는 기능이 자식클래스에 맞지 않는다면<br>
 *	자식 클래스에서 부모 클래스의 method와 동일한 method를 정의하여<br>
 *	사용하는 것.
 */
public class OverrideToString {

	
	public String toString() {
		return "OverrideToString 클래스 " + super.toString();
	}
	public static void main(String[] args) {

	}//main
	
	
	

}//class
