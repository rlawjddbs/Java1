package day1122;

/**
 *	다형성 : method Overload<br>
 *	하나의 클래스에서 같은 이름의 method를 여러개 작성하는 것.<br>
 *	규칙 ) 접근지정자 반환형 method명은 동일하게 작성하고,<br>
 *	"매개변수"만 다르게 작성한다.<br>
 * @author owner
 */
public class TestOverload {
	/**
	 * ★을 하나 출력하는 일을 하는 메소드 printStar()
	 */
	public void printStar() {
		System.out.println("★");
	}//printStar()
	
	/**
	 * 입력되는 값에 따라 ★을 여러개 출력하는 일을 하는 메소드 printStar()<br>
	 * @param count 출력할 별의 개수
	 */
	public void printStar(int count) {
		for(int i = 0; i<count; i++) {
			System.out.print("☆");
		}//end for
		System.out.println();
	}//printStar()
	
	/**
	 * 구구단 3단을 출력하는 method printGgd()
	 */
	public void printGgd() {
		final int THREE = 3;
		System.out.println();
		System.out.println(THREE+"단 출력 시작");
		for(int i = 1; i < 10; i++) {
			System.out.println(THREE+" x "+i+" = "+THREE*i);
		}//end for
	}//end printGgd
	
	/**
	 * 입력하는 단이 2~9단 사이일 때 해당 단을 출력하는 method printGgd()
	 * @param dan 2~9 사이의 구구단이 출력되길 원하는 단을 입력
	 */
	public void printGgd(int dan) {
		if(dan>1 && dan<10) {
			System.out.println();
			System.out.println(dan+"단 출력 시작");
			for(int i=1; i<10; i++) {
				System.out.println(dan+" x "+i+" = "+dan*i);
			}//end for
			System.out.println(dan+"단 출력 끝");
		} else { 
			System.out.println();
			System.out.println(dan+"단 출력 실패");
			System.out.println("단은 2~9 사이의 정수만 출력 가능 합니다."); 
		}//end else
	}//end printGgd
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		//별 한개 출력
		to.printStar();
		//별 여러개 출력
		to.printStar(5);
		
		//구구단 3단을 출력하는 method
		to.printGgd();
		//입력하는 단이 2~9단 사이일 때 해당 단을 출력하는 method
		to.printGgd(9);
	}//main
}//class
