package day1206;

import java.text.DecimalFormat;

/**
 *	DecimalFormat<br>
 *	���ڸ� ������ ���ڿ��� ����.
 * @author owner
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
		int temp = 20181206;
		System.out.println(temp);
		
		// ���Ͽ��� ������ �ڸ����� �Ѿ�� ������ �߻��ϴ� ����Ŭ�� �޸�
		// �ڹٴ� �˾Ƽ� ���� ������ ã�� �������ش�.
		DecimalFormat df = new DecimalFormat("0,000");
		DecimalFormat df1 = new DecimalFormat("#,###");
		
		System.out.println("0 ��� : "+df.format(temp));
		System.out.println("# ��� : "+df1.format(temp));
		
		DecimalFormat df2 = new DecimalFormat("#,###.00");
		// �Ǽ� �ڸ����� 0���� �����ϰ� ����� �� ������ ���ڸ��� ���� �ݿø� ����̶�� �ݿø��� ����� �����ش�.
		// �Ǽ� �ڸ����� 0���� �����ϰ� ����� �� ������ ������ ���ڸ������� �Էµ� ���� �ڸ����� ���� ��� ������ �ڸ������� �ݿø��� ����� �����ش�.
		System.out.println("�Ҽ��ڸ��� ǥ�� : "+df2.format(201812.064));
		System.out.println("�Ҽ��ڸ��� ǥ�� : "+df2.format(201812.065));
		
		
	}//UseDecimalFormat
	
	public static void main(String[] args) {
		new UseDecimalFormat();
	}//main

}//class
