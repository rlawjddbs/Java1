package day1218;

/**
 *	Compile Exception : byte code를 정상적으로 생성하기 위한것이 목적
 * @author owner
 */
public class UseCompileException {

	public static void main(String[] args) {
		
		try {
//			Class c = Class.forName("");
//			Object obj = Class.forName("java.lang.String");
			Object obj = Class.forName("day1217.UseRuntimeException");
			System.out.println("로딩한 클래스 "+ obj); //new연산자를 쓰지않고도 클래스 로딩가능
		} catch (ClassNotFoundException cnfe){
			System.err.println("죄송합니다.");
			System.err.println("예외 메세지 출력 : "+cnfe.getMessage());
			System.err.println("예외처리 객체와 메세지 : "+ cnfe);
			cnfe.printStackTrace();
//			System.out.println("--------"); //println은 printStackTrace보다 먼저 출력 될 수 있다.
			
		} finally {
			System.out.println("사용해주셔서 감사합니다.");
		}//end Finally
		
		//예외가 떨어지면 클래스를 가장 먼저 확인할 것
		
	}//main
	
}//class
