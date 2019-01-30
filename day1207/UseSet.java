package day1207;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *	Set : �˻��� ����� ������(get x), �ߺ����� �������� �ʴ� ���.
 * @author owner
 */
public class UseSet {
	public UseSet() {
	// JDK1.5 ���Ͽ����� Generic�� �������� �ʰ� ��ü�� ����
		//1. ���� ) is a ������ instanceȭ
		Set<String> set = new HashSet<String>();
		//2. �� �Ҵ� ) - ������� �Էµ��� �ʴ´�.
		set.add("���ü�");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("�̺���");
		set.add("������"); // �ߺ����� �������� �ʴ´�.
		System.out.println(set.size()+" / "+set);
		set.remove("������"); // ����������
		System.out.println(set.size()+" / "+set); // ������ ����ŭ ũ�Ⱑ �پ���.
		
		// �迭�� ����
		String[] names = new String[set.size()];
		set.toArray(names);
		
		//set�� ��� ��(Element)�� �� ���
//		System.out.println(set.get("������")); //set ��ü�� �˻��� ����� ����.
		//Iterator�� ����ϸ� ���� ���
		Iterator<String> ita = set.iterator();
		
		String name=""; //empty
		while(ita.hasNext()) { //Iterator�� �����ϴ� Set�� ��Ұ� �����Ѵٸ�
			name=ita.next();//�ش� ����� ���� ��� ���� �����ͷ� �̵�
			System.out.println(name);
		}//end while
		System.out.println("-----------------------------���� for--------------------------------");
		for(String temp : set) {
			System.out.println(temp);
		}//end for
		
		// ��� ���� �� ����
		set.clear();
		System.out.println("clear�� "+set.size()+", "+set);
		System.out.println("--------------------------�迭�� ������ ��----------------------------");
		for(int i=0; i < names.length; i++) {
			System.out.println(names[i]);
		}//end for
		
		
		
	}//UseSet
	
	public int[] lotto() {
		int[] tempLotto = new int[6];
		
		Random random = new Random();
		for(int i=0; i < tempLotto.length; i++) {
			tempLotto[i]=random.nextInt(45)+1; // �������� �߻��� �� �ִ�.
			for(int j=0; j < i; j++) {
				if(tempLotto[i] == tempLotto[j]) {//���� ���� ����.
					i--;			// �ߺ� �߻��� ��ȣ�� index��°�� �ٽ� �߻���Ű�� ����
								// index ��ȣ�� �ϳ� ���δ�.
					break; // �ݺ����� ���� ������.
				}//end if
			}//end for
		}//end for
		return tempLotto;
	}//lotto
	
	
	public Integer[] lotto1() {
		Integer[] tempLotto = new Integer[6];
		
		Set<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		while(true) {
			set.add(random.nextInt(45)+1); // ���� ���� �߰����� �ʴ´�.
			if(set.size()==6) {
				break;
			}//end if
		}//end for
		set.toArray(tempLotto);
		return tempLotto;
	}//lotto
	
	public static void main(String[] args) {
		
		UseSet us = new UseSet();
		int[] temp = us.lotto();
		
		for(int i=0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}//end for

		System.out.println("----------------------------------------------------------------------------------");
		
		Integer[] temp1 = us.lotto1();
		for(int i=0; i < temp1.length; i++) {
			System.out.println(temp1[i]);
		}//end for
	}//main

}//class
