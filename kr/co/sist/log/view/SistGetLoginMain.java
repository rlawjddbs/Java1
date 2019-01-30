package kr.co.sist.log.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import kr.co.sist.log.evt.SistGetLogMainEvt;

/**
 *	�����ڸ��� ������ �� �ִ� â�� �����ִ� SistGetLoginMain Ŭ������ log������ ����ã�ų�,<br>
 *	������ ��� �ڷḦ data ���Ϸ� export�� �� �ִ� �� ���� ����� ���� â�� �ٸ��ִ� ���� �Ѵ�.
 * @author zeongyun
 */
@SuppressWarnings("serial")
public class SistGetLoginMain extends JFrame{
	
	// �����ڰ� ������ �� �ִ� ������Ʈ�� �� ������ JButton���� �����Ǹ�,
	// �̸� �����Ѵ�.
	private JButton jbView, jbReport;

	public SistGetLoginMain(){
		super("log���� �м���");
		
		//������Ʈ ����
		jbView = new JButton("log���� ����");
		jbReport = new JButton("Report���� �����");
		
		//�̺�Ʈ ���
		SistGetLogMainEvt sglme = new SistGetLogMainEvt(this);
		jbView.addActionListener(sglme);
		jbReport.addActionListener(sglme);
		
		//���̾ƿ� ����
		setLayout(new GridLayout(1,2));
		add(jbView);
		add(jbReport);

		//��ǥ �� ũ��
		setBounds(100, 100, 300, 200);
		//����ȭ
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//SistGetLoginMain
	
	public JButton getJbView() {
		return jbView;
	}//getJbview

	public JButton getJbReport() {
		return jbReport;
	}//getJbReport

}//class