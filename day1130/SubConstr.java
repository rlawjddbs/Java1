package day1130;


public class SubConstr extends SuperConstr{
	int i;
	
	public SubConstr() {
//		super(100);
		// 1번. 부모 기본, 부모 인자 300, 자식 인자 200, 자식 기본
//		this(200);
//		this(100);
		super();
		System.out.println("자식 기본 생성자");
		
	}//자식의 기본 생성자
	public SubConstr(int i) {
//		super(300);
//		super(100);
		this();
		System.out.println("자식 인자 생성자 "+i);
	}//자식의 인자있는 기본 생성자
	
}//class
