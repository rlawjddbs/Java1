package day1121;

/**
 * 1. while�� ����Ͽ� ������ ��ü ���� ����ϴ� instance method��<br>
 * �ۼ��ϰ�, ȣ���ϼ���.<br>
 * 
 * 2. do~while�� ����Ͽ� �Ʒ��� ������ *�� ����ϴ� static method��<br>
 * �ۼ��Ͽ� ȣ���ϼ���.<br>
 * <br>
 ** <br>
 *** <br>
 **** <br>
 * 
 * @author owner
 */
public class Work19 {
	
	// ���� 1.
	public void printGgd() {
		int i = 2, j;
		while (i < 10) {
			System.out.println("----------------------" + i + "�� ����---------------------");
			j = 1;
			while (j < 10) {
				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			}//end while
			System.out.println("----------------------------------------------------");
			i++;
		}//end while
	}//printGgd
	
	// ���� 2.
//	public static void printStars() {
//		int i=0, j=0;
//		do {
//			i++;
//			System.out.println("*");
//			System.out.println("**");
//			System.out.println("***");
//			System.out.println("****");
//		}while(false);
//	}//pointStars
	
	public static void printStars2() {
		int i=0, j;
		do {
			j=0;
			while(j<i) {
				System.out.print("*");
				j++;
			}
			System.out.println("*");
			i++;
		}while(i<4);
	}//pointStars
	
	
	public static void main(String[] args) {
		// ���� 1.
		Work19 ggd = new Work19();
		ggd.printGgd();

		// ���� 2.
		Work19.printStars2();
	}//main
}//class
