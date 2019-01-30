package day1214;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;

/**
 * MVC pattern을 기반으로한 JList, DefaultListModel 사용
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseJList extends JFrame implements ActionListener, MouseListener/* , ListSelectionListener */ {

	private JList<String> jl; // view
	private DefaultListModel<String> dlm; // Model

	private JLabel jlOutput;
	private JButton jb;

	public UseJList() {
		super("JList 사용");

		dlm = new DefaultListModel<String>();
		dlm.addElement("Java SE");
		dlm.addElement("Oracle");
		dlm.addElement("JDBC");
		dlm.addElement("HTML");
		dlm.addElement("JavaScript");
		dlm.addElement("CSS");

		jl = new JList<String>(dlm);

		jlOutput = new JLabel("출력");
		jlOutput.setBorder(new TitledBorder("선택 아이템"));

		jb = new JButton("입력");

		// ScrollBar가 없는 JList에게 ScrollBar 설정
		JScrollPane jsp = new JScrollPane(jl);

		add("North", jb);
		add("Center", jsp); // 컴포넌트를 가진 스크롤바 객체를 배치
		add("South", jlOutput);

		jb.addActionListener(this);
//		jl.addListSelectionListener(this);
		jl.addMouseListener(this);

		setBounds(100, 100, 300, 400);
		setVisible(true);

		jb = new JButton();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseJList

	public static void main(String[] args) {
		new UseJList();
	}// main

	@Override
	public void actionPerformed(ActionEvent ae) {
		String lang = JOptionPane.showInputDialog("컴퓨터 개발관련 언어 입력");
//		System.out.println(lang);

		// 입력데이터 이므로 Model 객체를 사용한다.
		// 만들어지지 않은 객체에 인스턴스 메소드를 사용할 수 없다.
		if (lang != null && !lang.equals("")) { // null인지를 먼저 묻고(취소) 비어있는지를 확인한다.(empty값인지)
			// 두 조건식의 순서가 뒤바껴도 문법상 틀린것은 아니지만 null(빈 객체)은 주소가 없기 때문에 인스턴스 메소드(.isEmpty())를 쓸
			// 수 없다.
			dlm.addElement(lang);
		}
	}// actionPerformed

	@Override
	public void mouseClicked(MouseEvent e) {// 2
		int idx = jl.getSelectedIndex();
		if (idx != -1) {
			String value = dlm.get(idx);
			// JLabel에 추가
			jlOutput.setText(value); // 클릭하고 있을때 한번, 손을 떼었을 때 한번, 총 두번 실행된다.
			// 선택된 값을 삭제
			dlm.removeElementAt(idx);
			System.out.println("삭제!!!");
		}//end if
	}// mouseClicked

	@Override
	public void mousePressed(MouseEvent e) {// 1
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {// 3
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {// 특정 영역에 커서가 들어갔을 때
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {// 커서가 빠져나갔을 때
		// TODO Auto-generated method stub

	}

	// 중복값 때문에 사용하지 않기로 함
//	private boolean flag;
//	@Override
//	public void valueChanged(ListSelectionEvent lse) {
//		// 선택된 아이템(JList)의 값을 얻어와서 값(DefaultTableModel)을 얻어와서
//		if( flag ) {
//			int idx = jl.getSelectedIndex();
//			String value = dlm.get(idx);
//			//JLabel에 추가
//			jlOutput.setText(value); // 클릭하고 있을때 한번, 손을 떼었을 때 한번, 총 두번 실행된다.
//			//선택된 값을 삭제
//			dlm.removeElementAt(idx);
//		}//end if
//		
//		flag = !flag;
//	}// valueChanged

}// class
