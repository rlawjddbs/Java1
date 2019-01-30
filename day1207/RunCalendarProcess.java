package day1207;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * �����̰� �۾��� java����
 * ���� 1.<br>
 *     main method�� arguments�� ��¥�� ������ �Է� �޾� �Է¹��� ��¥��
 *     ������ �����ϰ� ����ϴ� method �� �ۼ��ϼ���.<br>
 *     ��) java Test> 4 12 30 32 35 15 4<br>
 *     ���) 4 ȭ<br>
 *         12 ��<br>
 *         15 ��<br>
 *         30 ��<br>
 *         
 * @author owner
 */
public class RunCalendarProcess {
	public RunCalendarProcess() {
		
	} // RunCalendarProcess
	
	public RunCalendarProcess(String[] days) {
		System.out.print("RCP ����");
		
		// arguments�� �ߺ��� �����ϰ�, �������� ������ �� ���
		printDays(clearDays(days));
		
		System.out.print("RCP ����");
		
	} // RunCalendarProcess
	
	public List<Integer> clearDays(String[] days) {
		String[] realDays = new String[days.length]; // 0~31 ������ ��¥�� �ޱ� ���� �迭
		Set<Integer> set = new HashSet<Integer>(); // �ߺ� ������ ���� Set
		
		// 1. 0~31 ������ �� realDays �迭�� ���
		int cnt = 0;
		for (int i = 0; i < days.length; i++) {
			if ((Integer.parseInt(days[i]) > 0) && 
					(Integer.parseInt(days[i]) < 32)) { // cal.getActualMaximum(Calendar.DATE) �� 12���� �ƴ� ���� ��¥�� �˰� �ʹٸ�
				realDays[cnt] = days[i];
				cnt++;
			} // end if
		} // end for
		
		// 2. realDays �迭�� ��� �ߺ� ����
		for (int i = 0; i < cnt; i++) {
			set.add(Integer.parseInt(realDays[i]));
		} // end for
		
		// ��ȯ�� ��¥ �����͸� ��� ���� ArrayList ����
		List<Integer> daysList = new ArrayList<Integer>(set);
		
		// �÷����� sort�� �̿��� �������� ����
		Collections.sort(daysList);
		
		return daysList;
		
	} // clearDays
	
	public void printDays(List<Integer> daysList) {
		String[] weeks = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		// cal ���� (getInstance �޼���)
		Calendar cal = Calendar.getInstance();
		
		// ���� : �� - 1, �� - 2, ȭ - 3, �� - 4, �� - 5-, �� - 6, �� - 7
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
		
		// arguments�� ����
		for (int i = 0; i < days.length; i++) {
			days[i] = args[i];
		} // end for
		
		// arguments�� �Է¹��� ��
		System.out.print("args.value : ");
		for (String temp : days) { 
			System.out.print(temp + " ");
		} // advanced for
		System.out.println("/ args.length() : " + days.length + "\n");
		
		new RunCalendarProcess(days);
		
	} // main
	
} // class
