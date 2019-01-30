package day1115;
/*
	단항연산자 (Unary)
	~, !, +, -, ++, --
*/
class Operator1{ //main 메소드가 들어있는 클래스를 'java application' 이라 한다.)
	public static void main(String[] args) {
		//~(tilde) : 1의 보수연산
		int i = 11;
		int j = -11;
		
		// ~양수 : 부호변경 및 1증가
		System.out.println("~"+i+" = "+ ~i); // -12
		// ~음수 : 부호변경 및 1감소
		System.out.println("~"+j+" = "+ ~j); // 10
		
		// ! (NOT) : true -> false, false -> true . 논리를 부정한다.
		boolean b= true;
		boolean c= false;
		System.out.println("!" +b+" = "+!b);	// false
		System.out.println("!" +c+" = "+!c);	// true 
		System.out.println( 11>15 );			// false
		//System.out.println( !11>15 );			// Error. NOT은 boolean에만 사용가능한 연산자다.
		System.out.println( !(11>15) );			// true

		// + : 형식적인 제공
		System.out.println("+"+i+" = "+ +i);	//11
		System.out.println("+"+j+" = "+ +j);	//-11

		// - : 2의 보수연산, 부호바꿈 연산
		System.out.println("-"+i+" = "+ -i);	//-11
		System.out.println("-"+j+" = "+ -j);	//11
		
		// ++ : 증가연산 ( 대상체의 값을 1씩 증가 )
		i = 0;
		j = 10;
		// 전위연산 : 연산자 대상체;
		++i; // 0 -> 1
		--j; // 10 -> 9
		System.out.println("전위연산 후 : i ="+ i +", j= "+j);
		// 후위연산 : 대상체 연산자;
		i++; // 1->2
		i--; // 9-> 8
		System.out.println("후위연산 후 : i ="+ i +", j= "+j);
		
		// 증가연산자와 감소연산자는 대입연산자와 함께 사용되면
		// 전위와 후위가 다른 값을 대입한다.
		j=0;
		// 전위 : 내 것 먼저
		j= ++i;
		System.out.println("전위연산후 i : "+i+", 대입 j : "+j);
		// 후위 : 남의 것 먼저
		j=0;
		j = i++;
		System.out.println("후위연산후 i : "+i+", 대입 j : "+j);
	}//main
}//class
