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
		super("Work1210 - 1 자동배치");
		Label lblTitle = new Label("학 생 관 리");
		Panel panelNorth = new Panel();
		panelNorth.add(lblTitle);
		
		
		Label lblName = new Label("이름");
		TextField tfName = new TextField(20);
	
		Label lblAge = new Label("나이");
		TextField tfAge = new TextField(20);
		
		Label lblTel = new Label("전화번호");
		TextField tfTel = new TextField(20);

		Label lblGen = new Label("성별");
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox genCheck1 = new Checkbox("남자", true, cg);
		Checkbox genCheck2 = new Checkbox("여자", false, cg);
		
		TextArea ta = new TextArea();
		
		
		//Center_left position 패널 생성 (4행 2열)
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
		
		//라디오 체크박스 전용 패널 생성 (그리드 레이아웃 1행 2열)
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
		
		//Center position 패널 생성 (1행 2열)
		Panel panelCenter = new Panel(new GridLayout(1, 2));
		panelCenter.add(cl);
		panelCenter.add(cr);
		
		//South position 패널 생성 (1행 1열)
		Panel panelBottom = new Panel();
		
		Button add = new Button("추가");
		Button chg = new Button("변경");
		Button del = new Button("삭제");
		Button exit = new Button("종료");
		
		panelBottom.add(add);
		panelBottom.add(chg);
		panelBottom.add(del);
		panelBottom.add(exit);
		
		
		//배치관리자 설정
		setLayout(new BorderLayout());
		add("North", panelNorth);
		add("Center", panelCenter);
		add("South", panelBottom);
		
		// 윈도우 크기 설정
		setSize(1000, 600);
		
		//사용자에게 보여주기
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		}/*anonymous inner class*/);
		
	////////////////////////////////////////////////////////////////////////////////////////
	}//Work1210 기본 생성자

	public static void main(String[] args) {
		new Work1210();
	}// main

}// class
