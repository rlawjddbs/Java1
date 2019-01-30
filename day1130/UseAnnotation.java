package day1130;

import java.util.ArrayList;
import java.util.List;


/**
 *	JDK 1.5에서부터 추가된 annotation의 사용.
 *	Deprecated, Override, SuppressWarnings
 * @author owner
 */
public class UseAnnotation {

	/**
	 * 이 메소드는 자라서 문제를 발생시킬 수 있습니다.
	 */
	@Deprecated
	public void test() {
		System.out.println("차후에 문제가 발생될 method");
	}//test
	
	public String toString() {
		return "온뇨쇼쵸몬도";
	}//toString
	
	// annotation을 method위에 설정하면 method 내의 모든 경고 상황을 무시한다.
	@SuppressWarnings({"rawtypes","unused"})
	public void temp() {
		// 경고를 무시(안 나타나게)하는 annotation
//		@SuppressWarnings("unused")
		int i = 0;
		
		//rawtypes : Generic 을 사용하지 않을 때 경고 무시
		// 변수위에 설정하면 특정변수만 경고를 무시하고
//		@SuppressWarnings({"rawtypes","unused"})
		List l=new ArrayList();
		
		int j = 0;
		System.out.println( "temp j = "+j );
	}
	
	public static void main(String[] args) {
		UseAnnotation ua = new UseAnnotation();
		ua.test();
		// Annotation Deprecated 는 문제가 될 수 있는 class, method, 변수 위에 작성
		System.out.println(ua);
	}//main

}//class
