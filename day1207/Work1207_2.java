package day1207;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 숙제 1.<br>
 * main method의 arguments로 날짜를 여러개 입력 받아 입력받은 날짜의<br>
 * 요일을 저장하고 출력하는 method 를 작성하세요.<br>
 * <br>
 * 예) java Test 4 12 30 32 35 15 4<br>
 * <br>
 * 출력) 4 화<br>
 * 12 수<br>
 * 15 토<br>
 * 30 일 <br>
 * <br>
 * - Map과 Set을 쓰면 편하게 할 수 있다.
 * 
 * @author owner
 */
public class Work1207_2 {
//	Map<Integer,String> map=new HashMap<Integer,String>();
	String[] days = { "1", "2", "23" };

	public Work1207_2() {
	}

	public static void main(String[] args) {
		args[0] = "4";
		args[1] = "12";
		args[2] = "30";
		args[3] = "32";
		args[4] = "35";
		args[5] = "15";
		args[6] = "4";
		
		// 입력된 값을 저장할 Set
		Set<String> inputDay = new HashSet<String>();
		// set에 저장된 값과 맞춰 요일을 저장할 Map
		Map<String, String> map = new HashMap<String, String>();
		// 요일 계산을 위한 Calendar 클래스 객체화
		Calendar cal = new GregorianCalendar();
		// DAY_OF_WEEK 을 저장하기 위한 변수 day
		int day; 
		// for
		for (int i = 0; i < args.length; i++) {
			int inputDays = Integer.parseInt(args[i]);
			if (inputDays > 0 && inputDays < 32) {
				cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(args[i]));
				day = cal.get(Calendar.DAY_OF_WEEK);
				inputDay.add(args[i]);
				Iterator<String> ita = inputDay.iterator();
				
				while(ita.hasNext()) {
				map.put(ita.next(), /*"일,월,화,수,목,금,토,일".split(",")[((Integer.parseInt(ita.next())) - 1)]*/"hh");
				System.out.println(map.get(ita.next()));
				}//while
				
//				map.add(inputDay.get(args[i]), day);
//				System.out.printf("12월의 [%d]일은 [%s]요일 입니다.\n", Integer.parseInt(args[i]),
//						("일,월,화,수,목,금,토,일".split(",")[(day) - 1]));
			} else {
				System.out.printf("1 ~ 31 사이의 일수를 입력해 주세요. 현재 입력된 값 : [%s]\n", args[i]);
			} // end else
			
		} // end for
	}// main

}
