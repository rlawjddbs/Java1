package day1114;
/*
�⺻�� ��������
	������ : byte, short, int, long
	������ : char
	�Ǽ��� : float, double
	�Ҹ��� : boolean
*/
class DataType{
	public static void main(String[] args) {
		//������
		byte a=10;			// byte�� -128 ~ 127 �� ���� ������ ������ ����
		short b=20;			
		int c=30;
		long d=40; //�Ҵ�Ǵ� ���� 4byte�� �̹Ƿ� literal�� ��ȯ�� �ʿ䰡 ����.
		long e=2147483647;	// int�� ���ͷ��� -2147483648 ~ 2147483647 ������ ��������� ������ �ִ�.
		// long f=2147483648L;		// 2147483647 �̻��� ���ͷ��� �Ҵ��ϱ� ���ؼ��� long���� ���ͷ��� ����ؾ� �ϸ� ���̻�� �빮�� L, Ȥ�� �ҹ��� l�� ����Ѵ�.

		System.out.println("byte : "+ a +", short : " + b + ", int : " + c + ", long : " + d + ", " + e);

		//������ : unicode �� : \u0000
		// char f='A'; // �Ҵ� unicode
		char f=66; // unicode���� 10������ �Ҵ簡��.
		char g='0';
		char h='��';
		//��� : unicode�� ���� ���� ���
		System.out.println("char : " + f + ", " + g + ", " + h);

		//�Ǽ�
		float i=3.14F; //������ �ʿ��� - �Ǽ� literal�� 8byte�̰� float ���������� 4byte �̹Ƿ� �� �Ҵ��� ���� �ʴ´�.
		// ���������� float(4byte)�ε� �Ҵ�Ǵ� ���ͷ��� ���̻簡 ���� �Ǽ��̹Ƿ� double�� ���ͷ��̴�. ���ͷ��� ���̻�� f �� F�� �ٿ� float������ �ٲ���� ���� �Ҵ�ȴ�.
		double j=3.14; //���ͷ��� ���������� �����Ƿ� ������ ������ �� �ִ�. (�Ǽ� ���ͷ��� ���̻簡 ���� ��� �˾Ƽ� double������ �����Ѵ�.)
		double k=3.14D; // double�� ���ͷ��� ���̻� d�� ������ ���� �ְ�, �׳� �ᵵ �ȴ�.

		System.out.println("float : " + i + ", double : " + j + ", " + k);
		
		//�Ҹ���
		boolean l = true;
		boolean m = false;
		System.out.println("boolean : " + l + ", " + m);

		byte b1 = 10, b2=20;
		int result = b1 + b2;

	}//main
}//class