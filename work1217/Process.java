package work1217;

import java.awt.List;

import javax.swing.JOptionPane;

public class Process {

	private List l;
	private int javaTot;
	private int oracleTot;
	
	public void inputMenu() {
		String inputScore = JOptionPane.showInputDialog(null, "�� ) �̸�, �ڹ�����, ����Ŭ����", "������ �Է��ϼ���", JOptionPane.DEFAULT_OPTION);
		if(inputScore.replaceAll(" ", "").split(",").length == 3) {
			addData();
		} else {
			JOptionPane.showMessageDialog(null, "�̸�, �ڹ�����, ����Ŭ������ �������� �Է����ּ���.", "Error", JOptionPane.ERROR_MESSAGE);
			inputMenu();
		}
	}//inputMenu
	
	public boolean addData() {
		return false; //�ӽð�
	}//addData
	
	
	public Process(){
		String inputValue = JOptionPane.showInputDialog(null, "1.�Է�               2.���                  3.����", "�޴�����", JOptionPane.DEFAULT_OPTION);
		if(inputValue != null && !inputValue.isEmpty()) { // �Էµ� ���� null�̳� ����ִ°��� �ƴҰ��
			
			if(inputValue.equals("1")) {
				inputMenu();
			} else if(inputValue.equals("2")) {
				viewData();
			} else if(inputValue.equals("3")) {
				return;
			}
				
		} else { // �Էµ� ���� null�̰ų� ����ִ� ���� ���
			JOptionPane.showMessageDialog(null, "1, 2, 3 �� �ϳ��� �Է��ϼ���.", "Error", JOptionPane.ERROR_MESSAGE);
			new Process();
		}
	}//Process �⺻������
	

	
	public void viewData() {
		
	}//viewData
	
	
}//class
