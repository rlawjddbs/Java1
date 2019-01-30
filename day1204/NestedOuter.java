package day1204;

/**
 *	���� Ŭ������ static ����ó�� ����� �� �ִ� ��ø Ŭ����.
 * @author owner
 */
public class NestedOuter {

	int i;
	static int j;
	
	public NestedOuter() {
		System.out.println("�ٱ� Ŭ������ ������");
	}//NestedOuter
	
	public void outInstMethod() {
		System.out.println("�ٱ� Ŭ������ �ν��Ͻ� method");
	}//outInstMethod
	
	public static void outStatMethod() {
		System.out.println("�ٱ� Ŭ������ static method");
	}//outStatMethod()

	/////////////////////////// Nested class ���� /////////////////////////////////////////
	static class NestedInner{
		int in_i; // �ν��Ͻ� ����
		static int in_j; // static ����
		
//		public NestedInner() {
//		}
		public void inMethod() {
			System.out.println("���� Ŭ������ �ν��Ͻ� Method");
		}//inMethod
		
		public static void inStatMethod() {
			System.out.println("����Ŭ������ static method");
			System.out.println("�ٱ� Ŭ������ �ڿ� ��� i=���Ұ� , j="+j);
			System.out.println("�ٱ� Ŭ������ �ڿ� ��� i=���Ұ� , j="+NestedOuter.j);
//			outInstMethod();// instance ������ method�̹Ƿ� ����� �� ����.
			NestedOuter.outStatMethod(); // static �� �����̹Ƿ� ��𼭳� �θ� �� ������ �տ� �Ҽӵ� Ŭ�������� �ٿ� ��ó�� �����ִ� ���� ����.
		}//inStatMethod
	}//class
	/////////////////////////// Nested class �� ///////////////////////////////////////////

	public static void main(String[] args) {
		//static ������ ����� ������ ��üȭ���� Ŭ������.������,
		//Ŭ������.method������ ����Ѵ�.
		NestedInner.inStatMethod(); // static �޼ҵ�� �տ� Ŭ�������� �ٿ���� �Ѵ�.
		
	}//main

}//class
