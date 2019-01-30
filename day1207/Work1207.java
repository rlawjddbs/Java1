package day1207;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ���� 1.<br>
 * main method�� arguments�� ��¥�� ������ �Է� �޾� �Է¹��� ��¥��<br>
 * ������ �����ϰ� ����ϴ� method �� �ۼ��ϼ���.<br>
 * <br>
 * ��) java Test 4 12 30 32 35 15 4<br>
 * <br>
 * ���) 4 ȭ<br>
 * 12 ��<br>
 * 15 ��<br>
 * 30 �� <br>
 * <br>
 * - Map�� Set�� ���� ���ϰ� �� �� �ִ�.
 * 
 * @author owner
 */
public class Work1207 {
	String[] days = { "1", "2", "23" };

	public Work1207() {
	}// �⺻ ������

	public static void main(String[] args) {
		args[0] = "4";
		args[1] = "12";
		args[2] = "30";
		args[3] = "32";
		args[4] = "35";
		args[5] = "15";
		args[6] = "4";

		// �Էµ� ���� ������ Set
		Set<String> inputDay = new HashSet<String>();
		// set�� ����� ���� ���� ������ ������ Map
		Map<String, String> map = new HashMap<String, String>();
		// ���� ����� ���� Calendar Ŭ���� ��üȭ
		Calendar cal = new GregorianCalendar();
		// DAY_OF_WEEK �� �����ϱ� ���� ���� day

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
			map.put(tempNum, "��,��,ȭ,��,��,��,��,��".split(",")[day - 1]);
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
