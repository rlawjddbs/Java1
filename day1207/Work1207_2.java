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
		
		// �Էµ� ���� ������ Set
		Set<String> inputDay = new HashSet<String>();
		// set�� ����� ���� ���� ������ ������ Map
		Map<String, String> map = new HashMap<String, String>();
		// ���� ����� ���� Calendar Ŭ���� ��üȭ
		Calendar cal = new GregorianCalendar();
		// DAY_OF_WEEK �� �����ϱ� ���� ���� day
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
				map.put(ita.next(), /*"��,��,ȭ,��,��,��,��,��".split(",")[((Integer.parseInt(ita.next())) - 1)]*/"hh");
				System.out.println(map.get(ita.next()));
				}//while
				
//				map.add(inputDay.get(args[i]), day);
//				System.out.printf("12���� [%d]���� [%s]���� �Դϴ�.\n", Integer.parseInt(args[i]),
//						("��,��,ȭ,��,��,��,��,��".split(",")[(day) - 1]));
			} else {
				System.out.printf("1 ~ 31 ������ �ϼ��� �Է��� �ּ���. ���� �Էµ� �� : [%s]\n", args[i]);
			} // end else
			
		} // end for
	}// main

}
