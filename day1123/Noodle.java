package day1123;

/**
 * ����� �߻�ȭ�Ͽ� ���� Ŭ����<br>
 * ����� Ư¡ : ����̸�, ������, ��������, ���̴½ð�, ����<br>
 * ������ Ư¡ : ������ ����, ��� ������ ���¹��� ����, �����ð����� ��������, ����ȴ�.<br>
 * <br>
 * 
 * ��� - ����� : ��, ����, ��Ű��... ������ : ����, �Ѽ� ...
 * 
 * ��üȭ) Noodle ��ü�� = new Noodle();<br>
 * ������ ��ü�� �Դ����� �� �� �ִ�.
 * 
 * @author owner
 */
public class Noodle {
	private String name, maker;
	private int soup, time, price;
//	/**
//	 * ������ ��� ��ü�� ������ �ִ� �̸��� �����ϴ� ��.
//	 * @param name ��� �̸�
//	 */
//	public void setName(String name) {
//		if(name == "�ʱ���" || name == "��¡��«��" || name == "�Ŷ��") {
//		this.name = name;
//		}else {
//			System.out.println("=====��� �̸� Error. ����� �̸��� \"�ʱ���\", \"��¡��«��\", \"�Ŷ��\"�߿� �ϳ��� �����ϼ���.=====\r\n");
//		}
//	}//setName

//	/**
//	 * ������ ��� ��ü�� ������ �ִ� ��������� ���� �ϴ� ��.
//	 * @param maker ��� ������
//	 */
//	public void setMaker(String maker) {
//		if(maker=="���") {
//		this.maker = maker;
//		} else {
//			System.out.println("=====������ Error. ������� ��� ��ǰ�� �Է°��� �մϴ�.");
//		}
//	}//setMaker
//	
//	/**
//	 * ������ ��� ��ü�� ������ �ִ� ���� ������ �����ϴ� ��.
//	 * @param soup ���� 
//	 */
//	public void setSoup(int soup) {
//		this.soup = soup;
//	}//setSoup
//	
//	/**
//	 * ������ ��� ��ü�� ������ �ִ� ��� ��ǰ�� ���̴� �ð��� �����ϴ� ��.
//	 * @param time ���̴� �ð� 
//	 */
//	public void setTime(int time) {
//		this.time = time;
//	}//setTime
//	/**
//	 * ������ ��� ��ü�� ������ �ִ� ������ �����ϴ� ��.
//	 * @param price ����� ���� 
//	 */
//	public void setPrice(int price) {
//		this.price = price;
//	}//setPrice

	/**
	 * �⺻ �����ڷ� ��� ��ü�� �����Ǹ� �ȼ�����, ���, ����1��, �����ð� 4��, ���� 750��
	 * ��� ��ü�� �����Ѵ�. <br>
	 * 11-26-2018 �ڵ� �߰�
	 * 
	 */
	public Noodle() {
		this("�ȼ�����", "���", 1, 4, 750);
	}//Noodle

	/**
	 * ���ڰ� �ִ� ������ - "�ȼ�����", "���", ����1��, �����ð� 4��, ���� 750���� �ƴ� �����
	 * ������ �� ����ϴ� ������<br>
	 * ����̸�, �������, ��������, �����ð�, ������ �Է¹޾� ��鰴ü�� ����.
	 * @param name ����� �̸�
	 * @param maker �������
	 * @param soup ��������
	 * @param time �����ð�
	 * @param price ����
	 */
	public Noodle(String name, String maker, int soup, int time, int price) {
		this.name = name;
		this.maker = maker;
		this.soup = soup;
		this.time = time;
		this.price = price;
	}

	/**
	 * ������ ��� ��ü�� ������ �ִ� �̸��� ��ȯ�ϴ� ��.
	 * 
	 * @return ����� �̸�
	 */
	public String getName() {
		return name;
	}// getName

	/**
	 * ������ ��� ��ü�� ������ �ִ� �����縦 ��ȯ�ϴ� ��.
	 * 
	 * @return �������� �̸�
	 */
	public String getMaker() {
		return maker;
	}// getMaker

	/**
	 * ������ ��� ��ü�� ������ �ִ� ���� ������ ��ȯ�ϴ� ��.
	 * 
	 * @return ������ ����
	 */
	public int getSoup() {
		return soup;
	}// getSoup

	/**
	 * ������ ��� ��ü�� ������ �ִ� ��� ��ǰ�� ���̴� �ð��� ��ȯ�ϴ� ��.
	 * 
	 * @return ��� ���̴� �ð�(��)
	 */
	public int getTime() {
		return time;
	}// getTime

	/**
	 * ������ ��� ��ü�� ������ �ִ� ������ ��ȯ�ϴ� ��.
	 * 
	 * @return ��� ����(��)
	 */
	public int getPrice() {
		return price;
	}// getPrice

	/**
	 * ������ Ư¡<br>
	 * ������ ��鰴ü�� �������� �� ����.
	 * 
	 * @return ���
	 */
	public String baking() {
		String msg = "";
		if (name != null) {
			msg = "[" + getMaker() + "]���� [" + getName() + "], ���� [" + getPrice() + "]������, ���¹��� �� �ϳ��� ���� [" + getSoup()
					+ "]���� �ְ� [" + getTime() + "]�а� �����Դ´�.";
		}
		return msg;
	}// baking

}// class
