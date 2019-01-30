package day1130;

public class RunConstr {

	public static void main(String[] args) {
		//서로 아무런 연관이 없는
		// 오브젝트의 같은 레벨의 클래스 이므로
		// 객체화 실패, 자식 클래스로부터 import 부모클래스경로; 를 입력해야 한다.
		
//		SubConstr sc = new SubConstr(); // 부모의 기본, 자식의 기본
//		SubConstr scl = new SubConstr(200); // 부모의기본, 자식의 인자
		
		//부모 기본, 부모 인자 300, 자식 인자 200, 자식 기본
		SubConstr child = new SubConstr(100);
		//부모 인자 100, 부모기본, 자식기본, 자식인자 100
		
		
		
	}//main

}//class
