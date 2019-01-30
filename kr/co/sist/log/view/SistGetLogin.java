package kr.co.sist.log.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import kr.co.sist.log.evt.SistGetLoginEvt;

/**
 * JFrame�� ��ӹ��� SistGetLogin Ŭ������ �α��� â�� �ٸ��ִ� ���� �Ѵ�.
 * 
 * @author zeongyun
 */
@SuppressWarnings("serial")
public class SistGetLogin extends JFrame {

	// �α��� â�� �⺻ ������
	// JTextFiled(���̵�), JPasswordField(��й�ȣ), JButton(�α��� ��ư)���� �����Ǹ�
	// �̸� �����Ѵ�.
	private JTextField jtfId;
	private JPasswordField jpfPasswd;
	private JButton jbLogin;

	public SistGetLogin() {
		// Window Ÿ��Ʋ ����.
		super("Login");

		// ������Ʈ ����
		jtfId = new JTextField();
		jpfPasswd = new JPasswordField();
		jbLogin = new JButton("�α���");

		// Titled Border����
		jtfId.setBorder(new TitledBorder("���̵�"));
		jpfPasswd.setBorder(new TitledBorder("��й�ȣ"));

		// �̺�Ʈ ���
		// �� Ŭ������ Ÿ��(SistGetLogin)�� ���ڷι޴� SistGetLoginEvt Ŭ������ �����ڸ� �̿��Ͽ�
		// Ŭ���� SistGetLoginEvt�� �ν��Ͻ��� �����Ѵ�.
		SistGetLoginEvt sgle = new SistGetLoginEvt(this);
		// �α��� ��ư�� Ŭ������ �� �߻��� �̺�Ʈ ���
		jbLogin.addActionListener(sgle);
		// ���̵�� �н����� �Է¶����� ���͸� ���� �� �߻��� �̺�Ʈ ���
		jtfId.addKeyListener(sgle);
		jpfPasswd.addKeyListener(sgle);

		// Window �˾� ��ǥ �� ũ�� ����.
		// �׸��� ���̾ƿ�(3�� 1��) ����
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