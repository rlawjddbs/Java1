package work1217;

import java.awt.List;

import javax.swing.JOptionPane;

public class Process {

	private List l;
	private int javaTot;
	private int oracleTot;
	
	public void inputMenu() {
		String inputScore = JOptionPane.showInputDialog(null, "예 ) 이름, 자바점수, 오라클점수", "정보를 입력하세요", JOptionPane.DEFAULT_OPTION);
		if(inputScore.replaceAll(" ", "").split(",").length == 3) {
			addData();
		} else {
			JOptionPane.showMessageDialog(null, "이름, 자바점수, 오라클점수의 형식으로 입력해주세요.", "Error", JOptionPane.ERROR_MESSAGE);
			inputMenu();
		}
	}//inputMenu
	
	public boolean addData() {
		return false; //임시값
	}//addData
	
	
	public Process(){
		String inputValue = JOptionPane.showInputDialog(null, "1.입력               2.출력                  3.종료", "메뉴선택", JOptionPane.DEFAULT_OPTION);
		if(inputValue != null && !inputValue.isEmpty()) { // 입력된 값이 null이나 비어있는값이 아닐경우
			
			if(inputValue.equals("1")) {
				inputMenu();
			} else if(inputValue.equals("2")) {
				viewData();
			} else if(inputValue.equals("3")) {
				return;
			}
				
		} else { // 입력된 값이 null이거나 비어있는 값일 경우
			JOptionPane.showMessageDialog(null, "1, 2, 3 중 하나를 입력하세요.", "Error", JOptionPane.ERROR_MESSAGE);
			new Process();
		}
	}//Process 기본생성자
	

	
	public void viewData() {
		
	}//viewData
	
	
}//class
