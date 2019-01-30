package day1217;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJTap extends JFrame implements ActionListener {

	private JTabbedPane jtp;
	private JLabel jl4;
	ImageIcon ii2;

	public UseJTap() {
		super("Tab");

		// 1. 탭을 추가할 수 있는 객체 생성.
		jtp = new JTabbedPane();

		// 2. 각 탭에 들어갈 컴포넌트를 생성.
		// 처음 탭에 들어갈 컴포넌트
		ImageIcon ii = new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/img1.png");
		ii2 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/img3.png");
		JLabel jl = new JLabel(ii);

		// 두번째 탭에 들어갈 컴포넌트
		JPanel jp = new JPanel();
		jp.add(new JLabel("이름"));
		jp.add(new JTextField(30));
		jp.add(new JButton("입력"));

		JPanel tab2 = new JPanel();
		tab2.setLayout(new BorderLayout());

		jp.setBorder(new TitledBorder("입력데이터"));

		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("결과창"));

		tab2.add("North", jp);
		tab2.add("Center", jsp);

		JPanel tab4 = new JPanel();
		tab4.setLayout(new BorderLayout());
		jl4 = new JLabel();
		tab4.add("Center", jl4);

		jtp.add("처음탭", jl);
		jtp.add("두번째 탭", tab2);
		jtp.add("세번째 탭", new JButton("클릭"));
		jtp.add("네번째 탭", tab4);

		// 이벤트 등록
		UseJTap.TapEvt te = this.new TapEvt();
		jtp.addMouseListener(te);

		// 배치
		add("Center", jtp);

		setBounds(100, 100, 600, 400);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseJTap

	@Override
	public void actionPerformed(ActionEvent e) {

	}//actionPerformed

	//////////////////////////////////////////////////////////////// inner class 시작
	public class TapEvt extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent me) {
			if (jtp.getSelectedIndex() == 3) {
				String answer = JOptionPane.showInputDialog("비밀번호를 입력하세요");
				switch(answer) {
				case "123" :
					jl4.setHorizontalAlignment(JLabel.CENTER);
					jl4.setVerticalAlignment(JLabel.CENTER);
					jl4.setIcon(ii2);
					break;
				default :
					jtp.setSelectedIndex(0);
					break;
				}//end switch
			} else {
				jl4.setIcon(null);
			}//end else
		}// mouseClicked
	}// TapEvt
		//////////////////////////////////////////////////////////////// inner class 끝

	public static void main(String[] args) {
		new UseJTap();
	}// main

}// UseJTap
