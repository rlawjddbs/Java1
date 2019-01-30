package day1121;

/**
 *	static (class) ���� : Ŭ������ ����Ǹ� ���� ó�� JVM�޸�(�� method ����)�� �ö󰡰�,
 *	��� ��ü�� �ϳ��� ������ �����Ͽ� ����� ����.
 *	
 * @author owner
 */
public class UseStaticVariable {
	static int i; // static variable -> �ٷ� ���
	int j; // instance variable -> �ݵ�� ��üȭ�Ͽ� ���
	public void test() {
		i = 100;
		j = 200;
		System.out.println(i+" / "+j);
	}//test
	public static void main(String[] args) {
		//static int i; // ���������� ���������ڰ� ����. Error
		
		//class ���� ���. Ŭ������.������ (�׳� �ᵵ OK)
		UseStaticVariable.i = 2000;
		System.out.println(i);
		
		UseStaticVariable usv = new UseStaticVariable();
		UseStaticVariable usv1 = new UseStaticVariable();
		usv.j=5000; //instance ������ ������ ��ü�� ���� ����Ѵ�.
		usv1.j=10000;
		
		UseStaticVariable.i=20;
//		usv.i=20; //��ü������ ����ϸ� Ư�� ��ü�� ����(member ����)�� �ƴϹǷ� ����� ���������� �����ϴ� ������ �ƴϴ�.
		System.out.println("usv��ü �ν��Ͻ� ���� : "+ usv.j+", ����ƽ���� : "+ usv.i);	// Ʋ���� �ƴ����� static ������� �ۼ��ϴ� ���� �����Ѵ�.
		System.out.println("usv1��ü �ν��Ͻ� ���� : "+ usv1.j+", ����ƽ���� : "+UseStaticVariable.i);
		
		
//		j = 200;
	}//main

}//class
