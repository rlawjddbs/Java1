package day1206;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * List : <br>
 * �ߺ����� ����ϸ� �˻��� ����� �ְ�, ������� ���� �Է��ϴ� ����������.
 * 
 * @author owner
 */
public class UseList {

	public UseList() {
		// JDK1.4������ Generic�� �������� �ʰ� ��ü�� ����ȴ�.
//		List list = new ArrayList();
//		//�� �߰� : JDK 1.5 ���� ������ ��ü�θ� ���� ���� �� �ִ�.
//		list.add(new Integer(10));
//		list.add(new Short((short)10));
//		list.add("������");

//		System.out.println(list.size());
//		System.out.println( ((Integer)list.get(0)).intValue()+10);
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));

		// JDK1.5+ ���� ��� : Generic, auto boxing, unboxing

//		List list = new ArrayList(); //Generic ������ ����
		List<Integer> list = new ArrayList<Integer>();
		list.add(10); // autoboxing
		list.add(20);
		list.add(new Integer(30));// autoboxing�� �������� ���.
		// Generic�� Integer�� �����߱� ������ ���ڿ� ���ͷ��� list�� �Ҵ�� �� ����.
//		list.add("�����"); // Generic���� ������ ���� �ƴ� ���������� �߰��� �� ����.

		System.out.println("list�� ũ�� : " + list.size());
		System.out.println((Integer) list.get(0) + 10);
		System.out.println((Integer) list.get(1) + 10);
