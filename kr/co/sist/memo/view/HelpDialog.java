package kr.co.sist.memo.view;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.TextArea;

import kr.co.sist.memo.evt.HelpDialogEvt;


@SuppressWarnings("serial")
public class HelpDialog extends Dialog{
	
	private JavaMemo jm;
	private TextArea ta;
	private Button btnOk;
	
	public HelpDialog(JavaMemo jm) {
		super(jm, "�޸��� ����", true);
		this.jm = jm;
		
		setLayout(null);
		
		ta = new TextArea("�޸�������");
		ta.append("\n\n�� �޸����� Java�� �����������,");
		ta.append("\n������ �ڵ� ���� �� ������ �� �� �ֽ��ϴ�.");
		ta.append("\n��, �� �ڵ带 ����Ͽ� �������� ������");
		ta.append("\n�ҽ� ������ ��Ģ���� �մϴ�. GNU");
		ta.append("\n\n�ۼ��� : 4���ǽ� 2��(�ڿ���, �ڼҿ�, ������, ������, ����ö)��");
		ta.append("\n����� ������");
		ta.append("\n\n- Version : 1.0");
		ta.setFont(new Font("Dialog", 0, 12));
		// ta ���� �Ұ� ����
		ta.setEditable(false);
		// ta ��ġ �� ũ�� ����
		ta.setBounds(25, 50, 450, 200);
		
		btnOk = new Button("Ȯ��");
		btnOk.setBounds(225, 255, 50, 30);
		
		HelpDialogEvt hde = new HelpDialogEvt(this);
		btnOk.addActionListener(hde);
		
		addWindowListener(hde);
		
		add(ta);
		add(btnOk);
		
		setBounds(jm.getX()+50, jm.getY()+80, 500, 300);
		setVisible(true);
		
		 
		
	}//HelpDialog
	
}//class
