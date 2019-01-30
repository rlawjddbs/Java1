package kr.co.sist.log.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import kr.co.sist.log.evt.SistGetLoginEvt;

/**
 * JFrame을 상속받은 SistGetLogin 클래스는 로그인 창을 꾸며주는 일을 한다.
 * 
 * @author zeongyun
 */
@SuppressWarnings("serial")
public class SistGetLogin extends JFrame {

	// 로그인 창의 기본 구성은
	// JTextFiled(아이디), JPasswordField(비밀번호), JButton(로그인 버튼)으로 구성되며
	// 이를 선언한다.
	private JTextField jtfId;
	private JPasswordField jpfPasswd;
	private JButton jbLogin;

	public SistGetLogin() {
		// Window 타이틀 설정.
		super("Login");

		// 컴포넌트 생성
		jtfId = new JTextField();
		jpfPasswd = new JPasswordField();
		jbLogin = new JButton("로그인");

		// Titled Border설정
		jtfId.setBorder(new TitledBorder("아이디"));
		jpfPasswd.setBorder(new TitledBorder("비밀번호"));

		// 이벤트 등록
		// 본 클래스의 타입(SistGetLogin)을 인자로받는 SistGetLoginEvt 클래스의 생성자를 이용하여
		// 클래스 SistGetLoginEvt의 인스턴스를 생성한다.
		SistGetLoginEvt sgle = new SistGetLoginEvt(this);
		// 로그인 버튼을 클릭했을 때 발생할 이벤트 등록
		jbLogin.addActionListener(sgle);
		// 아이디와 패스워드 입력란에서 엔터를 쳤을 때 발생할 이벤트 등록
		jtfId.addKeyListener(sgle);
		jpfPasswd.addKeyListener(sgle);

		// Window 팝업 좌표 및 크기 설정.
		// 그리드 레이아웃(3행 1열) 설정
		setLayout(new GridLayout(3, 1));
		add(jtfId);
		add(jpfPasswd);
		add(jbLogin);

		setBounds(100, 100, 300, 200);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// SistGetLogin

	public JTextField getJtfId() {
		return jtfId;
	}// getJtfId

	public JPasswordField getJpfPasswd() {
		return jpfPasswd;
	}// getJpfPasswd

	public JButton getJbLogin() {
		return jbLogin;
	}// getJbLogin

}// class