package day1121;

/**
 *	do ~ while : ���۰� ���� �� �� ����ϴ� �ݺ���<br>
 *					  �ּ� �� �� ���� �� �� ������ �ִ� ���Ǳ��� ����Ǳ⵵ �Ѵ�.<br>
 * ���� )<br>
 * do{<br>
 * 		�ݺ����� �����;<br>
 * } while(���ǽ�);<br>
 * 
 * @author owner
 */
public class TestDoWhile {

	public static void main(String[] args) {
		int i = 1000; //�ʱⰪ, do ~ while�� ���ǽ�
		do {
			System.out.println("i="+i);//�ݺ����๮��
			i++;//������
		}while(i < 10);//���ǽ�
		
		
		//�ԷµǴ� ������ ������ ���
		// wrapper Ŭ������ �� ���������� �°� �߶󳻺���
		
		i=Integer.parseInt(args[0]);
		/*float f=Float.parseFloat(args[0]);
		double d=Double.parseDouble(args[0]);
		long l=Long.parseLong(args[0]);*/
		
		if( i>1 && i<10 ) { //2�� 9�� ����
			System.out.println(i+"��");
			int j=1;
			do {
				System.out.println(i+" x "+j+" = "+ i*j);
				j++;
			} while (j < 10); //end do ~ while
		} else {
			System.out.println(i+"���� ����� �� �����ϴ�.");
			System.out.println("���� 2�ܿ��� 9�ܱ��� �Է��� �ּ���.");
		}//end if else
		
	}//main
}//class
