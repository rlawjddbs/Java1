package day1129.sub;

import java.util.Arrays;
import day1129.Work21_2;

public class Work21_2sub extends Work21_2 {

	public static void main(String[] args) {
		//1. ���� : ��������[] �迭�� = null;
		Work21_2[] dataArr = null;
		
		//2. ���� : �迭�� = new ��������[���ǰ���];
		dataArr = new Work21_2[7];
		dataArr[0] = new Work21_2();
		
		dataArr[0] = new Work21_2(1, "������", "����� ������ ���ﵿ", 28, "����");
		dataArr[1] = new Work21_2(2, "������", "����� ���빮�� ��ʸ���", 27, "����");
		dataArr[2] = new Work21_2(3, "������", "������ ���뱸 ���뵿", 26, "����");
		dataArr[3] = new Work21_2(4, "���ü�", "����� ���α� ���ε�", 27, "����");
		dataArr[4] = new Work21_2(5, "���ü�", "����� ���۱� �󵵵�", 29, "����");
		dataArr[5] = new Work21_2(6, "�����", "��⵵ ��õ�� ��õ��", 26, "����");
		dataArr[6] = new Work21_2(7, "�����", "����� ������ �����絿", 27, "����");
		
		Work21_2 Work21sub = new Work21_2();
		Work21sub.printArr(dataArr);
//		System.out.println(Arrays.toString(dataArr));
		
		
		
		
	}//main

}//class
