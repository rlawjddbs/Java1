package day1203;

/**
 *	interface를 구현하는 class (자식클래스이고 interface내 모든 추상 method를 Override하는 클래스)
 *	구현 interface가 부모 interface를 가진다면 최종적인 자식클래스에서는
 *	모든 추상 method를 구현해야 한다.
 * @author owner
 */
public class InterfaceImpl /*extends SuperInterface*/implements SuperInterface{
	// extends 뒤에는 클래스만 올 수 있으며, 인터페이스는 클래스가 아니므로 상속되지 않는다.
	// extends 대신 implements 를 사용하여 인터페이스를 상속받아야 한다.
	
	public String msg() {//InterA
		return "내일은 화요일";
	}//msg
	
	public String msgB() {//InterB
		return "오늘은 월요일";
	}//msgB
	
	
	@Override
	public void methodA() {//SuperInterface
		System.out.println("methodA");
	}//methodA
	
	@Override
	public void methodB(int i) {//SuperInterface
		System.out.println("methodB");
	}//methodB
	
	public void test() {
	}
	
	public static void main(String[] args) {
		//자식 클래스로 객체화 : 모든 method를 호출할 수 있다.
		// ii.msg(), ii.msgB(), ii.methodA, ii.methodB, ii.test()
		InterfaceImpl ii = new InterfaceImpl();
		ii.methodB(12);
		
		// is a 관계의 객체화
		// SuperInterface로 객체화를 하면 Override된 method만 호출된다.
		// 부모의 method도 모두 호출 가능
		//si.msg(), si.msgB(), si.methodA(), si.methodB()
		SuperInterface si = new InterfaceImpl();
		System.out.println(si.msg());
		
		// InterA로 객체화하면 : InterA 인터페이스의 msg()만 호출 가능
		// 객체명 앞의 데이터형에 따라 호출가능한 메소드도 달라짐
		InterA ia = new InterfaceImpl();
		System.out.println(ia.msg());

		// InterB로 객체화하면 : ib.msg()만 호출가능.
		InterB ib = new InterfaceImpl();
		System.out.println(ib.msgB());
		
		// Object o = new InterfaceImpl(); // Object에 달려있는 method만 고를 수 있음.
		// interface는 객체화되지 않는다.
		// 자식을 통해서만 객체화를 할 수 있다.
		
//		InterA ia1 = new InterA(); //Error
//		SuperInterface si1 = new SuperInterface();
		
		
	}//main

}//class
