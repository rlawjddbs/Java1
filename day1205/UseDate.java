package day1205;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ������ �ִ� ��¥ ������ ���� ��.<br>
 * ���� - java.text.SimpleDateFormat <br>
 * ��¥���� - java.util.Date
 * 
 * @author owner
 */
public class UseDate {
	public UseDate() {
		Date date = new Date();
		System.out.println(date);
//		System.out.println(1900+date.getYear()); //����õ method�� ����.
		
		// ��¥ ������ ������� Error �� �߻��ϴ� "����Ŭ"���� �޸� �ڹٴ� ��¥ ������ ������� ������ ���� �ʴ´�.
		// Locale - �ٸ� ������ ��¥ �������� �����Ͽ� ������ ��.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd�� a EEEE HH(hh, kk):mm:ss:ms", Locale.ITALY); // E�� ���� ����ϸ� "����"���� �ڵ� ��µȴ�. (OS �� ������ ����, Ȥ�� locale Ŭ������ ������ ����)
		String formatDate = sdf.format(date);
		System.out.println(formatDate);
		
	}// UseDate

	public static void main(String[] args) {
		new UseDate();
	}// main

}// class
