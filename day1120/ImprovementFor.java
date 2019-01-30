package day1120;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ for�� : �迭�̳� Collection���� ��� ���� ���� ó������<br>
 * ���������� ����ϱ����� ����.<br>
 * ������ for���� JDK1.5�������� ��밡��<br>
 * <br>
 * ���� )<br>
 * for( �������� ������ : �迭��(Collection��)){<br>
 * ������;(�迭(Collection)���� ���� ����� �� �ִ�.)<br>
 * }<br>
 * a
 * 
 * @author owner
 */
public class ImprovementFor {

	public static void main(String[] args) {
		// ������ ������� �迭���� ���
		int[] tempArr= {2018, 11, 20, 16, 5};
		//������ for�� ��� ���� ���� ���
		for (int i=0; i < tempArr.length; i++) {
			System.out.println(tempArr[i]);
		}//end for
		System.out.println("--------------------------------------------------");
		// ������ ������� �迭���� ���
		for (int value:tempArr) {
			System.out.println(value);
		}//end for
		
		
		//Collection �̶�� ��
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(110);
		list.add(1);
		System.out.println("-------------------List ���� ������� for-----------------------");
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}//end for
		
		
		System.out.println("-------------------List ������ ������� for-----------------------");
		for(int i : list) {
			System.out.println(i);
		}//end for
		
		
	}// main

}
