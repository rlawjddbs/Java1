package kr.co.sist.log.view;


import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import kr.co.sist.log.evt.GetLogMainViewEvt;


@SuppressWarnings("serial")
public class GetLogMainView extends JDialog {
	
	private SistGetLoginMain sglm;
	private String filePath, fileName;
	private JTextArea jtaView1, jtaView2, jtaView3, jtaView4, jtaView5, jtaView6;
	public GetLogMainView() {
				
				
//				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//GetLogMainView

	public GetLogMainView(SistGetLoginMain sglm, String filePath, String fileName) {
		super(sglm, "View", true);
		
		//������Ʈ ����
		jtaView1 = new JTextArea();
		jtaView2 = new JTextArea();
		jtaView3 = new JTextArea();
		jtaView4 = new JTextArea();
		jtaView5 = new JTextArea();
		jtaView6 = new JTextArea();
		
		// JTA ���� ����
		jtaView1.setEditable(false);
		jtaView2.setEditable(false);
		jtaView3.setEditable(false);
		jtaView4.setEditable(false);
		jtaView5.setEditable(false);
		jtaView6.setEditable(false);
		
		//Titled Border ����
		jtaView1.setBorder(new TitledBorder("�ִ� ��� Ű�� �̸�/Ƚ��"));
		jtaView2.setBorder(new TitledBorder("�������� ���� Ƚ��/����"));
		jtaView3.setBorder(new TitledBorder("���� ���� Ƚ��/���� Ƚ��"));
		jtaView4.setBorder(new TitledBorder("��û�� ���� ���� �ð�"));
		jtaView5.setBorder(new TitledBorder("���������� ��û�� �߻��� Ƚ��/����"));
		jtaView6.setBorder(new TitledBorder("1000~1500��xxxxxxxx° ������ �ִ� ��� Ű�� �̸�/Ƚ��"));
		

		//log������ �м�,�����ϱ� ���� �̺�Ʈ ��ü ����
		GetLogMainViewEvt glmve = new GetLogMainViewEvt(this, filePath, fileName);
		
		
		//���̾ƿ� �� ��ġ
		setLayout(new GridLayout(6,1));
		add(jtaView1);
		add(jtaView2);
		add(jtaView3);
		add(jtaView4);
		add(jtaView5);
		add(jtaView6);
		
		//��ǥ �� ũ��
		setBounds(sglm.getX()+50, sglm.getY()+50, 300, 600);
		//����ȭ
		setVisible(true);
		

		
	}// GetLogMainView

	public JTextArea getJtaView1() {
		return jtaView1;
	}// getJtaView1

	public JTextArea getJtaView2() {
		return jtaView2;
	}// getJtaView2

	public JTextArea getJtaView3() {
		return jtaView3;
	}// getJtaView3

	public JTextArea getJtaView4() {
		return jtaView4;
	}// getJtaView4

	public JTextArea getJtaView5() {
		return jtaView5;
	}// getJtaView5

	public JTextArea getJtaView6() {
		return jtaView6;
	}// getJtaView6

}// class