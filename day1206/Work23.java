package day1206;

import java.util.ArrayList;
import java.util.Random; // Random 클래스 활용
import java.util.StringTokenizer;

/**
 * 숙제<br>
 * 1. 아래의 데이터를 처리하는 프로그램을 작성하세요.<br>
 * 백인재,이봉현,이재찬,정택성,이재현,김정운 의 데이터가 존재하고,<br>
 * 점수는 0~100점 사이로 발생할 수 있습니다.<br>
 * <br>
 * 프로그램이 실행되면 위의 사람중에 2명 이상이 성적처리 대상자 이고 (매번 무작위하게 점수와 인원이 발표됨)<br>
 * n명의 이름과 점수를 저장하여 출력하는 일을 하는 프로그램 작성.<br>
 * 중복이름은 들어갈 수 없다.<br>
 * <br>
 * 출력 예)<br>
 * 이재찬 89<br>
 * 정택성 77<br>
 * 김정운 90<br>
 * 총점 xx점<br>
 * <br>
 * 난수와 List를 받아서 출력하는 문제.
 * 
 * @author owner
 *
 */
public class Work23 {
	Random r = new Random();

	public Work23() {
//		randomScore();
//		randomCount();
		ArrayList<String> sl = new ArrayList<String>(); // student List
		sl.add("백인재 " + String.valueOf(randomScore()) + "점");
		sl.add("이봉현 " + String.valueOf(randomScore()) + "점");
		sl.add("이재찬 " + String.valueOf(randomScore()) + "점");
		sl.add("정택성 " + String.valueOf(randomScore()) + "점");
		sl.add("이재현 " + String.valueOf(randomScore()) + "점");
		sl.add("김정운 " + String.valueOf(randomScore()) + "점");

//		int cnt = randomCount();
//		String[] names = new String[cnt];
//		for (int i = 0; i < cnt; i++) {
//			names[i] = sl.get(randomStudent());
//			for (int j = 0; j < i; j++) {
//				if(names[j] == names[i]) {
//					i--;
//					break;
//				}//end if
//			}//end for
//		} // end for

		int cnt = randomCount();
		int tempRanNum = 0;
		for (int i = 0; i < cnt; i++) {
			tempRanNum = randomStudent();
			if (sl.get(tempRanNum) != null) {
				System.out.println(sl.get(tempRanNum));
				sl.set(tempRanNum, null);
			} else {
				i--;
			}//end else
		} // end for

//		for (int k = 0; k < names.length; k++) {
//			System.out.println(names[k]);
//		}

	}// Work23

	public int randomScore() {
		int ranScore = Math.abs(r.nextInt() % 101); // 0 ~ 100점 발생
		return ranScore;
	}

	public int randomStudent() {
		int ranStd = Math.abs(r.nextInt() % 6); // 0 ~ 5 사이 번호 생성 (index 용)
		return ranStd;
	}// randomCount

	public int randomCount() {
		int ranCnt = (Math.abs(r.nextInt() % 5)) + 2; // 2 ~ 6 사이 번호 생성 (index 용)
		return ranCnt;
	}// randomCount

	public String[] separator(String names) {
		String[] result = null;
		return result;
	}// separator

	public static void main(String[] args) {
		new Work23();
	}// main

}// class
