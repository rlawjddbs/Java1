package day1218;


/**
 * ��ü ���� : �����Ǵ� ��ü�� Cloneable interface�� �����ؾ߸� �Ѵ�.
 * 
 * @author owner
 */
public class ObjectClone implements Cloneable{

	private int i;
	
	public static void main(String[] args) {

		ObjectClone oc = new ObjectClone();
		oc.i = 100;

		try {
			ObjectClone oc1 = (ObjectClone) oc.clone();
			System.out.println("��������"+oc1);
			oc.i = 200; //���� ��ü�� ���°� ����
			System.out.println("���� : "+ oc.i + " / ������ : "+oc1.i);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}// main

}// class
