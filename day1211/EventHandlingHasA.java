package day1211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *	Has a ����� �̺�Ʈ ó��
 * @author owner
 */
//1. �̺�Ʈó�� ��ü�� ����
public class EventHandlingHasA implements ActionListener{
	//EventHandlingHasA �� Design�� ������ �ִ�.
	private Design design;
	public EventHandlingHasA(Design design) {
		this.design = design;
	}//EventHandlingHasA
	
	
	@Override
	//3. abstract method Override
	public void actionPerformed(ActionEvent ae) {
		//�̺�Ʈ�� �߻����� �� ó���� �ڵ�
		System.out.println("���޹��� Design��ü "+design);
		design.dispose();
	}//actionPerformed
	
}//class
