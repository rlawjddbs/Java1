package day1212;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Work1212Evt extends WindowAdapter implements ActionListener, ItemListener{

	// �̺�Ʈ�� ó���ϱ����� ���Ǵ� ��� ������Ʈ�� has a ������ ��ü(Work1212)�κ���
	// ������ ����Ѵ�.
	private Work1212 wo1212;
	
	public Work1212Evt(Work1212 wo1212) {
		this.wo1212 = wo1212;
	}//Work1212Evt - ���ڰ� �ִ� ������
	
	@Override
	public void windowClosing(WindowEvent we) {
		wo1212.dispose();
	}//windowClosing
	
	@Override
	public void itemStateChanged(ItemEvent ie) {
		if(ie.getSource() == wo1212.getList()) {
			copyItem();
		}//end if
	}//itemStateChanged

	@Override
	public void actionPerformed(ActionEvent ae) {
		//�߰� ��ư
		if(ae.getSource() == wo1212.getBtnAdd() && emptyCheck()) {
			addList();
			removeTfs();
			wo1212.getTfName().requestFocus();
		}//end if
		
		//���� ��ư
		if(ae.getSource() == wo1212.getBtnDel() && emptyCheck()) {
			removeList();
			wo1212.getTfName().requestFocus();
		}//end if
		
		//���� ��ư
		if(ae.getSource() == wo1212.getBtnChg() && emptyCheck() && 
			wo1212.getList().getSelectedItem() != null) {
			changeList();
		}
		//�ݱ� ��ư
		if(ae.getSource() == wo1212.getBtnClose()) {
			wo1212.dispose();
		}
	}//actionPerformed

	
	
	public String addName() {
		String name = wo1212.getTfName().getText();
		return name;
	}//addName
	public String addAge() {
		String age = wo1212.getTfAge().getText();
		return age;
	}//addAge
	public String addAddr() {
		String addr = wo1212.getTfAddr().getText();
		return addr;
	}//addAddr
	
	private void addList() {
		wo1212.getList().add(addName() + "  /  " + addAge() + "  /  " + addAddr());
	}//addList
	
	private void removeList() {
		String tempInfo = wo1212.getList().getSelectedItem();
		wo1212.getList().remove(tempInfo);
	}//removeList
	
	private void changeList() {
		int selectedIdx = wo1212.getList().getSelectedIndex();
		wo1212.getList().remove(selectedIdx);
		wo1212.getList().add(addName() + "  /  " + addAge() + "  /  " + addAddr(), selectedIdx);
	}//changeList
	
	private void copyItem() {
		List tempItems = wo1212.getList();
		String[] tempInfo = tempItems.getSelectedItem().replaceAll(" ","").split("/");
		wo1212.getTfName().setText(tempInfo[0]);
		wo1212.getTfAge().setText(tempInfo[1]);
		wo1212.getTfAddr().setText(tempInfo[2]);
		wo1212.getTfName().requestFocus();
	}//copyItem
	
	
	public void removeTfs() {
		wo1212.getTfName().setText("");
		wo1212.getTfAge().setText("");
		wo1212.getTfAddr().setText("");
	}//removeList
	
	public boolean emptyCheck() {
		String name = addName();
		String age = addAge();
		String addr = addAddr();
		return !name.isEmpty() && !age.isEmpty() && !addr.isEmpty();
	}//emptyCheck

}
