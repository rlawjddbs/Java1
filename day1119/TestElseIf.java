package day1119;

/**
 *	else~if : ������ ���� ������ ���� ��.<br >
 * ���� ) if(���ǽ�){<br>
 * 				���ǿ� ���� �� ���� ����;<br>
 * 			}else if(���ǽ�){
 * 				���ǿ� ���� �� ���� ����;<br>
 * 			}else if(���ǽ�){
 * 				���ǿ� ���� �� ���� ����;<br>
 * 			}else if(���ǽ�){
 * 				���ǿ� ���� �� ���� ����;<br>
 * 			}else{<br>
 * 				��� ���ǿ� ���� ���� �� ���� ����;<br>
 * 			}
 * @author owner
 */
public class TestElseIf {

	public static void main(String[] args) {
		//args[0] = "100";
		int i = Integer.parseInt(args[0]);
		System.out.println(i+"��(��)");
		if(i < 0) {
			System.out.println("0���� �۾Ƽ� ����");
		} else if (i > 100) {
			System.out.println("100���� Ŀ�� ����");
		} else {
			System.out.println("0�� 100����, �Է¼���");
		} // end else
		
		// �̸��� �Է¹޾� "������" �̸� "����"��,
		// �̺���, �ڿ���, ������, ������ �̸� "����"��,
		// �׷��� ������ ����� �̸��տ� ����ϼ���.
		
		if(args[1] == "������") {
			System.out.print("���� ");
		}else if(args[1].equals("�̺���") || args[1].equals("������") || args[1].equals("������") || args[1].equals("������")) {
			System.out.print("���� ");
		}else {
			System.out.print("��� ");
		}//end else
		System.out.println(args[1]+"�� �ȳ��ϼ���.");
		
		//�¾��(1995)�� �Է¹޾� ��(12) ���ϱ�
		// 11-��, 10-��, 9-��, 8-��, 7-�䳢, 6-ȣ����, 5-��, 4-��, 3-����, 2-��, 1-��, 0-������
		
		int l = Integer.parseInt(args[2]) % 12;
		System.out.print(args[2]+"����� ");
		if(l == 0) {
			System.out.println("�����̶� �Դϴ�.");
		}else if(l==1) {
			System.out.println("�߶� �Դϴ�.");
		}else if(l==2) {
			System.out.println("���� �Դϴ�.");
		}else if(l==3) {
			System.out.println("������ �Դϴ�.");
		}else if(l==4) {
			System.out.println("��� �Դϴ�.");
		}else if(l==5) {
			System.out.println("�Ҷ� �Դϴ�.");
		}else if(l==6) {
			System.out.println("ȣ���̶� �Դϴ�.");
		}else if(l==7) {
			System.out.println("�䳢�� �Դϴ�.");
		}else if(l==8) {
			System.out.println("��� �Դϴ�.");
		}else if(l==9) {
			System.out.println("��� �Դϴ�.");
		}else if(l==10) {
			System.out.println("���� �Դϴ�.");
		} else if(l==11){
			System.out.println("��� �Դϴ�.");
		} else {
			System.out.println("Error");
		}
		
	}//main
}//class
