package day1129;

import java.util.Arrays;

public class UseSecureArray {

	public static void main(String[] args) {
		SecureArray sa = new SecureArray();
		int[] tempArr = sa.getArr();

		//SecureArray Ŭ������ ���� �� ������ private �迭 arr�� ���� �ս��� �����´�.
		System.out.println(tempArr);
		//�迭 ���� ���� �ս��� ����Ϸ��� Arrays Ŭ������ ����Ѵ�.
		System.out.println(Arrays.toString(tempArr));
		
		//SecureArray Ŭ������ private �迭 arr�� ���������ڰ� private �ӿ���
		//���� ������ �� �ִ�.(���� Ŭ������ ���������ڰ� public�� method����
		//arr �迭�� ���� ��ȯ�ϱ� ����)
		tempArr[0]=190;
		System.out.println(Arrays.toString(tempArr));
		
		// �迭�� ���� �ٲ�����Ƿ� ���ο� ��ü�� ������ �迭 ���� �ҷ��͵�
		// ������ �迭���� ���´�.
		int[] tempArr1 = sa.getArr();
		System.out.println(Arrays.toString(tempArr1));
	}//main

}//class
