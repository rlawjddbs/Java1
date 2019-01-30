package day1212;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *	Design class�� Has a ����� ������ �̺�Ʈ ó�� Ŭ����
 * @author owner
 */
public class FriendsListEvt extends WindowAdapter implements ActionListener, ItemListener {

	// �̺�Ʈ�� ó���ϱ����� ���Ǵ� ��� ������Ʈ�� has a ������
	// ��ü�� ����Ͽ� ó���Ѵ�.
	private FriendsList fl; 
	
	public FriendsListEvt(FriendsList fl) {
		this.fl = fl;
	}//���ڰ� �ִ� ������
	
	@Override
	public void windowClosing(WindowEvent e) {
		fl.dispose();
	}//windowClosing
	
	@Override
	//List �̺�Ʈ ó��
	public void itemStateChanged(ItemEvent ie) {
		//ģ�� ����Ʈ���� Ŭ���Ǹ� �ش� �������� ���ܵ� ģ���� ������.
		if(ie.getSource() == fl.getListFriend()) {
//			System.out.println("ģ��");
			blockFriend();
		}//end if
		//���ܵ� ģ�� ����Ʈ���� Ŭ���� �ش� �������� ģ������Ʈ�� ������.
		if(ie.getSource() == fl.getListBlockFriend()) {
//			System.out.println("ģ���� �ƴ�");
			unblockFriend();
		}//end if
		
	}//itemStateChanged

	@Override
	//Button �̺�Ʈ ó��
	public void actionPerformed(ActionEvent ae) {

		// >> : ��� ģ���� ���� ������� �̵�
		if(ae.getSource() == fl.getBtnAllBlock()) {
			allBlock();
		}//end if
		
		// << : ���ܵ� ��� ģ���� ģ��������� �̵�
		if(ae.getSource() == fl.getBtnAllUnblock()) {
			allUnBlock();
		}//end if
		
	}//actionPerformed
	
	/**
	 * ����Ʈ���� ������ ģ���� �����ϴ� method
	 */
	private void blockFriend() {
		List tempFriend = fl.getListFriend();
		//������ ģ���� ���ͼ�
		String name = tempFriend.getSelectedItem();
		//�������� ������.
		fl.getListBlockFriend().add(name);
		//������ ģ���� ����
		fl.getListFriend().remove(name);
	}//blockFriend

	/**
	 * ������ ģ���� ģ������Ʈ�� �̵��ϴ� method
	 */
	private void unblockFriend() {
		//���ܵ� ģ������Ʈ���� ������ �̸��� �޾ƿͼ�
		List tempList = fl.getListBlockFriend();
		//ģ�� ����Ʈ�� �߰��ϰ�
		int selectedIndex = tempList.getSelectedIndex();
		fl.getListFriend().add(tempList.getItem(selectedIndex));
		//���ܵ� ģ������Ʈ���� �����Ѵ�.
		fl.getListBlockFriend().remove(tempList.getItem(selectedIndex));
	}//blockFriend

	/**
	 * &gt;&gt; ��ư�� Ŭ���ϸ� ��� ģ������
	 */
	private void allBlock() {
		//ģ�� ����Ʈ�� ��� �������� �޾ƿͼ�
		String[] arrFriend = fl.getListFriend().getItems();
		//���� ����Ʈ�� ������.
		for(int i = 0; i < arrFriend.length; i++) {
			fl.getListBlockFriend().add(arrFriend[i]);
		}//end for
		fl.getListFriend().removeAll();
	}//allBlock

	/**
	 * &gt;&gt; ��ư�� Ŭ���ϸ� ���ܵ� ���ģ���� ģ������Ʈ�� �̵�
	 */
	private void allUnBlock() {
		//���ܵ� ��� ģ������� �޾ƿͼ�
		String[] arrBlockList = fl.getListBlockFriend().getItems();
		//ģ����Ͽ� �߰��ϰ�
		for(String name : arrBlockList) {
			fl.getListFriend().add(name);
		}
		fl.getListBlockFriend().removeAll();
		//���ܵ� ��� ģ������� ����
	}//allUnBlock
	
	
}//class
