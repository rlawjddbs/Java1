package day1129;

/**
 * ����� ����Ư¡�� �θ�(Person)�� ���� ����ϰ� �ڽŸ��� Ư¡(ö���� ���Ѵ�)�� ����
 * 
 * @author owner
 *
 */
public class Kjy extends Person {
	private int tekken;
	private int pullUp;

	public Kjy() {// �⺻ ������ : ��ü�� �����Ǿ��� �� ������ �ʱ�ȭ �Ѵ�.
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
			result = "�̰��. o(^_^o) (o^_^)o\n���� ���� : "+String.valueOf(tekken);
		} else if(tekken < challenger) {
			tekken--;
			limitTekken();
			result = "����.... ��_��....\n���� ���� : "+String.valueOf(tekken);
		} else {
			result="��� �Ѥ�?\n���� ���� : "+String.valueOf(tekken);
		}//end else
		return result;
	}//playTekken
	
	public String food(String food) {
		String result = "";
		if(food.equals("ġŲ")) {
			pullUp--;
			limitPullUp();
			result = food+"�� �Ծ����� Ǯ�� Ƚ���� "+pullUp+"ȸ�� �پ���";
		} else if (food.equals("ġ������")) {
			pullUp -= 2;
			limitPullUp();
			result = food+"�� �Ծ����� Ǯ�� Ƚ���� "+pullUp+"ȸ�� �پ���";
		} else {
			pullUp++;
			result = food+"�� �Ծ "+pullUp+"ȸ Ǯ���� �ߴ�.";
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
