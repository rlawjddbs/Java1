package day1122;

/**
 * 숙제<br >
 * 아래의 업무를 처리하는 method를 type에 알맞게 작성하고 API주석을 설정한 후 호출하여 결과를 본 후 Java Doc을<br >
 * 생성해보세요. - API주석은 어떤 형태의 method인지를 주석으로 기술할것.<br >
 * <br >
 * 1. 자신의 이름을 반환하는 method작성. (고정값 - 반환형 O, 매개변수 x)<br >
 * 2. 나이를 입력받아 태어난 해를 반환하는 method 작성. (가변값 - 반환형O, 매개변수O)<br >
 * 3. 문자를 입력받아 해당 문자의 Unicode 값을 반환하는 method 작성. (가변 값 - 반환형 O int, 매개변수O char)<br >
 * 4. 숫자를 입력받아 숫자가 영문자, 숫자의 범위에 있을 때 해당 숫자의 문자를 출력하는 일을 하는 method 작성. (가변 값 - 반환형 O void, 매개변수 O int)<br >
 * 5. 호출하면 자신의 주소를 출력하는 method 작성. (가변 값 - 반환형x, 매개변수x, class 주소가 아니라 객체주소.) (고정 일 - 반환형 x, 매개변수 x)<br >
 * 6. 친구의 이름을 입력받아 출력하는 method 작성(친구는 n명 입니다.) (가변 값 - 반환형O, 매개변수O Variable Arguments)
 * 
 * @author owner
 */
public class Work20 {

	/**
	 * 1. 입력된 이름을 반환하는 yourName 메소드.
	 * 
	 * @return 입력한 이름을 그대로 문자열 리터럴로 반환
	 */
	public String yourName() {
		String myName = "김정윤";
		return myName;
	}

	/**
	 * 2. 출생년도 반환 메소드<br >
	 * 나이를 입력받아 태어난 해를 반환하는 birthYear 메소드.
	 * 
	 * @param yourAge 나이를 입력
	 * @return 태어난 해를 birthYear 변수에 할당한 뒤 변수값을 반환
	 */
	public int[] birthYear(int yourAge) {
		int birthYear = 2018 - yourAge + 1;
		int[] ageSet = {birthYear, yourAge};
		return ageSet;
	}

	/**
	 * 3. 문자 유니코드 반환 메소드<br>
	 * 문자를 입력받아 해당 문자의 유니코드 값을 반환하는 "unicode" 메소드.
	 * 
	 * @param character - 문자 리터럴을 입력
	 * @return 입력된 문자 리터럴의 유니코드를 char_uni 변수에 정수로 할당한 뒤 변수값을 반환
	 */
	public int[] unicode(char character) {
		int char_uni = (int) character;
		int[] characterSet = {character, char_uni};
		return characterSet;
	}

	/**
	 * 4. 입력된 숫자의 문자 반환 메소드 character<br>
	 * 숫자를 입력받아 숫자가 영문자, 숫자의 범위에 있을 때 해당 숫자의 문자를 출력하는 character 메소드.
	 * @param integer - 정수입력
	 */
	public void character(int integer) {
		char print_character = ' ';
		if (integer > -1 && integer < 65536) {
			print_character = (char) integer;
			System.out.println("4. 정수 [" + integer + "]와 Unicode값이 일치하는 문자는 \" " + print_character + " \" 입니다.");
		} else {
			System.out.println("4. **Error** 0에서 65535 사이의 정수를 입력해주세요.");
		}//end else
	}// character

	/**
	 * 5. 호출하면 자신의 메모리 주소를 출력하는 메소드 memoryAddr (overload)
	 * @param paramAddr VariableArgument의 주소를 알아내기 위한 메소드로 입력할 필요없음
	 */
	public void memoryAddr(int... paramAddr) {
		System.out.print("5. ");
		System.out.print("memoryAddr() 메서드의 주소는 : \"" + paramAddr + "\" 입니다. ");
	}

	/**
	 * 5. 호출하면 자신의 메모리 주소를 출력하는 메소드 memoryAddr (overload)
	 * @param objAddr 객체 mtd의 주소를 알아내기 위한 메소드이므로 mtd를 입력하면 됨.
	 */
	public void memoryAddr(Work20 objAddr) {
		System.out.println("memoryAddr() 메서드의 주소는 : \"" + objAddr + "\" 입니다.");
	}

	/**
	 * 6. 입력받은 친구의 이름을 출력하는 friends 메소드
	 * @param names - 친구의 이름을 입력하면 입력된 만큼 친구의 이름이 출력되며 친구가 몇명인지 출력된다.
	 */
	public void friends(String... names) {
		int j = 0;
		System.out.print("6. ");
		for (int i = 0; i < names.length; i++) {
			System.out.print((i + 1) + "번 친구 [" + names[i] + "],  ");
			j = i + 1;
		} // end for
		System.out.print("친구가 " + j + "명 이시군요.");
		System.out.println();
	}// friends

	public static void main(String[] args) {
		// 객체선언 및 참조 클래스 할당
		Work20 mtd = new Work20();
		// 1번 문제
		System.out.print("1. 이름 : [");
		System.out.print(mtd.yourName());
		System.out.println("]");
		// 2번 문제
		System.out.print("2. 올해 [");
		System.out.print(mtd.birthYear(30)[1]);
		System.out.print("]살이며 [");
		System.out.print(mtd.birthYear(30)[0]);
		System.out.println("] 년에 태어남");
		// 3번 문제
		System.out.print("3. ["+(char)mtd.unicode('K')[0]+"]의 ");
		System.out.println("Unicode는 ["+mtd.unicode('K')[1]+"] 입니다.");
		// 4번 문제
		mtd.character(123);
		// 5번 문제
		mtd.memoryAddr();
		mtd.memoryAddr(mtd);
		// 6번 문제
		mtd.friends("asdfasdf", "asdfasdfasdf");
	}

}
