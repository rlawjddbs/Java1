package day1120;

/**
 * for : ���۰� ���� �˰����� �� ����ϴ� �ݺ���<br>
 * ���� )<br>
 * for(���۰� ; ����; ����|���ҽ�){<br>
 * �ݺ� ���� ����;<br>
 * }
 * 
 * @author owner
 */
public class TestFor {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "�� �ȳ�");
		}//end for
		
		// 1���� ���� 1�� �����ϸ� 100���� �ݺ� ���� for
//		for (int i = 1; i <= 100; i++) { // �۰ų� ���ٴ� ������ �ѹ� ���� ������ �ѹ� �� ���´�. (�ι� ���� ������ ����Ƚ���� �þ. ����.)
//			System.out.println(i);
//		}
		for (int i = 1; i < 101; i++) { 
			System.out.println(i);
		}//end for
		
		// 1���� ���� 100���� ¦���� ������ ��� for
		for (int i = 1; i < 101; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}//end if
		}//end for
		System.out.println();// �ٺ���
		
		for (int i = 2; i < 101; i+=2) {
				System.out.print(i+" ");
		}//end for
		System.out.println();// �ٺ���
		
		//1���� ����100���� Ȧ���� ������ ���
		int cnt=0;
		// ��.���ҽ��� ������ ���� ��ȭ��Ű�� ������ų �� �ִ� ��� �����ڸ� 
		// ����� �� �ִ�.
		for (int i = 1; i < 101; i+=2) {
			cnt++;
//			if(i%2==1) {
				System.out.print(i+" ");
//			}//end if
		}//end for
		System.out.println("\n"+cnt+"�� ����");

		// 1~100���� ����ϴµ� 3�� ������� ���ڴ�� "¦"
		for(int i=1; i < 101; i++) {
			if (i%3==0) {				
				System.out.print("¦ ");
				continue;
			}//end if
			System.out.print(i + " ");
		}//end for
		System.out.println();
		
		// 1~100������ �� ��� : 1�������� 100������ ���� 5050
		int total=0;
		for (int i=1; i < 101; i++) {
			total+=i;
		}//end for
		System.out.println("1�������� 100������ ���� : "+total);
		
		// A~Z���� ���
		for (char i=65; i<91; i++) {
			System.out.print(i + " ");
		}//end for
		
		System.out.println();
		
		for (char c='A'; c<='Z'; c++) {
			System.out.print(c + " ");
		}//end for
		System.out.println();
		
		for(int i=1; i < 10; i++) {
			System.out.println("2 * "+i+" = "+ (2*i));
		}//end for
		
		
	}// main

}// class
