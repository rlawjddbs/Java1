package day1122;

/**
 * 특수문자 : 문자열 내 \로 시작하는 기능을 가진 문자.<br>
 * @author owner
 *
 */
public class UseEscapeCharacter {

	public static void main(String[] args) {
		System.out.println("이\t재현"); //\t : tab
		System.out.println("이\t\t재현");
		System.out.println("정\n택성"); //\n : new line
		System.out.println("정\r택성"); //\n : return (커서가 앞으로 가는 것인데 줄이 바뀌게 됨.)
		System.out.println("오늘은 \"급여일\" 입니다.");	//	\" : 큰 따옴표 " 를 표현할 때 사용
		System.out.println("오늘은 '급여일' 입니다.");		//	\' : 작은 따옴표 ' 를 표현할 때 사용
//		System.out.println("c:\dev\workspace\javase_prj\src\day1122\");		//	\' : 작은 따옴표 ' 를 표현할 때 사용
		
	}//main

}
