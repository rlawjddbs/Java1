package day1205;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : 단일 날짜 정보를 얻을 때,
 * 
 * @author owner
 */
public class UseCalendar {

	public UseCalendar() {
		// Calendar 클래스의 인스턴스 얻기
		// 1. getInstance사용
//		Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		// 2. is a 관계
		Calendar cal1 = new GregorianCalendar();
		// 3. 자식만으로 객체만들기
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(cal);
		System.out.println(cal1);
		System.out.println(gc);

		// Constant 를 인자로 넣으면 가독성이 향상된다.
		int year = cal.get(Calendar.YEAR);
		// Java에서는 월의 시작이 0월 (1을 더해줘야 함)
		int month = cal.get(Calendar.MONTH) + 1;
		// 일의 시작은 1일
		int day = cal.get(Calendar.DATE);
		// 이번달 시작으로부터 며칠 지났는지
		int day1 = cal.get(Calendar.DAY_OF_MONTH);
		int day_of_year = cal.get(Calendar.DAY_OF_YEAR);
		// 요일 : 일-1, 월-2, 화-3, 수-4, 목-5, 금-6, 토-7
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println(year + "년");

		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(day1 + "일");
		System.out.println(day_of_year + "일");

		System.out.printf("%d-%d-%d 오늘은 올해에 %d번째 날\n", year, month, day, day_of_year);
		System.out.printf("%d요일 ", day_of_week);

//		switch (day_of_week) {
//		case 1:			System.out.println("일요일");			break;
//		case 2:			System.out.println("월요일");			break;
//		case 3:			System.out.println("화요일");			break;
//		case 4:			System.out.println("수요일");			break;
//		case 5:			System.out.println("목요일");			break;
//		case 6:			System.out.println("금요일");			break;
//		case 7:			System.out.println("토요일");			break;
//		}
		String week=null;
//		switch (day_of_week) {
//		case Calendar.SUNDAY:
//			week="일요일";
//			break;
//		case Calendar.MONDAY:
//			week="월요일";
//			break;
//		case Calendar.TUESDAY:
//			week="화요일";
//			break;
//		case Calendar.WEDNESDAY:
//			week="수요일";
//			break;
//		case Calendar.THURSDAY:
//			week="목요일";
//			break;
//		case Calendar.FRIDAY:
//			week="금요일";
//			break;
//		case Calendar.SATURDAY:
//			week="토요일";
//			break;
//		}
		String[] weekTitle= {"일", "월", "화", "수", "목", "금", "토"};
		System.out.printf("%d요일 %s\n ", day_of_week, weekTitle[day_of_week-1]);
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
		System.out.printf("%d, %s ", am_pm, am_pm == Calendar.AM?"오전":"오후");
		
		//HOUR는 오전 오후가 표기된 시간, HOUR_OF_DAY는 24시간제로 표기된 시간
		int hour=cal.get(Calendar.HOUR);
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d(%d):%d:%d\n ", hour, hour24, minute, second);
		
		System.out.println("-----------------------------------------------------------");
		System.out.printf("설정 전 %d-%d-%d %s요일\n", 
				cal1.get(Calendar.YEAR),
				cal1.get(Calendar.MONTH)+1,
				cal1.get(Calendar.DAY_OF_MONTH),
				"일,월,화,수,목,금,토".split(",")[cal1.get(Calendar.DAY_OF_WEEK)-1]
				);
		
		//년 설정
		cal1.set(Calendar.YEAR, 2019); //2019-12-06
		//월 설정 : 사람이 생각하는 월보다 1 적게 설정
		cal1.set(Calendar.MONTH, 4); //2019-05-06
		//일 설정 : 해당 월에 최대 일수를 넘긴 값으로 설정하면 그만큼 다음달 일수까지 밀려난 일로 설정된다.
//		cal1.set(Calendar.DAY_OF_MONTH, 32); //2019-06-01
		cal1.set(Calendar.DAY_OF_MONTH, 15); //2019-05-15
		
		
		System.out.printf("설정 후 %d-%d-%d %s요일\n", 
				cal1.get(Calendar.YEAR),
				cal1.get(Calendar.MONTH)+1,
				cal1.get(Calendar.DAY_OF_MONTH),
				"일,월,화,수,목,금,토".split(",")[cal1.get(Calendar.DAY_OF_WEEK)-1]
				);
		
		// 달의 마지막 일수 : getActualMaximum()
		System.out.println("이번달의 마지막날 : "+ cal.getActualMaximum(Calendar.DATE));
	}// UseCalendar

	public static void main(String[] args) {
		new UseCalendar();
	}//main

}//class
