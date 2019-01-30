package day1121;

/**
 *	Instance(member) ����<br>
 * 		��ü�� ������ �� �޸�(heap)�� �Ҵ� �ǰ�, �� �ּҸ� ������<br>
 * 		����(��ü, instance, object)�� ����Ͽ� �����ϴ� ����.<br>
 * 		�ڵ� �ʱ�ȭ�� �ȴ�.<br>
 * 		
 * @author owner
 */
public class UseInstanceVariable {
	
	// instance ���� ����
	int i;	//������ �ʱ�ȭ�� 0
	int j;
	double d; //�Ǽ��� �ʱ�ȭ�� 0.0
	char c; // ������ �ʱ�ȭ�� \u0000
	boolean b; //�Ҹ��� �ʱ�ȭ�� false
	String str; //������ �ʱ�ȭ�� null
	UseInstanceVariable jaehyun;// ������ �ʱ�ȭ�� null
	
	public static void main(String[] args) {
		// static ������ ���� ���� �޸𸮿� �ε� �ǹǷ�, ���������� �𸣴�
		// instance ������ ���� ����� �� ����.
		// i = 300; //��� �ȵ�
		
		// ��üȭ�� �ϸ� ��ü�� �޸�(heap����)�� �����ǰ�, �� �ּҸ� �޸�(stack����)�� ����
		// ��üȭ�� ������ : Ŭ������ ��ü�� = new Ŭ������();
		UseInstanceVariable uiv = new UseInstanceVariable();
		UseInstanceVariable uiv1 = new UseInstanceVariable();
		System.out.println("��ü ���(heap�ּ�) "+uiv);		// �ڹ��� �ּ� ü��´� 4byteü����
		System.out.println("��ü ���(heap�ּ�) "+uiv1);	// �ڹ��� �ּ� ü��´� 4byteü����
		
		// heap�� ������ instance variable�� ���.
		uiv.i=11;
		uiv.j=21;
		
		System.out.println("uiv��ü�� ��� ���� i = "+ uiv.i);
		System.out.println("uiv��ü�� ��� ���� j = "+ uiv.j);	
		
		// instance(member)������ �ڵ��ʱ�ȭ �ȴ�.
		System.out.println("uiv1 ��ü i : "+uiv1.i +", uiv1 ��ü j : "+uiv1.j);
		System.out.println("------------- Instance Variable�� �ڵ� �ʱ�ȭ ��--------------");
		System.out.println("������ : " + uiv1.i);
		System.out.println("�Ǽ��� : " + uiv1.d);
		System.out.println("������ : " + uiv1.c);		// white space�� �������
		System.out.println("�Ҹ��� : " + uiv1.b);
		System.out.println("������1 : " + uiv1.str);
		System.out.println("������2 : " + uiv1.jaehyun);
		
		
	}//main
}//class
