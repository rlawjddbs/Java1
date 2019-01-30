package day1205;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 숙제<br>
 * 1. 1~45 까지의 사이의 수중에서 무작위로 하나를 뽑아 6개의 세트를<br>
 * 만들어 배열로 반환하는 method를 만들고 호출하여 출력할 것.<br>
 * 단, 중복된 수는 배열에 입력되지 않아야한다.<br>
 * <br>
 * 2. 아래 제시된 문자열을 구분 문자로 잘라내어 문자열 배열에 저장하고<br>
 * 반환하는 일을 하는 method를 작성하세요.<br>
 * <br>
 * "이재찬,이재현,공선의, 정택성~이재현!최지우.김희철,이재찬,이재찬,정택성.공선의"<br>
 * <br>
 * 출력:<br>
 * 이재찬 이재현 공선의 정택성 이재현 최지우 김희철 이재찬 이재찬 정택성 공선의
 * 
 * @author owner
 *
 */
public class Work22 {

	public Work22() {
		// 숙제 Work22_1 출력
		int[] nums = Work22_1();
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		// 숙제 Work22_2 출력
		String[] namesList = Work22_2("이재찬,이재현,공선의, 정택성~이재현!최지우.김희철,이재찬,이재찬,정택성.공선의");
		for (int i = 0; i < namesList.length; i++) {
			System.out.print(namesList[i] + " ");
		}
		System.out.println();

	}// Work22 기본 생성자

	public int[] Work22_1() {
		int[] numList = new int[6];
		
		for (int i = 0; i < numList.length; i++) {
			System.out.println("바깥 for문 시작점 i의 값 : "+i);
			numList[i] = (int)((Math.random() * 45)+1);
			for (int j = 0; j < i; j++) {
				System.out.println("numList["+j+"] : "+numList[j]+", numList["+i+"] : "+numList[i]);
				if(numList[j] == numList[i]) {
					System.out.println("현재 numList["+j+"(j)]의 값 : "+numList[j]+", 현재 numList["+i+"(i)]의 값 : "+numList[i]+", 안쪽 for문 i-- 이전의 값 : "+i);
					i--;
					System.out.println("안쪽 for문 i-- 이후의 값 : "+i);
					break;
				}//end if
			} // end for
			System.out.println("바깥 for문 끝점 i의 값 : "+i);
		}//end for

		return numList;
	}// Work22_1

	/**
	 * Work22-2 입력된 문자열을 쉼표(",") 마침표(".") 물결표("~") 느낌표(!) 공백(" ") 단위로 구분지어 문자열 배열값으로
	 * 반환하는 method
	 * 
	 * @param names 이름과 구분자를 입력
	 * @return 구분된 이름들을 반환
	 */
	public String[] Work22_2(String names) {
		int tempIdx = 0;
		StringTokenizer stk = new StringTokenizer(names, ",.~! ", false);
		String[] NamesArr = new String[stk.countTokens()];
		while (stk.hasMoreTokens()) {
			NamesArr[tempIdx] = stk.nextToken();
			tempIdx++;
		} // end while
		return NamesArr;
	}// Work22_2

	public static void main(String[] args) {
		new Work22();
	}

}
