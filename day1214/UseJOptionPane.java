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
		super("JOptionPane ���");

		btn1 = new JButton("Input Dialog");
		btn2 = new JButton("Message Dialog");
		btn3 = new JButton("Confirm Dialog");

		jlOutput = new JLabel("���");
		jlOutput.setBorder(new TitledBorder("���â"));

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
			String name = JOptionPane.showInputDialog("�̸� �Է�", "ȫ�浿"); // �ڹٽ�ũ��Ʈ prompt()�� ���
			jlOutput.setText(name + "�� �ȳ��ϼ���?");
		} // end if
		if (ae.getSource() == btn2) {
			JOptionPane.showMessageDialog(this, "������ �ݿ��� �Դϴ�.", "���� �ȳ�", JOptionPane.INFORMATION_MESSAGE);// �ڹٽ�ũ��Ʈ
																											// alert()��
																											// ���
//			JOptionPane.QUESTION_MESSAGE�� �ۼ��� ����ǥ (?) �� ����
		} // end if
		if (ae.getSource() == btn3) {
			int flag = JOptionPane.showConfirmDialog(this, "���� ���ְ� ��̾��?");
			switch (flag) {
			case 0: //JOptionPane.OK_OPTION
				JOptionPane.showMessageDialog(this, "�ູ�� ���� �Ǽ���!");
				break;
			case 1: //JOptionPane.NO_OPTION
				String menu = JOptionPane.showInputDialog(this, "� ���� �޴������?");
				JOptionPane.showMessageDialog(this,  menu+"�� �� �׷��� ��!");
				break;
			case 2: //JOptionPane.CANCEL_OPTION
				JOptionPane.showMessageDialog(this, "�ϱ� ������?", "��?", JOptionPane.QUESTION_MESSAGE);
				break;
			}// end switch
		} // end if
	}// actionPerformed

	public static void main(String[] args) {
		new UseJOptionPane();
	}// main

}// class
