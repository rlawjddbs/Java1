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
		super("Work1210 - 2 수동배치");
		// 라벨 설정
		Label font = new Label("글꼴");
		Label style = new Label("글꼴스타일");
		Label size = new Label("크기");
		// 보기 라벨 설정
		Label view = new Label("보기");
		TextField viewPic = new TextField("AaBbYyZz");
		// 보기 라벨 미리보기 폰트크기 설정
		viewPic.setFont(new Font("SanSerif", Font.BOLD, 30));
		
		
		// 텍스트 필드 설정
		TextField fo_tf = new TextField(20);
		TextField st_tf = new TextField(20);
		TextField sz_tf = new TextField(20);
		
		
		// 버튼 설정
		Button ok = new Button("확인");
		Button cancel = new Button("취소");
		
		
		// 리스트 설정
		List fo_li = new List();
		List st_li = new List();
		List sz_li = new List();
		
		//글꼴 리스트 내용 추가
		fo_li.add("Dialog");
		fo_li.add("Serif");
		fo_li.add("SanSerif");
		fo_li.add("Monospaced");
		fo_li.add("DialogInput");

		//스타일 리스트 내용 추가
		st_li.add("일반");
		st_li.add("굵게");
		st_li.add("기울임꼴");
		st_li.add("굵게 기울임꼴");
		
		//글꼴 크기 리스트 내용 추가
		for(int i=2; i < 81; i++) {
			sz_li.add(String.valueOf(i));
			if(i<10) {
				i++;
			}//end if
		}//end for
		
		// 배치
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
		
		//Frame에 배치
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
		
		// 윈도우 크기 설정
		setSize(900, 550);
		
		//사용자에게 보여주기
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		}/*anonymous inner class*/);
		
	}//Work1210-2 기본 생성자

	public static void main(String[] args) {
		new Work1210_2();
	}// main

}// class
