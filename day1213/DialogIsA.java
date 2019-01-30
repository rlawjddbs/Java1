package day1213;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
//1. Dialog ���
public class DialogIsA extends Dialog implements ActionListener {
	//2. �̺�Ʈ�� �����ִ� ������Ʈ�� ����
	private Button btn;
	
	//���� ���̾�α��� �θ𰡵� ��ü�� has a ����
	DialogIsA(UseDialogIsA uda){ 
		super(uda, "���̾�α�", true); //���̾�α��� �θ�� ��ü uda�ڽ�(=FrameŬ����(��ӹ���)), ���̾�α��� Ÿ��Ʋ�� "���̾�α�", �������
		
		// ������Ʈ ����
		Label lbl = new Label("������ ������Դϴ�.");
		
		btn = new Button("����");
		
		add("Center",lbl); //Dialog�� ��ġ
		add("South", btn);
		
		//���̾�α��� ��ư Ŭ���� �̺�Ʈ �߰�
		btn.addActionListener(this);
		
		//���̾�α��� X��ư Ŭ���� �ݱ�
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); // �� Ŭ������ Dialog�� dispose() �� �ȴ�.
			}//windowClosing
		}/*anonymous inner class*/);
		
		//���̾�α��� ��ġ�� �θ������� ���ʿ��� ����
		System.out.println("�θ� x : "+uda.getX()+"�θ��� y : "+uda.getY());
		setBounds(uda.getX()+70, uda.getY()+70, 300, 300);
		setVisible(true);

		
	}//DialogIsA ���ڰ� �ִ� ������

	@Override
	public void actionPerformed(ActionEvent e) {
		//���̾�α��� "�ݱ�" btn Ŭ���� �̺�Ʈ
		dispose();
	}//actionPerformed

}//class
