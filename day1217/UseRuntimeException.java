package day1217;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *	JVM이 자동으로 예외를 처리해주는 RuntimeException.
 * @author owner
 */
public class UseRuntimeException {

	public static void main(String[] args) {
		
		//1. JTextArea생성(행수, 컬럼수)
		JTextArea jta = new JTextArea(10, 40);
		jta.setEditable(false);
		jta.append("어어어어어");
		//2. 
		JScrollPane jsp = new JScrollPane(jta);
		//3. MessageDialog의 두번 째 매개변수(문자열)에 컴포넌트를 할당
		
		JOptionPane.showMessageDialog(null, jsp);
		
		
		try {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result = 0;
		
		result = num1 / num2;
		
		System.out.println(num1 + " / " + num2 + " = " + result);
		} catch(ArrayIndexOutOfBoundsException aioobe) {
			System.err.println("배열의 인덱스가 잘못되었습니다.");
			System.err.println("예외의 이유 : "+ aioobe.getMessage() );
			System.err.println("예외처리 클래스명과 이유 : "+ aioobe );
			aioobe.printStackTrace();//자세한 예외
		} catch (NumberFormatException nfe) {
			System.err.println("입력값이 숫자 형태가 아닙니다.");
			System.err.println("예외의 이유 : "+ nfe.getMessage() );
			System.err.println("예외처리 클래스명과 이유 : "+ nfe );
			nfe.printStackTrace();
		} catch (ArithmeticException ae) {
			System.err.println("0으로 나눌 수 없습니다.");
			System.err.println("예외의 이유 : "+ ae.getMessage() );
			System.err.println("예외처리 클래스명과 이유 : "+ ae );
			ae.printStackTrace();
		} catch (Exception e) {
			System.err.println("개발자가 인지하지 못한예외.");
		} finally {
			System.out.println("반드시 실행되어야할 코드");
		}//end finally
		
	}//main

}//class
