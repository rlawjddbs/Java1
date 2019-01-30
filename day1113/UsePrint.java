package day1113;

// 표준 출력 method 사용
class UsePrint{
	
	public static void main(String[] args){
		/*
		System.out.println("안녕");	// println() 은 한 줄 바뀜
		System.out.print("하세요");	// print() 는 한 줄 안 바뀜
		*/

		System.out.println(11); // 정수상수
		System.out.println(11.13); // 실수상수
		System.out.println('A'); // 문자상수
		System.out.println("ABC 오늘은"); //문자열상수

		/* 작은따옴표로 둘러싸인 문자는 하나씩만 작성가능하여 문자 상수라 하며
		큰따옴표로 둘러싸인 문자는 여러문자를 한번에 묶을 수 있어 문자열상수라 한다. */
		
		int i=11; //지역변수
		String s="오늘은 화요일"; // 문자열 객체

		System.out.println(i); //기본형 데이터형 변수
		System.out.println(s); //참조형 데이터형 변수

		System.out.println(11+13); //연산식
		//메세지 연산식
		System.out.println("11+13"); //문자열은 있는 그대로 보여준다. 연산안됨!
		System.out.println("11+13="+11+13); // 11+13=1133
		// 문자열에 수에대한 연산이 들어가면 더해지지않고 옆에 붙여진다.
		System.out.println("11+13="+(11+13)); // 11+13=24
		// 소괄호로 연산의 우선순위를 지정하면 정상적인 연산 결과가 나타난다.
		
	}// main


}//class