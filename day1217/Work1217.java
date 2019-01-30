package day1217;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Work1217 {

	private String selectMenu;

	private JList<String> list;
	private DefaultListModel dlm;

	public Work1217() {
		list = new JList<String>();
		dlm = new DefaultListModel();
		inputCount();
	}// Work1217

	public void inputCount() {
		// 1. InputDialog�� ���� Dialog ������ �޴� ����
		selectMenu = JOptionPane.showInputDialog(null, "1.�Է�               2.���                  3.����", "�޴�����",
				JOptionPane.DEFAULT_OPTION);

		// 2. �Էµ� �޴���ȣ�� ��ȿ�� ����
		if (selectMenu != null && !selectMenu.isEmpty()) { // �Է°��� null�� �ƴϸ� ����ִ� ���� �ƴ� ��� ���� ó��

			if (selectMenu.equals("1")) { // 1�� ����
				// �̸�, ���� �Է�
				String inputData = JOptionPane.showInputDialog(null, "��) �̸�, �ڹ�����, ����Ŭ����", "�������Է�",
						JOptionPane.DEFAULT_OPTION);

				if (inputData == null || inputData.replaceAll(" ", "").split(",").length != 3) {
					JOptionPane.showMessageDialog(null, "�ٽ��ѹ� �Է��ϼ���.", "�� �Է� ����", JOptionPane.ERROR_MESSAGE);
					inputCount();
				} else {
					String[] resultData = inputData.replaceAll(" ", "").split(",");
					int total = Integer.parseInt(resultData[1]) + Integer.parseInt(resultData[2]);
					float avg = (float)total / 2;
					String saveData = resultData[0] + "\t" + resultData[1] + "\t" + resultData[2] + "\t"
							+ String.valueOf(total) + "\t" + String.valueOf(avg);
					dlm.addElement(saveData);
					System.out.println("�Էµ� �� : " + dlm.size());
					inputCount();
				} // end else

			} else if (selectMenu.equals("2")) { // 2�� ����
				//dlm�� ũ�Ⱑ 0�� ��� ���â ����
				if (dlm.size() == 0) {
					JOptionPane.showMessageDialog(null, "����� ���� �����ϴ�.", "�� �ε� ����", JOptionPane.ERROR_MESSAGE);
					inputCount();
				} else {
					JTextArea jta = new JTextArea(10, 60);
					jta.setEditable(false);
					jta.append("��ȣ\t�̸�\t�ڹ�\t����Ŭ\t����\t���\n");
					for (int i = 0; i < dlm.size(); i++) {
						jta.append((i + 1) + "\t" + dlm.get(i) + "\n");
					} // end for

					JScrollPane jsp = new JScrollPane(jta);
					JOptionPane.showMessageDialog(null, jsp, "���", JOptionPane.DEFAULT_OPTION);
					inputCount();
				} // end else

			} else if (selectMenu.equals("3")) { // 3�� ����
				return;
			} else {
				JOptionPane.showMessageDialog(null, "�޴��� �������� �ʾҰų� ���� ��ȿ���� ����.", "�޴�����", JOptionPane.ERROR_MESSAGE);
				inputCount();
			} // end if else

		} else { //
			
			JOptionPane.showMessageDialog(null, "�޴��� �������� �ʾҰų� ���� ��ȿ���� ����.", "�޴�����", JOptionPane.ERROR_MESSAGE);
			inputCount();
			
		} // end if else

	}// inputCount

	public static void main(String[] args) {
		new Work1217();
	}

}
