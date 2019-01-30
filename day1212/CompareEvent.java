package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//1. ������ ������Ʈ�� ���
@SuppressWarnings("serial")
public class CompareEvent extends Frame {
	
	//2. �̺�Ʈ ó�� ���� ������Ʈ�� ��üȭ
	private Button btn1;
	private Button btn2;

	public CompareEvent() {
		super("�̺�Ʈ ���غ���");
		//3. ������Ʈ ����
		btn1 = new Button("A");
		btn2 = new Button("B");
		//4. ��ġ
		Panel panel = new Panel(new GridLayout(1,2));
		panel.add(btn1);
		panel.add(btn2);
		
		add("Center", panel);
		
		//5. �̺�Ʈ ���
		//Inner Class ����.
//		CompareEvent.ActionImpl1 ai1 = this.new ActionImpl1();
//		CompareEvent.ActionImpl2 ai2 = this.new ActionImpl2();
//		btn1.addActionListener(ai1);
//		btn2.addActionListener(ai2);
	
		//6. ������ ��ǥ, ũ�� ����
		setBounds(100, 100, 300, 300);
		
		//7. ����ڿ��� �����ֱ�
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		
		
	}//�⺻ ������
	
	//5-1. Inner Class�� �̺�Ʈ ó�� ������ ����
//			public class ActionImpl1 implements ActionListener {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("������");
//				}
//			}//class
//			public class ActionImpl2 implements ActionListener {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("^o^");
//				}
//			}//class
	
	public static void main(String[] args) {
		new CompareEvent();
	}//main

}//class
