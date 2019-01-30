package day1120;

/**
 * for : 시작과 끝을 알고있을 때 사용하는 반복문<br>
 * 문법 )<br>
 * for(시작값 ; 끝값; 증가|감소식){<br>
 * 반복 수행 문장;<br>
 * }
 * 
 * @author owner
 */
public class TestFor {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "번 안녕");
		}//end for
		
		// 1에서 부터 1씩 증가하며 100까지 반복 수행 for
//		for (int i = 1; i <= 100; i++) { // 작거나 같다는 작은지 한번 묻고 같은지 한번 더 묻는다. (두번 묻기 때문에 수행횟수가 늘어남. 비추.)
//			System.out.println(i);
//		}
		for (int i = 1; i < 101; i++) { 
			System.out.println(i);
		}//end for
		
		// 1에서 부터 100까지 짝수만 옆으로 출력 for
		for (int i = 1; i < 101; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}//end if
		}//end for
		System.out.println();// 줄변경
		
		for (int i = 2; i < 101; i+=2) {
				System.out.print(i+" ");
		}//end for
		System.out.println();// 줄변경
		
		//1에서 부터100까지 홀수만 옆으로 출력
		int cnt=0;
		// 증.감소식은 변수에 값을 변화시키고 유지시킬 수 있는 모든 연산자를 
		// 사용할 수 있다.
		for (int i = 1; i < 101; i+=2) {
			cnt++;
//			if(i%2==1) {
				System.out.print(i+" ");
//			}//end if
		}//end for
		System.out.println("\n"+cnt+"번 수행");

		// 1~100까지 출력하는데 3의 배수마다 숫자대신 "짝"
		for(int i=1; i < 101; i++) {
			if (i%3==0) {				
				System.out.print("짝 ");
				continue;
			}//end if
			System.out.print(i + " ");
		}//end for
		System.out.println();
		
		// 1~100까지의 합 출력 : 1에서부터 100까지의 합은 5050
		int total=0;
		for (int i=1; i < 101; i++) {
			total+=i;
		}//end for
		System.out.println("1에서부터 100까지의 합은 : "+total);
		
		// A~Z까지 출력
		for (char i=65; i<91; i++) {
			System.out.print(i + " ");
		}//end for
		
		System.out.println();
		
		for (char c='A'; c<='Z'; c++) {
			System.out.print(c + " ");
		}//end for
		System.out.println();
		
		for(int i=1; i < 10; i++) {
			System.out.println("2 * "+i+" = "+ (2*i));
		}//end for
		
		
	}// main

}// class
