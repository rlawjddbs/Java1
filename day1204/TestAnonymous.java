package day1204;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


@SuppressWarnings("serial")
public class TestAnonymous extends Frame{

	public TestAnonymous() {
		super("Anonymous innerclass����");
		Button btn = new Button("Ŭ��");
		add(btn);
		setSize(300, 300);
		setVisible(true);
		//anonymous inner class�� ������ ���� �̺�Ʈ�� ó��.
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		
	}//TestAnonymous
	
	public static void main(String[] args) {
		new TestAnonymous();
	}

}
