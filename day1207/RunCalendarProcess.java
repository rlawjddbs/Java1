package day1207;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 영민이가 작업한 java파일
 * 숙제 1.<br>
 *     main method의 arguments로 날짜를 여러개 입력 받아 입력받은 날짜의
 *     요일을 저장하고 출력하는 method 를 작성하세요.<br>
 *     예) java Test> 4 12 30 32 35 15 4<br>
 *     출력) 4 화<br>
 *         12 수<br>
 *         15 토<br>
 *         30 일<br>
 *         
 * @author owner
 */
public class RunCalendarProcess {
	public RunCalendarProcess() {
		
	} // RunCalendarProcess
	
	public RunCalendarProcess(String[] days) {
		System.out.print("RCP 시작");
		
		// arguments의 중복을 배제하고, 오름차순 정렬한 후 출력
		printDays(clearDays(days));
		
		System.out.print("RCP 종료");
		
	} // RunCalendarProcess
	
	public List<Integer> clearDays(String[] days) {
		String[] realDays = new String[days.length]; // 0~31 사이의 날짜만 받기 위한 배열
		Set<Integer> set = new HashSet<Integer>(); // 중복 배제를 위한 Set
		
		// 1. 0~31 사이의 값 realDays 배열에 담기
		int cnt = 0;
		for (int i = 0; i < days.length; i++) {
			if ((Integer.parseInt(days[i]) > 0) && 
					(Integer.parseInt(days[i]) < 32)) { // cal.getActualMaximum(Calendar.DATE) ← 12월이 아닌 달의 날짜를 알고 싶다면
				realDays[cnt] = days[i];
				cnt++;
			} // end if
		} // end for
		
		// 2. realDays 배열에 담긴 중복 제거
		for (int i = 0; i < cnt; i++) {
			set.add(Integer.parseInt(realDays[i]));
		} // end for
		
		// 반환할 날짜 데이터를 담기 위한 ArrayList 생성
		List<Integer> daysList = new ArrayList<Integer>(set);
		
		// 컬렉션의 sort를 이용한 오름차순 정렬
		Collections.sort(daysList);
		
		return daysList;
		
	} // clearDays
	
	public void printDays(List<Integer> daysList) {
		String[] weeks = {"일", "월", "화", "수", "목", "금", "토"};
		
		// cal 생성 (getInstance 메서드)
		Calendar cal = Calendar.getInstance();
		
		// 요일 : 일 - 1, 월 - 2, 화 - 3, 수 - 4, 목 - 5-, 금 - 6, 토 - 7
		for (int i = 0; i < daysList.size(); i++) {
			if (daysList.get(i) == null) {
				break;
			} // end if
			cal.set(Calendar.DAY_OF_MONTH, daysList.get(i));
			System.out.printf("\n%-4d %s", cal.get(Calendar.DAY_OF_MONTH), weeks[cal.get(Calendar.DAY_OF_WEEK) - 1]);
		} // end for
		
		System.out.println();
		
	} // printDays
	
	public static void main(String[] args) {
		String[] days = new String[args.length];
		
		// arguments의 길이
		for (int i = 0; i < days.length; i++) {
			days[i] = args[i];
		} // end for
		
		// arguments에 입력받은 값
		System.out.print("args.value : ");
		for (String temp : days) { 
			System.out.print(temp + " ");
		} // advanced for
		System.out.println("/ args.length() : " + days.length + "\n");
		
		new RunCalendarProcess(days);
		
	} // main
	
} // class