//		System.out.println((Integer)list.get(2)+10); // ���ڿ��� ������ �����ϸ� Error �߻�.

		System.out.println("list�� ũ�� : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + 1);
		} // end for

	}// UseList

	/**
	 * ArrayList ��� : Multi Threadȯ�濡�� ���� ���� ����.(����ȭ x)
	 */
	public void useArrayList() {
		// 1. ����
		ArrayList<String> al = new ArrayList<String>(); // �� 0��
		List<String> al1 = new ArrayList<String>(100);// �� 100��, ���� ���� ���¿��� size()�� ũ�� ��½� 0���� ����. (size()�� �������� ũ�⸦
														// ��ȯ��)

		System.out.println(al + " / " + al1); // �ּҰ� �ȳ����� ������ �������̵��߱� �����̴�.
		// 2. ���߰�
		al.add("������");
		al.add("���ü�");
		al.add("������");
		al.add("�����");
		al.add("������"); // ArrayList�� �ߺ����� ����Ѵ�.
		al.add("������"); // ArrayList�� �ߺ����� ����Ѵ�.
		al.add("������"); // ArrayList�� �ߺ����� ����Ѵ�.
		al.add("������");
		System.out.println(al + " / " + al1);
		// size() : �������� ũ��
		System.out.println("al�� ũ�� : " + al.size() + ", al1�� ũ�� : " + al1.size());

		// �迭�� ����
		String[] names = new String[al.size()];
		al.toArray(names);

		// ���� �� ����
		// index�� ���� : Ư�� index���� ���� ������
		al.remove(4);
		System.out.println("al�� ũ�� : " + al.size());
		// ���� �������� ����
		al.remove("������"); // ���� -> ���������� �˻��Ͽ� ��ġ�ϴ� ù��° ���� ���� �����Ѵ�.
		System.out.println("al�� ũ�� : " + al.size());

		for (String name : al) {
			System.out.printf(name + "\t");
		} // end for
		System.out.println();

		// ��� ���� �� ���� :
		al.clear();
		System.out.println("��ü ���� �� : " + al.size() + " / " + al);

		// �迭�� ��
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s\t", names[i]);
		} // end for
		System.out.println();

	}// useArrayList

	public void useVector() {
		// 1. ����
		Vector<String> vec = new Vector<String>(); // �� 0��
		List<String> vec1 = new ArrayList<String>(100);// �� 100��, ���� ���� ���¿��� size()�� ũ�� ��½� 0���� ����. (size()�� �������� ũ�⸦
														// ��ȯ��)

		System.out.println(vec + " / " + vec1); // �ּҰ� �ȳ����� ������ �������̵��߱� �����̴�.
		// 2. ���߰�
		vec.add("������");
		vec.add("���ü�");
		vec.add("������");
		vec.add("�����");
		vec.add("������"); // ArrayList�� �ߺ����� ����Ѵ�.
		vec.add("������"); // ArrayList�� �ߺ����� ����Ѵ�.
		vec.add("������"); // ArrayList�� �ߺ����� ����Ѵ�.
		vec.add("������");
		System.out.println(vec + " / " + vec1);
		// size() : �������� ũ��
		System.out.println("vec�� ũ�� : " + vec.size() + ", vec1�� ũ�� : " + vec1.size());

		// �迭�� ����
		String[] names = new String[vec.size()];
		vec.toArray(names);

		// ���� �� ����
		// index�� ���� : Ư�� index���� ���� ������
		vec.remove(4);
		System.out.println("vec�� ũ�� : " + vec.size());
		// ���� �������� ����
		vec.remove("������"); // ���� -> ���������� �˻��Ͽ� ��ġ�ϴ� ù��° ���� ���� �����Ѵ�.
		System.out.println("vec�� ũ�� : " + vec.size());

		for (String name : vec) {
			System.out.printf(name + "\t");
		} // end for
		System.out.println();

		// ��� ���� �� ���� :
		vec.clear();
		System.out.println("��ü ���� �� : " + vec.size() + " / " + vec);

		// �迭�� ��
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s\t", names[i]);
		} // end for
		System.out.println();

	}// useVector

	public void useLinkedList() {
		// 1. ����
				LinkedList<String> ll = new LinkedList<String>(); // �� 0��
				List<String> ll1 = new ArrayList<String>(100);// �� 100��, ���� ���� ���¿��� size()�� ũ�� ��½� 0���� ����. (size()�� �������� ũ�⸦ ��ȯ��)

				System.out.println(ll + " / " + ll1); // �ּҰ� �ȳ����� ������ �������̵��߱� �����̴�.
				// 2. ���߰�
				ll.add("������");
				ll.add("���ü�");
				ll.add("������");
				ll.add("�����");
				ll.add("������"); // ArrayList�� �ߺ����� ����Ѵ�.
				ll.add("������"); // ArrayList�� �ߺ����� ����Ѵ�.
				ll.add("������"); // ArrayList�� �ߺ����� ����Ѵ�.
				ll.add("������");
				System.out.println(ll + " / " + ll1);
				// size() : �������� ũ��
				System.out.println("ll�� ũ�� : " + ll.size() + ", ll1�� ũ�� : " + ll1.size());

				// �迭�� ����
				String[] names = new String[ll.size()];
				ll.toArray(names);

				// ���� �� ����
				// index�� ���� : Ư�� index���� ���� ������
				ll.remove(4);
				System.out.println("ll�� ũ�� : " + ll.size());
				// ���� �������� ����
				ll.remove("������"); // ���� -> ���������� �˻��Ͽ� ��ġ�ϴ� ù��° ���� ���� �����Ѵ�.
				System.out.println("ll�� ũ�� : " + ll.size());

				for (String name : ll) {
					System.out.printf(name + "\t");
				} // end for
				System.out.println();

				// ��� ���� �� ���� :
				ll.clear();
				System.out.println("��ü ���� �� : " + ll.size() + " / " + ll);

				// �迭�� ��
				for (int i = 0; i < names.length; i++) {
					System.out.printf("%s\t", names[i]);
				} // end for
				System.out.println();

	}// useLinkedList

	public static void main(String[] args) {
		UseList ul = new UseList();
		System.out.println("----------------------------ArrayList--------------------------------");
		ul.useArrayList();
		System.out.println("-------------------------------Vector-----------------------------");
		ul.useVector();
		System.out.println("------------------------------LinkedList------------------------------");
		ul.useLinkedList();
		
		
	}// main
}// UseList
