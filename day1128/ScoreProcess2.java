package day1128;

/**
 * 학생의 Oracle, Java, JDBC 과목 점수를 처리하는 프로그램
 * 
 * @author owner
 */
public class ScoreProcess2 {
	private int total;
	private int people;

	public ScoreProcess2() {
		total = 0;
		people = 0;
	}// ScoreProcess2

	/**
	 * 점수를 누적 합
	 * 
	 * @param score 과목별 점수
	 */
	public void addTotal(int score) {
		total += score;
	}// setTotal

	/**
	 * 점수를 얻는 일
	 * 
	 * @return 점수를 가져옴
	 */
	public int getTotal() {
		return total;
	}// getTotal

	/**
	 * 총합 점수를 초기화
	 */
	public void resetTotal() {
		total = 0;
	}// resetTotal

	public String[] nameData() {
		String[] name = { "김정운", "이재현", "정택성", "노진경", "최지우", "김건하" };
		return name;
	}// nameData

	public int[][] scoreData() {
		int[][] score = { { 85, 86, 81 }, { 95, 91, 100 }, { 89, 71, 59 }, { 97, 96, 91 }, { 78, 74, 77 },
				{ 100, 95, 68 } };
		return score;
	}// scoreData

	/**
	 * 1. 학생의 평균 점수를 구하는 일
	 * 
	 * @param length 한행(한 학생)당 열 개수(과목 개수)를 입력
	 * @return 총점을 과목개수로 나눈 값 반환
	 */
	public double avg(int length) {
		return (double) total / length;
	}

	/**
	 * 2차원 배열의 열의 개수를 파악하는 일을 하는 method<br>
	 * 최종적으로 지역 변수 room에 방의 개수를 할당한다.
	 * 
	 * @param score 2차원 배열을 입력
	 * @return room에 할당된 정수(방의 개수)를 반환
	 */
	public int checkRow(int[][] score) {
		int room = 0;
		for (int i = 0; i < score.length; i++) {
			room = i + 1;
		} // end for
		return room;
	}// checkRoom

	/**
	 * 2. 각 과목당 총점과 총점의 총점 2차원 배열의 행의 합을 구하는 일을 한다.
	 * 
	 * @param score      2차원 배열 입력
	 * @param subjectIdx 과목별 합의 index를 입력
	 * @return
	 */
	public int ScoreProcess2(int[][] score, int subjectIdx) {
		// 지역변수 temp에 1차원 배열 선언
		int[] temp = null;
		// 선언된 temp 배열에 parameter로 받은 배열의 방 개수(행 개수)만큼 공간 생성
		temp = new int[checkRow(score)];
		for (int i = 0; i < score[i].length; i++) {// 행
			for (int j = 0; j < score.length; j++) {// 열
				temp[i] += score[j][i];
				people = j + 1;
			} // end for
		} // end for
		return temp[subjectIdx];
	}// ScoreProcess2

	/**
	 * 3. 각 과목당 평균과 전체 평균출력 (전체 평균은 소수이하 두자리 까지 출력)
	 * 
	 * @param score      3과목별 점수를 할당한 2차원 배열 입력
	 * @param subjectIdx 원하는 과목의 index 입력
	 * @return subjectIdx로 입력된 index를 가진 과목의 평균값 반환
	 */
	public double subjectAvg(int[][] score, int subjectIdx) {
		return (double) ScoreProcess2(score, subjectIdx) / (double) people;
	}

	/**
	 * 4. 각 과목당 최고 점수를 출력
	 * 
	 * @return
	 */
	public int highScore(int[][] score, int subjectIdx) {
		int[] highScore = null;
		highScore = new int[3];
		for (int i = 0; i < score[i].length; i++) {// 행
			for (int j = 0; j < score.length; j++) {// 열
				if (highScore[i] < score[j][i]) {
					highScore[i] = score[j][i];
				} // end if
			} // end for
		} // end for
		return highScore[subjectIdx];
	}// highScore

