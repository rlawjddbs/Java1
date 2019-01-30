package day1203;

/**
 * 사람의 공통특징을 부모(Person)로 부터 사용하고 자신만의 특징(싸움을 잘한다)만 정의
 * 
 * @author owner
 */
public class HongGilDong extends Person {
	private int level; // 싸움 레벨

	/**
	 * 홍길동은 싸움을 평민보다 잘하므로 7로 시작
	 */
	public HongGilDong() {// 기본 생성자 : 객체가 생성되었을 때 변수에게 초기값을 초기화 한다.
		super(2, 1, 1);
		level = 7;
	}// HongGilDong

	/**
	 * 싸움 하는 일 : 입력된 레벨보다 낮다면 패배, 입력된 레벨보다 높다면 승리, 입력된 레벨과 같다면 비김.<br>
	 * 승리하면 레벨이 1증가, 패배하면 레벨이 1감소, 비기면 레벨 변화 없음. 레벨은 최대 10, 최소 1을 가진다.
	 * 
	 * @param intputLevel 싸움 상대자의 레벨
	 * @return 싸움의 결과
	 */
	public String fight(int inputLevel) {
		String result = "";
		if (level > inputLevel) {// 승리
			result = "이겼다. s('.^)V";
			level++;
			if (level > 10) {
				level = 10;
			} // end if
		} else if (level < inputLevel) {// 패배
			result = "졌다. ~(_-_)~";
			level--;
			if (level < 1) {
				level = 1;
			} // end if
		} else {// 비김
			result = "비김 ㅡㅡ+;;";
		} // end else
		return result;
	}// fight

	// annotation
	// ↓컴파일러에게 컴파일 할 때 오버라이딩이 잘 되었는지 체크해보라는 명령을 내린다.
	@Override
	public String toString() {
		return "홍길동 객체의 값 : 눈 : " + getEye() + ", 코 : " + getNose() + ", 입 : " + getMouth();
	}// toString

	@Override
	public String eat() {
		return getName() + "이 집에서 밥을 먹는다.";
	}

	/**
	 * 부모 클래스가 제공하는 eat() method의 기능이 자식 클래스에서<br>
	 * 사용하기 적합하지 않아 식당이 주막으로 변경<br>
	 * 화폐단위인 원이 냥으로 변경
	 */
	@Override
	public String eat(String menu, int price) {
		return getName() + "이 주막에서 " + menu + "인 음식을 " + price + "냥 내고 사먹는다.";
	}// eat

	
}// class
