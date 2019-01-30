package day1213;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Frame클래스에서 Is a 관계로 생성된 Dialog클래스를 사용
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseDialogIsA extends Frame implements ActionListener {

	private Button btn1/* Frame에 배치 */, btn2/* Dialog에 배치 */;
	private Dialog d;
	
	
	public UseDialogIsA() {
		super("다이얼로그 사용");

		btn1 = new Button("다이얼로그 사용");
		Panel panel = new Panel();
		panel.add(btn1);

		add("Center", panel);

		btn1.addActionListener(this);

		setBounds(100, 100, 300, 400);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent ae) {
				dispose();
			}// windowClosing
		});

		
	}// UseDialogHasA 기본 생성자

	@Override
	public void actionPerformed(ActionEvent ae) {
		createDialog();
	}// actionPerformed

	public void createDialog() {
		new DialogIsA(this);
	}// createDialog

	public static void main(String[] args) {
		new UseDialogIsA();
	}// main

}// class
