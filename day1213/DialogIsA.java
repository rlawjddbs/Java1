package day1213;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
//1. Dialog 상속
public class DialogIsA extends Dialog implements ActionListener {
	//2. 이벤트와 관련있는 컴포넌트를 선언
	private Button btn;
	
	//현재 다이얼로그의 부모가될 객체와 has a 관계
	DialogIsA(UseDialogIsA uda){ 
		super(uda, "다이얼로그", true); //다이얼로그의 부모는 객체 uda자신(=Frame클래스(상속받음)), 다이얼로그의 타이틀은 "다이얼로그", 모달적용
		
		// 컴포넌트 생성
		Label lbl = new Label("오늘은 목요일입니다.");
		
		btn = new Button("종료");
		
		add("Center",lbl); //Dialog에 배치
		add("South", btn);
		
		//다이얼로그의 버튼 클릭시 이벤트 추가
		btn.addActionListener(this);
		
		//다이얼로그의 X버튼 클릭시 닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); // 본 클래스는 Dialog의 dispose() 가 된다.
			}//windowClosing
		}/*anonymous inner class*/);
		
		//다이얼로그의 위치를 부모프레임 안쪽에서 띄우기
		System.out.println("부모 x : "+uda.getX()+"부모의 y : "+uda.getY());
		setBounds(uda.getX()+70, uda.getY()+70, 300, 300);
		setVisible(true);

		
	}//DialogIsA 인자가 있는 생성자

	@Override
	public void actionPerformed(ActionEvent e) {
		//다이얼로그의 "닫기" btn 클릭시 이벤트
		dispose();
	}//actionPerformed

}//class
