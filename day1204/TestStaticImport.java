package day1204;

import static java.lang.Integer.MAX_VALUE;
//���� �̸��� ����� �ϳ��� static import �޴´�.
//import static java.lang.Byte.MAX_VALUE;

// method�� method�� ����Ѵ�.
import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;

/**
 *  static import : 
 *	�ٸ� Ŭ������ static ����(Constant)�� method�� ���� Ŭ������
 *	�ִ� ��ó�� ����� ��.
 *	import static ��Ű����.Ŭ������.������|method��;
 * @author owner
 */
public class TestStaticImport {
	
	public static void main(String[] args) {
		int i = MAX_VALUE;
		System.out.println(i);
		System.out.println(MAX_VALUE);
		
		String year = "2018";
		String month = "12";
		String day = "4";
		
		int intYear = parseInt(year);
		int intMonth = parseInt(month);
		int intDay = parseInt(day);
		
		System.out.println(intYear + " / " + intMonth + " / " + intDay);
		System.out.println(toBinaryString(intYear) + "�� / " + toBinaryString(intMonth) + "�� / " + toBinaryString(intDay)+"��");
	}//main

}//class
