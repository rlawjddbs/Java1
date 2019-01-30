package day1214;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener {

	private JButton btn1, btn2, btn3;
	private JLabel jlOutput;

	public UseJOptionPane() {
		super("JOptionPane 사용");

		btn1 = new JButton("Input Dialog");
		btn2 = new JButton("Message Dialog");
		btn3 = new JButton("Confirm Dialog");

		jlOutput = new JLabel("출력");
		jlOutput.setBorder(new TitledBorder("출력창"));

		JPanel panel = new JPanel();
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);

		add("Center", panel);
		add("South", jlOutput);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

		setBounds(100, 100, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseJOptionPane

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btn1) {
			String name = JOptionPane.showInputDialog("이름 입력", "홍길동"); // 자바스크립트 prompt()와 비슷
			jlOutput.setText(name + "님 안녕하세요?");
		} // end if
		if (ae.getSource() == btn2) {
			JOptionPane.showMessageDialog(this, "오늘은 금요일 입니다.", "요일 안내", JOptionPane.INFORMATION_MESSAGE);// 자바스크립트
																											// alert()과
																											// 비슷
//			JOptionPane.QUESTION_MESSAGE로 작성시 물음표 (?) 가 나옴
		} // end if
		if (ae.getSource() == btn3) {
			int flag = JOptionPane.showConfirmDialog(this, "점심 맛있게 드셨어요?");
			switch (flag) {
			case 0: //JOptionPane.OK_OPTION
				JOptionPane.showMessageDialog(this, "행복한 오후 되세요!");
				break;
			case 1: //JOptionPane.NO_OPTION
				String menu = JOptionPane.showInputDialog(this, "어떤 점심 메뉴였어요?");
				JOptionPane.showMessageDialog(this,  menu+"가 다 그렇죠 뭐!");
				break;
			case 2: //JOptionPane.CANCEL_OPTION
				JOptionPane.showMessageDialog(this, "하기 싫으냐?", "응?", JOptionPane.QUESTION_MESSAGE);
				break;
			}// end switch
		} // end if
	}// actionPerformed

	public static void main(String[] args) {
		new UseJOptionPane();
	}// main

}// class
