package day1113;

// ǥ�� ��� method ���
class UsePrint{
	
	public static void main(String[] args){
		/*
		System.out.println("�ȳ�");	// println() �� �� �� �ٲ�
		System.out.print("�ϼ���");	// print() �� �� �� �� �ٲ�
		*/

		System.out.println(11); // �������
		System.out.println(11.13); // �Ǽ����
		System.out.println('A'); // ���ڻ��
		System.out.println("ABC ������"); //���ڿ����

		/* ��������ǥ�� �ѷ����� ���ڴ� �ϳ����� �ۼ������Ͽ� ���� ����� �ϸ�
		ū����ǥ�� �ѷ����� ���ڴ� �������ڸ� �ѹ��� ���� �� �־� ���ڿ������ �Ѵ�. */
		
		int i=11; //��������
		String s="������ ȭ����"; // ���ڿ� ��ü

		System.out.println(i); //�⺻�� �������� ����
		System.out.println(s); //������ �������� ����

		System.out.println(11+13); //�����
		//�޼��� �����
		System.out.println("11+13"); //���ڿ��� �ִ� �״�� �����ش�. ����ȵ�!
		System.out.println("11+13="+11+13); // 11+13=1133
		// ���ڿ��� �������� ������ ���� ���������ʰ� ���� �ٿ�����.
		System.out.println("11+13="+(11+13)); // 11+13=24
		// �Ұ�ȣ�� ������ �켱������ �����ϸ� �������� ���� ����� ��Ÿ����.
		
	}// main


}//class