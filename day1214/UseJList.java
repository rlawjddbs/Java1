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
 * MVC pattern�� ��������� JList, DefaultListModel ���
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
		super("JList ���");

		dlm = new DefaultListModel<String>();
		dlm.addElement("Java SE");
		dlm.addElement("Oracle");
		dlm.addElement("JDBC");
		dlm.addElement("HTML");
		dlm.addElement("JavaScript");
		dlm.addElement("CSS");

		jl = new JList<String>(dlm);

		jlOutput = new JLabel("���");
		jlOutput.setBorder(new TitledBorder("���� ������"));

		jb = new JButton("�Է�");

		// ScrollBar�� ���� JList���� ScrollBar ����
		JScrollPane jsp = new JScrollPane(jl);

		add("North", jb);
		add("Center", jsp); // ������Ʈ�� ���� ��ũ�ѹ� ��ü�� ��ġ
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
		String lang = JOptionPane.showInputDialog("��ǻ�� ���߰��� ��� �Է�");
//		System.out.println(lang);

		// �Էµ����� �̹Ƿ� Model ��ü�� ����Ѵ�.
		// ��������� ���� ��ü�� �ν��Ͻ� �޼ҵ带 ����� �� ����.
		if (lang != null && !lang.equals("")) { // null������ ���� ����(���) ����ִ����� Ȯ���Ѵ�.(empty������)
			// �� ���ǽ��� ������ �ڹٲ��� ������ Ʋ������ �ƴ����� null(�� ��ü)�� �ּҰ� ���� ������ �ν��Ͻ� �޼ҵ�(.isEmpty())�� ��
			// �� ����.
			dlm.addElement(lang);
		}
	}// actionPerformed

	@Override
	public void mouseClicked(MouseEvent e) {// 2
		int idx = jl.getSelectedIndex();
		if (idx != -1) {
			String value = dlm.get(idx);
			// JLabel�� �߰�
			jlOutput.setText(value); // Ŭ���ϰ� ������ �ѹ�, ���� ������ �� �ѹ�, �� �ι� ����ȴ�.
			// ���õ� ���� ����
			dlm.removeElementAt(idx);
			System.out.println("����!!!");
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
	public void mouseEntered(MouseEvent e) {// Ư�� ������ Ŀ���� ���� ��
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {// Ŀ���� ���������� ��
		// TODO Auto-generated method stub

	}

	// �ߺ��� ������ ������� �ʱ�� ��
//	private boolean flag;
//	@Override
//	public void valueChanged(ListSelectionEvent lse) {
//		// ���õ� ������(JList)�� ���� ���ͼ� ��(DefaultTableModel)�� ���ͼ�
//		if( flag ) {
//			int idx = jl.getSelectedIndex();
//			String value = dlm.get(idx);
//			//JLabel�� �߰�
//			jlOutput.setText(value); // Ŭ���ϰ� ������ �ѹ�, ���� ������ �� �ѹ�, �� �ι� ����ȴ�.
//			//���õ� ���� ����
//			dlm.removeElementAt(idx);
//		}//end if
//		
//		flag = !flag;
//	}// valueChanged

}// class
