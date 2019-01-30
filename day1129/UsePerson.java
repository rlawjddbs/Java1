package day1129;

import java.util.Date;

public class UsePerson {

	public static void main(String[] args) {
		HongGilDong gd = new HongGilDong();
		gd.setName("홍길동");//부모의 method 사용 (HongGilDong 클래스의 부모인 UsePerson의 method)
		System.out.println("홍길동의 눈 : "+gd.getEye()
		+", 코 : "+gd.getNose()
		+", 입 : "+gd.getMouth());
		System.out.println(gd.eat());
		System.out.println(gd.eat("국밥", 1)); //홍길동이 살던 시절엔 "원"단위가 없었음, 오버라이딩의 필요성이 부각됨
		//자신만의 특징
		System.out.println(gd.fight(6));//level : 7 > 8
		System.out.println(gd.fight(7));//level : 8>9
		System.out.println(gd.fight(9));//비김
		System.out.println(gd.fight(10));//진다. 9 > 8
		System.out.println(gd.fight(9));//진다. 8 > 7
		
		System.out.println("-------------------------------------------------------------------------------------");
		Clark superman = new Clark();// 자식이 생성되면 부모클래스가 먼저 생성된 후 자식이 생성된다.
		//자식의 객체로 부모 클래스의 자원(변수, method)를 자식의 것처럼 사용할 수 있다. 코드의 재 사용성
		System.out.println(superman.getEye()+" / "+superman.getNose()+" / "+superman.getMouth());
		System.out.println(superman.getName());
		
		superman.setName("클락");
		System.out.println(superman.getName());
		
		System.out.println("----------------------------------------------------------");
		
		superman.setName("클락켄트");
		System.out.println(superman.eat());
		System.out.println(superman.eat("스테이크", 10));
		
		// 자식의 method
		String stone = "짱돌";
		System.out.println(stone+"을 맞은 결과 - "+
				superman.power(stone)+", 힘의 변화 : "+
				superman.power);
		
		stone="다이아몬드";
		System.out.println(stone+"을 맞은 결과 - "+
				superman.power(stone)+", 힘의 변화 : "+
				superman.power);
		
		stone="클립토나이트";
		System.out.println(stone+"을 맞은 결과 - "+
				superman.power(stone)+", 힘의 변화 : "+
				superman.power);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		
		Kjy kjy = new Kjy();
		kjy.setName("김정윤");
		System.out.println(kjy.getName());
		System.out.println(kjy.eat());
		System.out.println(kjy.eat("짬뽕", 1));
		System.out.println("----------------------------------------------------------");
		System.out.println(kjy.playTekken(8));
		System.out.println("----------------------------------------------------------");
		System.out.println(kjy.playTekken(6));
		System.out.println("----------------------------------------------------------");
		System.out.println(kjy.playTekken(5));
		
		System.out.println(kjy);
		System.out.println(gd);
		System.out.println(gd.toString()); // toString() method 출처는 object
		System.out.println(kjy.toString());
		
		String s = new String("오늘은 금욜");
		System.out.println(s.toString()); // 오버라이딩
		// 최상위 클래스 object에 존재하는 toString() 메소드를 같은 이름으로 만들어 변환
		
		Date d = new Date();
		System.out.println(d.getYear());
		
		int i;
	}//main

}//class
