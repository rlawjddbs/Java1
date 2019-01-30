package day1207;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *	Window Application �ۼ�
 * @author owner
 */
//1. Window Component ���.
@SuppressWarnings("serial")
public class HelloAWT extends Frame{
	public HelloAWT(){
		super("AWT ����"); // �θ� Ŭ����(Frame)�� �����ڸ� �ҷ��´�.
		//2. ����� �Ϲ� ������Ʈ ����.
		Label lblTitle = new Label("������ ����Ʈ ���ڼ���");
		TextArea ta = new TextArea("���ü���\n���� 1���� �ڶ�!!!!!");
		
		//3. ��ġ �����ڸ� ����Ͽ� ������Ʈ�� ��ġ.
		add("North",lblTitle); // ���ʿ� lblTitle ������Ʈ ��ġ
		add("Center",ta); // �߾ӿ� ta ������Ʈ ��ġ
		
		//4. ������ ũ�� ����
		setSize(400, 270); //px ����
		
		//5. ����ڿ��� �����ֱ�
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				//���� ������ �ν��Ͻ��� ����
				dispose();
//				System.exit(0);
			}//windowClosing
		});//addWindowListener
		
	}//HelloAWT
	public static void main(String[] args) {
		new HelloAWT();
	}//main

}//class
