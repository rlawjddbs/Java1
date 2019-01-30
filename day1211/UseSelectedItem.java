package day1211;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class UseSelectedItem extends Frame{

	public UseSelectedItem() {
		
		Label label = new Label("이름 :               나이 : ");
		
		List list = new List();
		list.setSize(200, 200);
		list.add("이재찬 / 27");
		list.add("정택성 / 26");
		list.add("공선의 / 27");
		
		Panel panel = new Panel();
		panel.setSize(200, 200);
		panel.add(list);
		
		setLayout(new BorderLayout());
		
		add("Center", panel);
		add("South", label);
		
		setBounds(300, 200, 300, 300);
		
		setVisible(true);
		
		
	}//UseSelectedItem
	
	public static void main(String[] args) {
		new UseSelectedItem();
	}//main
	
	public class WindowImpl extends WindowAdapter{
		
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
		}//windowClosing
		
	}//inner class

}//class
