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
public class Work1207 {
	String[] days = { "1", "2", "23" };

	public Work1207() {
	}// 기본 생성자

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

		for (int i = 0; i < args.length; i++) {

			int inputDays = Integer.parseInt(args[i]);

			if (inputDays > 0 && inputDays < 32) {
				inputDay.add(args[i]);
			} // end if

		} // end for

		int day;
		int temp = 0;
		Iterator<String> ita = inputDay.iterator();
		int[] tempAlign = new int[inputDay.size()];

		while (ita.hasNext()) {
			String tempNum = ita.next();
			cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(tempNum));
			day = cal.get(Calendar.DAY_OF_WEEK);
			map.put(tempNum, "일,월,화,수,목,금,토,일".split(",")[day - 1]);
			tempAlign[temp] = Integer.parseInt(tempNum);
			temp++;
		} // end while

		int tempSpace = 0;
		for (int i = 0; i < map.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (tempAlign[i] < tempAlign[j]) {
					tempSpace = tempAlign[i];
					tempAlign[i] = tempAlign[j];
					tempAlign[j] = tempSpace;
				} // end if
			} // end for
		} // end for

		for (int i = 0; i < tempAlign.length; i++) {
			System.out.printf("%s %s \n", tempAlign[i], map.get(String.valueOf(tempAlign[i])));
		} // end for

	}// main
}// class
