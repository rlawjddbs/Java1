package day1210;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *	수동배치 : 개발자가 컴포넌트의 배치 위치와 크기를 설정하는 배치방법
 * @author owner
 */
//1. 윈도우 컴포넌트 상속
public class UseManualLayout extends Frame{

	public UseManualLayout() {
		super("수동배치");
		//1. 컴포넌트 생성
		Label lbl = new Label();
		lbl.setText("라벨"); //생성자 뿐만아니라 setText를 통해서도 내용을 설정할 수 있다.
		TextField tf = new TextField();
		Button btn = new Button("클릭");
		
		
		//2. 배치관리자 설정(해제) : BorderLaytout -> null
		setLayout(null);
		
		//3. 배치
		//컴포넌트의 좌표 크기 설정
		lbl.setLocation(10, 35);//배치 좌표
		lbl.setSize(80,20); //배치 크기
		tf.setBounds(50, 100, 120, 25); // x, y, w, h
		btn.setBounds(290, 200, 120, 23);
		
		add( lbl ); //Frame에 배치
		add( tf ); //Frame에 배치
		add( btn ); //Frame에 배치
		
		//4. 윈도우 좌표 설정
//		setLocation(100,200); // window 10의 x좌표는 0으로 설정해도 약간의 틈이 있다.
		//5. 윈도우 크기 설정
//		setSize(500, 600);
		
		//한번에 설정하기
		setBounds(200, 100, 400, 250); //x, y, w, h 순으로 한번에 설정할 수 있다.
		setResizable(false); // 크기변경을 막아주는 method
		
		//6. 사용자에게 보여주기
		setVisible(true);
		
		//7. 종료처리
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		}/*addWindowListener*/);
	}//UseManualLayout
	
	public static void main(String[] args) {
		new UseManualLayout();
	}//main
}//class
