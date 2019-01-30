package day1119;

/**
 * ���� <br>
 * 1. ����� �ð��� �Է¹޾� �Ʒ��� �������� ����ϼ���. <br>
 * ��� : ����� �ð��� �ִ� 2�ð��� ������ ������ 60���� �Ѵ� �ٸ� "��Ÿ�" <br>
 * 60�� ���϶�� "�ܰŸ�"�� ����ϼ���. <br>
 * 120���� �Ѿ�� 7H�־�<br>
 * 
 * 
 * 2. �̸�, ������ܰ� ����� �Ÿ��� �Է¹޾� �Ʒ��� ���� ����ϼ���. <br>
 * ��������� "����,����ö,�ý�,����"�� �����Ѵ�. <br>
 * ������� 1200��, ����ö ��� 1250��, �ýÿ�� 3800�� �Դϴ�. <br>
 * ����� 10Ű�� ������ �⺻���, �� 5Ű�� �ʰ��� ���� 100���� ���� �մϴ�. <br>
 * <br>
 * - ��� : xxx�� ����� ��������� xx�̸� �Ÿ��� xx Ű�� �Դϴ�. <br>
 * �� �̿� ��� xx���̰�, �պ��̿� ��� xx���̸�, �Ѵ� 20�ϱ��� <br>
 * ������ ��: xxxx�� �Դϴ�. <br>
 * 
 * @author owner
 */
public class Work17 {
	public static final int LIMIT_TIME=120;
	public static void main(String[] args) {
		// 1�� ����
		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		if (sum <= 60) {
			System.out.println("�ܰŸ�");
		} else if (sum > 60 && sum <= LIMIT_TIME) {
			System.out.println("��Ÿ�");
		} else {
			System.out.println("7H�־�");
		} //end if
		
		// 2�� ����
		int tax = 0;
		String traff=args[3];
		int km = Integer.parseInt(args[4]);
		
		switch(traff) {
		case "����":tax=1200;
			if(km>=10) {
				tax=1200+((km-10)/5)*100;
			}
		break;
		case "����ö":tax=1250;
			if(km>=10) {
				tax=1250+((km-10)/5)*100;
			}
		break;
		case "�ý�":tax=3800;
			if(km>=10) {
				tax=3800+((km-10)/5)*100;
			}
		break;
		case "����":tax=0;
		break;
		default:System.out.println("����, ����ö, �ý�, ���� �� �ϳ��� �Է��ϼ���.");
		}
		
		System.out.println(args[2]+"�� ����� ��������� "+traff+"�̸� �Ÿ��� "+km+"Ű�� �Դϴ�.");
		System.out.println("�� �̿��� "+tax+"���̰�, �պ��̿� ��� "+(tax*2)+"���̸�, �Ѵ� 20�� ����");
		System.out.println("������ �� : "+(tax*40)+"�� �Դϴ�.");
	}

}
