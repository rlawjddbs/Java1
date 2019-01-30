package day1115;
/*
	Java 프로그램 외부에서 Java 프로그램 내부로 값을
	전달할 때 main method의 Arguments를 사용한다.
	실행 ) java bytecode명(클래스파일명) 값 값 값...
	Arguments(값)의 최대 등록 개수는 약 21억개임.
*/
class  MainArguments{
	public static void main(String[] args)	{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]);
		// System.out.println(args[0]*args[1]); // 문자열 끼리 곱하면 Error 발생
		
		// 문자열을 정수로 변환
		// Integer.parseInt( 문자열 ); 문자열을 구분하여 int형으로 
		// 변환한 후 그 값을 반환하는 메소드
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);

		System.out.println(i * j);

		System.out.println(args[2]+"님 안녕하세요.");
	}//main
}//class
