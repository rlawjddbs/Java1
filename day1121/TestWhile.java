package day1121;

/**
 *	while : ���۰� ���� �� �� ����ϴ� �ݺ���<br>
 *			 �ּ� 0�� ����, �ִ� ���Ǳ��� ����<br>
 *	����)<br>
 *	while(���ǽ�){<br>
 *		�ݺ����๮��;<br>
 *	}<br>
 * @author owner
 */
public class TestWhile {

	public static void main(String[] args) {
		int i=0; //�ʱⰪ
		
		while(i < 10) {//���ǽ�
			System.out.println("i="+i); //�ݺ����� ����
			i++;// ������
		}//end while
		
		System.out.println("--------------------------------------------------------------");
		
		//���� �Է¹޾� 2��~9�� ���̶�� �������� ���
		int j=Integer.parseInt(args[0]);
		if(j>1 && j<10) {
			int k=1;
			while(k<10) {
				System.out.println(j+" * "+k+" = "+(j*k));
				k++;
			}
		}
		
		//���� loop
		i=0;
		while(true) {
			System.out.println("���� loop x "+i);
			if(i==5) {
				break;
			}//end if
			i++;
		}//end while
		
	}//main

}//class
