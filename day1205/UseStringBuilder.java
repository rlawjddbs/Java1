package day1205;

/**
 * String,Buffer, StringBuilder(JDK1.5) 문자열을 heap에 직접 저장하고 사용하는 클래스
 * StringBuffer 는 동시접근을 허용하지 않는다.
 * StringBuilder 는 동시접근을 허용한다.
 * 
 * @author owner
 */
public class UseStringBuilder {

	public void useStringBuffer() {
		// 1.클래스 생성
		StringBuffer sb = new StringBuffer();
		// 2.값(정수, 실수, 문자, 불린, 문자열 ..) 추가
		sb.append("오늘은 "); // 문자열
		System.out.println(sb);
		sb.append(12); // 정수
		System.out.println(sb);
		sb.append("월 5일").append("수요일 입니다.");
		System.out.println(sb);
		System.out.println(sb.indexOf("오"));
		System.out.println(sb.indexOf("늘"));
		System.out.println(sb.indexOf("은"));
		System.out.println(sb.indexOf("월"));
		System.out.println(sb.indexOf(" "));

		// 3. 값 삽입
		// 오늘은 12월 5일 수요일 입니다.
		// 0 1 2 3456 789 101112131415161718.
		sb.insert(4, "2018년 ");
		System.out.println(sb);

		// 4. 값을 삭제 : delete(시작인덱스, 끝인덱스+1);
		// 오늘은 2018년 12월 5일수요일 입니다.
		sb.delete(0, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}// useStringBuffer

	public void useStringBuilder() {
		// 1.클래스 생성
		StringBuilder sb = new StringBuilder();
		// 2.값(정수, 실수, 문자, 불린, 문자열 ..) 추가
		sb.append("오늘은 "); // 문자열
		System.out.println(sb);
		sb.append(12); // 정수
		System.out.println(sb);
		sb.append("월 5일").append("수요일 입니다.");
		System.out.println(sb);
		System.out.println(sb.indexOf("오"));
		System.out.println(sb.indexOf("늘"));
		System.out.println(sb.indexOf("은"));
		System.out.println(sb.indexOf("월"));
		System.out.println(sb.indexOf(" "));

		// 3. 값 삽입
		// 오늘은 12월 5일 수요일 입니다.
		// 0 1 2 3456 789 101112131415161718.
		sb.insert(4, "2018년 ");
		System.out.println(sb);

		// 4. 값을 삭제 : delete(시작인덱스, 끝인덱스+1);
		// 오늘은 2018년 12월 5일수요일 입니다.
		sb.delete(0, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}// useStringBuilder

	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		usb.useStringBuffer();
		System.out.println("-----------------------------------");
		usb.useStringBuilder();
		
		String str = "안녕하세요?"; //짧은 문자열은 String에 저장한다.
		System.out.println(str);
		
		String str1 = "안";
		//문자열에 +가 붙어서 긴 문자열
		System.out.println(str1+"녕"+"하"+"세"+"요?");
		//  System.out.println((new StringBuilder(String.valueOf(str1))).append("녕").append("하").append("세").append("요?").toString()); 와 같다
		//  System.out.println((new StringBuilder(String.valueOf(str1))).append("\uB155").append("\uD558").append("\uC138").append("\uC694?").toString()); 와 같다
		
	}// main
}// class
