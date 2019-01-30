package day1127;

/**
 * 숙제 1. 주민번호를 입력받아 처리하는 프로그램 작성.<br>
 * 각 작업은 method로 정의하고 호출하여 결과를 받아서 처리 (반환값을 가지고 처리)<br>
 * 1-1. 생성자는 주민번호를 받아 instance 변수에 할당한다.<br>
 * - 인스턴스 변수의 값 사용<br>
 * 1-2. 주민번호의 길이를 체크하여 14자가 아니면 false 반환<br>
 * 1-3. 주민번호의 6번째 자리가 "-"이 아니면 false 반환<br>
 * 1-4. 주민번호의 유효성 검증하여 유효하면 true 그렇지 않으면 false 반환<br>
 * 각 자리에 2 3 4 5 6 7 8 9 2 3 4 5 를 곱한 값을<br>
 * 더하여 11로 나눈 나머지 값을 얻고 11에서 그 값을 빼고<br>
 * 10으로 나눈 나머지가 주민번호의 끝자리와 같다면 true || false<br>
 * 1-5. 생년월일 반환하는 일. 1988-11-11 의 형식을 지킬 것.<br>
 * 1-6. 나이를 반환하는 일. ex) 31<br>
 * 1-7. 성별을 반환 ex) "남", "여"<br>
 * 1-8. 내국인/외국인 반환 - 주민번호 7번째 자리가 1, 2, 3, 4면 내국인, 5,6,7,8은 외국인<br>
 * 1-9. 띠를 반환 ex) "양띠"
 * 
 * if(1-2method()){<br>
 * if(1-3 method()){<br>
 * if(1-4 method()){<br>
 * S.o.p(1-5method());<br>
 * S.o.p(1-6method());<br>
 * S.o.p(1-7method());<br>
 * S.o.p(1-8method());<br>
 * S.o.p(1-9method());<br>
 * }else{<br>
 * S.o.p("잘못된 주민번호");<br>
 * }//end else in 1-4method<br>
 * }<br>
 * }
 * 
 * @author owner
 */
public class Work23 {
	String ssn;

	public Work23(String ssn) { // 1-1 method
		this.ssn = ssn;
	}// Work23

	boolean ssnLength() { // 1-2 method
//		return this.ssn.length()==14;
		// 변수는 하나뿐이라 this 생략가능
		return ssn.length() == 14;
	}// ssnLengthCheck

	boolean ssnHyphen() { // 1-3 method
		return ssn.charAt(6) == '-'; // charAt()은 문자열 리터럴이 아닌 문자 리터럴을 가져온다.
	}// ssnHyphen

	boolean validSsn() { // 1-4 method
		int[] arrSsn = new int[13];
		int total = 0; // 주민번호 각 자릿수와 연산된 값들을 모두 더해 저장할 변수
		int j = 2; // 연산에 활용될 변수
		for (int i = 0; i < arrSsn.length; i++) {
			if (j > 9) {
				j = 2;
			}
			if (i > 5) {
				arrSsn[i] = Integer.parseInt(ssn.substring(i + 1, i + 2));
			} else {
				arrSsn[i] = Integer.parseInt(ssn.substring(i, i + 1));
			} // end else
			if (i < 12) {
				total += arrSsn[i] * j;
			}
			j++;
		} // end for
		total = (11 - total % 11) % 10;
		return total == Integer.parseInt(ssn.substring(13, 14));

	}// validSsn

	String birth() { // 1-5 method
		String birth;
		int sevenSsn = Integer.parseInt(ssn.substring(7, 8));
		if (sevenSsn == 1 || sevenSsn == 2 || sevenSsn == 5 || sevenSsn == 6) {// 및힌;
			birth = "19".concat(ssn.substring(0, 2)).concat("-").concat(ssn.substring(2, 4)).concat("-")
					.concat(ssn.substring(4, 6)); // 및힌 ㅠㅠ
		} else if (sevenSsn == 3 || sevenSsn == 4 || sevenSsn == 7 || sevenSsn == 8) {
			birth = "20".concat(ssn.substring(0, 2)).concat("-").concat(ssn.substring(2, 4)).concat("-")
					.concat(ssn.substring(4, 6)); // 및힌 ㅠㅠ
		} else {
			birth = "18".concat(ssn.substring(0, 2)).concat("-").concat(ssn.substring(2, 4)).concat("-")
					.concat(ssn.substring(4, 6)); // 및힌 ㅠㅠ
		} // end else
		return birth;
	}// birth

