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
	// 리스트 선언
	private Map<String, Color> colorMap;

	// 라벨, 텍스트필드, 리스트, 패널 컴포넌트 선언
	private Label label;
	private Choice list;
	private TextField tf;
	private Panel leftP;
	private Panel rightP;
	private Panel totalP;
	private Color nowColor;
	
	public Work1211() {
		// 맵 생성 및 키워드, 값 입력
		colorMap = new HashMap<String, Color>();
		colorMap.put("색선택", nowColor);
		colorMap.put("검은색", Color.BLACK);
		colorMap.put("파랑색", Color.BLUE);
		colorMap.put("빨강색", Color.RED);
		colorMap.put("녹　색", Color.GREEN);
		colorMap.put("선홍색", Color.MAGENTA);

		// 라벨, 텍스트필드, 리스트, 패널 컴포넌트 생성
		label = new Label("Label");
		tf = new TextField("오늘은 화요일");
		tf.setFont(new Font("Dialog", Font.BOLD, 20));
		list = new Choice();
		list.add("색선택");
		list.add("검은색");
		list.add("파랑색");
		list.add("빨강색");
		list.add("녹　색");
		list.add("선홍색");
		
		//왼쪽 패널(2행 1열)에 라벨과 텍스트필드 삽입
		leftP = new Panel(new GridLayout(2, 1));
		leftP.add(label);
		leftP.add(tf);

		//오른쪽 패널에 리스트 삽입
		rightP = new Panel();
		rightP.add(list);

		//종합 패널의 왼쪽, 오른쪽에 각각의 패널 삽입
		totalP = new Panel();
		totalP.add("West", leftP);
		totalP.add("East", rightP);

		//리스트 이벤트 등록
		list.addItemListener(this);
		
		//윈도우 레이아웃 설정
		setLayout(new BorderLayout());
		//윈도우 중앙에 종합 패널 삽입
		add("Center", totalP);
		
		//윈도우 좌표 및 크기설정
		setBounds(300, 300, 300, 200);
		//사용자에게 보여주기
		setVisible(true);

		// 종료 처리
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
	
	// 초이스의 변화가 감지되면 이벤트 실행
	@Override
	public void itemStateChanged(ItemEvent e) {
		String readItem = list.getSelectedItem();
		Color colorVal = colorMap.get(readItem);
		nowColor = Color.BLUE;
		tf.setForeground(colorVal);
	}//itemStateChanged
	

}// class
