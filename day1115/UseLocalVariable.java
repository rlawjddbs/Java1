package day1115;

// �������� ���� ���
class UseLocalVariable{

	public static void main(String[] args){
		//1. �������� ���� : �������� ������;
		int i; //�ڵ��ʱ�ȭ�� ���� �ʴ´�.
		int j = 11; // ������ �ʱ�ȭ : ������ �����ϸ鼭 ���Ҵ�

		//2. ���Ҵ� : ������ = ��;
		i=100; // �ʱ�ȭ �������� ������ ����ϸ� error �߻�

		//3. �� ��� : ���, ����, ���Ҵ�
		System.out.println(i);
		System.out.println(j);
		System.out.println(i + j);
		System.out.println(i * j);
		System.out.println(i / j);	// ���� ���� ���Ѵ�.
		System.out.println(i % j);	// ���� �������� ���Ѵ�.
		
		//int i = 200; //���� �̸��� ������ �ۼ��� �� ����.

		//�������� �ѱ۷� ���� �����ϳ� �ѱ��� ������� �� ��
		int ����=300;
		long l=3_000_000_000L;
		System.out.println(l);
		float f=0.5f; // float f=0.5F;
		System.out.println(f);
	}//main

}//class