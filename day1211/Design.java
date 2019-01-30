package day1211;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

/**
 *	has a ������ �̺�Ʈ ó��<br>
 *	�����ΰ� �̺�Ʈó�� �ڵ带 �и��Ͽ� �ڵ��� ���⵵�� ���� �� �ִ�.
 * @author owner
 */
@SuppressWarnings("serial")
//1. ������ ������Ʈ ��ӹޱ�
public class Design extends Frame{
	//2. �̺�Ʈó���� �����ִ� Component�� ����
	private Button btn;
	
	public Design() {
		super("������");
		//3. ������Ʈ ����
		btn = new Button("Ŭ��");
		
		//4. ��ġ
		Panel panel = new Panel();
		panel.add(btn);
		
		add("Center",panel);
		//5. �̺�Ʈ ���
		//�̺�Ʈ ó�� ��ü �����ϰ� has a ����.
		EventHandlingHasA ehha = new EventHandlingHasA( this );
		System.out.println("������ ������ ��ü " + this);
		//������Ʈ�� �̺�Ʈ�� ���
		btn.addActionListener(ehha); //��ư���� �̺�Ʈ�� �߻��ϸ� ehha ��ü�� Override�� method���� �̺�Ʈ�� ó��
		
		//6. ������ ũ�� ����
		setBounds(100,100,400,300);
		//7. ����ڿ��� �����ֱ�
		setVisible(true);
		
		
	}//Design
	
	public Button getBtn() {
		return btn;
	}//getBtn
	
	public static void main(String[] args) {
		new Design();
	}//main

}//class
