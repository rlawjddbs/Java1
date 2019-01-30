package day1129;

import java.util.Arrays;


/**
 *	����� ���� ��������(���� ���� Ŭ����)�� ����Ͽ� �迭�� ����.<br>
 *	������ �迭 �� �ϳ��� �������� �پ��� ���� �����ϰ� ����� �� �ִ�.
 * @author owner
 */
public class UseClassArray {

	public UseClassArray() {
		//1. ���� : ��������[] �迭��=null;
		Data[] dataArr = null;
		//2. ���� : �迭�� = new ��������[���ǰ���];
		dataArr = new Data[4];
		//3. �� �Ҵ� : �迭��[���ǹ�ȣ] = new ������();
		// �ٸ���� ��
		// Ŭ������ ��ü�� = new ������();
		// �迭��[���ǹ�ȣ] = ��ü��;
		dataArr[0] = new Data();
		System.out.println(Arrays.toString(dataArr));
		dataArr[0] = new Data("������",27,"gong@daum.net",'G');
		dataArr[1] = new Data("�����",29,"kim@daum.net",'K');
		dataArr[2] = new Data("������",25,"choi@daum.net",'C');
		//��ü���� �� ���� �߰�
		Data d = new Data();
		dataArr[3] = d;
		//�ּҴ� �ϳ� �̹Ƿ� �迭���� ����Ͽ� method�� ȣ���ϵ�
		dataArr[3].setName("���ü�");
		dataArr[3].setAge(26);
		//��ü���� ����Ͽ� method�� ȣ���ϵ� �����ϰ� ���� ����ȴ�.
		d.setEmail("jung@jung.net");
		d.setInitial('D');
		
//		System.out.println(Arrays.toString(dataArr));
		//4. �� ���
		//�迭������ �ٷ� ���.
		System.out.println(dataArr[0].getName()+" / "+dataArr[0].getAge());
		//��ü�� �����Ͽ� ���. (�������� ���� ����̶� �����)
		Data temp=dataArr[0];
		System.out.println(temp.getName()+" / "+temp.getAge());
		
		//�ϰ�ó��
//		Data tempData = null;
//		for(int i = 0; i < dataArr.length; i++) {
//			tempData = dataArr[i];
//			System.out.println(tempData.getName()+" / "+tempData.getAge()+" / "
//					+tempData.getEmail()+" / "+tempData.getInitial());
//		}//end for
		
		for( Data tempData : dataArr ) {
			System.out.println(tempData.getName()+" / "
					+tempData.getAge()+" / "+tempData.getEmail()+" / "
					+tempData.getInitial());
		}//end for
	}//UseClassArray
	
	public static void main(String[] args) {
		new UseClassArray();
	}//main

}//class
