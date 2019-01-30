package day1212;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HasAEventHandling extends WindowAdapter implements ActionListener, ItemListener{

	private BlockList blocklist;
	private String selectedName;
	public HasAEventHandling(BlockList blocklist) {
		this.blocklist = blocklist;
	}//HasAEventHandling
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == blocklist.getBtnL()) {
//			System.out.println("차단 해제하는 버튼");
			if(!selectedName.isEmpty()) {
			blocklist.getListL().add(selectedName);
			blocklist.getListR().remove(selectedName);
			selectedName = "";
			blocklist.getListR().requestFocus();
			}
		}//end if
		if(ae.getSource() == blocklist.getBtnR()) {
			if(!selectedName.isEmpty()) {
//			System.out.println("차단하는 버튼");
			blocklist.getListR().add(selectedName);
			blocklist.getListL().remove(selectedName);
			selectedName = "";
			blocklist.getListL().requestFocus();
			}
		}//end if
		if(ae.getSource() == blocklist.getTf()) {
			blocklist.getListL().add(blocklist.getTf().getText());
		}
	}//actionPerformed

	@Override
	public void itemStateChanged(ItemEvent ie) {
		if(ie.getSource() == blocklist.getListL()) {
//			System.out.println("왼쪽리스트");
			selectedName = blocklist.getListL().getSelectedItem();
//			blocklist.getListR().add(selectedName);
		}//end if
		if(ie.getSource() == blocklist.getListR()) {
			System.out.println("오른쪽리스트");
			selectedName = blocklist.getListR().getSelectedItem();
//			blocklist.getListL().add(selectedName);
		}//end if
	}//itemStateChanged
	
	@Override
	public void windowClosing(WindowEvent e) {
		blocklist.dispose();
	}//windowClosing
		
}//class
