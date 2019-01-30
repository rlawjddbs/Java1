package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//1. 윈도우 컴포넌트를 상속
@SuppressWarnings("serial")
public class CompareEvent extends Frame {
	
	//2. 이벤트 처리 관련 컴포넌트를 객체화
	private Button btn1;
	private Button btn2;

	public CompareEvent() {
		super("이벤트 비교해보기");
		//3. 컴포넌트 생성
		btn1 = new Button("A");
		btn2 = new Button("B");
		//4. 배치
		Panel panel = new Panel(new GridLayout(1,2));
		panel.add(btn1);
		panel.add(btn2);
		
		add("Center", panel);
		
		//5. 이벤트 등록
		//Inner Class 생성.
//		CompareEvent.ActionImpl1 ai1 = this.new ActionImpl1();
//		CompareEvent.ActionImpl2 ai2 = this.new ActionImpl2();
//		btn1.addActionListener(ai1);
//		btn2.addActionListener(ai2);
	
		//6. 윈도우 좌표, 크기 설정
		setBounds(100, 100, 300, 300);
		
		//7. 사용자에게 보여주기
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		
		
	}//기본 생성자
	
	//5-1. Inner Class로 이벤트 처리 리스너 구현
//			public class ActionImpl1 implements ActionListener {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("ㅋㅋㅋ");
//				}
//			}//class
//			public class ActionImpl2 implements ActionListener {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("^o^");
//				}
//			}//class
	
	public static void main(String[] args) {
		new CompareEvent();
	}//main

}//class
