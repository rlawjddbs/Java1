package day1123;

public class UseMarker {

	/**
	 * ��ī���� ������ Ŭ������ ����ϴ� Ŭ����.<br>
	 * 4. ��ü����<br>
	 * 5. ������ ��ü ���.
	 * @param args �ۼ�
	 */
	public static void main(String[] args) {
		//������ ��ī�� 1�� ����
		Marker black = new Marker();
//		black.setColor("������");
//		black.setCap(1);
//		black.setBody(1);
		
		System.out.printf("������ ��ī�� ��[%s], �Ѳ�[%d], ��ü[%d]\n", black.getColor(), black.getCap(), black.getBody());
		
		//������ ��ü�� ���
		System.out.println(black.write("�ȳ��ϼ���?"));
		
		//������ ��ī�� 5�� ����
		Marker red = new Marker("������", 5, 5);
//		red.color="�ʷϻ�"; //Marker Ŭ������ color �ν��Ͻ� ������ ���������ڰ� public �̶�� �ܺο��� ���� ���� ������ �� �����Ƿ� �߸��� ���� �Էµ� �� �ִ�.
//		red.setColor("������");
//		red.setColor("���");
//		red.setBody(5);
		red.setCap(5);
		
		System.out.printf("������ ��ī�� ��[%s], �Ѳ�[%d], ��ü[%d]\n", red.getColor(), red.getCap(), red.getBody());
		System.out.println(red.write("�ȳ��ϼ���?"));
		
	}//main

}//class
