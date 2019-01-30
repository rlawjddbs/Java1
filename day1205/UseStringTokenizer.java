package day1205;

import java.util.StringTokenizer;

/**
 *	문자열을 짧은 마디로 구분하는 StringTokenizer의 사용.
 * @author owner
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String msg="오늘은 수요일 입니다. 날씨는 -5입니다. 쉬었다가 합시다.";

		// 공백으로 구분 : 매개변수 하나인 생성자 사용.
		StringTokenizer stk = new StringTokenizer(msg);
		
		System.out.println( stk.countTokens() + "개");
		while(stk.hasMoreTokens()) {//토큰이 존재하는지?
			System.out.println(stk.nextToken());//토큰을 얻고 포인터를 다음으로 이동
		}//end while
		
		String names="이재현, 이재찬~정택성, 김희철, 김정운~김정윤, 공선의";
		
		//특정 문자로 토큰을 구분 할때는 : 매개변수 두개인 생성자를 활용
//		StringTokenizer stk1 = new StringTokenizer(names, ",");
//		StringTokenizer stk1 = new StringTokenizer(names, "김");
		StringTokenizer stk1 = new StringTokenizer(names, ",~ "); // 두번째 인자값(구분할 문자열)은 or 기능이 있어 앞의 코드처럼 ",~ " 로 작성시 쉼표, 물결표, 공백 을 모두 지워 구분한다.
		
		System.out.println("---------------------------------------");
		System.out.println("토큰의 수 : "+ stk1.countTokens());
		
		
		while(stk1.hasMoreTokens()) {
			System.out.println(stk1.nextToken());
		}//end while
		
		//특정문자로 토큰 구분, 구분된 문자열도 토큰으로 처리 :
		//매개변수 세개인 생성자를 활용
		StringTokenizer stk2 = new StringTokenizer(names, ",.~ ", true); 
		// 세번째 인자값(구분된 문자열을 버릴건지 보호할 건지)을 true로 설정하면 구분된 문자열이 버려지지 않고 따로 구분되어 나온다.
		// 세번째 인자값(구분된 문자열을 버릴건지 보호할 건지)을 false로 설정하면 구분된 문자열이 버려지고 나머지 문자열들이 구분되어 나온다.
		while(stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());
//			System.out.println(stk2.nextToken()); //한번에 하나씩 처리하는것을 권장(구분되어 출력될 개수가 구분되어야 함)
		}//end while
		
		
		
		
	}//UseStringTokenizer
	public static void main(String[] args) {
		new UseStringTokenizer();
	}//main

}//class
