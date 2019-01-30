package day1119;

/**
 *	switch ~ case : 정수를 비교할 때. (JDK1.7에서 부터는 문자열도 비교 가능)<br>
 * 문법 ) switch (변수명){<br>
 * 				case 상수 : 수행문장;<br>
 * 				case 상수 : 수행문장;<br>
 * 				...<br>
 * 				...<br>
 * 				default : 일치하는 상수가 없을 때 수행문장;<br>
 * }
 * 
 * @author owner
 */
public class TestSwitchCase {

	public static void main(String[] args) {
		// String i="1"; // JDK1.7 이상부터 사용 가능
		int i = 1;
		//switch에 입력되는 변수는 변수의 데이터형은 byte, short, int, char, String
		//switch에 String 데이터형을 사용할 수 있는건 1.7 버전 이상 부터
		switch(i) {
		// case는 입력되는 변수에 따라 다른 상수범위를 가진다.
		case 0:System.out.println("아침");
		case 1:System.out.println("점심");
		case 2:System.out.println("저녁");
		default:System.out.println("새벽");
		}//end switch
	}//main
}//class
