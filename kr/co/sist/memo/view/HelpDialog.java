package kr.co.sist.memo.view;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.TextArea;

import kr.co.sist.memo.evt.HelpDialogEvt;


@SuppressWarnings("serial")
public class HelpDialog extends Dialog{
	
	private JavaMemo jm;
	private TextArea ta;
	private Button btnOk;
	
	public HelpDialog(JavaMemo jm) {
		super(jm, "메모장 정보", true);
		this.jm = jm;
		
		setLayout(null);
		
		ta = new TextArea("메모장정보");
		ta.append("\n\n이 메모장은 Java로 만들어졌으며,");
		ta.append("\n누구나 코드 수정 및 배포를 할 수 있습니다.");
		ta.append("\n단, 이 코드를 사용하여 개선했을 때에는");
		ta.append("\n소스 공개를 원칙으로 합니다. GNU");
		ta.append("\n\n작성자 : 4강의실 2조(박영민, 박소영, 김정윤, 이지수, 김희철)와");
		ta.append("\n곽우신 선생님");
		ta.append("\n\n- Version : 1.0");
		ta.setFont(new Font("Dialog", 0, 12));
		// ta 편집 불가 설정
		ta.setEditable(false);
		// ta 위치 및 크기 설정
		ta.setBounds(25, 50, 450, 200);
		
		btnOk = new Button("확인");
		btnOk.setBounds(225, 255, 50, 30);
		
		HelpDialogEvt hde = new HelpDialogEvt(this);
		btnOk.addActionListener(hde);
		
		addWindowListener(hde);
		
		add(ta);
		add(btnOk);
		
		setBounds(jm.getX()+50, jm.getY()+80, 500, 300);
		setVisible(true);
		
		 
		
	}//HelpDialog
	
}//class
