package day1205;

/**
 *	1970년01월01일 00:00:00초로부터 현재 날짜의 시간을
 *	ms(밀리초)로 얻어내는 System.currentTimeMillis() 사용
 * @author owner
 */
public class UseCurrentTime {

	
	public void test() {
		long sum=0;
			for(int i=0; i < 10000; i++) {
				sum=sum+i;
				System.out.println(i);
			}//end for
		
	}//test
	
	/**
	 * 코드의 수행시간을 알아보는 방법
	 * 각 프로세스를 System.currentTimeMillis(); 로 감싸준다.
	 */
	public static void main(String[] args) {
		UseCurrentTime uct = new UseCurrentTime();
		long[] avgTime = new long[17];
		long st=0, et = 0;
		for(int i = 0; i < avgTime.length; i++) {
			st=System.currentTimeMillis();
			uct.test();
			et=System.currentTimeMillis();
			avgTime[i]=(et-st);
			System.out.println(avgTime[i]);
		}//end for
		
		
//		long et = System.currentTimeMillis();
//		uct.test();
//		long st = System.currentTimeMillis();
//		System.out.println((et-st)+"ms");
	}//main
	
}//UseCurrentTime
