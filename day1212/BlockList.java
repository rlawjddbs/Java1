package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;

/**
 *	Has a 관계로 Event 처리
 * @author owner
 */
@SuppressWarnings("serial")
public class BlockList extends Frame {
//	라벨2개 리스트2개 버튼2개
	private Label lblL;
	private Label lblR;
	
	private List listL;
	private List listR;
	
	private Button btnL;
	private Button btnR;
	
	private TextField tf;
	public BlockList() {
		super("절교 관리");
		setLayout(null);
		
		
		lblL = new Label("친구 목록");
		lblR = new Label("차단된 친구");
		lblL.setBounds(50, 50, 80, 30);
		lblR.setBounds(200, 50, 80, 30);
		
		btnR = new Button(">>");
		btnL = new Button("<<");
		btnR.setBounds(145, 150, 40,20);
		btnL.setBounds(145, 190, 40,20);
		
		listL = new List();
		listL.setBounds(50, 80, 80, 200);
		listL.add("이재찬");
		listL.add("이재현");
		listL.add("정택성");
		
		listR = new List();
		listR.setBounds(200, 80, 80, 200);
		
		tf = new TextField();
		tf.setBounds(120, 300, 100, 20);
		//이벤트 추가
		HasAEventHandling heh = new HasAEventHandling(this);
		btnL.addActionListener(heh);
		btnR.addActionListener(heh);
		listL.addItemListener(heh);
		listR.addItemListener(heh);
		tf.addActionListener(heh);
		
		addWindowListener(heh);
		
		add(lblL);
		add(lblR);
		add(btnL);
		add(btnR);
		add(listL);
		add(listR);
		add(tf);
		setBounds(200, 200, 330, 350);
		
		setVisible(true);
		
		
	}//기본 생성자
	
	public List getListL() {
		return listL;
	}
	public List getListR() {
		return listR;
	}

	public Button getBtnL() {
		return btnL;
	}
	public Button getBtnR() {
		return btnR;
	}
	public TextField getTf() {
		return tf;
	}
	
	
	public static void main(String[] args) {
		new BlockList();
	}//main

}//class
