package day1128;

/**
 * �л��� Oracle, Java, JDBC ���� ������ ó���ϴ� ���α׷�
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
	 * ������ ���� ��
	 * 
	 * @param score ���� ����
	 */
	public void addTotal(int score) {
		total += score;
	}// setTotal

	/**
	 * ������ ��� ��
	 * 
	 * @return ������ ������
	 */
	public int getTotal() {
		return total;
	}// getTotal

	/**
	 * ���� ������ �ʱ�ȭ
	 */
	public void resetTotal() {
		total = 0;
	}// resetTotal

	public String[] nameData() {
		String[] name = { "������", "������", "���ü�", "������", "������", "�����" };
		return name;
	}// nameData

	public int[][] scoreData() {
		int[][] score = { { 85, 86, 81 }, { 95, 91, 100 }, { 89, 71, 59 }, { 97, 96, 91 }, { 78, 74, 77 },
				{ 100, 95, 68 } };
		return score;
	}// scoreData

	/**
	 * 1. �л��� ��� ������ ���ϴ� ��
	 * 
	 * @param length ����(�� �л�)�� �� ����(���� ����)�� �Է�
	 * @return ������ ���񰳼��� ���� �� ��ȯ
	 */
	public double avg(int length) {
		return (double) total / length;
	}

	/**
	 * 2���� �迭�� ���� ������ �ľ��ϴ� ���� �ϴ� method<br>
	 * ���������� ���� ���� room�� ���� ������ �Ҵ��Ѵ�.
	 * 
	 * @param score 2���� �迭�� �Է�
	 * @return room�� �Ҵ�� ����(���� ����)�� ��ȯ
	 */
	public int checkRow(int[][] score) {
		int room = 0;
		for (int i = 0; i < score.length; i++) {
			room = i + 1;
		} // end for
		return room;
	}// checkRoom

	/**
	 * 2. �� ����� ������ ������ ���� 2���� �迭�� ���� ���� ���ϴ� ���� �Ѵ�.
	 * 
	 * @param score      2���� �迭 �Է�
	 * @param subjectIdx ���� ���� index�� �Է�
	 * @return
	 */
	public int ScoreProcess2(int[][] score, int subjectIdx) {
		// �������� temp�� 1���� �迭 ����
		int[] temp = null;
		// ����� temp �迭�� parameter�� ���� �迭�� �� ����(�� ����)��ŭ ���� ����
		temp = new int[checkRow(score)];
		for (int i = 0; i < score[i].length; i++) {// ��
			for (int j = 0; j < score.length; j++) {// ��
				temp[i] += score[j][i];
				people = j + 1;
			} // end for
		} // end for
		return temp[subjectIdx];
	}// ScoreProcess2

	/**
	 * 3. �� ����� ��հ� ��ü ������ (��ü ����� �Ҽ����� ���ڸ� ���� ���)
	 * 
	 * @param score      3���� ������ �Ҵ��� 2���� �迭 �Է�
	 * @param subjectIdx ���ϴ� ������ index �Է�
	 * @return subjectIdx�� �Էµ� index�� ���� ������ ��հ� ��ȯ
	 */
	public double subjectAvg(int[][] score, int subjectIdx) {
		return (double) ScoreProcess2(score, subjectIdx) / (double) people;
	}

	/**
	 * 4. �� ����� �ְ� ������ ���
	 * 
	 * @return
	 */
	public int highScore(int[][] score, int subjectIdx) {
		int[] highScore = null;
		highScore = new int[3];
		for (int i = 0; i < score[i].length; i++) {// ��
			for (int j = 0; j < score.length; j++) {// ��
				if (highScore[i] < score[j][i]) {
					highScore[i] = score[j][i];
				} // end if
			} // end for
		} // end for
		return highScore[subjectIdx];
	}// highScore

	/**
	 * 5. �ϵ� �л��� �̸��� ����, ��ȣ
	 * 
	 * @param score �� �л�����
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
		return "1�� �л��� [" + topStudent + "] ����[" + highScore + "]�� ��ȣ[" + studentNum + "]��";
	}// topOfClass

	/**
	 * 6. �ڹ� ������ �������� �����Ͽ� ���.
	 * 
	 * @param score 2���� �迭 �Է�
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
	 * 2���� �迭�� ������ �������� ����� �Ʒ��� ���� ���� �־� ����ϴ� method<br>
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
		// ����. -��� ���� �մ��� �Ű������� ��ȯ���� ����Ͽ�
		// method�� �����Ͽ� ȣ���Ͽ� ����Ѵ�.

		System.out.println("��ȣ\t�̸�\tOracle\tJava\tJDBC\t����\t���");
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < score.length; i++) {// ��
			System.out.printf(" %d\t%s\t", i + 1, name[i]);
			for (int j = 0; j < score[i].length; j++) {// ��
				System.out.printf("%d\t", score[i][j]);
				addTotal(score[i][j]); // ���� ���ϱ�
			} // end for
			System.out.printf("%d\t", getTotal()); // ���� ��������

			// 1. �� �л��� ����� ���Ͽ� ��� (����� �Ҽ� ���� 1�ڸ�����)
			System.out.printf("%.1f", avg(score[i].length));

			System.out.println();
			resetTotal(); // ���� �ʱ�ȭ�ϱ�
		} // end for

		// 2. �� ����� ������ ������ ����
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.printf("2. ���� ���� - Java : [%d]��, Oracle : [%d]��, JDBC : [%d]��, ������ ���� : [%d]��\n",
				ScoreProcess2(score, 0), ScoreProcess2(score, 1), ScoreProcess2(score, 2),
				ScoreProcess2(score, 0) + ScoreProcess2(score, 1) + ScoreProcess2(score, 2));

		// 3. �� ����� ��հ� ��ü ������ (��ü ����� �Ҽ����� ���ڸ� ���� ���)
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.printf("3. ���� ��� - Java : [%d]��, Oracle : [%d]��, " + "JDBC : [%d]��, �� ����� ��� : [%.2f]��\n",
				(int) subjectAvg(score, 0), (int) subjectAvg(score, 1), (int) subjectAvg(score, 2),
				(subjectAvg(score, 0) + subjectAvg(score, 1) + subjectAvg(score, 2)) / 3);

		// 4. �� ����� �ְ� ������ ���
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.printf("4. ���� �ְ����� - Java : [%d]��, Oracle : [%d]��, JDBC : [%d]��\n", highScore(score, 0),
				highScore(score, 1), highScore(score, 2));

		// 5. �ϵ� �л��� �̸��� ����, ��ȣ
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.println("5. " + topOfClass(nameData(), score));

		// 6. �ڹ� ������ �������� �����Ͽ� ���.
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.printf("6. �ڹ� ���� ���� : [%d]\t[%d]\t[%d]\t[%d]\t[%d]\t[%d]",
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
//		System.out.printf("�ڹ� ���� ����-----------------------------------------------------\n");
		// ���� 2.
		/*
		 * 2���� �迭�� ������ �������� ����� �Ʒ��� ���� ���� �־� ����ϴ� method �ۼ�. 1 1 1 1 1 1 1 1 1 1 0 0 0 0
		 * 0 0 0 1 1 0 0 0 0 0 0 0 1 1 0 0 0 0 0 0 0 1 1 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1
		 * 1
		 */
		square();

	}// printScore

	public static void main(String[] args) {
		ScoreProcess2 sp2 = new ScoreProcess2();
		// ó���� ������ �ޱ�
		String[] name = sp2.nameData();
		int[][] score = sp2.scoreData();
		// ó��
		sp2.printScore(name, score);
	}// main

}// class
