package day1123;

/**
 * main method가 있는 class = 자바 어플리케이션(Java Application)<br>
 * 사람을 추상화하여 만든 Person 클래스를 사용하는 UsePerson 클래스<br>
 * @author owner
 */
public class UsePerson {
	
	public static void main(String[] args) {
		// 객체 생성 : heap memory 영역에 생성되고 instance 변수는 자동 초기화가 된다. ( ex : int의 경우 0, String의 경우 null 등 )
		Person taecksung = new Person(); // 참조형데이터형 객체명 = new 클래스명();
		// 참조형 데이터형인 Person은 heap의 주소를 가지고 있다.
		System.out.println("객체를 출력하면 주소가 출력" + taecksung);
		System.out.format("생성된 사람 객체 정보 눈[%d], 코[%d], 입[%d], 이름[%s]\n", taecksung.getEye(), taecksung.getNose(), taecksung.getMouth(), taecksung.getName());
		
		taecksung.setName("정택성");
//		taecksung.setEye(2);
//		taecksung.setNose(1);
//		taecksung.setMouth(1);
		System.out.format("생성된 사람 객체 정보 눈[%d], 코[%d], 입[%d], 이름[%s]\n", taecksung.getEye(), taecksung.getNose(), taecksung.getMouth(), taecksung.getName());
		
		//생성된 객체에서 정의된 일을 사용
		System.out.println(taecksung.eat());
		System.out.println(taecksung.eat("육회비빔밥", 8000));
		
		
		System.out.println("------------------------------------------------------------------------");
		Person jinban = new Person(3, 1, 1);
		jinban.setName("천진반");
//		jinban.setEye(3);
//		jinban.setNose(1);
//		jinban.setMouth(1);
		
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("선두", 1));
//		System.out.println(taecksung.eat());
//		System.out.println(taecksung.eat("육회비빔밥", 8000));
		
		// 천진반 객체와 정택성 객체의 주소는 다르다.
		System.out.println(taecksung);
		System.out.println(jinban);
		
		/*  */
	}//main

}//class
