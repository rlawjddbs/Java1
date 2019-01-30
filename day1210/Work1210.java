package day1210;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Work1210 extends Frame {

	public Work1210() {
		super("Work1210 - 1 �ڵ���ġ");
		Label lblTitle = new Label("�� �� �� ��");
		Panel panelNorth = new Panel();
		panelNorth.add(lblTitle);
		
		
		Label lblName = new Label("�̸�");
		TextField tfName = new TextField(20);
	
		Label lblAge = new Label("����");
		TextField tfAge = new TextField(20);
		
		Label lblTel = new Label("��ȭ��ȣ");
		TextField tfTel = new TextField(20);

		Label lblGen = new Label("����");
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox genCheck1 = new Checkbox("����", true, cg);
		Checkbox genCheck2 = new Checkbox("����", false, cg);
		
		TextArea ta = new TextArea();
		
		
		//Center_left position �г� ���� (4�� 2��)
		Panel cl = new Panel(new GridLayout(4, 2));
		Panel np1 = new Panel();
		Panel np2 = new Panel();
		Panel ap1 = new Panel();
		Panel ap2 = new Panel();
		Panel tp1 = new Panel();
		Panel tp2 = new Panel();
		Panel cp1 = new Panel();
		Panel cp2 = new Panel();
		
		np1.add(lblName);
		np2.add(tfName);
		cl.add(np1);
		cl.add(np2);

		ap1.add(lblAge);
		ap2.add(tfAge);
		cl.add(ap1);
		cl.add(ap2);
		
		tp1.add(lblTel);
		tp2.add(tfTel);
		cl.add(tp1);
		cl.add(tp2);
		
		//���� üũ�ڽ� ���� �г� ���� (�׸��� ���̾ƿ� 1�� 2��)
				Panel genPanel = new Panel(new GridLayout(1,2));
				genPanel.add(genCheck1);
				genPanel.add(genCheck2);
		
		cp1.add(lblGen);
		cp2.add(genPanel);
		cl.add(cp1);
		cl.add(cp2);
		
		cl.add(ta);

		Panel cr = new Panel();
		cr.add(ta);
		
		//Center position �г� ���� (1�� 2��)
		Panel panelCenter = new Panel(new GridLayout(1, 2));
		panelCenter.add(cl);
		panelCenter.add(cr);
		
		//South position �г� ���� (1�� 1��)
		Panel panelBottom = new Panel();
		
		Button add = new Button("�߰�");
		Button chg = new Button("����");
		Button del = new Button("����");
		Button exit = new Button("����");
		
		panelBottom.add(add);
		panelBottom.add(chg);
		panelBottom.add(del);
		panelBottom.add(exit);
		
		
		//��ġ������ ����
		setLayout(new BorderLayout());
		add("North", panelNorth);
		add("Center", panelCenter);
		add("South", panelBottom);
		
		// ������ ũ�� ����
		setSize(1000, 600);
		
		//����ڿ��� �����ֱ�
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		}/*anonymous inner class*/);
		
	////////////////////////////////////////////////////////////////////////////////////////
	}//Work1210 �⺻ ������

	public static void main(String[] args) {
		new Work1210();
	}// main

}// class
