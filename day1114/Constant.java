package day1114;
/*
	Constant(������ ���ó�� ����ϴ� ��)�� ���
	���� : class field������ ���� �� �ʱ�ȭ
*/

class Constant{
	//Constant ����
	public static final int MAX_SCORE=100;
	public static final int MIN_SCORE=0;

	public static void main(String[] args) {
		//public static final int MIN_SCORE=0; 
		//����� �ʵ忡���� ������ �����ϴ�.(method �������� ������ �� ����. ����� Error �߻�)

		//����� ��� : �����
		System.out.println(MAX_SCORE+" / "+MIN_SCORE);
		//����� ��� : Ŭ������.�����
		System.out.println(Constant.MAX_SCORE+" / "+Constant.MIN_SCORE);

		int my_score=95;
		my_score=93;
		//MAX_SCORE=90; //����� �ʱ�ȭ ���� �� �Ҵ��� ���� �ʴ´�.
		my_score=83;

		System.out.println("������ �ְ����� "+Constant.MAX_SCORE+
		"���̰�, �������� "+my_score+"�� �Դϴ�. ȹ�������� "+ 
		my_score+"�� �̰�, �ְ����� ȹ�������� ���̴� "+(MAX_SCORE - my_score)+"�� �Դϴ�.");

		System.out.println("long �ִ밪 : "+Long.MAX_VALUE+" / �ּҰ� : "+Long.MIN_VALUE);
	}//main
}//class