package day1120;

/**
 *
 * @author owner
 */
public class TestFor2 {

	public static void main(String[] args) {
//		//무한 loop
//		for( ; ;) {
//			System.out.println("무한루프");
//		}//end for
		
//		//증가하는 수를 세는 무한 loop
//		for(int i=0; ;i++) {
//			System.out.println("무한 loop"+i);
//			if(i == 50) {
//				break; // break는 가장 가까운 반복문을 빠져나감. (다중 for문 일 경우 부모 for문만 빠져나감.)
//				// break는 가장 인근에 존재하는 반복문을 빠져나간다.
//			}//end if
//		}//end for
//		System.out.println("");
		
		//여러개의 초기값을 사용하는 for
		for(int i=0, j=10, k=30; i < 10; i++, j++, k--) {
			System.out.println(i+" "+j+" "+k);
		}//end for
		
//		//조건식을 잘못 설정하면 무한 loop
//		for(int i=0; i<10; i--) {
//			System.out.println(i);
//		}
		
		// for() 뒤에 세미콜론을 찍으면 반복문의 조건식과 증감연산만 반복되며 중괄호의 코드들은 한번씩만 동작하게된다.
		int i=0;
		for(i=0; i<10; i++); {
			System.out.println("반복문 "+i);
		}
		
		
	}//main

}//class
