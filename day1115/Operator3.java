package day1115;
/*
	����Ʈ������
	<< (left shift) : ��Ʈ�� �������� �а�, �о ���� �� ��ĭ�� �׻� 0���� ä���.
	>> (right shift) : ��Ʈ�� ���������� �а�, �о ���� �� ��ĭ�� �ֻ��� ��ȣ��Ʈ�� ���� ����� 0��, ������ 1�� ä���.
	>>> (unsigned right shift) : ��Ʈ�� ���������� �а�, �ֻ��� ��ȣ��Ʈ�� ������� �о ���� �� ��ĭ�� �׻� 0���� ä���.
*/
class  Operator3{
	public static void main(String[] args) {
		
		// method : static method ���
		// Ŭ������.method��(��)
		int i=11;
		System.out.println(Integer.toBinaryString(i));		// 1011
		System.out.println(Integer.toOctalString(i));		// 013
		System.out.println(Integer.toHexString(i));		// 0xb
		
		i=9;
		System.out.println(i+"<<3 = "+ (i << 3));		//72
		i=36;
		System.out.println(i+"<<3 = "+ (i >> 3));		//4
		i=120;
		System.out.println(i+">>>4 = "+ (i >>> 4));	//7

		i=1;
		System.out.println( i << 1 ); //2
		System.out.println( i << 2 ); //4
		System.out.println( i << 3 ); //8
		System.out.println( i << 31 ); // -2147483648, �ֻ��� ��ȣ��Ʈ ����
		System.out.println( i << 32 ); // 1 

		i=-1;
		System.out.println( i >> 100 ); // �ֻ��� ��ȣ��Ʈ ����
		System.out.println( i >>> 1 ); 
		// -1 �� 2������ 1111 1111 1111 1111 1111 1111 1111 1111 �̴�. �̰��� unsigned right shift �����ڸ� ���� ���������� ��ĭ �и�
		// 0111 1111 1111 1111 1111 1111 1111 1111 �� �ȴ�. �� integer ������������ ���� �� �ִ� ���� ū ����� �� 2147483647�� ���´�.
											
	}//main
}//class