package day1218;

/**
 *	Compile Exception : byte code�� ���������� �����ϱ� ���Ѱ��� ����
 * @author owner
 */
public class UseCompileException {

	public static void main(String[] args) {
		
		try {
//			Class c = Class.forName("");
//			Object obj = Class.forName("java.lang.String");
			Object obj = Class.forName("day1217.UseRuntimeException");
			System.out.println("�ε��� Ŭ���� "+ obj); //new�����ڸ� �����ʰ� Ŭ���� �ε�����
		} catch (ClassNotFoundException cnfe){
			System.err.println("�˼��մϴ�.");
			System.err.println("���� �޼��� ��� : "+cnfe.getMessage());
			System.err.println("����ó�� ��ü�� �޼��� : "+ cnfe);
			cnfe.printStackTrace();
//			System.out.println("--------"); //println�� printStackTrace���� ���� ��� �� �� �ִ�.
			
		} finally {
			System.out.println("������ּż� �����մϴ�.");
		}//end Finally
		
		//���ܰ� �������� Ŭ������ ���� ���� Ȯ���� ��
		
	}//main
	
}//class
