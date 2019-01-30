package day1121;

/**
 *	do ~ while : 시작과 끝을 모를 때 사용하는 반복문<br>
 *					  최소 한 번 수행 될 수 있으며 최대 조건까지 수행되기도 한다.<br>
 * 문법 )<br>
 * do{<br>
 * 		반복수행 문장들;<br>
 * } while(조건식);<br>
 * 
 * @author owner
 */
public class TestDoWhile {

	public static void main(String[] args) {
		int i = 1000; //초기값, do ~ while은 조건식
		do {
			System.out.println("i="+i);//반복수행문장
			i++;//증가식
		}while(i < 10);//조건식
		
		
		//입력되는 단으로 구구단 출력
		// wrapper 클래스로 각 데이터형에 맞게 잘라내보기
		
		i=Integer.parseInt(args[0]);
		/*float f=Float.parseFloat(args[0]);
		double d=Double.parseDouble(args[0]);
		long l=Long.parseLong(args[0]);*/
		
		if( i>1 && i<10 ) { //2단 9단 사이
			System.out.println(i+"단");
			int j=1;
			do {
				System.out.println(i+" x "+j+" = "+ i*j);
				j++;
			} while (j < 10); //end do ~ while
		} else {
			System.out.println(i+"단은 출력할 수 없습니다.");
			System.out.println("단은 2단에서 9단까지 입력해 주세요.");
		}//end if else
		
	}//main
}//class
