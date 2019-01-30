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
 *	log���� �м���â���� �� ���� ��ư �� �ϳ��� Ŭ������ �� �߻��� �̺�Ʈ�� ó���ϴ� ��.
 * @author zeongyun
 */
public class SistGetLogMainEvt implements ActionListener {

	private SistGetLoginMain sglm;
	private GetLogMainView glmv;
	// jbReport ��ư�� �ѹ��̶� jbView ��ư�� Ŭ���Ǿ�� ����� �� �����Ƿ�
	// boolean ������ Ÿ���� ���� flagView�� �����Ѵ�.
	private boolean flagView;
	
	public SistGetLogMainEvt(SistGetLoginMain sglm) {
		this.sglm = sglm;
		flagView = false;
	}// SistGetLogMainEvt

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == sglm.getJbReport()) {
			if (flagView) {
				System.out.println("����Ʈ ��ư ����");
			}//end if
		}//end if
		if(ae.getSource() == sglm.getJbView()) {
				viewLogFile();
				flagView = true;
		}//end if
		
	}// actionPerfomred

	public void viewLogFile(){
		FileDialog fdOpenLog = new FileDialog(glmv, "log���� ����", FileDialog.LOAD);
		fdOpenLog.setVisible(true);
		
		String filePath = fdOpenLog.getDirectory();
		String fileName = fdOpenLog.getFile();
		
		if (filePath != null && fileName.endsWith(".log")) {
			new GetLogMainView(sglm, filePath, fileName);
		} else {
			JOptionPane.showMessageDialog(sglm, fileName +"��(��) log������ �ƴմϴ�.", "Error", JOptionPane.ERROR_MESSAGE);
		}//end else
		
	}//viewLogFile
	
} // SistGetLogMainEvt