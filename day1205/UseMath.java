package day1205;

/**
 * Math : 객체를 생성하지 않고 사용하는 클래스
 * 
 * @author owner
 */
public class UseMath {

	public UseMath() {
//		Math m = new Math(); // 생성자 없음, 객체생성 안됨 (java-api.html 참고)
		int i = -10;
		System.out.println(i + "의 절대값 : " + Math.abs(i));
		System.out.println(Math.ceil(10.1)); // 올림
		System.out.println(Math.round(10.1)); // 반올림, 소수점 이하 첫자리에서
		System.out.println(Math.floor(10.5)); // 내림, 소수점 이하 첫자리에서

		double d = Math.random(); // 소수점을 포함하여 17자리의 소수가 나옴
		System.out.println("발생한 난수 : " + d);
		System.out.println("범위를 설정한 난수 : " + d * 5);
		System.out.println("범위를 설정한 난수에서 정수 : " + (int) d * 5); // 0이 나옴. int형으로 캐스팅시 실수부를 다 절삭하게 되므로 d*5를 먼저 연산후 int형으로
																// 형변환 해야한다.
		System.out.println("범위를 설정한 난수에서 정수 : " + (int) (d * 5));

		// A(65)-Z(90) 중 하나의 문자를 반환하는 일
		System.out.println((char) ((d * 26) + 65));

		System.out.println(createPassword());
	}// UseMath

	/**
	 * 비밀번호 생성기 (비밀번호 보안성 체크 http://www.passwordmeter.com/)<br>
	 * 65 ~ 90 대문자<br>
	 * 97 ~ 122 소문자<br>
	 * 48 ~ 57 숫자
	 * 
	 * @return
	 */
	public char[] createPassword() {
		// xcxxxx***** (마스킹형식으로 제공하든지), AbcEdg3 (임시 비번을 제공하든지)
		// 영문자대문자, 소문자, 숫자로 이루어진 임의의 비밀번호 8자리를 생성하여 반환하는 일
		char[] tempPass = new char[8];
		
//		내가 한 것
		double charOrNum = 0;
		for (int i = 0; i < tempPass.length; i++) {
			charOrNum = (int) (Math.random() * 3);
			if (charOrNum == 0) {//대문자 알파벳
				tempPass[i] = (char) ((int) ((Math.random() * 26) + 65));
			} else if (charOrNum == 1) {//소문자 알파벳
				tempPass[i] = (char) ((int) ((Math.random() * 26) + 97));
			} else {//숫자
				tempPass[i] = (char) ((int) ((Math.random() * 9) + 48));
			} // end if
		} // end for
		return tempPass;
		
		// 배열[3] 만들어서 랜덤으로 
		
//		//선생님이 풀이한 것
//		String flag="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//		
//		for(int i=0; i < tempPass.length; i++) {
//			tempPass[i] = flag.charAt( (int)(Math.random()*flag.length()) );
//		}//end for
//		return tempPass;
	}// createPassword;

	public static void main(String[] args) {
		new UseMath();
	}// main
}// UseMath
