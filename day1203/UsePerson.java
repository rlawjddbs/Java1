package day1203;

import java.util.Arrays;

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
		String[] clackLang = superman.language("�ܰ��");
		clackLang = superman.language("����");
		clackLang = superman.language("�ѱ���");
		clackLang = superman.language("����");
		clackLang = superman.language("�ѱ���");
		clackLang = superman.language("����");
		clackLang = superman.language("�ѱ���");
		
		System.out.println(Arrays.toString(clackLang));
		
		String[] hongLang = gd.language("�ѱ���");
		hongLang = gd.language("�߱���");
		hongLang = gd.language("��ȭ");
		
		System.out.println(Arrays.toString(hongLang));
		System.out.println("----------------------------------------------------------");
		//Clark�� interface�� ���� �Ͽ����Ƿ�
		System.out.println(superman.speed("����"));
		System.out.println(superman.height("��"));
		
		
	}//main

}//class
