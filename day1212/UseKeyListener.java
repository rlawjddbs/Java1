package day1212;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Keyboard Event 처리
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseKeyListener extends Frame implements KeyListener {

	public static final int ENTER = 10;
	// 2. 이벤트와 관련있는 컴포넌트 선언
	private TextField tf;
	private Label lbl;

	public UseKeyListener() {
		super("키보드 이벤트 연습");
		// 3. 컴포넌트 생성
		tf = new TextField();
		lbl = new Label("출력창", Label.CENTER);

		// 4. 배치
		add("North", tf);
		add("Center", lbl);

		// 5. 컴포넌트를 이벤트에 등록
		tf.addKeyListener(this);

		// 6. 윈도우 크기 설정
		setBounds(100, 100, 400, 150);

		// 7. 사용자에게 보여주기 (가시화)
		setVisible(true);

		// 8. Window 종료 처리
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}// 기본 생성자

	@Override
	public void keyTyped(KeyEvent ke) {
		// 2. 키가 눌려 정보가 전달되는 순간, 눌린 키의 정보를 알 수 있다.
//		System.out.println("KeyTyped");

		// 눌린키의 문자와 코드값을 얻어내기

	}// keyTyped

	@Override
	public void keyPressed(KeyEvent ke) {
		// 1. 키보드의 키가 눌리는 순간이어서 키의 정보를 알 수 없다.
//		System.out.println("KeyPressed");
	}// keyPressed

	@Override
	public void keyReleased(KeyEvent ke) {
		// 3. 눌린키가 정보를 전달하고 다시 올라오는 순간. 눌린키의 정보를 알 수 있다.
//		System.out.println("KeyReleased");
		char inputKey = ke.getKeyChar();
		int inputCode = ke.getKeyCode();
		// keycode는 키보드 키의 고유값 : unicode와 다르게 같은 값이 나온다.
//		System.out.println( inputKey + " / " +inputCode);

		// 출력 Label에 뿌린다.
		StringBuilder output = new StringBuilder();
		output.append("눌린 키 문자 : ").append(inputKey).append(", 눌린키의 KeyCode : ").append(inputCode);

		lbl.setText(output.toString());

		switch (inputCode) {
		case ENTER:
			// JDK1.7에서 발생한 버그 : TextField, TextArea는
			// setText("")를 바로 사용하면 초기화되지 않는다.

			// JDK 1.7부터 생긴 버그. ""가 empty 가 아니라
			// " "로 스페이스바를 이용한 공백을 삽입해야 empty 상태로 변경가능하다
//			tf.setText(" "); 

			// 혹은 값을 한번 얻어낸 후 초기화를 하면 초기화가 잘 된다.
			tf.getText();
			tf.setText("");
			break;
		case KeyEvent.VK_ESCAPE:
			dispose();
			break;
		}// end switch

	}// keyReleased

	public static void main(String[] args) {
		new UseKeyListener();
	}// main

}// class
