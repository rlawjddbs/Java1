package day1126;

/**
 * �⺻������ : Ŭ������ �ۼ��� �� �����ڸ� �ϳ��� �������� ������
 * �����Ϸ��� �Ű����� ���� Default Constructor�� �����Ѵ�.
 * @author owner
 */
public class TestConstructor {
	
	/**
	 * �⺻������ 
	 */
	public TestConstructor() {
		System.out.println("�⺻ ������");
//		TestConstructor(300); //�����ڸ� method ȣ���� �� ȣ���� �� ����.
	}//TestConstructor
	
	/**
	 * �����ִ� ������
	 * @param i ������ ��
	 */
	public TestConstructor(int i) {
		System.out.println("�����ִ� ������ : "+i);
	}//TestConstructor
	
	public void test() {
		System.out.println("test method!!!");
		temp(); //temp method ȣ��
	}//test
	
	public void temp() {
		System.out.println("---------------temp method!!!");
	}//temp
	
	
	public static void main(String[] args) {
		//Overloading �� �����ڸ� ����Ͽ� ��üȭ�� �پ��ϰ� �� �� ����.
		TestConstructor tc = new TestConstructor();//�⺻������
		TestConstructor tc1 = new TestConstructor(123);//�����ִ� ������
		
		System.out.println(tc);
		System.out.println(tc1);
		
		tc.test();
	}

}
