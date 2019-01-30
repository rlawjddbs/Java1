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

		// 1. ���� �߰��� �� �ִ� ��ü ����.
		jtp = new JTabbedPane();

		// 2. �� �ǿ� �� ������Ʈ�� ����.
		// ó�� �ǿ� �� ������Ʈ
		ImageIcon ii = new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/img1.png");
		ii2 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/img3.png");
		JLabel jl = new JLabel(ii);

		// �ι�° �ǿ� �� ������Ʈ
		JPanel jp = new JPanel();
		jp.add(new JLabel("�̸�"));
		jp.add(new JTextField(30));
		jp.add(new JButton("�Է�"));

		JPanel tab2 = new JPanel();
		tab2.setLayout(new BorderLayout());

		jp.setBorder(new TitledBorder("�Էµ�����"));

		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("���â"));

		tab2.add("North", jp);
		tab2.add("Center", jsp);

		JPanel tab4 = new JPanel();
		tab4.setLayout(new BorderLayout());
		jl4 = new JLabel();
		tab4.add("Center", jl4);

		jtp.add("ó����", jl);
		jtp.add("�ι�° ��", tab2);
		jtp.add("����° ��", new JButton("Ŭ��"));
		jtp.add("�׹�° ��", tab4);

		// �̺�Ʈ ���
		UseJTap.TapEvt te = this.new TapEvt();
		jtp.addMouseListener(te);

		// ��ġ
		add("Center", jtp);

		setBounds(100, 100, 600, 400);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseJTap

	@Override
	public void actionPerformed(ActionEvent e) {

	}//actionPerformed

	//////////////////////////////////////////////////////////////// inner class ����
	public class TapEvt extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent me) {
			if (jtp.getSelectedIndex() == 3) {
				String answer = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���");
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
		//////////////////////////////////////////////////////////////// inner class ��

	public static void main(String[] args) {
		new UseJTap();
	}// main

}// UseJTap
