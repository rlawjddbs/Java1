package day1115;
class Operator6{
	public static void main(String[] args) {
		int i = 11;
		i = -1;
		System.out.println(i+"��(��) "+ (i>=0?"���":"����"));

		//���밪�� ���ϴ� ���׿�����
		System.out.println(i+"�� ���밪 "+ ( i>=0 ? i : -i ));

		//tilde�� ����Ͽ� �Էµ� ���� ������ ��� �����, ����� ��� ������ ǥ���غ���
		int j = 10;
		System.out.println(j>=0 ? ~j+1 : ~j+1); 

		//������ ���� ¦������ Ȧ������ �Ǵ��ϴ� ���׿�����
		int k = 15;
		System.out.println(k%2==1 ? "Ȧ��" : "¦��");

	}//main
}//class