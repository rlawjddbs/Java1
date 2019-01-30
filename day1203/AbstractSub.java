package day1203;

/**
 * 추상클래스를 부모로 하는 자식클래스<br>
 * 자식클래스는 반드시 부모클래스의 추상method를 Override 해야한다.
 * 
 * @author owner
 */
public class AbstractSub extends AbstractSuper {

	public void subMethod() {
		System.out.println("자식 method!!!!!");
	}// subMethod

	@Override
	// Override 규칙 : 접근지정자는 달라도 되고(광의의) 반환형과 method명,
	// 매개변수는 같아야 한다.
	public void absMethod() {
		// 추상method는 super로 호출할 수 없다.
//		super.absMethod(); // Error. 호출해도 body가 없어서 일을 못함
		System.out.println("Override한 자식의 absMethod");
	}// absMethod

	@Override
	public String absMethod1(int pram_i) {
		return String.valueOf(pram_i).concat(" - 자식");
	}// absMethod

//	@Override
//	public void method() {
//		System.out.println("자식의 일을 하는 일반 method");
//	}

	// 자식 클래스가 객체화 되면 추상클래스는 객체화가 된다.
	public static void main(String[] args) {
		AbstractSub as = new AbstractSub();
		// 자식클래스 객체화 : 부모의 변수, method, 자식의 변수, method
		as.i = 12;// 부모 변수
		as.method();// 부모 method
		// Override된 method 자식에서 구현한 것이므로 자식의 method 호출
		as.absMethod();// 같은 이름으로 존재한다면 자식의 method 호출
		// 자식의 method (override 된 것이니 결국 자식의 method라 할 수 있음)
		System.out.println(as.absMethod1(3)); // 같은 이름으로 존재한다면 자식의 method 호출
		as.subMethod();

		// is a 관계의 객체화 : 객체 다형성
		// 부모클래스명 객체명 = new 자식생성자();
		// 같은 이름의 클래스를 다양하게 쓸 수 있다.
		AbstractSuper as1 = new AbstractSub();
		// 부모의 자원 호출 가능
		// 단, Override된 method가 존재한다면 자식의 자원을 호출한다.
		as1.i = 100;
		as1.method();
		// 추상 method는 body가 없지만 호출하게되면 자식의 method가
		// Overriding 되어있을 경우 호출된다.
		as1.absMethod();
		System.out.println(as1.absMethod1(2018));

		// is a 관계로 객체화하면 자식이 가진 method는 호출 불가하다.
		// overriding 한 변수나 메소드만 호출 가능하다.
//		as1.subMethod();
	}// main

}// class
