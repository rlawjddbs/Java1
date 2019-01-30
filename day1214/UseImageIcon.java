package day1214;


import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *	icon class�� ����� �̹��� ���
 * @author owner
 */

@SuppressWarnings("serial")
public class UseImageIcon extends JFrame{

	public UseImageIcon() {
		super("ImageIcon ���");
		ImageIcon ii1 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/img1.png");
		ImageIcon ii2 = new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1214\\images\\img2.png");
		ImageIcon ii3 = new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1214\\images\\img3.png");
		
		JButton btn1 = new JButton("��ư1", ii1);
		JButton btn2 = new JButton("��ư2", ii2);
		JButton btn3 = new JButton("��ư3", ii3);

		//Tooltip Text ����
		btn1.setToolTipText("�ɳ�1");
		btn2.setToolTipText("�ɳ�2");
		btn3.setToolTipText("ũ��");
		
		//RollOver icon
		btn1.setRolloverIcon(ii2);
		btn2.setRolloverIcon(ii3);
		btn3.setRolloverIcon(ii1);

		//��ư �� ��ġ ����
		//������ġ ���� : LEFT, CENTER, RIGHT
		btn1.setHorizontalTextPosition(JButton.LEFT);
		btn2.setHorizontalTextPosition(JButton.CENTER);
		btn3.setHorizontalTextPosition(JButton.CENTER);
		
		//������ġ�� ���� : TOP, CENTER, BOTTOM
		btn1.setVerticalTextPosition(JButton.TOP);
		btn2.setVerticalTextPosition(JButton.CENTER);
		btn3.setVerticalTextPosition(JButton.BOTTOM);
		
		
		setLayout(new GridLayout(1, 3));
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		setBounds(100, 100, 1800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseImageIcon
		
	public static void main(String[] args) {
		new UseImageIcon();
	}//main

}//class
