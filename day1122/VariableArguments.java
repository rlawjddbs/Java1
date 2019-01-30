package day1122;

/**
 *	Variable Arguments	
 *	매개변수(parameter)는 하나인데 인수(argument)를 여러개 넣을 수 있는 기능.<br>
 *	method 내에서는 배열로 처리된다.<br>
 *	정의 ) "데이터형 ... 파라메터명" 형식으로 정의<br>
 * @author owner
 */
public class VariableArguments {

	/**
	 * 	동일 데이터형으로 되어있는 인수 값을 여러개 사용할 때.
	 * @param param	가변 인자형
	 */
	public void Test(int ... param) {
		System.out.println("=====================");
		for(int val : param) { // 향상된 for, 혹은 개선된 for
			System.out.print(val+"  ");
		}//end for
		System.out.println();
		System.out.println("test method called!!!");
		System.out.println("---------------------------------");
	}//Test
	
	/**
	 * 	가변 인수를 받기위한 매개변수는 가장 마지막에만 정의 할 수 있다.
	 * @param i 정수
	 * @param d 실수
	 * @param j 정수 배열값
	 */
	public void test1(int i, double d, int ... j) { //Variable Arguments는 parameter들의 끝자리에 위치해야 한다.
		System.out.println("첫번째 매개변수 : "+i);
		System.out.println("두번째 매개변수 : "+d);
		System.out.println("세번째 매개변수 : "+j); //Variable Arguments 출력시 주소가 출력된다.
		System.out.println("세번째 매개변수[0] : "+j[0]);
		System.out.println("세번째 매개변수[1] : "+j[1]);
		System.out.println("세번째 매개변수[2] : "+j[2]);
		for(int idx=0; idx < j.length; idx++) {
			System.out.println(j[idx]);
		}//end for
	}//test1
	
	//문자열을 입력받을 수 있는 매개변수를 선언
	public void printName(String name) {
		System.out.println(name+"님 안녕하세요?");	
	}//printName
	
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		
		va.Test(1);
		va.Test(1, 2, 3, 4);
		va.Test(1, 200, 400, 20, 10, 89, 012);
		
//		va.test(1,2,3,4);
		va.test1(1, 3.14, 10, 20, 30);
		
		String name = "이재찬";
		va.printName(name);
		
		va.printName("김정윤");
		
//		String path="c:\temp\kkk-file.txt"; //
		String path="c:\temp\new-file.txt";
		System.out.println(path);
		
		System.out.println("'안녕하세요.'");
		System.out.println("\"안녕하세요.\"");
	}//main

}//class
