package day1123;

/**
 * 라면을 추상화하여 만든 클래스<br>
 * 명사적 특징 : 라면이름, 제조사, 스프개수, 끓이는시간, 가격<br>
 * 동사적 특징 : 봉투가 뜯긴다, 면과 스프가 끓는물에 담긴다, 지정시간동안 끓여진다, 섭취된다.<br>
 * <br>
 * 
 * 라면 - 명시적 : 면, 스프, 패키지... 동사적 : 끓여, 뿌셔 ...
 * 
 * 객체화) Noodle 객체명 = new Noodle();<br>
 * 생성된 객체로 먹는일을 할 수 있다.
 * 
 * @author owner
 */
public class Noodle {
	private String name, maker;
	private int soup, time, price;
//	/**
//	 * 생성된 라면 객체가 가지고 있는 이름을 설정하는 일.
//	 * @param name 라면 이름
//	 */
//	public void setName(String name) {
//		if(name == "너구리" || name == "오징어짬뽕" || name == "신라면") {
//		this.name = name;
//		}else {
//			System.out.println("=====라면 이름 Error. 라면의 이름을 \"너구리\", \"오징어짬뽕\", \"신라면\"중에 하나로 설정하세요.=====\r\n");
//		}
//	}//setName

//	/**
//	 * 생성된 라면 객체가 가지고 있는 제조사명을 설정 하는 일.
//	 * @param maker 라면 제조사
//	 */
//	public void setMaker(String maker) {
//		if(maker=="농심") {
//		this.maker = maker;
//		} else {
//			System.out.println("=====제조사 Error. 제조사는 농심 제품만 입력가능 합니다.");
//		}
//	}//setMaker
//	
//	/**
//	 * 생성된 라면 객체가 가지고 있는 스프 개수를 설정하는 일.
//	 * @param soup 스프 
//	 */
//	public void setSoup(int soup) {
//		this.soup = soup;
//	}//setSoup
//	
//	/**
//	 * 생성된 라면 객체가 가지고 있는 라면 제품의 끓이는 시간을 설정하는 일.
//	 * @param time 끓이는 시간 
//	 */
//	public void setTime(int time) {
//		this.time = time;
//	}//setTime
//	/**
//	 * 생성된 라면 객체가 가지고 있는 가격을 설정하는 일.
//	 * @param price 라면의 가격 
//	 */
//	public void setPrice(int price) {
//		this.price = price;
//	}//setPrice

	/**
	 * 기본 생성자로 라면 객체가 생성되면 안성탕면, 농심, 스프1개, 조리시간 4분, 가격 750인
	 * 라면 객체를 생성한다. <br>
	 * 11-26-2018 코드 추가
	 * 
	 */
	public Noodle() {
		this("안성탕면", "농심", 1, 4, 750);
	}//Noodle

	/**
	 * 인자가 있는 생성자 - "안성탕면", "농심", 스프1개, 조리시간 4분, 가격 750원이 아닌 라면을
	 * 생성할 때 사용하는 생성자<br>
	 * 라면이름, 제조사명, 스프개수, 조리시간, 가격을 입력받아 라면객체를 생성.
	 * @param name 라면의 이름
	 * @param maker 제조사명
	 * @param soup 스프개수
	 * @param time 조리시간
	 * @param price 가격
	 */
	public Noodle(String name, String maker, int soup, int time, int price) {
		this.name = name;
		this.maker = maker;
		this.soup = soup;
		this.time = time;
		this.price = price;
	}

	/**
	 * 생성된 라면 객체가 가지고 있는 이름을 반환하는 일.
	 * 
	 * @return 라면의 이름
	 */
	public String getName() {
		return name;
	}// getName

	/**
	 * 생성된 라면 객체가 가지고 있는 제조사를 반환하는 일.
	 * 
	 * @return 제조사의 이름
	 */
	public String getMaker() {
		return maker;
	}// getMaker

	/**
	 * 생성된 라면 객체가 가지고 있는 스프 개수를 반환하는 일.
	 * 
	 * @return 스프의 개수
	 */
	public int getSoup() {
		return soup;
	}// getSoup

	/**
	 * 생성된 라면 객체가 가지고 있는 라면 제품의 끓이는 시간을 반환하는 일.
	 * 
	 * @return 라면 끓이는 시간(분)
	 */
	public int getTime() {
		return time;
	}// getTime

	/**
	 * 생성된 라면 객체가 가지고 있는 가격을 반환하는 일.
	 * 
	 * @return 라면 가격(원)
	 */
	public int getPrice() {
		return price;
	}// getPrice

	/**
	 * 동사적 특징<br>
	 * 생성된 라면객체가 끓여지는 일 구현.
	 * 
	 * @return 결과
	 */
	public String baking() {
		String msg = "";
		if (name != null) {
			msg = "[" + getMaker() + "]사의 [" + getName() + "], 정가 [" + getPrice() + "]원으로, 끓는물에 면 하나와 스프 [" + getSoup()
					+ "]개를 넣고 [" + getTime() + "]분간 끓여먹는다.";
		}
		return msg;
	}// baking

}// class
