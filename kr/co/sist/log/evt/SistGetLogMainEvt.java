package kr.co.sist.log.evt;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

import kr.co.sist.log.view.GetLogMainView;
import kr.co.sist.log.view.SistGetLoginMain;

/**
 *	log파일 분석기창에서 두 가지 버튼 중 하나를 클릭했을 때 발생할 이벤트를 처리하는 일.
 * @author zeongyun
 */
public class SistGetLogMainEvt implements ActionListener {

	private SistGetLoginMain sglm;
	private GetLogMainView glmv;
	// jbReport 버튼은 한번이라도 jbView 버튼이 클릭되어야 실행될 수 있으므로
	// boolean 데이터 타입의 변수 flagView를 선언한다.
	private boolean flagView;
	
	public SistGetLogMainEvt(SistGetLoginMain sglm) {
		this.sglm = sglm;
		flagView = false;
	}// SistGetLogMainEvt

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == sglm.getJbReport()) {
			if (flagView) {
				System.out.println("리포트 버튼 눌림");
			}//end if
		}//end if
		if(ae.getSource() == sglm.getJbView()) {
				viewLogFile();
				flagView = true;
		}//end if
		
	}// actionPerfomred

	public void viewLogFile(){
		FileDialog fdOpenLog = new FileDialog(glmv, "log파일 열기", FileDialog.LOAD);
		fdOpenLog.setVisible(true);
		
		String filePath = fdOpenLog.getDirectory();
		String fileName = fdOpenLog.getFile();
		
		if (filePath != null && fileName.endsWith(".log")) {
			new GetLogMainView(sglm, filePath, fileName);
		} else {
			JOptionPane.showMessageDialog(sglm, fileName +"은(는) log파일이 아닙니다.", "Error", JOptionPane.ERROR_MESSAGE);
		}//end else
		
	}//viewLogFile
	
} // SistGetLogMainEvt