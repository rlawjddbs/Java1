package day1122;

/**
 * ����<br >
 * �Ʒ��� ������ ó���ϴ� method�� type�� �˸°� �ۼ��ϰ� API�ּ��� ������ �� ȣ���Ͽ� ����� �� �� Java Doc��<br >
 * �����غ�����. - API�ּ��� � ������ method������ �ּ����� ����Ұ�.<br >
 * <br >
 * 1. �ڽ��� �̸��� ��ȯ�ϴ� method�ۼ�. (������ - ��ȯ�� O, �Ű����� x)<br >
 * 2. ���̸� �Է¹޾� �¾ �ظ� ��ȯ�ϴ� method �ۼ�. (������ - ��ȯ��O, �Ű�����O)<br >
 * 3. ���ڸ� �Է¹޾� �ش� ������ Unicode ���� ��ȯ�ϴ� method �ۼ�. (���� �� - ��ȯ�� O int, �Ű�����O char)<br >
 * 4. ���ڸ� �Է¹޾� ���ڰ� ������, ������ ������ ���� �� �ش� ������ ���ڸ� ����ϴ� ���� �ϴ� method �ۼ�. (���� �� - ��ȯ�� O void, �Ű����� O int)<br >
 * 5. ȣ���ϸ� �ڽ��� �ּҸ� ����ϴ� method �ۼ�. (���� �� - ��ȯ��x, �Ű�����x, class �ּҰ� �ƴ϶� ��ü�ּ�.) (���� �� - ��ȯ�� x, �Ű����� x)<br >
 * 6. ģ���� �̸��� �Է¹޾� ����ϴ� method �ۼ�(ģ���� n�� �Դϴ�.) (���� �� - ��ȯ��O, �Ű�����O Variable Arguments)
 * 
 * @author owner
 */
public class Work20 {

	/**
	 * 1. �Էµ� �̸��� ��ȯ�ϴ� yourName �޼ҵ�.
	 * 
	 * @return �Է��� �̸��� �״�� ���ڿ� ���ͷ��� ��ȯ
	 */
	public String yourName() {
		String myName = "������";
		return myName;
	}

	/**
	 * 2. ����⵵ ��ȯ �޼ҵ�<br >
	 * ���̸� �Է¹޾� �¾ �ظ� ��ȯ�ϴ� birthYear �޼ҵ�.
	 * 
	 * @param yourAge ���̸� �Է�
	 * @return �¾ �ظ� birthYear ������ �Ҵ��� �� �������� ��ȯ
	 */
	public int[] birthYear(int yourAge) {
		int birthYear = 2018 - yourAge + 1;
		int[] ageSet = {birthYear, yourAge};
		return ageSet;
	}

	/**
	 * 3. ���� �����ڵ� ��ȯ �޼ҵ�<br>
	 * ���ڸ� �Է¹޾� �ش� ������ �����ڵ� ���� ��ȯ�ϴ� "unicode" �޼ҵ�.
	 * 
	 * @param character - ���� ���ͷ��� �Է�
	 * @return �Էµ� ���� ���ͷ��� �����ڵ带 char_uni ������ ������ �Ҵ��� �� �������� ��ȯ
	 */
	public int[] unicode(char character) {
		int char_uni = (int) character;
		int[] characterSet = {character, char_uni};
		return characterSet;
	}

	/**
	 * 4. �Էµ� ������ ���� ��ȯ �޼ҵ� character<br>
	 * ���ڸ� �Է¹޾� ���ڰ� ������, ������ ������ ���� �� �ش� ������ ���ڸ� ����ϴ� character �޼ҵ�.
	 * @param integer - �����Է�
	 */
	public void character(int integer) {
		char print_character = ' ';
		if (integer > -1 && integer < 65536) {
			print_character = (char) integer;
			System.out.println("4. ���� [" + integer + "]�� Unicode���� ��ġ�ϴ� ���ڴ� \" " + print_character + " \" �Դϴ�.");
		} else {
			System.out.println("4. **Error** 0���� 65535 ������ ������ �Է����ּ���.");
		}//end else
	}// character

	/**
	 * 5. ȣ���ϸ� �ڽ��� �޸� �ּҸ� ����ϴ� �޼ҵ� memoryAddr (overload)
	 * @param paramAddr VariableArgument�� �ּҸ� �˾Ƴ��� ���� �޼ҵ�� �Է��� �ʿ����
	 */
	public void memoryAddr(int... paramAddr) {
		System.out.print("5. ");
		System.out.print("memoryAddr() �޼����� �ּҴ� : \"" + paramAddr + "\" �Դϴ�. ");
	}

	/**
	 * 5. ȣ���ϸ� �ڽ��� �޸� �ּҸ� ����ϴ� �޼ҵ� memoryAddr (overload)
	 * @param objAddr ��ü mtd�� �ּҸ� �˾Ƴ��� ���� �޼ҵ��̹Ƿ� mtd�� �Է��ϸ� ��.
	 */
	public void memoryAddr(Work20 objAddr) {
		System.out.println("memoryAddr() �޼����� �ּҴ� : \"" + objAddr + "\" �Դϴ�.");
	}

	/**
	 * 6. �Է¹��� ģ���� �̸��� ����ϴ� friends �޼ҵ�
	 * @param names - ģ���� �̸��� �Է��ϸ� �Էµ� ��ŭ ģ���� �̸��� ��µǸ� ģ���� ������� ��µȴ�.
	 */
	public void friends(String... names) {
		int j = 0;
		System.out.print("6. ");
		for (int i = 0; i < names.length; i++) {
			System.out.print((i + 1) + "�� ģ�� [" + names[i] + "],  ");
			j = i + 1;
		} // end for
		System.out.print("ģ���� " + j + "�� �̽ñ���.");
		System.out.println();
	}// friends

	public static void main(String[] args) {
		// ��ü���� �� ���� Ŭ���� �Ҵ�
		Work20 mtd = new Work20();
		// 1�� ����
		System.out.print("1. �̸� : [");
		System.out.print(mtd.yourName());
		System.out.println("]");
		// 2�� ����
		System.out.print("2. ���� [");
		System.out.print(mtd.birthYear(30)[1]);
		System.out.print("]���̸� [");
		System.out.print(mtd.birthYear(30)[0]);
		System.out.println("] �⿡ �¾");
		// 3�� ����
		System.out.print("3. ["+(char)mtd.unicode('K')[0]+"]�� ");
		System.out.println("Unicode�� ["+mtd.unicode('K')[1]+"] �Դϴ�.");
		// 4�� ����
		mtd.character(123);
		// 5�� ����
		mtd.memoryAddr();
		mtd.memoryAddr(mtd);
		// 6�� ����
		mtd.friends("asdfasdf", "asdfasdfasdf");
	}

}
