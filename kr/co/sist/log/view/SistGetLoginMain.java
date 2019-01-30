package kr.co.sist.log.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import kr.co.sist.log.evt.SistGetLogMainEvt;

/**
 *	관리자만이 열람할 수 있는 창을 보여주는 SistGetLoginMain 클래스는 log파일을 직접찾거나,<br>
 *	열람한 통계 자료를 data 파일로 export할 수 있는 두 가지 기능을 갖춘 창을 꾸며주는 일을 한다.
 * @author zeongyun
 */
@SuppressWarnings("serial")
public class SistGetLoginMain extends JFrame{
	
	// 관리자가 조작할 수 있는 컴포넌트는 두 가지의 JButton으로 구성되며,
	// 이를 선언한다.
	private JButton jbView, jbReport;

	public SistGetLoginMain(){
		super("log파일 분석기");
		
		//컴포넌트 생성
		jbView = new JButton("log파일 열기");
		jbReport = new JButton("Report파일 만들기");
		
		//이벤트 등록
		SistGetLogMainEvt sglme = new SistGetLogMainEvt(this);
		jbView.addActionListener(sglme);
		jbReport.addActionListener(sglme);
		
		//레이아웃 설정
		setLayout(new GridLayout(1,2));
		add(jbView);
		add(jbReport);

		//좌표 및 크기
		setBounds(100, 100, 300, 200);
		//가시화
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//SistGetLoginMain
	
	public JButton getJbView() {
		return jbView;
	}//getJbview

	public JButton getJbReport() {
		return jbReport;
	}//getJbReport

}//class