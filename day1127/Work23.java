package day1127;

/**
 * ���� 1. �ֹι�ȣ�� �Է¹޾� ó���ϴ� ���α׷� �ۼ�.<br>
 * �� �۾��� method�� �����ϰ� ȣ���Ͽ� ����� �޾Ƽ� ó�� (��ȯ���� ������ ó��)<br>
 * 1-1. �����ڴ� �ֹι�ȣ�� �޾� instance ������ �Ҵ��Ѵ�.<br>
 * - �ν��Ͻ� ������ �� ���<br>
 * 1-2. �ֹι�ȣ�� ���̸� üũ�Ͽ� 14�ڰ� �ƴϸ� false ��ȯ<br>
 * 1-3. �ֹι�ȣ�� 6��° �ڸ��� "-"�� �ƴϸ� false ��ȯ<br>
 * 1-4. �ֹι�ȣ�� ��ȿ�� �����Ͽ� ��ȿ�ϸ� true �׷��� ������ false ��ȯ<br>
 * �� �ڸ��� 2 3 4 5 6 7 8 9 2 3 4 5 �� ���� ����<br>
 * ���Ͽ� 11�� ���� ������ ���� ��� 11���� �� ���� ����<br>
 * 10���� ���� �������� �ֹι�ȣ�� ���ڸ��� ���ٸ� true || false<br>
 * 1-5. ������� ��ȯ�ϴ� ��. 1988-11-11 �� ������ ��ų ��.<br>
 * 1-6. ���̸� ��ȯ�ϴ� ��. ex) 31<br>
 * 1-7. ������ ��ȯ ex) "��", "��"<br>
 * 1-8. ������/�ܱ��� ��ȯ - �ֹι�ȣ 7��° �ڸ��� 1, 2, 3, 4�� ������, 5,6,7,8�� �ܱ���<br>
 * 1-9. �츦 ��ȯ ex) "���"
 * 
 * if(1-2method()){<br>
 * if(1-3 method()){<br>
 * if(1-4 method()){<br>
 * S.o.p(1-5method());<br>
 * S.o.p(1-6method());<br>
 * S.o.p(1-7method());<br>
 * S.o.p(1-8method());<br>
 * S.o.p(1-9method());<br>
 * }else{<br>
 * S.o.p("�߸��� �ֹι�ȣ");<br>
 * }//end else in 1-4method<br>
 * }<br>
 * }
 * 
 * @author owner
 */
public class Work23 {
	String ssn;

	public Work23(String ssn) { // 1-1 method
		this.ssn = ssn;
	}// Work23

	boolean ssnLength() { // 1-2 method
//		return this.ssn.length()==14;
		// ������ �ϳ����̶� this ��������
		return ssn.length() == 14;
	}// ssnLengthCheck

	boolean ssnHyphen() { // 1-3 method
		return ssn.charAt(6) == '-'; // charAt()�� ���ڿ� ���ͷ��� �ƴ� ���� ���ͷ��� �����´�.
	}// ssnHyphen

	boolean validSsn() { // 1-4 method
		int[] arrSsn = new int[13];
		int total = 0; // �ֹι�ȣ �� �ڸ����� ����� ������ ��� ���� ������ ����
		int j = 2; // ���꿡 Ȱ��� ����
		for (int i = 0; i < arrSsn.length; i++) {
			if (j > 9) {
				j = 2;
			}
			if (i > 5) {
				arrSsn[i] = Integer.parseInt(ssn.substring(i + 1, i + 2));
			} else {
				arrSsn[i] = Integer.parseInt(ssn.substring(i, i + 1));
			} // end else
			if (i < 12) {
				total += arrSsn[i] * j;
			}
			j++;
		} // end for
		total = (11 - total % 11) % 10;
		return total == Integer.parseInt(ssn.substring(13, 14));

	}// validSsn

	String birth() { // 1-5 method
		String birth;
		int sevenSsn = Integer.parseInt(ssn.substring(7, 8));
		if (sevenSsn == 1 || sevenSsn == 2 || sevenSsn == 5 || sevenSsn == 6) {// ����;
			birth = "19".concat(ssn.substring(0, 2)).concat("-").concat(ssn.substring(2, 4)).concat("-")
					.concat(ssn.substring(4, 6)); // ���� �Ф�
		} else if (sevenSsn == 3 || sevenSsn == 4 || sevenSsn == 7 || sevenSsn == 8) {
			birth = "20".concat(ssn.substring(0, 2)).concat("-").concat(ssn.substring(2, 4)).concat("-")
					.concat(ssn.substring(4, 6)); // ���� �Ф�
		} else {
			birth = "18".concat(ssn.substring(0, 2)).concat("-").concat(ssn.substring(2, 4)).concat("-")
					.concat(ssn.substring(4, 6)); // ���� �Ф�
		} // end else
		return birth;
	}// birth

