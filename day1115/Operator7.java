package day1115;
/*
	���Կ�����
	=
	+=, -=, *=, /=, %=
	<<=, >>=, >>>=
	&=, |=, ^=
*/
class Operator7{
	public static void main(String[] args) {

		int i=3; // ����
		//�������
		i+=2;  // i=i+2;	5
		System.out.println(i);
		i-=1;	// i=i-1;	4
		System.out.println(i);
		i*=2;	// i=i*2;	8
		System.out.println(i);
		i/=2;	// i=i/2;	4
		System.out.println(i);
		i/=3;	// i=i/3;	1	���� / ����= ���� (�Ǽ����� �����κ��� �� ��ȯ)
		System.out.println(i);
		i%=3;	// i=i%1;	1
		System.out.println(i);

		i=2;
		//����Ʈ����
		i<<=4; // i=i<<4; // 0000 0010 << 4 = 0010 0000
		System.out.println(i);
		i>>=1; // i=i>>1; // 0010 0000 >> 1 = 0001 0000
		System.out.println(i);			// debugging �������� System.out.println()�� ����. (method ���߽� �� Ȯ�ο����� ���)
		// �������� �ڵ忡 ��� �ڵ尡 �����ϸ� �ӵ��� ��������. (����� �� �ϳ�)
		i>>>=2; // i=i>>>2; // i = i >>> 2; // 0001 0000 >>> 0000 0100
		System.out.println(i);

		//��Ʈ���� ����
		i &= 12; // i = i & 12; // 0100 & 1100 = 0100
		System.out.println(i);
		i |= 11; // i = i | 11; // 0100 | 1011 = 1111
		System.out.println(i);
		i ^= 5; // i = i ^ 5; // 1111 ^ 0101 = 1010
		System.out.println(i);
		
	}//main
}//class