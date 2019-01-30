package day1205;

/**
 * Math : ��ü�� �������� �ʰ� ����ϴ� Ŭ����
 * 
 * @author owner
 */
public class UseMath {

	public UseMath() {
//		Math m = new Math(); // ������ ����, ��ü���� �ȵ� (java-api.html ����)
		int i = -10;
		System.out.println(i + "�� ���밪 : " + Math.abs(i));
		System.out.println(Math.ceil(10.1)); // �ø�
		System.out.println(Math.round(10.1)); // �ݿø�, �Ҽ��� ���� ù�ڸ�����
		System.out.println(Math.floor(10.5)); // ����, �Ҽ��� ���� ù�ڸ�����

		double d = Math.random(); // �Ҽ����� �����Ͽ� 17�ڸ��� �Ҽ��� ����
		System.out.println("�߻��� ���� : " + d);
		System.out.println("������ ������ ���� : " + d * 5);
		System.out.println("������ ������ �������� ���� : " + (int) d * 5); // 0�� ����. int������ ĳ���ý� �Ǽ��θ� �� �����ϰ� �ǹǷ� d*5�� ���� ������ int������
																// ����ȯ �ؾ��Ѵ�.
		System.out.println("������ ������ �������� ���� : " + (int) (d * 5));

		// A(65)-Z(90) �� �ϳ��� ���ڸ� ��ȯ�ϴ� ��
		System.out.println((char) ((d * 26) + 65));

		System.out.println(createPassword());
	}// UseMath

	/**
	 * ��й�ȣ ������ (��й�ȣ ���ȼ� üũ http://www.passwordmeter.com/)<br>
	 * 65 ~ 90 �빮��<br>
	 * 97 ~ 122 �ҹ���<br>
	 * 48 ~ 57 ����
	 * 
	 * @return
	 */
	public char[] createPassword() {
		// xcxxxx***** (����ŷ�������� �����ϵ���), AbcEdg3 (�ӽ� ����� �����ϵ���)
		// �����ڴ빮��, �ҹ���, ���ڷ� �̷���� ������ ��й�ȣ 8�ڸ��� �����Ͽ� ��ȯ�ϴ� ��
		char[] tempPass = new char[8];
		
//		���� �� ��
		double charOrNum = 0;
		for (int i = 0; i < tempPass.length; i++) {
			charOrNum = (int) (Math.random() * 3);
			if (charOrNum == 0) {//�빮�� ���ĺ�
				tempPass[i] = (char) ((int) ((Math.random() * 26) + 65));
			} else if (charOrNum == 1) {//�ҹ��� ���ĺ�
				tempPass[i] = (char) ((int) ((Math.random() * 26) + 97));
			} else {//����
				tempPass[i] = (char) ((int) ((Math.random() * 9) + 48));
			} // end if
		} // end for
		return tempPass;
		
		// �迭[3] ���� �������� 
		
//		//�������� Ǯ���� ��
//		String flag="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//		
//		for(int i=0; i < tempPass.length; i++) {
//			tempPass[i] = flag.charAt( (int)(Math.random()*flag.length()) );
//		}//end for
//		return tempPass;
	}// createPassword;

	public static void main(String[] args) {
		new UseMath();
	}// main
}// UseMath
