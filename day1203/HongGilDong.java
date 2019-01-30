package day1203;

/**
 * ����� ����Ư¡�� �θ�(Person)�� ���� ����ϰ� �ڽŸ��� Ư¡(�ο��� ���Ѵ�)�� ����
 * 
 * @author owner
 */
public class HongGilDong extends Person {
	private int level; // �ο� ����

	/**
	 * ȫ�浿�� �ο��� ��κ��� ���ϹǷ� 7�� ����
	 */
	public HongGilDong() {// �⺻ ������ : ��ü�� �����Ǿ��� �� �������� �ʱⰪ�� �ʱ�ȭ �Ѵ�.
		super(2, 1, 1);
		level = 7;
	}// HongGilDong

	/**
	 * �ο� �ϴ� �� : �Էµ� �������� ���ٸ� �й�, �Էµ� �������� ���ٸ� �¸�, �Էµ� ������ ���ٸ� ���.<br>
	 * �¸��ϸ� ������ 1����, �й��ϸ� ������ 1����, ���� ���� ��ȭ ����. ������ �ִ� 10, �ּ� 1�� ������.
	 * 
	 * @param intputLevel �ο� ������� ����
	 * @return �ο��� ���
	 */
	public String fight(int inputLevel) {
		String result = "";
		if (level > inputLevel) {// �¸�
			result = "�̰��. s('.^)V";
			level++;
			if (level > 10) {
				level = 10;
			} // end if
		} else if (level < inputLevel) {// �й�
			result = "����. ~(_-_)~";
			level--;
			if (level < 1) {
				level = 1;
			} // end if
		} else {// ���
			result = "��� �Ѥ�+;;";
		} // end else
		return result;
	}// fight

	// annotation
	// �������Ϸ����� ������ �� �� �������̵��� �� �Ǿ����� üũ�غ���� ����� ������.
	@Override
	public String toString() {
		return "ȫ�浿 ��ü�� �� : �� : " + getEye() + ", �� : " + getNose() + ", �� : " + getMouth();
	}// toString

	@Override
	public String eat() {
		return getName() + "�� ������ ���� �Դ´�.";
	}

	/**
	 * �θ� Ŭ������ �����ϴ� eat() method�� ����� �ڽ� Ŭ��������<br>
	 * ����ϱ� �������� �ʾ� �Ĵ��� �ָ����� ����<br>
	 * ȭ������� ���� ������ ����
	 */
	@Override
	public String eat(String menu, int price) {
		return getName() + "�� �ָ����� " + menu + "�� ������ " + price + "�� ���� ��Դ´�.";
	}// eat

	
}// class
