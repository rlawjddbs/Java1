package day1214;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import kr.co.sist.memo.view.JavaMemo;

@SuppressWarnings("serial")
public class UseTitledBorder extends JFrame implements ActionListener {

	private JTextField jtfId;
	private JPasswordField jtfpass;
	private JLabel jlOutput;
	
	public UseTitledBorder() {
		super("border ���");
		
		jtfId = new JTextField();
		jtfpass = new JPasswordField();
		jlOutput = new JLabel("��� : ");
		
		jtfId.setBorder(new TitledBorder("���̵�"));
		jtfpass.setBorder(new TitledBorder("��й�ȣ"));
		jlOutput.setBorder(new TitledBorder("���"));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));
		
		//�����̳� ������Ʈ
		panel.setBorder(new TitledBorder("�α���"));
		
		panel.add(jtfId);
		panel.add(jtfpass);
		panel.add(jlOutput);
		
		//�̺�Ʈ ���
		jtfId.addActionListener(this);
		jtfpass.addActionListener(this);
		
		add("Center", panel);
		
		setBounds(100, 100, 250, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseTitleBorder()
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String id = jtfId.getText().trim();
		
		if(ae.getSource() == jtfId) {//���̵𿡼� �̺�Ʈ�� �߻��ϸ�(��ȭ�� �����Ǹ�)
			//���̵� ���� ����ִٸ� Ŀ���� ��й�ȣ�� �̵�
			if(!id.equals("")) {
				jtfpass.requestFocus();
			}//end if
		}//end if
		
		if(ae.getSource() == jtfpass) {//��й�ȣ���� �̺�Ʈ�� �߻��ϸ�(��ȭ�� �����Ǹ�)
			
			//���̵� ���� ���ٸ� Ŀ���� ���̵�� �̵�
			if(id.equals("")) {
				jtfId.requestFocus();
				jlOutput.setText("���̵� �Է����ּ���.");
				return; //��ȯ���� void�� method���� �ڵ��� ������ ���߰� ȣ���� ������ ���ư���
			}//endif
			
			
			//��й�ȣ�� ���� ���ٸ� ���â�� "��� �Է�"�� �����ְ� Ŀ����
			//��й�ȣ�� �̵�
			String pass = new String(jtfpass.getPassword());
			if(pass.trim().equals("")) {
				jtfpass.requestFocus();
				jlOutput.setText("��й�ȣ�� �Է����ּ���.");
				return;
			}//end if
			
			
			//��й�ȣ�� ���� �ִٸ� ���̵� admin, ��й�ȣ�� 123�� ������
			//���Ͽ� ���ٸ� �ڹٸ޸��� Ŭ������ ����
			if(id.equals("admin")&&pass.equals("123")) {
//				new JavaMemo();
			} else {
				jlOutput.setText("���̵� ��й�ȣ�� Ȯ�����ּ���.");
			}//end else
			
		}//end if
		
	}//actionPerformed

	public static void main(String[] args) {
		new UseTitledBorder();
	}//main

}//class
