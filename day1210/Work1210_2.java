package day1210;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


@SuppressWarnings("serial")
public class Work1210_2 extends Frame {

	public Work1210_2() {
		super("Work1210 - 2 ������ġ");
		// �� ����
		Label font = new Label("�۲�");
		Label style = new Label("�۲ý�Ÿ��");
		Label size = new Label("ũ��");
		// ���� �� ����
		Label view = new Label("����");
		TextField viewPic = new TextField("AaBbYyZz");
		// ���� �� �̸����� ��Ʈũ�� ����
		viewPic.setFont(new Font("SanSerif", Font.BOLD, 30));
		
		
		// �ؽ�Ʈ �ʵ� ����
		TextField fo_tf = new TextField(20);
		TextField st_tf = new TextField(20);
		TextField sz_tf = new TextField(20);
		
		
		// ��ư ����
		Button ok = new Button("Ȯ��");
		Button cancel = new Button("���");
		
		
		// ����Ʈ ����
		List fo_li = new List();
		List st_li = new List();
		List sz_li = new List();
		
		//�۲� ����Ʈ ���� �߰�
		fo_li.add("Dialog");
		fo_li.add("Serif");
		fo_li.add("SanSerif");
		fo_li.add("Monospaced");
		fo_li.add("DialogInput");

		//��Ÿ�� ����Ʈ ���� �߰�
		st_li.add("�Ϲ�");
		st_li.add("����");
		st_li.add("����Ӳ�");
		st_li.add("���� ����Ӳ�");
		
		//�۲� ũ�� ����Ʈ ���� �߰�
		for(int i=2; i < 81; i++) {
			sz_li.add(String.valueOf(i));
			if(i<10) {
				i++;
			}//end if
		}//end for
		
		// ��ġ
		setLayout(null);
		font.setBounds(150, 80, 100, 30);
		style.setBounds(400, 80, 100, 30);
		size.setBounds(650, 80, 100, 30);
		view.setBounds(400, 300, 100, 30);
		viewPic.setBounds(400, 350, 150, 60);
		
		fo_li.setBounds(150, 110, 150, 100);
		st_li.setBounds(400, 110, 150, 100);
		sz_li.setBounds(650, 110, 150, 100);;
		
		ok.setBounds(705, 450, 50, 20);
		cancel.setBounds(760, 450, 50, 20);
		
		//Frame�� ��ġ
		add(font);
		add(style);
		add(size);
		add(fo_li);
		add(st_li);
		add(sz_li);
		add(view);
		add(viewPic);
		add(ok);
		add(cancel);
		
		// ������ ũ�� ����
		setSize(900, 550);
		
		//����ڿ��� �����ֱ�
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		}/*anonymous inner class*/);
		
	}//Work1210-2 �⺻ ������

	public static void main(String[] args) {
		new Work1210_2();
	}// main

}// class
