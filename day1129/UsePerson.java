package day1129;

import java.util.Date;

public class UsePerson {

	public static void main(String[] args) {
		HongGilDong gd = new HongGilDong();
		gd.setName("ȫ�浿");//�θ��� method ��� (HongGilDong Ŭ������ �θ��� UsePerson�� method)
		System.out.println("ȫ�浿�� �� : "+gd.getEye()
		+", �� : "+gd.getNose()
		+", �� : "+gd.getMouth());
		System.out.println(gd.eat());
		System.out.println(gd.eat("����", 1)); //ȫ�浿�� ��� ������ "��"������ ������, �������̵��� �ʿ伺�� �ΰ���
		//�ڽŸ��� Ư¡
		System.out.println(gd.fight(6));//level : 7 > 8
		System.out.println(gd.fight(7));//level : 8>9
		System.out.println(gd.fight(9));//���
		System.out.println(gd.fight(10));//����. 9 > 8
		System.out.println(gd.fight(9));//����. 8 > 7
		
		System.out.println("-------------------------------------------------------------------------------------");
		Clark superman = new Clark();// �ڽ��� �����Ǹ� �θ�Ŭ������ ���� ������ �� �ڽ��� �����ȴ�.
		//�ڽ��� ��ü�� �θ� Ŭ������ �ڿ�(����, method)�� �ڽ��� ��ó�� ����� �� �ִ�. �ڵ��� �� ��뼺
		System.out.println(superman.getEye()+" / "+superman.getNose()+" / "+superman.getMouth());
		System.out.println(superman.getName());
		
		superman.setName("Ŭ��");
		System.out.println(superman.getName());
		
		System.out.println("----------------------------------------------------------");
		
		superman.setName("Ŭ����Ʈ");
		System.out.println(superman.eat());
		System.out.println(superman.eat("������ũ", 10));
		
		// �ڽ��� method
		String stone = "¯��";
		System.out.println(stone+"�� ���� ��� - "+
				superman.power(stone)+", ���� ��ȭ : "+
				superman.power);
		
		stone="���̾Ƹ��";
		System.out.println(stone+"�� ���� ��� - "+
				superman.power(stone)+", ���� ��ȭ : "+
				superman.power);
		
		stone="Ŭ���䳪��Ʈ";
		System.out.println(stone+"�� ���� ��� - "+
				superman.power(stone)+", ���� ��ȭ : "+
				superman.power);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		
		Kjy kjy = new Kjy();
		kjy.setName("������");
		System.out.println(kjy.getName());
		System.out.println(kjy.eat());
		System.out.println(kjy.eat("«��", 1));
		System.out.println("----------------------------------------------------------");
		System.out.println(kjy.playTekken(8));
		System.out.println("----------------------------------------------------------");
		System.out.println(kjy.playTekken(6));
		System.out.println("----------------------------------------------------------");
		System.out.println(kjy.playTekken(5));
		
		System.out.println(kjy);
		System.out.println(gd);
		System.out.println(gd.toString()); // toString() method ��ó�� object
		System.out.println(kjy.toString());
		
		String s = new String("������ �ݿ�");
		System.out.println(s.toString()); // �������̵�
		// �ֻ��� Ŭ���� object�� �����ϴ� toString() �޼ҵ带 ���� �̸����� ����� ��ȯ
		
		Date d = new Date();
		System.out.println(d.getYear());
		
		int i;
	}//main

}//class
