package day1115;
/* 
 숙제
1. 변수에 할당된 값이 양수일때만 2진수로 출력하고 음수라면 ~를 사용하여
    양수로 변경하고 입력된 그대로의 10진수로 출력.
    출력 예)  "양수 인경우"  10 은(는)  1010
                 "음수 인경우"  -10 은(는) 10

2. 2147483647의 값에서 상위 2byte와 하위 2byte 값을 분리하여 출력해보세요. 
    출력 예) 상위 2byte -> 32767
                하위 2byte -> 65535

3. ||를 사용했을 때 전항이 true라면 후항을 연산하지 않는 것을 증명할 수 있는
     코드를 작성하세요.


4. 책을 읽으세요. p136 ~ 146
*/
class Work16{
	public static void main(String[] args) {
		// 숙제 1
		int i = 10;
		System.out.println(i>=0 ? Integer.toBinaryString(i) : ~i+1);

		// 숙제 2
		System.out.println("Integer의 상위 2byte = "+(Integer.MAX_VALUE>>16));
		System.out.println("Integer의 하위 2byte = "+(Integer.MAX_VALUE>>15));

		// 숙제 3
		String s;
		System.out.println((1+1==2) || (1+1 == 0) ? (s="1 더하기 1은 2") : (s="1 더하기 1은 1"));
	}//main
}//class
