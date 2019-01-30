package day1210;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *	������ġ : �����ڰ� ������Ʈ�� ��ġ ��ġ�� ũ�⸦ �����ϴ� ��ġ���
 * @author owner
 */
//1. ������ ������Ʈ ���
public class UseManualLayout extends Frame{

	public UseManualLayout() {
		super("������ġ");
		//1. ������Ʈ ����
		Label lbl = new Label();
		lbl.setText("��"); //������ �Ӹ��ƴ϶� setText�� ���ؼ��� ������ ������ �� �ִ�.
		TextField tf = new TextField();
		Button btn = new Button("Ŭ��");
		
		
		//2. ��ġ������ ����(����) : BorderLaytout -> null
		setLayout(null);
		
		//3. ��ġ
		//������Ʈ�� ��ǥ ũ�� ����
		lbl.setLocation(10, 35);//��ġ ��ǥ
		lbl.setSize(80,20); //��ġ ũ��
		tf.setBounds(50, 100, 120, 25); // x, y, w, h
		btn.setBounds(290, 200, 120, 23);
		
		add( lbl ); //Frame�� ��ġ
		add( tf ); //Frame�� ��ġ
		add( btn ); //Frame�� ��ġ
		
		//4. ������ ��ǥ ����
//		setLocation(100,200); // window 10�� x��ǥ�� 0���� �����ص� �ణ�� ƴ�� �ִ�.
		//5. ������ ũ�� ����
//		setSize(500, 600);
		
		//�ѹ��� �����ϱ�
		setBounds(200, 100, 400, 250); //x, y, w, h ������ �ѹ��� ������ �� �ִ�.
		setResizable(false); // ũ�⺯���� �����ִ� method
		
		//6. ����ڿ��� �����ֱ�
		setVisible(true);
		
		//7. ����ó��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		}/*addWindowListener*/);
	}//UseManualLayout
	
	public static void main(String[] args) {
		new UseManualLayout();
	}//main
}//class
