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
		
		//컴포넌트 생성
		jtaView1 = new JTextArea();
		jtaView2 = new JTextArea();
		jtaView3 = new JTextArea();
		jtaView4 = new JTextArea();
		jtaView5 = new JTextArea();
		jtaView6 = new JTextArea();
		
		// JTA 편집 방지
		jtaView1.setEditable(false);
		jtaView2.setEditable(false);
		jtaView3.setEditable(false);
		jtaView4.setEditable(false);
		jtaView5.setEditable(false);
		jtaView6.setEditable(false);
		
		//Titled Border 설정
		jtaView1.setBorder(new TitledBorder("최다 사용 키의 이름/횟수"));
		jtaView2.setBorder(new TitledBorder("브라우저별 접속 횟수/비율"));
		jtaView3.setBorder(new TitledBorder("서비스 성공 횟수/실패 횟수"));
		jtaView4.setBorder(new TitledBorder("요청이 가장 많은 시간"));
		jtaView5.setBorder(new TitledBorder("비정상적인 요청이 발생한 횟수/비율"));
		jtaView6.setBorder(new TitledBorder("1000~1500번xxxxxxxx째 라인의 최다 사용 키의 이름/횟수"));
		

		//log파일을 분석,정리하기 위해 이벤트 객체 생성
		GetLogMainViewEvt glmve = new GetLogMainViewEvt(this, filePath, fileName);
		
		
		//레이아웃 및 배치
		setLayout(new GridLayout(6,1));
		add(jtaView1);
		add(jtaView2);
		add(jtaView3);
		add(jtaView4);
		add(jtaView5);
		add(jtaView6);
		
		//좌표 및 크기
		setBounds(sglm.getX()+50, sglm.getY()+50, 300, 600);
		//가시화
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