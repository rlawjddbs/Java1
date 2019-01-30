package day1129;

import java.util.Arrays;

public class UseSecureArray {

	public static void main(String[] args) {
		SecureArray sa = new SecureArray();
		int[] tempArr = sa.getArr();

		//SecureArray 클래스에 선언 및 생성된 private 배열 arr의 값을 손쉽게 가져온다.
		System.out.println(tempArr);
		//배열 방의 값을 손쉽게 출력하려면 Arrays 클래스를 사용한다.
		System.out.println(Arrays.toString(tempArr));
		
		//SecureArray 클래스에 private 배열 arr은 접근지정자가 private 임에도
		//값을 수정할 수 있다.(같은 클래스내 접근지정자가 public인 method에서
		//arr 배열의 값을 반환하기 때문)
		tempArr[0]=190;
		System.out.println(Arrays.toString(tempArr));
		
		// 배열의 값이 바뀌었으므로 새로운 객체를 생성후 배열 값을 불러와도
		// 수정된 배열값이 나온다.
		int[] tempArr1 = sa.getArr();
		System.out.println(Arrays.toString(tempArr1));
	}//main

}//class
