package day1129.sub;

import java.util.Arrays;
import day1129.Work21_2;

public class Work21_2sub extends Work21_2 {

	public static void main(String[] args) {
		//1. 선언 : 데이터형[] 배열명 = null;
		Work21_2[] dataArr = null;
		
		//2. 생성 : 배열명 = new 데이터형[방의개수];
		dataArr = new Work21_2[7];
		dataArr[0] = new Work21_2();
		
		dataArr[0] = new Work21_2(1, "이재찬", "서울시 강남구 역삼동", 28, "남자");
		dataArr[1] = new Work21_2(2, "이재현", "서울시 동대문구 답십리동", 27, "남자");
		dataArr[2] = new Work21_2(3, "김정운", "수원시 영통구 영통동", 26, "남자");
		dataArr[3] = new Work21_2(4, "정택성", "서울시 구로구 구로동", 27, "남자");
		dataArr[4] = new Work21_2(5, "정택순", "서울시 동작구 상도동", 29, "여자");
		dataArr[5] = new Work21_2(6, "김건하", "경기도 부천시 부천동", 26, "남자");
		dataArr[6] = new Work21_2(7, "이재순", "서울시 광진구 광나루동", 27, "여자");
		
		Work21_2 Work21sub = new Work21_2();
		Work21sub.printArr(dataArr);
//		System.out.println(Arrays.toString(dataArr));
		
		
		
		
	}//main

}//class
