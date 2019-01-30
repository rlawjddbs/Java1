package day1210;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *	FlowLayout과 Component의 사용
 * @author owner
 */
//1. Window Component 상속
public class UseFlowLayout extends Frame {

	public UseFlowLayout() {
		super("FlowLayout 연습");
		//2. 일반 컴포넌트의 생성
		Label lblName = new Label("이름");
		TextField tfName = new TextField(10); //보여줄 글자 수 10자 (10이라고 하는게 글자마다 조금씩 보여지는 개수가 다를 수 있음, 보통 대문자 A를 기준으로 셈)
		Button btn = new Button("입력");
		List list = new List();
		list.add("정택성");
		list.add("이재현");
		list.add("김정운");
		list.add("김정윤");
		list.add("이재찬");

		Checkbox cb1 = new Checkbox("등산", false);
		Checkbox cb2 = new Checkbox("댄스", false);
		Checkbox cb3 = new Checkbox("게임", false);
		
		CheckboxGroup cg = new CheckboxGroup();
		//CheckboxGroup을 설정하면 Radio Button이 생성된다.
		Checkbox rb1 = new Checkbox("남자", true, cg);
		Checkbox rb2 = new Checkbox("여자", true, cg);
		
		//3. Layout 변경 : 기본값 BorderLayout -> FlowLayout 으로 변경된다.
		setLayout(new FlowLayout());
		
		//4. 일반 컴포넌트 배치
		add(lblName);	
		add(tfName);
		add(btn);
		add(list);
		add(cb1);
		add(cb2);
		add(cb3);
		add(rb1);
		add(rb2);
		
		//5. 윈도우 크기 설정
		setSize(400, 400);
		
		//6. 사용자에게 보여주기
		setVisible(true);
		
		//윈도우 종료 이벤트 처리
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		}/*anonymous inner class*/);
		
		
		
		
		
		
	}//UseFlowLayout
	
	public static void main(String[] args) {
		new UseFlowLayout();
	}//main

}//class
