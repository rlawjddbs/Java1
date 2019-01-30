package day1129;

/**
 * 사람의 공통특징을 부모(Person)로 부터 사용하고 자신만의 특징(철권을 잘한다)만 정의
 * 
 * @author owner
 *
 */
public class Kjy extends Person {
	private int tekken;
	private int pullUp;

	public Kjy() {// 기본 생성자 : 객체가 생성되었을 때 변수를 초기화 한다.
		this(7, 15);
//		tekken = 7;
//		pullUp = 15;
	}// Kjy

	public Kjy(int tekken, int pullUp) {
		this.tekken = tekken;
		this.pullUp = pullUp;
	}// Kjy

	public void setTekken(int tekken) {
		this.tekken = tekken;
	}// setTekken

	public void setPullUp(int pullUp) {
		this.pullUp = pullUp;
	}// setPullUp

	public int getTekken() {
		return tekken;
	}//getTekken
	public int getPullUp() {
		return pullUp;
	}//getPullUp

	public String playTekken(int challenger) {
		String result = "";
		if(tekken > challenger) {
			tekken++;
			result = "이겼다. o(^_^o) (o^_^)o\n현재 레벨 : "+String.valueOf(tekken);
		} else if(tekken < challenger) {
			tekken--;
			limitTekken();
			result = "졌다.... ˇ_ˇ....\n현재 레벨 : "+String.valueOf(tekken);
		} else {
			result="비김 ㅡㅡ?\n현재 레벨 : "+String.valueOf(tekken);
		}//end else
		return result;
	}//playTekken
	
	public String food(String food) {
		String result = "";
		if(food.equals("치킨")) {
			pullUp--;
			limitPullUp();
			result = food+"를 먹었더니 풀업 횟수가 "+pullUp+"회로 줄었다";
		} else if (food.equals("치즈케익")) {
			pullUp -= 2;
			limitPullUp();
			result = food+"를 먹었더니 풀업 횟수가 "+pullUp+"회로 줄었다";
		} else {
			pullUp++;
			result = food+"를 먹어도 "+pullUp+"회 풀업을 했다.";
		}
		return result;
	}
	
	public void limitTekken() {
		if(tekken < 1) {
			tekken = 1;
		}
	}//limitTekken
	public void limitPullUp() {
		if(pullUp < 10) {
			pullUp = 10;
		}
	}//limitPullUp
	
	
}// class
