package day1214;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author owner
 */
@SuppressWarnings("serial")
public class UseJScrollPane extends JFrame {

	public UseJScrollPane() {
		super("��ũ�� �ٰ� ���� ��ü");
		JTextArea jta = new JTextArea();
		//JTextArea�� �ۼ��� ���� J.T.A�� ���� �����ϸ� �� ����
		jta.setLineWrap(true);
		//���� ����Ǹ� �ܾ ��ȣ�ϸ鼭 ���� ����.(�ѱ��� �� ��... ��)
		jta.setWrapStyleWord(true);
		
		//JTextArea�� ScrollBar ����
		//1. JScrollPane ����
		JScrollPane jsp = new JScrollPane(jta);
		
		//2. ��ġ
//		add("Center", jta);
		// JTextArea�� ���Ե� JScrollBar�� JFrame�� �߰��ؾ� ��ũ�ѹٰ� ��Ÿ����.
		add("Center",jsp);
		
		
		setBounds(100, 100, 300, 400);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseJScrollPane
	
	public static void main(String[] args) {
		new UseJScrollPane();
	}//main

}//class
