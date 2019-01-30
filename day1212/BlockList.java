package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;

/**
 *	Has a ����� Event ó��
 * @author owner
 */
@SuppressWarnings("serial")
public class BlockList extends Frame {
//	��2�� ����Ʈ2�� ��ư2��
	private Label lblL;
	private Label lblR;
	
	private List listL;
	private List listR;
	
	private Button btnL;
	private Button btnR;
	
	private TextField tf;
	public BlockList() {
		super("���� ����");
		setLayout(null);
		
		
		lblL = new Label("ģ�� ���");
		lblR = new Label("���ܵ� ģ��");
		lblL.setBounds(50, 50, 80, 30);
		lblR.setBounds(200, 50, 80, 30);
		
		btnR = new Button(">>");
		btnL = new Button("<<");
		btnR.setBounds(145, 150, 40,20);
		btnL.setBounds(145, 190, 40,20);
		
		listL = new List();
		listL.setBounds(50, 80, 80, 200);
		listL.add("������");
		listL.add("������");
		listL.add("���ü�");
		
		listR = new List();
		listR.setBounds(200, 80, 80, 200);
		
		tf = new TextField();
		tf.setBounds(120, 300, 100, 20);
		//�̺�Ʈ �߰�
		HasAEventHandling heh = new HasAEventHandling(this);
		btnL.addActionListener(heh);
		btnR.addActionListener(heh);
		listL.addItemListener(heh);
		listR.addItemListener(heh);
		tf.addActionListener(heh);
		
		addWindowListener(heh);
		
		add(lblL);
		add(lblR);
		add(btnL);
		add(btnR);
		add(listL);
		add(listR);
		add(tf);
		setBounds(200, 200, 330, 350);
		
		setVisible(true);
		
		
	}//�⺻ ������
	
	public List getListL() {
		return listL;
	}
	public List getListR() {
		return listR;
	}

	public Button getBtnL() {
		return btnL;
	}
	public Button getBtnR() {
		return btnR;
	}
	public TextField getTf() {
		return tf;
	}
	
	
	public static void main(String[] args) {
		new BlockList();
	}//main

}//class
