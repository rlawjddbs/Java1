package kr.co.sist.log.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import kr.co.sist.log.view.SistGetLogin;
import kr.co.sist.log.view.SistGetLoginMain;

/**
 * 로그인 창에서 로그인 버튼을 누르거나,<br> 
 * 입력필드에서 엔터키를 입력했을 때 발생할 이벤트를 처리하는 일
 * 
 * @author zeongyun
 */
public class SistGetLoginEvt implements ActionListener, KeyListener {

	// 이벤트로 등록된 로그인창의 컴포넌트들을 전달받기 위
	//	SistGetLogin 타입의 참조변수 sgl을 선언한다. 
	private SistGetLogin sgl;

	public SistGetLoginEvt(SistGetLogin sgl) {
		this.sgl = sgl;
	}// SistGetLoginEvt 인자가 있는 생성자

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == sgl.getJbLogin()) {
			checkLogin();
		} // end if

	}// actionPerformed

	/**
	 * 로그인, 패스워드에 입력된 값이 맞는지 확인하는 일
	 */
	public void checkLogin() {
		String id = sgl.getJtfId().getText();
		String passwd = new String(sgl.getJpfPasswd().getPassword());

		// 아이디가 입력되었는지 검사
		if (id == null || id.equals("")) {
			JOptionPane.showMessageDialog(sgl, "아이디를 입력하세요.", "Error", JOptionPane.ERROR_MESSAGE);
			sgl.getJtfId().requestFocus();
			return;
		} // end if

		// 비밀번호가 입력되었는지 검사
		if (passwd == null || passwd.equals("")) {
			JOptionPane.showMessageDialog(sgl, "비밀번호를 입력하세요.", "Error", JOptionPane.ERROR_MESSAGE);
			sgl.getJpfPasswd().requestFocus();
			return;
		} // end if

		// 관리자 아이디, 비밀번호가 입력되었는지 검사
		if ((id.equals("admin") && passwd.equals("1234")) || id.equals("root") && passwd.equals("1111")) {
			// 관리자가 맞다면 SistGetLoginMain 클래스의 인스턴스를 생성한다.
			new SistGetLoginMain();
			// 새로운 창이 나타나므로 현재 열려있는 로그인 창(인스턴스 sgl)은 닫는다.
			sgl.dispose();
		} // end if

	}// checkLogin

	@Override
	public void keyTyped(KeyEvent ke) {
	}

	@Override
	public void keyPressed(KeyEvent ke) {
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		if (ke.getKeyCode() == 10) {
			checkLogin();
		} // end if
	}// keyRealased

}// class