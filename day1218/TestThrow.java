package day1218;

import java.util.Random;

/**
 * ���ܸ� ������ �߻�
 * 
 * @author owner
 */
public class TestThrow {
	String[] grade = { "�ʵ��л�", "���л�", "����л�" };
	String randomGd = grade[new Random().nextInt(grade.length)];
	
	/**
	 * ���� ���ٰ� ��踦 �ǿ�� �л��� ���� ���ǻ�ȸ�� �����Ѵ�.
	 */
	public void teacksung() throws Exception {

		if (randomGd.equals("�ʵ��л�")) {
//			try {
			throw new Exception(randomGd + " ��Ե� �ݿ��ؾ��ϴ� �κ�������?");
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		} else {
			System.out.println(randomGd + "�� ��踦 �ǿ�� ��ô ��������. ('' )( '')");
		} // end else

	}// teacksung
	
	
	public void teacksung2() throws TobaccoException {
		
		if (randomGd.equals("�ʵ��л�")) {
			throw new TobaccoException();
		} else {
			System.out.println(randomGd + "�� ��踦 �ǿ�� ��ô ��������. ('' )( '')");
		} // end else
		
	}// teacksung

	public static void main(String[] args) {
		TestThrow tt = new TestThrow();
		try {
			tt.teacksung();
		} catch (Exception e) {
			e.printStackTrace();
		}//end catch
		
		System.out.println("---------------------------------------");
		
		try {
			tt.teacksung2();
		} catch (TobaccoException e) {
			e.printStackTrace();
		}//end catch
		
	}// main
}// class
