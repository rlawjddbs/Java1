package day1123;

/**
 *	1. 금요일에 만든 라면 클래스에 기본생성자와 인자있는 생성자를 정의한 후,
 *	해당 생성자를 사용하여 객체를 생성하고 사용할 것.
 *	
 *	2. 그후 책 읽기 182 ~ 207p String 배열의 초기화까지
 *		214 ~ 220p 다차원 배열의 활용 전까지
 * @author owner
 */
public class Work22 {

	public static void main(String[] args) {
		Noodle nd = new Noodle();
		
		System.out.println(nd.baking());
		
		Noodle nd1 = new Noodle("신라면", "농심", 2, 4, 850);
		System.out.println(nd1.baking());
	}

}
