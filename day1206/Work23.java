package day1206;

import java.util.ArrayList;
import java.util.Random; // Random Ŭ���� Ȱ��
import java.util.StringTokenizer;

/**
 * ����<br>
 * 1. �Ʒ��� �����͸� ó���ϴ� ���α׷��� �ۼ��ϼ���.<br>
 * ������,�̺���,������,���ü�,������,������ �� �����Ͱ� �����ϰ�,<br>
 * ������ 0~100�� ���̷� �߻��� �� �ֽ��ϴ�.<br>
 * <br>
 * ���α׷��� ����Ǹ� ���� ����߿� 2�� �̻��� ����ó�� ����� �̰� (�Ź� �������ϰ� ������ �ο��� ��ǥ��)<br>
 * n���� �̸��� ������ �����Ͽ� ����ϴ� ���� �ϴ� ���α׷� �ۼ�.<br>
 * �ߺ��̸��� �� �� ����.<br>
 * <br>
 * ��� ��)<br>
 * ������ 89<br>
 * ���ü� 77<br>
 * ������ 90<br>
 * ���� xx��<br>
 * <br>
 * ������ List�� �޾Ƽ� ����ϴ� ����.
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
		sl.add("������ " + String.valueOf(randomScore()) + "��");
		sl.add("�̺��� " + String.valueOf(randomScore()) + "��");
		sl.add("������ " + String.valueOf(randomScore()) + "��");
		sl.add("���ü� " + String.valueOf(randomScore()) + "��");
		sl.add("������ " + String.valueOf(randomScore()) + "��");
		sl.add("������ " + String.valueOf(randomScore()) + "��");

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
		int ranScore = Math.abs(r.nextInt() % 101); // 0 ~ 100�� �߻�
		return ranScore;
	}

	public int randomStudent() {
		int ranStd = Math.abs(r.nextInt() % 6); // 0 ~ 5 ���� ��ȣ ���� (index ��)
		return ranStd;
	}// randomCount

	public int randomCount() {
		int ranCnt = (Math.abs(r.nextInt() % 5)) + 2; // 2 ~ 6 ���� ��ȣ ���� (index ��)
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
