package day1115;
class Launching{
	public static void main(String[] args)	{		
		int deci=15;		// 10����		15
		int octal =017;	// 8����		15
		int hex =0xf;		// 16����		15
		int hex2 = 0x1f; // 16������ ǥ���� 31
		int binary = 0b10; // 2����

		int tel = 0101234;	//8������ �ν���.
		// int tel = 0101238;	//���ھտ� 0�� ���̸� 8����. 8������ 8�̶�� ���ڰ� ���� ������ Error �߻�.

		System.out.println(deci + octal + hex);
		System.out.println(hex2);
		System.out.println(tel); // 8������ 10������ ǥ����
		System.out.println(binary);
	}//main
}//class