	/**
	 * 5. 일등 학생의 이름과 총점, 번호
	 * 
	 * @param score 각 학생들의
	 * @return
	 */
	public String topOfClass(String[] nameData, int[][] score) {
		int temp[] = new int[score.length];

		int studentNum = 0;
		int highScore = 0;
		String topStudent = "";

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				addTotal(score[i][j]);
				temp[i] = getTotal();
				if (highScore < temp[i]) {
					studentNum = i + 1;
					highScore = temp[i];
					topStudent = nameData[i];
				} // end if
			} // end for
			resetTotal();
		} // end for
		return "1등 학생은 [" + topStudent + "] 총점[" + highScore + "]점 번호[" + studentNum + "]번";
	}// topOfClass

	/**
	 * 6. 자바 점수만 오름차순 정렬하여 출력.
	 * 
	 * @param score 2차원 배열 입력
	 */
	public int[] javaTop(int[][] score) {
		int[] javaScore = new int[score.length];
		int temp = 0;
		for (int i = 0; i < score.length; i++) {
			javaScore[i] = score[i][0];
		}
		for (int j = 0; j < score.length-1; j++) {
			for (int k = j + 1; k < score.length; k++) {
				if (javaScore[j] < javaScore[k]) {
					temp = javaScore[j];
					javaScore[j] = javaScore[k];
					javaScore[k] = temp;
				} // end if
			} // end for
		} // end for
		return javaScore;
	}// javaTop

	/**
	 * 2차원 배열을 참조형 형식으로 만들고 아래와 같이 값을 넣어 출력하는 method<br>
	 * 111111111<br>
	 * 100000001<br>
	 * 100000001<br>
	 * 100000001<br>
	 * 100000001<br>
	 * 111111111
	 */
	public void square() { // 2 - method
		int[][] square = null;
		square = new int[6][9];
		int val = 0;
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				if (i == 0 || i == 5 || j == 0 || j == 8) {
					val = 1;
				} // end if
				square[i][j] = val;
				System.out.printf("%d\t", square[i][j]);
				val = 0;
			} // end for
			System.out.println();
		} // end for
	}// sqaure

	public void printScore(String[] name, int[][] score) {
		// 숙제. -모든 일은 합당한 매개변수와 반환형을 사용하여
		// method로 정의하여 호출하여 사용한다.

		System.out.println("번호\t이름\tOracle\tJava\tJDBC\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < score.length; i++) {// 행
			System.out.printf(" %d\t%s\t", i + 1, name[i]);
			for (int j = 0; j < score[i].length; j++) {// 열
				System.out.printf("%d\t", score[i][j]);
				addTotal(score[i][j]); // 점수 더하기
			} // end for
			System.out.printf("%d\t", getTotal()); // 점수 가져오기

			// 1. 각 학생의 평균을 구하여 출력 (출력은 소수 이하 1자리까지)
			System.out.printf("%.1f", avg(score[i].length));

			System.out.println();
			resetTotal(); // 점수 초기화하기
		} // end for

		// 2. 각 과목당 총점과 총점의 총점
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.printf("2. 과목 총점 - Java : [%d]점, Oracle : [%d]점, JDBC : [%d]점, 총점의 총점 : [%d]점\n",
				ScoreProcess2(score, 0), ScoreProcess2(score, 1), ScoreProcess2(score, 2),
				ScoreProcess2(score, 0) + ScoreProcess2(score, 1) + ScoreProcess2(score, 2));

		// 3. 각 과목당 평균과 전체 평균출력 (전체 평균은 소수이하 두자리 까지 출력)
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.printf("3. 과목 평균 - Java : [%d]점, Oracle : [%d]점, " + "JDBC : [%d]점, 총 평균의 평균 : [%.2f]점\n",
				(int) subjectAvg(score, 0), (int) subjectAvg(score, 1), (int) subjectAvg(score, 2),
				(subjectAvg(score, 0) + subjectAvg(score, 1) + subjectAvg(score, 2)) / 3);

		// 4. 각 과목당 최고 점수를 출력
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.printf("4. 과목별 최고점수 - Java : [%d]점, Oracle : [%d]점, JDBC : [%d]점\n", highScore(score, 0),
				highScore(score, 1), highScore(score, 2));

		// 5. 일등 학생의 이름과 총점, 번호
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.println("5. " + topOfClass(nameData(), score));

		// 6. 자바 점수만 오름차순 정렬하여 출력.
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.printf("6. 자바 점수 순위 : [%d]\t[%d]\t[%d]\t[%d]\t[%d]\t[%d]",
				javaTop(score)[0],
				javaTop(score)[1],
				javaTop(score)[2],
				javaTop(score)[3],
				javaTop(score)[4],
				javaTop(score)[5]);
		System.out.println();
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
//		System.out.printf();
//		System.out.printf("자바 점수 순위-----------------------------------------------------\n");
		// 숙제 2.
		/*
		 * 2차원 배열을 참조형 형식으로 만들고 아래와 같이 값을 넣어 출력하는 method 작성. 1 1 1 1 1 1 1 1 1 1 0 0 0 0
		 * 0 0 0 1 1 0 0 0 0 0 0 0 1 1 0 0 0 0 0 0 0 1 1 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1
		 * 1
		 */
		square();

	}// printScore

	public static void main(String[] args) {
		ScoreProcess2 sp2 = new ScoreProcess2();
		// 처리할 데이터 받기
		String[] name = sp2.nameData();
		int[][] score = sp2.scoreData();
		// 처리
		sp2.printScore(name, score);
	}// main

}// class
