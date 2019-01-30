package day1211;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * XxxAdapter class�� ���Ǿ�� �ϴ� ����
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseWindowEvent extends Frame {

	public UseWindowEvent() {
		super("������ �̺�Ʈ ����");

		setBounds(100, 100, 400, 400);
		setVisible(true);
		
		UseWindowEvent.WindowImpl wi = this.new WindowImpl();
		addWindowListener(wi);

	}// UseWindowEvent()

	public static void main(String[] args) {
		new UseWindowEvent();
	}// main

	// WindowListener interface�� ������ class�� ������� �ʴ�method������
	// ��� Override �ؾ� �Ѵ�.
	public class WindowImpl implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("windowOpened");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			dispose();
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// windowClosing���� dispose()�� ȣ��Ǹ� �� �� windowClosed�� ȣ��
			System.out.println("windowClosed");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("windowIconified");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("windowDeiconified");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("windowActivated");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("windowDeactivated");
		}
		
	}//inner class ����
}// class
