package day1121;

/**
 * 1. while을 사용하여 구구단 전체 단을 출력하는 instance method를<br>
 * 작성하고, 호출하세요.<br>
 * 
 * 2. do~while을 사용하여 아래의 형태의 *을 출력하는 static method를<br>
 * 작성하여 호출하세요.<br>
 * <br>
 ** <br>
 *** <br>
 **** <br>
 * 
 * @author owner
 */
public class Work19 {
	
	// 숙제 1.
	public void printGgd() {
		int i = 2, j;
		while (i < 10) {
			System.out.println("----------------------" + i + "단 시작---------------------");
			j = 1;
			while (j < 10) {
				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			}//end while
			System.out.println("----------------------------------------------------");
			i++;
		}//end while
	}//printGgd
	
	// 숙제 2.
//	public static void printStars() {
//		int i=0, j=0;
//		do {
//			i++;
//			System.out.println("*");
//			System.out.println("**");
//			System.out.println("***");
//			System.out.println("****");
//		}while(false);
//	}//pointStars
	
	public static void printStars2() {
		int i=0, j;
		do {
			j=0;
			while(j<i) {
				System.out.print("*");
				j++;
			}
			System.out.println("*");
			i++;
		}while(i<4);
	}//pointStars
	
	
	public static void main(String[] args) {
		// 숙제 1.
		Work19 ggd = new Work19();
		ggd.printGgd();

		// 숙제 2.
		Work19.printStars2();
	}//main
}//class
