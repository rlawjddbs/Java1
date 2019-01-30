package kr.co.sist.log.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import kr.co.sist.log.view.SistGetLogin;
import kr.co.sist.log.view.SistGetLoginMain;

/**
 * �α��� â���� �α��� ��ư�� �����ų�,<br> 
 * �Է��ʵ忡�� ����Ű�� �Է����� �� �߻��� �̺�Ʈ�� ó���ϴ� ��
 * 
 * @author zeongyun
 */
public class SistGetLoginEvt implements ActionListener, KeyListener {

	// �̺�Ʈ�� ��ϵ� �α���â�� ������Ʈ���� ���޹ޱ� ��
	//	SistGetLogin Ÿ���� �������� sgl�� �����Ѵ�. 
	private SistGetLogin sgl;

	public SistGetLoginEvt(SistGetLogin sgl) {
		this.sgl = sgl;
	}// SistGetLoginEvt ���ڰ� �ִ� ������

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == sgl.getJbLogin()) {
			checkLogin();
		} // end if

	}// actionPerformed

	/**
	 * �α���, �н����忡 �Էµ� ���� �´��� Ȯ���ϴ� ��
	 */
	public void checkLogin() {
		String id = sgl.getJtfId().getText();
		String passwd = new String(sgl.getJpfPasswd().getPassword());

		// ���̵� �ԷµǾ����� �˻�
		if (id == null || id.equals("")) {
			JOptionPane.showMessageDialog(sgl, "���̵� �Է��ϼ���.", "Error", JOptionPane.ERROR_MESSAGE);
			sgl.getJtfId().requestFocus();
			return;
		} // end if

		// ��й�ȣ�� �ԷµǾ����� �˻�
		if (passwd == null || passwd.equals("")) {
			JOptionPane.showMessageDialog(sgl, "��й�ȣ�� �Է��ϼ���.", "Error", JOptionPane.ERROR_MESSAGE);
			sgl.getJpfPasswd().requestFocus();
			return;
		} // end if

		// ������ ���̵�, ��й�ȣ�� �ԷµǾ����� �˻�
		if ((id.equals("admin") && passwd.equals("1234")) || id.equals("root") && passwd.equals("1111")) {
			// �����ڰ� �´ٸ� SistGetLoginMain Ŭ������ �ν��Ͻ��� �����Ѵ�.
			new SistGetLoginMain();
			// ���ο� â�� ��Ÿ���Ƿ� ���� �����ִ� �α��� â(�ν��Ͻ� sgl)�� �ݴ´�.
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