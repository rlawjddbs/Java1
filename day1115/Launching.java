package day1115;
class Launching{
	public static void main(String[] args)	{		
		int deci=15;		// 10진수		15
		int octal =017;	// 8진수		15
		int hex =0xf;		// 16진수		15
		int hex2 = 0x1f; // 16진수로 표현한 31
		int binary = 0b10; // 2진수

		int tel = 0101234;	//8진수로 인식함.
		// int tel = 0101238;	//숫자앞에 0을 붙이면 8진수. 8진수는 8이라는 숫자가 없기 때문에 Error 발생.

		System.out.println(deci + octal + hex);
		System.out.println(hex2);
		System.out.println(tel); // 8진수를 10진수로 표현함
		System.out.println(binary);
	}//main
}//class
