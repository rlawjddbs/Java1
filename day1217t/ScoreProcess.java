package day1217t;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//매번 Integer.parseInt() 쓰기 귀찮다면 Integer클래스의 parseInt()를 import하여 해당 메소드만 쓸 수 있도록 하자
import static java.lang.Integer.parseInt;

import java.text.DecimalFormat;

public class ScoreProcess {

	private List<ScoreVO> listStu;
	private int totalScore;

	public static final int INPUT_DATA = 1;
	public static final int VIEW_DATA = 2;
	public static final int EXIT = 3;

	public ScoreProcess() {
		listStu = new ArrayList<ScoreVO>();
	}

	/**
	 * 선택 메뉴 제공
	 */
	public void inputMenu() {
		String selectMenu = "", inputResult = "";
		boolean exitFlag = false;
		do {
			selectMenu = JOptionPane.showInputDialog("메뉴선택\n1.입력 2.출력 3.종료");

//			if(selectMenu.equals("3")) {
//				/*break;*/		//첫 번째 방법
//				exitFlag=true;	//두 번째 방법
//			}//end if

//			exitFlag = selectMenu.equals("3"); //세 번째 방법

			// 네 번째 방법
			try {
				switch (parseInt(selectMenu)) {
				case INPUT_DATA:
					inputResult = "데이터의 개수가 맞지 않거나 점수는 숫자 형태이어야 합니다.";
					if (inputData()) {
						inputResult = "추가성공";
					} // end if
					JOptionPane.showMessageDialog(null, inputResult);
					break;
				case VIEW_DATA:
					printData();
					break;
				case EXIT:
					exitFlag = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "메뉴는 1,2,3중 하나여야 합니다.");
				}// end switch
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "메뉴는 숫자여야 합니다.");
			} // end catch
		} while (/* true 첫번째방법 */ !exitFlag);

	}// inputMenu

	/**
	 * 정보처리할 데이터를 입력받기
	 * 
	 * @return
	 */
	public boolean inputData() {
		boolean flag = false;

		String inputData = JOptionPane.showInputDialog("데이터입력\n예)이름,자바점수,오라클점수");
		try {
		String[] data = inputData.replaceAll(" ", "").split(",");
			if (data.length == 3) { // 입력형식에 맞을 때
				// 자바점수와 오라클 점수는 숫자여야 한다.
				try {
					ScoreVO sv = new ScoreVO(data[0], parseInt(data[1]), parseInt(data[2]));
					listStu.add(sv); // 정제된 데이터를 list에 추가
					flag = true;
				} catch (NumberFormatException nfe) {
					nfe.printStackTrace();
					flag = false;
				} // end catch
			} // end if
		} catch (NullPointerException npe) {
		}
		return flag;
	}// inputData

	/**
	 * 입력 정보를 출력하는 일
	 */
	public void printData() {
		if (listStu.size() == 0) {
			JOptionPane.showMessageDialog(null, "출력할 데이터가 없습니다.");
			return;
		} // end if
		StringBuilder viewData = new StringBuilder();
		viewData.append(
				"-----------------------------------------------------------------------------------------------------------------------\n")
				.append("번호\t이름\t자바\t오라클\t총점\t평균\n")
				.append("-----------------------------------------------------------------------------------------------------------------------\n");
		int tempTotal = 0;
		ScoreVO sv = null;

		for (int i = 0; i < listStu.size(); i++) {
			sv = listStu.get(i);
			tempTotal = sv.getJavaScore() + sv.getOracleScore();
			viewData.append(i + 1).append("\t").append(sv.getName()).append("\t").append(sv.getJavaScore()).append("\t")
					.append(sv.getOracleScore()).append("\t").append(tempTotal).append("\t").append(tempTotal / 2.0)
					.append("\n");

			// 한 학생의 자바점수와 오라클 점수를 더한 값을 누적합
			totalScore += tempTotal;

			tempTotal = 0;// 한 학생의 총점 변수를 초기화
		} // end for
		viewData.append("-----------------------------------------------------------------------------------------------------------------------------\n")
				.append("\t\t\t\t총점").append(totalScore).append("\t평균")
//				.append(Double.parseDouble(String.format("%.2f", ((double)totalScore / (double)(listStu.size() * 2)))));
				.append(new DecimalFormat(".00").format((double)totalScore / (double)(listStu.size() * 2)));

		JTextArea jta = new JTextArea(7, 50);
		jta.append(viewData.toString()); // 화면을 구성한 데이터를 JTA에 붙여준다.
		JScrollPane jsp = new JScrollPane(jta);
		JOptionPane.showMessageDialog(null, jsp);

	}// printData

	public static void main(String[] args) {
		ScoreProcess sp = new ScoreProcess();
		sp.inputMenu();
	}// main

}// class
