package day1130;

public class SuperConstr {
	int i;
	
	public SuperConstr() {
//		super();
		this(100);
		System.out.println("부모 기본 생성자");
	}//부모의 기본 생성자
	
	
	public SuperConstr(int i) {
//		super();
		this.i=i;
		System.out.println("부모 인자 생성자 "+i);
		
	}//부모의 인자 있는 생성자
	
}//class
