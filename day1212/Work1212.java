package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;

@SuppressWarnings("serial")
public class Work1212 extends Frame{
	//////////////////// ������Ʈ ���� //////////////////
	private Label lblName, lblAge, lblAddr, lblList;
	private TextField tfName, tfAge, tfAddr;
	private List list;
	private Button btnAdd, btnDel, btnChg, btnClose;
	
	public Work1212(){
		
		
		///////////////// ������Ʈ ���� ////////////////
		lblName = new Label("�̸�");
		lblAge = new Label("����");
		lblAddr = new Label("�ּ�");
		lblList = new Label("���");
		
		tfName = new TextField();
		tfAge = new TextField();
		tfAddr = new TextField();
		
		list = new List();
		
		btnAdd = new Button("�߰�");
		btnDel = new Button("����");
		btnChg = new Button("����");
		btnClose = new Button("�ݱ�");
		
		
		
		/////////////// ������Ʈ ���� /////////////////
		lblName.setBounds(50, 80, 50, 20);
		lblAge.setBounds(50, 140, 50, 20);
		lblAddr.setBounds(50, 200, 50, 20);
		lblList.setBounds(350, 50, 50, 20);
		
		tfName.setBounds(100, 80, 150, 20);
		tfAge.setBounds(100, 140, 150, 20);
		tfAddr.setBounds(100, 200, 150, 20);
		
		list.setBounds(350, 75, 200, 150);
		
		btnAdd.setBounds(125, 300, 70, 30);
		btnDel.setBounds(225, 300, 70, 30);
		btnChg.setBounds(325, 300, 70, 30);
		btnClose.setBounds(425, 300, 70, 30);
		
		
		
		////////////// ���̾ƿ� ���� (����) ////////////
		setLayout(null);
		///////////// �����ӿ� ������Ʈ �߰� ////////////
		add(lblName);
		add(lblAge);
		add(lblAddr);
		add(lblList);
		
		add(tfName);
		add(tfAge);
		add(tfAddr);
		
		add(list);

		add(btnAdd);
		add(btnDel);
		add(btnChg);
		add(btnClose);
		
		// �̺�Ʈ ���
		Work1212Evt wo1212e = new Work1212Evt(this);
		
		btnAdd.addActionListener(wo1212e);
		btnDel.addActionListener(wo1212e);
		btnChg.addActionListener(wo1212e);
		btnClose.addActionListener(wo1212e);
		list.addItemListener(wo1212e);

		// �ݱ� ����
		addWindowListener(wo1212e);
		
		
		///////////// ����ڿ��� �����ֱ� //////////////
		setBounds(600, 100, 600, 400);
		setResizable(false);
		setVisible(true);
		
		
		
	}//�⺻ ������
	
	public TextField getTfName() {
		return tfName;
	}//getTfName

	public TextField getTfAge() {
		return tfAge;
	}//getTfAge

	public TextField getTfAddr() {
		return tfAddr;
	}//getTfAddr

	public List getList() {
		return list;
	}//getList

	public Button getBtnAdd() {
		return btnAdd;
	}//getBtnAdd

	public Button getBtnDel() {
		return btnDel;
	}//getBtnDel

	public Button getBtnChg() {
		return btnChg;
	}//getBtnChg

	public Button getBtnClose() {
		return btnClose;
	}//getBtnClose

	public static void main(String[] args) {
		new Work1212();
	}//main

}//class
