package day1206;

import java.text.DecimalFormat;

/**
 *	DecimalFormat<br>
 *	숫자를 지정한 문자열로 변경.
 * @author owner
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
		int temp = 20181206;
		System.out.println(temp);
		
		// 패턴에서 설정된 자리수를 넘어서면 에러가 발생하는 오라클과 달리
		// 자바는 알아서 형식 패턴을 찾아 설정해준다.
		DecimalFormat df = new DecimalFormat("0,000");
		DecimalFormat df1 = new DecimalFormat("#,###");
		
		System.out.println("0 사용 : "+df.format(temp));
		System.out.println("# 사용 : "+df1.format(temp));
		
		DecimalFormat df2 = new DecimalFormat("#,###.00");
		// 실수 자리수를 0으로 설정하고 사용할 때 마지막 뒷자리의 값이 반올림 대상이라면 반올림한 결과를 보여준다.
		// 실수 자리수를 0으로 설정하고 사용할 때 설정된 마지막 뒷자리수보다 입력된 값의 자리수가 많을 경우 설정된 자리수까지 반올림한 결과를 보여준다.
		System.out.println("소수자리수 표현 : "+df2.format(201812.064));
		System.out.println("소수자리수 표현 : "+df2.format(201812.065));
		
		
	}//UseDecimalFormat
	
	public static void main(String[] args) {
		new UseDecimalFormat();
	}//main

}//class
