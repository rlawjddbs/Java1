package day1127;

public class UseString1 {
	//�̸����� �Է¹޾� �̸����� ��ȿ���� �����Ͽ� boolean������
	//����� ����� ��ȯ�ϴ� ���� �ϴ� method�� ����� ȣ���Ͽ� ����غ�����.
	
	/*public static boolean email(String email) {
		boolean check=false;
		if (email.indexOf("@") != -1 && email.length() > 5) {
			check = true;
		}
		return check;
	}//email */ //���� �Ѱ�
	private boolean validEmail(String email) {
//		boolean flag=false;
//		if(email.length() > 5 && email.indexOf("@") != -1 && email.indexOf(".") != -1) {
//			flag=true;
//		}//end if;
		boolean flag = email.length() > 5 && email.contains("@") && email.contains(".");
		return flag;
	}//validEmail
	
	//'�ñ���' ������ �ּҸ� n�� �Է¹޾� �������� �ƴ����� �Ǵ��Ͽ�
	//����ϴ� method
	
	public static void main(String[] args) {
		/*System.out.println(email("zeongyun@gmail.com"));
		System.out.println(email("zeongyungmail.com"));
		System.out.println(email(""));
		System.out.println(email("@"));
		System.out.println(email("@   "));*/
		
		UseString1 us1 = new UseString1();
		String email="kjya@.";
		if(us1.validEmail(email)) {
			System.out.println(email+" ��ȿ");
		}else {
			System.out.println(email+" ��ȿ");
		}//end else
			
	}//main

}//class
