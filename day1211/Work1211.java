package day1211;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

/**
 * @author owner
 *
 */
public class Work1211 extends Frame implements ItemListener {
	// ����Ʈ ����
	private Map<String, Color> colorMap;

	// ��, �ؽ�Ʈ�ʵ�, ����Ʈ, �г� ������Ʈ ����
	private Label label;
	private Choice list;
	private TextField tf;
	private Panel leftP;
	private Panel rightP;
	private Panel totalP;
	private Color nowColor;
	
	public Work1211() {
		// �� ���� �� Ű����, �� �Է�
		colorMap = new HashMap<String, Color>();
		colorMap.put("������", nowColor);
		colorMap.put("������", Color.BLACK);
		colorMap.put("�Ķ���", Color.BLUE);
		colorMap.put("������", Color.RED);
		colorMap.put("�졡��", Color.GREEN);
		colorMap.put("��ȫ��", Color.MAGENTA);

		// ��, �ؽ�Ʈ�ʵ�, ����Ʈ, �г� ������Ʈ ����
		label = new Label("Label");
		tf = new TextField("������ ȭ����");
		tf.setFont(new Font("Dialog", Font.BOLD, 20));
		list = new Choice();
		list.add("������");
		list.add("������");
		list.add("�Ķ���");
		list.add("������");
		list.add("�졡��");
		list.add("��ȫ��");
		
		//���� �г�(2�� 1��)�� �󺧰� �ؽ�Ʈ�ʵ� ����
		leftP = new Panel(new GridLayout(2, 1));
		leftP.add(label);
		leftP.add(tf);

		//������ �гο� ����Ʈ ����
		rightP = new Panel();
		rightP.add(list);

		//���� �г��� ����, �����ʿ� ������ �г� ����
		totalP = new Panel();
		totalP.add("West", leftP);
		totalP.add("East", rightP);

		//����Ʈ �̺�Ʈ ���
		list.addItemListener(this);
		
		//������ ���̾ƿ� ����
		setLayout(new BorderLayout());
		//������ �߾ӿ� ���� �г� ����
		add("Center", totalP);
		
		//������ ��ǥ �� ũ�⼳��
		setBounds(300, 300, 300, 200);
		//����ڿ��� �����ֱ�
		setVisible(true);

		// ���� ó��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}// windowClosing
		});// addWindowListener
		
		
		
	}// Work1211

	public static void main(String[] args) {
		new Work1211();
	}// main

	public Color getColor() {
		nowColor = tf.getForeground();
		return nowColor;
	}
	
	// ���̽��� ��ȭ�� �����Ǹ� �̺�Ʈ ����
	@Override
	public void itemStateChanged(ItemEvent e) {
		String readItem = list.getSelectedItem();
		Color colorVal = colorMap.get(readItem);
		nowColor = Color.BLUE;
		tf.setForeground(colorVal);
	}//itemStateChanged
	

}// class
