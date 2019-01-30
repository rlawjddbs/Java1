package day1130;

import java.util.ArrayList;
import java.util.List;


/**
 *	JDK 1.5�������� �߰��� annotation�� ���.
 *	Deprecated, Override, SuppressWarnings
 * @author owner
 */
public class UseAnnotation {

	/**
	 * �� �޼ҵ�� �ڶ� ������ �߻���ų �� �ֽ��ϴ�.
	 */
	@Deprecated
	public void test() {
		System.out.println("���Ŀ� ������ �߻��� method");
	}//test
	
	public String toString() {
		return "�´����ݸ�";
	}//toString
	
	// annotation�� method���� �����ϸ� method ���� ��� ��� ��Ȳ�� �����Ѵ�.
	@SuppressWarnings({"rawtypes","unused"})
	public void temp() {
		// ��� ����(�� ��Ÿ����)�ϴ� annotation
//		@SuppressWarnings("unused")
		int i = 0;
		
		//rawtypes : Generic �� ������� ���� �� ��� ����
		// �������� �����ϸ� Ư�������� ��� �����ϰ�
//		@SuppressWarnings({"rawtypes","unused"})
		List l=new ArrayList();
		
		int j = 0;
		System.out.println( "temp j = "+j );
	}
	
	public static void main(String[] args) {
		UseAnnotation ua = new UseAnnotation();
		ua.test();
		// Annotation Deprecated �� ������ �� �� �ִ� class, method, ���� ���� �ۼ�
		System.out.println(ua);
	}//main

}//class
