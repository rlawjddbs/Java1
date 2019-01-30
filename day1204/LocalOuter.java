package day1204;

/**
 *	method안에 클래스를 정의하는 지역 class의 사용.<br>
 *	생성된 객체를 지역변수처럼 사용하는 클래스
 * @author owner
 */
public class LocalOuter {
	int i;
	
	public LocalOuter() {
		System.out.println("바깥 클래스의 생성자");
	}//LocalOuter
	
	public void method(int param_i, final int param_j) {
		int local_i=0;
		final int local_j=0;
		
		//////////////////////////////// 지역클래스 시작 //////////////////////////////////////////////
		class Local{
			int loc_i;
			
			public Local() {
				System.out.println("지역 클래스의 생성자");
			}//Local
			public void locMethod() {
				System.out.println("지역 클래스의 method loc+i="+loc_i);
				System.out.println("외부 클래스의 인스턴스 변수 i="+i);
				//JDK compiler 1.7 이전 버전에서는 final이 붙은 매개변수만 사용할 수 있다.
				System.out.println("매개변수(Parameter) param_i="+param_i+", parm_j="+param_j);
				//JDK 1.8 이전 버전에서는 final이 붙은 지역변수만 사용할 수 있다.
				System.out.println("지역변수 local_i="+local_i+", local_j="+local_j);
				
				// JDK 1.8 이후부터는 final 이 붙지않은 지역변수를 사용할 수는 있으나 값 변경은 불가하다.
				// JDK 1.8 에서부터는 출력은 가능하지만, final이 붙어있지 않은 지역변수의 값 변경은 불가하다.
//				local_i = 2018; // JDK 1.8에서부터는 final이 붙어있지 않은 지역변수의 출력은 가능하지만 값 할당은 되지 않는다.
				
				
			}//locMethod
			
			
		}//class
		//////////////////////////////// 지역클래스 끝 ////////////////////////////////////////////////
		//지역 클래스의 객체화
		Local lo = new Local();
		//생성된 객체로 클래스의 내의 자원을 사용할 수 있다.
//		loc_i=100; //직접사용불가
		lo.loc_i = 100;
		lo.locMethod();
		
		System.out.println("바깥 클래스의 method호출");
	}//method
	
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.method(12, 4);
	}//main

}//class
