package day1122;

/**
 *	������ : method Overload<br>
 *	�ϳ��� Ŭ�������� ���� �̸��� method�� ������ �ۼ��ϴ� ��.<br>
 *	��Ģ ) ���������� ��ȯ�� method���� �����ϰ� �ۼ��ϰ�,<br>
 *	"�Ű�����"�� �ٸ��� �ۼ��Ѵ�.<br>
 * @author owner
 */
public class TestOverload {
	/**
	 * ���� �ϳ� ����ϴ� ���� �ϴ� �޼ҵ� printStar()
	 */
	public void printStar() {
		System.out.println("��");
	}//printStar()
	
	/**
	 * �ԷµǴ� ���� ���� ���� ������ ����ϴ� ���� �ϴ� �޼ҵ� printStar()<br>
	 * @param count ����� ���� ����
	 */
	public void printStar(int count) {
		for(int i = 0; i<count; i++) {
			System.out.print("��");
		}//end for
		System.out.println();
	}//printStar()
	
	/**
	 * ������ 3���� ����ϴ� method printGgd()
	 */
	public void printGgd() {
		final int THREE = 3;
		System.out.println();
		System.out.println(THREE+"�� ��� ����");
		for(int i = 1; i < 10; i++) {
			System.out.println(THREE+" x "+i+" = "+THREE*i);
		}//end for
	}//end printGgd
	
	/**
	 * �Է��ϴ� ���� 2~9�� ������ �� �ش� ���� ����ϴ� method printGgd()
	 * @param dan 2~9 ������ �������� ��µǱ� ���ϴ� ���� �Է�
	 */
	public void printGgd(int dan) {
		if(dan>1 && dan<10) {
			System.out.println();
			System.out.println(dan+"�� ��� ����");
			for(int i=1; i<10; i++) {
				System.out.println(dan+" x "+i+" = "+dan*i);
			}//end for
			System.out.println(dan+"�� ��� ��");
		} else { 
			System.out.println();
			System.out.println(dan+"�� ��� ����");
			System.out.println("���� 2~9 ������ ������ ��� ���� �մϴ�."); 
		}//end else
	}//end printGgd
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		//�� �Ѱ� ���
		to.printStar();
		//�� ������ ���
		to.printStar(5);
		
		//������ 3���� ����ϴ� method
		to.printGgd();
		//�Է��ϴ� ���� 2~9�� ������ �� �ش� ���� ����ϴ� method
		to.printGgd(9);
	}//main
}//class
