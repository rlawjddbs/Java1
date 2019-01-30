package day1115;
/*
	쉬프트연산자
	<< (left shift) : 비트를 왼쪽으로 밀고, 밀어서 남게 된 빈칸을 항상 0으로 채운다.
	>> (right shift) : 비트를 오른쪽으로 밀고, 밀어서 남게 된 빈칸을 최상위 부호비트에 따라 양수면 0을, 음수면 1을 채운다.
	>>> (unsigned right shift) : 비트를 오른쪽으로 밀고, 최상위 부호비트에 상관없이 밀어서 남게 된 빈칸을 항상 0으로 채운다.
*/
class  Operator3{
	public static void main(String[] args) {
		
		// method : static method 사용
		// 클래스명.method명(값)
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
		System.out.println( i << 31 ); // -2147483648, 최상위 부호비트 변경
		System.out.println( i << 32 ); // 1 

		i=-1;
		System.out.println( i >> 100 ); // 최상위 부호비트 유지
		System.out.println( i >>> 1 ); 
		// -1 은 2진수로 1111 1111 1111 1111 1111 1111 1111 1111 이다. 이것을 unsigned right shift 연산자를 통해 오른쪽으로 한칸 밀면
		// 0111 1111 1111 1111 1111 1111 1111 1111 가 된다. 즉 integer 데이터형에서 가질 수 있는 가장 큰 양수의 값 2147483647이 나온다.
											
	}//main
}//class
