package day1121;

/**
 *	Instance(member) 변수<br>
 * 		객체가 생성될 때 메모리(heap)에 할당 되고, 그 주소를 저장한<br>
 * 		변수(객체, instance, object)를 사용하여 접근하는 변수.<br>
 * 		자동 초기화가 된다.<br>
 * 		
 * @author owner
 */
public class UseInstanceVariable {
	
	// instance 변수 생성
	int i;	//정수형 초기화값 0
	int j;
	double d; //실수형 초기화값 0.0
	char c; // 문자형 초기화값 \u0000
	boolean b; //불린형 초기화값 false
	String str; //참조형 초기화값 null
	UseInstanceVariable jaehyun;// 참조형 초기화값 null
	
	public static void main(String[] args) {
		// static 영역은 가장 먼저 메모리에 로드 되므로, 생성될지도 모르는
		// instance 변수를 직접 사용할 수 없다.
		// i = 300; //사용 안됨
		
		// 객체화를 하면 객체가 메모리(heap영역)에 생성되고, 그 주소를 메모리(stack영역)에 저장
		// 객체화의 문법은 : 클래스명 객체명 = new 클래스명();
		UseInstanceVariable uiv = new UseInstanceVariable();
		UseInstanceVariable uiv1 = new UseInstanceVariable();
		System.out.println("객체 출력(heap주소) "+uiv);		// 자바의 주소 체계는는 4byte체계임
		System.out.println("객체 출력(heap주소) "+uiv1);	// 자바의 주소 체계는는 4byte체계임
		
		// heap에 생성된 instance variable을 사용.
		uiv.i=11;
		uiv.j=21;
		
		System.out.println("uiv객체의 멤버 변수 i = "+ uiv.i);
		System.out.println("uiv객체의 멤버 변수 j = "+ uiv.j);	
		
		// instance(member)변수는 자동초기화 된다.
		System.out.println("uiv1 객체 i : "+uiv1.i +", uiv1 객체 j : "+uiv1.j);
		System.out.println("------------- Instance Variable의 자동 초기화 값--------------");
		System.out.println("정수형 : " + uiv1.i);
		System.out.println("실수형 : " + uiv1.d);
		System.out.println("문자형 : " + uiv1.c);		// white space가 들어있음
		System.out.println("불린형 : " + uiv1.b);
		System.out.println("참조형1 : " + uiv1.str);
		System.out.println("참조형2 : " + uiv1.jaehyun);
		
		
	}//main
}//class
