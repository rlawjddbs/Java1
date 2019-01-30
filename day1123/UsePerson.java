package day1123;

/**
 * main method�� �ִ� class = �ڹ� ���ø����̼�(Java Application)<br>
 * ����� �߻�ȭ�Ͽ� ���� Person Ŭ������ ����ϴ� UsePerson Ŭ����<br>
 * @author owner
 */
public class UsePerson {
	
	public static void main(String[] args) {
		// ��ü ���� : heap memory ������ �����ǰ� instance ������ �ڵ� �ʱ�ȭ�� �ȴ�. ( ex : int�� ��� 0, String�� ��� null �� )
		Person taecksung = new Person(); // �������������� ��ü�� = new Ŭ������();
		// ������ ���������� Person�� heap�� �ּҸ� ������ �ִ�.
		System.out.println("��ü�� ����ϸ� �ּҰ� ���" + taecksung);
		System.out.format("������ ��� ��ü ���� ��[%d], ��[%d], ��[%d], �̸�[%s]\n", taecksung.getEye(), taecksung.getNose(), taecksung.getMouth(), taecksung.getName());
		
		taecksung.setName("���ü�");
//		taecksung.setEye(2);
//		taecksung.setNose(1);
//		taecksung.setMouth(1);
		System.out.format("������ ��� ��ü ���� ��[%d], ��[%d], ��[%d], �̸�[%s]\n", taecksung.getEye(), taecksung.getNose(), taecksung.getMouth(), taecksung.getName());
		
		//������ ��ü���� ���ǵ� ���� ���
		System.out.println(taecksung.eat());
		System.out.println(taecksung.eat("��ȸ�����", 8000));
		
		
		System.out.println("------------------------------------------------------------------------");
		Person jinban = new Person(3, 1, 1);
		jinban.setName("õ����");
//		jinban.setEye(3);
//		jinban.setNose(1);
//		jinban.setMouth(1);
		
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("����", 1));
//		System.out.println(taecksung.eat());
//		System.out.println(taecksung.eat("��ȸ�����", 8000));
		
		// õ���� ��ü�� ���ü� ��ü�� �ּҴ� �ٸ���.
		System.out.println(taecksung);
		System.out.println(jinban);
		
		/*  */
	}//main

}//class