	int age() { // 1-6 method
		int sevenSsn = Integer.parseInt(ssn.substring(7, 8));
		int birthYear;
		if (sevenSsn == 1 || sevenSsn == 2 || sevenSsn == 5 || sevenSsn == 6) {
			birthYear = 1900 + Integer.parseInt(ssn.substring(0, 2));
		} else if (sevenSsn == 3 || sevenSsn == 4 || sevenSsn == 7 || sevenSsn == 8) {
			birthYear = 2000 + Integer.parseInt(ssn.substring(0, 2));
		} else {
			birthYear = 1800 + Integer.parseInt(ssn.substring(0, 2));
		}
		return 2018 - birthYear + 1;
	}// age

	char gen() { // 1-7 method
		String sevenSsn = ssn.substring(7, 8);
		char gen;
		if (sevenSsn.equals("1") || sevenSsn.equals("3") || sevenSsn.equals("5") || sevenSsn.equals("7")
				|| sevenSsn.equals("9")) {
			gen = '��';
		} else {
			gen = '��';
		} // end else
		return gen;
	}// gen

	String local() { // 1-8 method
		String sevenSsn = ssn.substring(7, 8);
		String local;
		if (sevenSsn.equals("0") || sevenSsn.equals("1") || sevenSsn.equals("2") || sevenSsn.equals("3")
				|| sevenSsn.equals("4") || sevenSsn.equals("9")) {
			local = "����";
		} else {
			local = "�ܱ�";
		} // end else
		return local;
	}// local

	String zodiacSign() {
		int calc = Integer.parseInt(birth().substring(0, 4)) % 12;
		String[] zodiacSign = new String[12];
		zodiacSign[0] = "������";
		zodiacSign[1] = "��";
		zodiacSign[2] = "��";
		zodiacSign[3] = "����";
		zodiacSign[4] = "��";
		zodiacSign[5] = "��";
		zodiacSign[6] = "ȣ����";
		zodiacSign[7] = "�䳢";
		zodiacSign[8] = "��";
		zodiacSign[9] = "��";
		zodiacSign[10] = "��";
		zodiacSign[11] = "��";
		return zodiacSign[calc];
	}

	public static void main(String[] args) {
		// ���� ����
		String ssn = "890906-1692421";
		// ��ü ����
		Work23 sc = new Work23(ssn);

		if (sc.ssnLength()) { // 1-2 method
			System.out.printf("-- 1-2. �Էµ� �ֹι�ȣ : [%s******] 14�ڸ� ���� ������ ��� �Ͽ����ϴ�.\n", sc.ssn.substring(0, 8));
			if (sc.ssnHyphen()) { // 1-3 method
				System.out.println("-- 1-3. �ֹι�ȣ 7��° : [-] ������ ������ ��� �Ͽ����ϴ�.");
				if (sc.validSsn()) { // 1-4 method
					System.out.printf("-- 1-4. �Էµ� �ֹι�ȣ : [%s******] ��ȿ�� ������ ��� �Ͽ����ϴ�.\n", sc.ssn.substring(0, 8));
					System.out.printf("-- 1-5. ������� : [%s]\n", sc.birth()); // 1-5 method
					System.out.printf("-- 1-6. ���� : [%d]��\n", sc.age()); // 1-6 method
					System.out.printf("-- 1-7. ���� : [%c]\n", sc.gen());// 1-7 method
					System.out.printf("-- 1-8. [%s]�� �Դϴ�.\n", sc.local());// 1-8 method
					System.out.printf("-- 1-9. [%s]�� �Դϴ�.\n", sc.zodiacSign());// 1-9 method
				} else {
					System.out.println("----------------�߸��� �ֹι�ȣ�Դϴ�.--------------------");
				} // end 1-4 else
			} else {
				System.out.println("------------------\"-\"�� �����ϴ�.------------------");
			} // end 1-3 else
		} else {
			System.out.printf("------------------�Էµ� �ֹι�ȣ : [%s]------------------\n", ssn);
			System.out.println("------------------�ֹι�ȣ�� ���̴� \"-\"�� �����Ͽ� [14]�ڷ� �Է��ϼ���.------------------");
		} // end 1-2 else
	}// main
}// class
