package day1205;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 형식이 있는 날짜 정보를 얻을 때.<br>
 * 형식 - java.text.SimpleDateFormat <br>
 * 날짜정보 - java.util.Date
 * 
 * @author owner
 */
public class UseDate {
	public UseDate() {
		Date date = new Date();
		System.out.println(date);
//		System.out.println(1900+date.getYear()); //비추천 method가 많다.
		
		// 날짜 형식이 길어지면 Error 가 발생하는 "오라클"과는 달리 자바는 날짜 형식이 길어져도 에러가 나지 않는다.
		// Locale - 다른 나라의 날짜 형식으로 변경하여 제공할 때.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd일 a EEEE HH(hh, kk):mm:ss:ms", Locale.ITALY); // E를 세번 사용하면 "요일"까지 자동 출력된다. (OS 언어에 맞춰져 나옴, 혹은 locale 클래스에 맞춰져 나옴)
		String formatDate = sdf.format(date);
		System.out.println(formatDate);
		
	}// UseDate

	public static void main(String[] args) {
		new UseDate();
	}// main

}// class
