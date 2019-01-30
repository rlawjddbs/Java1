package kr.co.sist.memo.evt;

import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import kr.co.sist.memo.view.HelpDialog;
import kr.co.sist.memo.view.JavaMemo;
import kr.co.sist.memo.view.MemoFormat;

public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private JavaMemo jm;
	private String taNoteData; // TextArea�� ������ ������ ����
	private String openPath; // ������ ���ϸ��� ����

	public JavaMemoEvt(JavaMemo jm) {
		this.jm = jm;
		taNoteData = ""; // TextArea�� ������ ������ ����
		openPath = "";
	}// JavaMemoEvt

	@Override
	public void windowClosing(WindowEvent e) {
		jm.dispose();
	}// windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		// miNew, miOpen, miSave, miNewSave,
		// miEnd, miFormat, miHelp

		// ���� �޴� �����ۿ��� �̺�Ʈ�� �߻����� ��
		if (ae.getSource() == jm.getMiNew()) {
			newMemo();
		} // end if
			// ���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if (ae.getSource() == jm.getMiOpen()) {
			try {
				openMemo();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(jm, "������ ������ ���� �� �����ϴ�.", "���Ͽ��� ����", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "������ ������ �о���̴� �� ������ �߻��߽��ϴ�.", "���Ͽ��� ����", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		} // end if
			// ���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if (ae.getSource() == jm.getMiSave()) {
			saveMemo();
		} // end if
			// �ٸ� �̸����� ���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if (ae.getSource() == jm.getMiNewSave()) {
			newSaveMemo();
		} // end if

		// miEnd, miFormat, miHelp
		// ���� �޴� �����ۿ��� �̺�Ʈ�� �߻� ���� ��
		if (ae.getSource() == jm.getMiFormat()) {
			formatDialog();
		} // end if
			// ���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if (ae.getSource() == jm.getMiEnd()) {
			//������� ���� ������ �ִٸ� �����ϰ� ���� (������� �ʾҴٸ� �������� �ʰ�, ����� ������ �ִٸ� ������ ��)
			int flag;
			if(!changeMemoCheck()) {
				flag = JOptionPane.showConfirmDialog(jm, "���α׷��� ���� �ϱ����� �ٸ� �̸����� ���� �Ͻðڽ��ϱ�?");
				
				switch(flag) {
				case JOptionPane.OK_OPTION:
					saveMemo();
					jm.dispose(); ////////////// ���� ���̾�α׸� ���� �����ư�� ������ ����, ��Ҹ� ������ �ٽ� �������� �ǵ����� ��
				case JOptionPane.NO_OPTION:
					jm.dispose();
				case JOptionPane.CANCEL_OPTION:
					break;
				}//end switch
			} else {
				jm.dispose();
			}//end else
			
