package day1120;

/**
 *
 * @author owner
 */
public class TestFor2 {

	public static void main(String[] args) {
//		//���� loop
//		for( ; ;) {
//			System.out.println("���ѷ���");
//		}//end for
		
//		//�����ϴ� ���� ���� ���� loop
//		for(int i=0; ;i++) {
//			System.out.println("���� loop"+i);
//			if(i == 50) {
//				break; // break�� ���� ����� �ݺ����� ��������. (���� for�� �� ��� �θ� for���� ��������.)
//				// break�� ���� �αٿ� �����ϴ� �ݺ����� ����������.
//			}//end if
//		}//end for
//		System.out.println("");
		
		//�������� �ʱⰪ�� ����ϴ� for
		for(int i=0, j=10, k=30; i < 10; i++, j++, k--) {
			System.out.println(i+" "+j+" "+k);
		}//end for
		
//		//���ǽ��� �߸� �����ϸ� ���� loop
//		for(int i=0; i<10; i--) {
//			System.out.println(i);
//		}
		
		// for() �ڿ� �����ݷ��� ������ �ݺ����� ���ǽİ� �������길 �ݺ��Ǹ� �߰�ȣ�� �ڵ���� �ѹ����� �����ϰԵȴ�.
		int i=0;
		for(i=0; i<10; i++); {
			System.out.println("�ݺ��� "+i);
		}
		
		
	}//main

}//class
