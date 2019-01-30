package day1211;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ActionEvent�� ����� Is a ����� �̺�Ʈ�� ó���ϴ� ��� �����ΰ� �̺�Ʈ ó���� �ϳ��� Ŭ�����ȿ��� ó���Ѵ�. (���� ����
 * ����� ���ϴ�.)
 * �������̽� : abstract method�� ����� �����ϴ� ����
 * 
 * @author owner
 */
//1. ������� Frame�� ó���ϰ�, �������� �̺�Ʈ ó�� ��ü�� ó���Ѵ�.
@SuppressWarnings("serial")
public class EventHandlingIsA extends Frame implements ActionListener {

	// 2. �̺�Ʈ ó���� ������ �ִ� ������Ʈ�� ����
	private Button btn;

	public EventHandlingIsA() {
		super("Is a ����� �̺�Ʈ ó���ϴ� ���");

		// 3. ������Ʈ ����
		btn = new Button("Ŭ��");
		// 4. ������ ������Ʈ�� �̺�Ʈ�� �߻���ų �� �ֵ��� �̺�Ʈ�� ���
		btn.addActionListener(this);
		// Arguments�� �Էµ� ��ü�� Override��
		// method�� ȣ��ȴ�.
		Panel panel = new Panel();
		panel.add(btn);

		// 5. ������ ������Ʈ�� ��ġ
		add("Center", panel);

		// 6. ������ ������Ʈ�� ũ�⸦ ����
		setBounds(100, 100, 300, 300);

		// 7. ����ڿ��� �����ֱ�
		setVisible(true);

	}// EventHandlingIsA

	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("��ư Ŭ���Ǿ����ϴ�.");
		dispose();
	}// actionPerformed
	
	public static void main(String[] args) {
		new EventHandlingIsA();
	}// main

}// class
