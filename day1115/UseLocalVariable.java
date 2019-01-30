package day1115;

// 지역변수 선언 사용
class UseLocalVariable{

	public static void main(String[] args){
		//1. 지역변수 선언 : 데이터형 변수명;
		int i; //자동초기화가 되지 않는다.
		int j = 11; // 변수의 초기화 : 변수를 선언하면서 값할당

		//2. 값할당 : 변수명 = 값;
		i=100; // 초기화 하지않은 변수를 사용하면 error 발생

		//3. 값 사용 : 출력, 연산, 재할당
		System.out.println(i);
		System.out.println(j);
		System.out.println(i + j);
		System.out.println(i * j);
		System.out.println(i / j);	// 나눈 몫을 구한다.
		System.out.println(i % j);	// 나눈 나머지를 구한다.
		
		//int i = 200; //같은 이름의 변수는 작성할 수 없음.

		//변수명은 한글로 선언 가능하나 한글을 사용하지 말 것
		int 변수=300;
		long l=3_000_000_000L;
		System.out.println(l);
		float f=0.5f; // float f=0.5F;
		System.out.println(f);
	}//main

}//class