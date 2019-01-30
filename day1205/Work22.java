package day1205;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * ����<br>
 * 1. 1~45 ������ ������ ���߿��� �������� �ϳ��� �̾� 6���� ��Ʈ��<br>
 * ����� �迭�� ��ȯ�ϴ� method�� ����� ȣ���Ͽ� ����� ��.<br>
 * ��, �ߺ��� ���� �迭�� �Էµ��� �ʾƾ��Ѵ�.<br>
 * <br>
 * 2. �Ʒ� ���õ� ���ڿ��� ���� ���ڷ� �߶󳻾� ���ڿ� �迭�� �����ϰ�<br>
 * ��ȯ�ϴ� ���� �ϴ� method�� �ۼ��ϼ���.<br>
 * <br>
 * "������,������,������, ���ü�~������!������.����ö,������,������,���ü�.������"<br>
 * <br>
 * ���:<br>
 * ������ ������ ������ ���ü� ������ ������ ����ö ������ ������ ���ü� ������
 * 
 * @author owner
 *
 */
public class Work22 {

	public Work22() {
		// ���� Work22_1 ���
		int[] nums = Work22_1();
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		// ���� Work22_2 ���
		String[] namesList = Work22_2("������,������,������, ���ü�~������!������.����ö,������,������,���ü�.������");
		for (int i = 0; i < namesList.length; i++) {
			System.out.print(namesList[i] + " ");
		}
		System.out.println();

	}// Work22 �⺻ ������

	public int[] Work22_1() {
		int[] numList = new int[6];
		
		for (int i = 0; i < numList.length; i++) {
			System.out.println("�ٱ� for�� ������ i�� �� : "+i);
			numList[i] = (int)((Math.random() * 45)+1);
			for (int j = 0; j < i; j++) {
				System.out.println("numList["+j+"] : "+numList[j]+", numList["+i+"] : "+numList[i]);
				if(numList[j] == numList[i]) {
					System.out.println("���� numList["+j+"(j)]�� �� : "+numList[j]+", ���� numList["+i+"(i)]�� �� : "+numList[i]+", ���� for�� i-- ������ �� : "+i);
					i--;
					System.out.println("���� for�� i-- ������ �� : "+i);
					break;
				}//end if
			} // end for
			System.out.println("�ٱ� for�� ���� i�� �� : "+i);
		}//end for

		return numList;
	}// Work22_1

	/**
	 * Work22-2 �Էµ� ���ڿ��� ��ǥ(",") ��ħǥ(".") ����ǥ("~") ����ǥ(!) ����(" ") ������ �������� ���ڿ� �迭������
	 * ��ȯ�ϴ� method
	 * 
	 * @param names �̸��� �����ڸ� �Է�
	 * @return ���е� �̸����� ��ȯ
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
