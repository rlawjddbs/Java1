package day1121;

/**
 *	method : ������ �����Ͽ� �����ϸ�, �ߺ��ڵ带 �ּ�ȭ�� �� ���.<br>
 *	�ۼ��� ) ����������	��ȯ��	method��(parameter){ ������ ����ó�� �����; }
 * @author owner
 */
public class UseMethod {
	
	//instance method
	public void instanceMethod() {
		System.out.println("��üȭ�Ͽ� ����ϴ� method");
	}//instance method
	
	//static method
	public static void staticMethod() {
		System.out.println("��üȭ���� ���� ȣ���Ͽ� ����ϴ� method");
	}//static method
	
	public static void main(String[] args) {
//		instanceMethod();//��üȭ ���Ŀ� ��ü��.�޼ҵ�� ���� ȣ���� �� �ִ�.
		UseMethod um = new UseMethod();
		um.instanceMethod();

		System.out.println("===============================");
		
//		um.staticMethod(); // static method�� Ư����ü�� �����ִ� method�� �ƴϹǷ� ��ü������ ȣ������ �ʴ´�. 
		// static method ���� instance methodó�� ��ü��.�޼ҵ��() ���� ȣ���� ������ �ùٸ� ����� �ƴϴ�. Ŭ������.�޼ҵ��()�̳�, �޼ҵ��()���� ȣ���ϴ� ���� �����Ѵ�.
		staticMethod(); //UseMethod.staticMethod() �� ���� ���� ����
		UseMethod.staticMethod(); // ���� ����Ǵ� static method ȣ�� ���. 		Ŭ������.�޼ҵ��();
				
	}//main

}//class
