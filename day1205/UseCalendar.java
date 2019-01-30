package day1205;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : ���� ��¥ ������ ���� ��,
 * 
 * @author owner
 */
public class UseCalendar {

	public UseCalendar() {
		// Calendar Ŭ������ �ν��Ͻ� ���
		// 1. getInstance���
//		Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		// 2. is a ����
		Calendar cal1 = new GregorianCalendar();
		// 3. �ڽĸ����� ��ü�����
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(cal);
		System.out.println(cal1);
		System.out.println(gc);

		// Constant �� ���ڷ� ������ �������� ���ȴ�.
		int year = cal.get(Calendar.YEAR);
		// Java������ ���� ������ 0�� (1�� ������� ��)
		int month = cal.get(Calendar.MONTH) + 1;
		// ���� ������ 1��
		int day = cal.get(Calendar.DATE);
		// �̹��� �������κ��� ��ĥ ��������
		int day1 = cal.get(Calendar.DAY_OF_MONTH);
		int day_of_year = cal.get(Calendar.DAY_OF_YEAR);
		// ���� : ��-1, ��-2, ȭ-3, ��-4, ��-5, ��-6, ��-7
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println(year + "��");

		System.out.println(month + "��");
		System.out.println(day + "��");
		System.out.println(day1 + "��");
		System.out.println(day_of_year + "��");

		System.out.printf("%d-%d-%d ������ ���ؿ� %d��° ��\n", year, month, day, day_of_year);
		System.out.printf("%d���� ", day_of_week);

//		switch (day_of_week) {
//		case 1:			System.out.println("�Ͽ���");			break;
//		case 2:			System.out.println("������");			break;
//		case 3:			System.out.println("ȭ����");			break;
//		case 4:			System.out.println("������");			break;
//		case 5:			System.out.println("�����");			break;
//		case 6:			System.out.println("�ݿ���");			break;
//		case 7:			System.out.println("�����");			break;
//		}
		String week=null;
//		switch (day_of_week) {
//		case Calendar.SUNDAY:
//			week="�Ͽ���";
//			break;
//		case Calendar.MONDAY:
//			week="������";
//			break;
//		case Calendar.TUESDAY:
//			week="ȭ����";
//			break;
//		case Calendar.WEDNESDAY:
//			week="������";
//			break;
//		case Calendar.THURSDAY:
//			week="�����";
//			break;
//		case Calendar.FRIDAY:
//			week="�ݿ���";
//			break;
//		case Calendar.SATURDAY:
//			week="�����";
//			break;
//		}
		String[] weekTitle= {"��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.printf("%d���� %s\n ", day_of_week, weekTitle[day_of_week-1]);
		int am_pm = cal.get(Calendar.AM_PM);
		System.out.printf("%d \n", am_pm);
//		switch(am_pm) {
//		case Calendar.AM :
//			
//			break;
//		case Calendar.PM:
//			
//			break;
//		}//end switch
		System.out.printf("%d, %s ", am_pm, am_pm == Calendar.AM?"����":"����");
		
		//HOUR�� ���� ���İ� ǥ��� �ð�, HOUR_OF_DAY�� 24�ð����� ǥ��� �ð�
		int hour=cal.get(Calendar.HOUR);
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d(%d):%d:%d\n ", hour, hour24, minute, second);
		
		System.out.println("-----------------------------------------------------------");
		System.out.printf("���� �� %d-%d-%d %s����\n", 
				cal1.get(Calendar.YEAR),
				cal1.get(Calendar.MONTH)+1,
				cal1.get(Calendar.DAY_OF_MONTH),
				"��,��,ȭ,��,��,��,��".split(",")[cal1.get(Calendar.DAY_OF_WEEK)-1]
				);
		
		//�� ����
		cal1.set(Calendar.YEAR, 2019); //2019-12-06
		//�� ���� : ����� �����ϴ� ������ 1 ���� ����
		cal1.set(Calendar.MONTH, 4); //2019-05-06
		//�� ���� : �ش� ���� �ִ� �ϼ��� �ѱ� ������ �����ϸ� �׸�ŭ ������ �ϼ����� �з��� �Ϸ� �����ȴ�.
//		cal1.set(Calendar.DAY_OF_MONTH, 32); //2019-06-01
		cal1.set(Calendar.DAY_OF_MONTH, 15); //2019-05-15
		
		
		System.out.printf("���� �� %d-%d-%d %s����\n", 
				cal1.get(Calendar.YEAR),
				cal1.get(Calendar.MONTH)+1,
				cal1.get(Calendar.DAY_OF_MONTH),
				"��,��,ȭ,��,��,��,��".split(",")[cal1.get(Calendar.DAY_OF_WEEK)-1]
				);
		
		// ���� ������ �ϼ� : getActualMaximum()
		System.out.println("�̹����� �������� : "+ cal.getActualMaximum(Calendar.DATE));
	}// UseCalendar

	public static void main(String[] args) {
		new UseCalendar();
	}//main

}//class
