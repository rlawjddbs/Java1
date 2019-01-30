package day1120;

/**
 *	槛力 1.
 *	备备窜 免仿 (flowchar 弊府绊)
 *	2x1=2, 2x2=4, 2x3=6 ...
 * 
 * 槛力2.
 * 0	0
 * 		1	0	1	1
 * 			2	0	2	1	2	2
 * 				3	0	3	1	3	2	3	3
 * @author owner
 */
public class Work18 {

	public static void main(String[] args) {
		// 槛力1. 备备窜
		for(int i=1; i<10; i++) {
			
			for(int j=2; j<10; j++) {
				System.out.print(j+"x"+i+"="+(i*j)+" | ");
			}
			System.out.println();
		}
		
		// 槛力2.
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
