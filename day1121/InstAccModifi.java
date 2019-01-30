package day1121;

/**
 * Instance Variable�� Access Modifier ���(�ν��Ͻ� ������ ���� ������ ���).<br>
 * public : Ŭ���� �ܺο��� ���� ����.<br>
 * protected : ���� ��Ű������ ���� ����,<br>
 * 				   ��Ű���� �ٸ��� ��Ӱ����� �ڽ� Ŭ������ ���� ����.<br>
 * private : Ŭ���� �ȿ����� ���� ����.<br>
 * default: ���� ��Ű������ ���� ����, ��Ű���� �ٸ��� ���� �Ұ�<br>
 * 
 * @author owner
 */
public class InstAccModifi {
		public int pub_i;
		protected int pro_i;
		private int pri_i;
		int def_i;	//default
		
	public static void main(String[] args) {
		//��üȭ
		InstAccModifi ivam = new InstAccModifi();
		//������ ������ �ִ� Ŭ���� �ȿ��� ��üȭ�� �Ǹ� ���������ڿ� �������
		//��� ��� ����.
		System.out.println("public : "+ ivam.pub_i);
		System.out.println("protected : "+ ivam.pro_i);
		System.out.println("private : "+ ivam.pri_i);
		System.out.println("default : "+ ivam.def_i);
	}//main

}//class
