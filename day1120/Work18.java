package day1120;

/**
 *	���� 1.
 *	������ ��� (flowchar �׸���)
 *	2x1=2, 2x2=4, 2x3=6 ...
 * 
 * ����2.
 * 0	0
 * 		1	0	1	1
 * 			2	0	2	1	2	2
 * 				3	0	3	1	3	2	3	3
 * @author owner
 */
public class Work18 {

	public static void main(String[] args) {
		// ����1. ������
		for(int i=1; i<10; i++) {
			
			for(int j=2; j<10; j++) {
				System.out.print(j+"x"+i+"="+(i*j)+" | ");
			}
			System.out.println();
		}
		
		// ����2.
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(i+" "+j+" ");
			}
			System.out.println();
			for(int k=0; k<=i; k++) {
				System.out.print("  ");
			}
		}
	}

}
