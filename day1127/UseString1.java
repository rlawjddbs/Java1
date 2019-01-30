package day1127;

public class UseString1 {
	//이메일을 입력받아 이메일의 유효성을 검증하여 boolean형으로
	//결과를 만들어 반환하는 일을 하는 method를 만들어 호출하여 사용해보세요.
	
	/*public static boolean email(String email) {
		boolean check=false;
		if (email.indexOf("@") != -1 && email.length() > 5) {
			check = true;
		}
		return check;
	}//email */ //내가 한거
	private boolean validEmail(String email) {
//		boolean flag=false;
//		if(email.length() > 5 && email.indexOf("@") != -1 && email.indexOf(".") != -1) {
//			flag=true;
//		}//end if;
		boolean flag = email.length() > 5 && email.contains("@") && email.contains(".");
		return flag;
	}//validEmail
	
	//'시군구' 형태의 주소를 n개 입력받아 서울인지 아닌지를 판단하여
	//출력하는 method
	
	public static void main(String[] args) {
		/*System.out.println(email("zeongyun@gmail.com"));
		System.out.println(email("zeongyungmail.com"));
		System.out.println(email(""));
		System.out.println(email("@"));
		System.out.println(email("@   "));*/
		
		UseString1 us1 = new UseString1();
		String email="kjya@.";
		if(us1.validEmail(email)) {
			System.out.println(email+" 유효");
		}else {
			System.out.println(email+" 무효");
		}//end else
			
	}//main

}//class