	int age() { // 1-6 method
		int sevenSsn = Integer.parseInt(ssn.substring(7, 8));
		int birthYear;
		if (sevenSsn == 1 || sevenSsn == 2 || sevenSsn == 5 || sevenSsn == 6) {
			birthYear = 1900 + Integer.parseInt(ssn.substring(0, 2));
		} else if (sevenSsn == 3 || sevenSsn == 4 || sevenSsn == 7 || sevenSsn == 8) {
			birthYear = 2000 + Integer.parseInt(ssn.substring(0, 2));
		} else {
			birthYear = 1800 + Integer.parseInt(ssn.substring(0, 2));
		}
		return 2018 - birthYear + 1;
	}// age

	char gen() { // 1-7 method
		String sevenSsn = ssn.substring(7, 8);
		char gen;
		if (sevenSsn.equals("1") || sevenSsn.equals("3") || sevenSsn.equals("5") || sevenSsn.equals("7")
				|| sevenSsn.equals("9")) {
			gen = '남';
		} else {
			gen = '여';
		} // end else
		return gen;
	}// gen

	String local() { // 1-8 method
		String sevenSsn = ssn.substring(7, 8);
		String local;
		if (sevenSsn.equals("0") || sevenSsn.equals("1") || sevenSsn.equals("2") || sevenSsn.equals("3")
				|| sevenSsn.equals("4") || sevenSsn.equals("9")) {
			local = "내국";
		} else {
			local = "외국";
		} // end else
		return local;
	}// local

	String zodiacSign() {
		int calc = Integer.parseInt(birth().substring(0, 4)) % 12;
		String[] zodiacSign = new String[12];
		zodiacSign[0] = "원숭이";
		zodiacSign[1] = "닭";
		zodiacSign[2] = "개";
		zodiacSign[3] = "돼지";
		zodiacSign[4] = "쥐";
		zodiacSign[5] = "소";
		zodiacSign[6] = "호랑이";
		zodiacSign[7] = "토끼";
		zodiacSign[8] = "용";
		zodiacSign[9] = "뱀";
		zodiacSign[10] = "말";
		zodiacSign[11] = "양";
		return zodiacSign[calc];
	}

	public static void main(String[] args) {
		// 변수 선언
		String ssn = "890906-1692421";
		// 객체 선언
		Work23 sc = new Work23(ssn);

		if (sc.ssnLength()) { // 1-2 method
			System.out.printf("-- 1-2. 입력된 주민번호 : [%s******] 14자리 길이 검증을 통과 하였습니다.\n", sc.ssn.substring(0, 8));
			if (sc.ssnHyphen()) { // 1-3 method
				System.out.println("-- 1-3. 주민번호 7번째 : [-] 하이픈 검증을 통과 하였습니다.");
				if (sc.validSsn()) { // 1-4 method
					System.out.printf("-- 1-4. 입력된 주민번호 : [%s******] 유효성 검증을 통과 하였습니다.\n", sc.ssn.substring(0, 8));
					System.out.printf("-- 1-5. 생년월일 : [%s]\n", sc.birth()); // 1-5 method
					System.out.printf("-- 1-6. 나이 : [%d]세\n", sc.age()); // 1-6 method
					System.out.printf("-- 1-7. 성별 : [%c]\n", sc.gen());// 1-7 method
					System.out.printf("-- 1-8. [%s]인 입니다.\n", sc.local());// 1-8 method
					System.out.printf("-- 1-9. [%s]띠 입니다.\n", sc.zodiacSign());// 1-9 method
				} else {
					System.out.println("----------------잘못된 주민번호입니다.--------------------");
				} // end 1-4 else
			} else {
				System.out.println("------------------\"-\"이 없습니다.------------------");
			} // end 1-3 else
		} else {
			System.out.printf("------------------입력된 주민번호 : [%s]------------------\n", ssn);
			System.out.println("------------------주민번호의 길이는 \"-\"를 포함하여 [14]자로 입력하세요.------------------");
		} // end 1-2 else
	}// main
}// class