//			jm.dispose();
		} // end if
			// ���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if (ae.getSource() == jm.getMiHelp()) {
			helpDialog();
		} // end if

	}// actionPerformed

	/**
	 * �� �� : TextArea�� �ʱ�ȭ�Ѵ�.
	 */
	public void newMemo() {

		TextArea tempTa = jm.getTaNote();
		boolean flagNew = false;
		// ������ ������ �Ǵ�
		if (!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, "�ٸ� �̸����� ���� �Ͻðڽ��ϱ�?");

			switch (flag) {
			case JOptionPane.OK_OPTION:
				newSaveMemo();
			case JOptionPane.NO_OPTION:
				flagNew = false;
				break;
			default:
				flagNew = true;
			}// end switch

		} // end if

		if (!flagNew) {
			// JDK 1.7 ���� ���ĺ��� ���� ���� : setText()�� empty ���� �ֱ⸸ �ϸ� ���� �ʱ�ȭ ���� �ʴ´�.
			tempTa.getText(); // �ѹ� �ؽ�Ʈ ���� ��������
			tempTa.setText(""); // empty���� ��� �ʱ�ȭ�ȴ�.

			// ������ �� ���Ŀ��� �б��� ������ �ʱ�ȭ
			taNoteData = tempTa.getText();
			openPath = ""; // �о���� ������ ��� �ʱ�ȭ
			jm.setTitle("�޸��� - ����");
		} // end if
	}// newMemo

	/**
	 * txt���� ����
	 */
	public void openMemo() throws FileNotFoundException, IOException {

		// TextArea�� ����� �о�鿴�� ������ �ٸ��ٸ� ���忩�θ� ����
		// �۾��� �����Ѵ�.
		TextArea tempTa = jm.getTaNote();
		boolean flagOpen = false;
		if (!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, openPath + "\n�� �����Ͻðڽ��ϱ�?");
			switch (flag) {
			case JOptionPane.OK_OPTION:
				if (!openPath.equals("")) {
					// ������ �̸��� ������ ������
					saveMemo();
				} else {
					// �ٸ� �̸����� ����
					newSaveMemo();
				} // end else
			case JOptionPane.NO_OPTION:
				flagOpen = false;
				break;
			default:
				flagOpen = true;
			}// end switch
		} // end if

		if (!flagOpen) {
			FileDialog fdOpen = new FileDialog(jm, "��������", FileDialog.LOAD);
			fdOpen.setVisible(true);

			String filePath = fdOpen.getDirectory();
			String fileName = fdOpen.getFile();

			if (filePath != null) {// ������ ������ �����Ѵٸ�
				/////////////////////////// 12-20-2018 ��Ʈ������ ������ ������ �д� �ڵ� �߰� ����

				// ������ ���Ϸ� ���� ��ü ����
				File file = new File(filePath + fileName);
				// 16bit stream ���
				BufferedReader br = null;

				try {
					br = new BufferedReader(new FileReader(file));
					String temp = "";
					// T.A�� �ʱ�ȭ �� ��
					tempTa.setText("");

					while ((temp = br.readLine()) != null) {
						// ���� �������� ���� ���¿��� setText()�� ���� �� text�� ������� �ʴ� ���װ� ����. (������ ���� ������ ���� �ذ��߾���.)
						// ���Ͽ��� �о���� ������ �����Ѵ�.
						tempTa.append(temp + "\r\n");
					} // end while

					// ������ �о���� ������ ����
					taNoteData = tempTa.getText();

					// ������ ���ϸ��� ����
					openPath = file.getAbsolutePath();
				} finally {
					// ������ �Ǿ��ֵ� �Ǿ����� �ʵ� br(BufferedReader��ü)�� ������� �ִٸ�
					if (br != null) {
						br.close();
					} // end if
				} // end finally

				/////////////////////////// 12-20-2018 �ڵ� ��Ʈ������ ������ ������ �д� �ڵ� �߰� ��
				/////////////////////////// ///////////////////////////

				// ������ ��ο� �̸��� Frame�� TitleBar�� ����
				jm.setTitle("�޸��� - ���� " + filePath + fileName);
			} // end if
		} // end if
	}// openMemo

	/**
	 * �ۼ��� �޸� ���� - ������ ���ϸ��� �״�� �����ϴ� ���ϸ� �ݿ�
	 */
	public void saveMemo() {
		// ������ ������ �̸��� ���Ͽ� ���� ���� ��
		try {
			if (!openPath.equals("")) {
				createFile(openPath);
			}else {
				newSaveMemo();
			}//end else
		} catch (IOException e) {
			e.printStackTrace();
		} // end catch
	}// saveMemo
	
	private void createFile(String pathName) throws IOException {
		BufferedWriter bw = null;

		try {
			// ����ڰ� ���丮���� ������� ������ �� ���� ������ File Ŭ������
			// ����� �ʿ䰡 ����.
			bw = new BufferedWriter(new FileWriter(pathName));
			bw.write(jm.getTaNote().getText()); // TextArea�� ������ ���Ͽ� ���
			bw.flush(); // ��Ʈ���� ��ϵ� ������ �������� ����, github�� fetch�� ������ ���� �ִ� �� ����
			
			openPath = pathName;
			taNoteData=jm.getTaNote().getText();
		} finally {
			if (bw != null) {
				bw.close();
			} // end if
		} // end finally

	}// createFile

	/**
	 * ���ϸ��� �Է¹޾� �� �̸����� ����
	 */
	public void newSaveMemo() {

		FileDialog fdSave = new FileDialog(jm, "��������", FileDialog.SAVE);
		fdSave.setVisible(true);

		String filePath = fdSave.getDirectory();
		String fileName = fdSave.getFile();

		if (filePath != null) {// �����ư�� ������ �� ����
			try {
				createFile(filePath + fileName);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "������ ���� �߻�", "�����߻�", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
			// ������ ��ο� �̸��� Frame�� TitleBar�� ����
			jm.setTitle("�޸��� - ���� " + filePath + fileName);
		} // end if

	}// newSaveMemo

	/**
	 * �۲��� �����ϴ� ���̾�α׸� �����ϴ� ��
	 */
	public void formatDialog() {
		new MemoFormat(jm);
	}// formatDialog

	/**
	 * �޸��� ������ �����ϴ� ���̾�α׸� ����
	 */
	public void helpDialog() {
		new HelpDialog(jm);
	}// helpDialog

	public boolean changeMemoCheck() {
		String temp = jm.getTaNote().getText();
		return temp.equals(taNoteData);
	}//changeMemoCheck
	
}// class
