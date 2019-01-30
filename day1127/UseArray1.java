package day1127;

/**
 * 1���� �迭 : �� �ϳ��� ���θ� ������ �迭<br>
 * �迭 - �޸𸮿� ���� ������������ ������ ��������<br>
 * ������ ��������, �������� ��<br>
 * �ϰ�ó���� ���<br>
 * ���� ���� ��� (�迭��.length)
 * 
 * @author owner
 */
public class UseArray1 {

	public UseArray1() {// ������
		// 1. �迭 ����) ��������[] �迭��=null;
		int[] arr = null;
		// 2. �迭 ����) �迭�� = new ��������[���ǰ���];
		// �迭�� �����ϸ� ��� ���� ���� �ʱ�ȭ�ȴ�.
		arr = new int[6];
		System.out.println(arr); // �迭�� �����ʰ� ���ÿ� ��üȭ�Ǳ� ������ �ּҰ� ��µȴ�.
		// ����� ����) ��������[] �迭�� = new ��������[���ǰ���];
		int[] arr1 = new int[8];
		System.out.println(arr + " / " + arr1);
		System.out.println("arr�迭 ���� ���� " + arr.length + ", arr1�迭 ���� ���� : " + arr1.length);
		// 3. �� �Ҵ�) �迭��[���� �ε���] = ��;
		arr[0] = 11;
		arr[1] = 27;
		arr[2] = 14;
		arr[3] = 46;
		// 4. �� ���)
		System.out.printf("arr[0]=%d, arr[1]=%d, arr[2]=%d", arr[0], arr[1], arr[2]);
		// �迭�� ���� �ε����� ����ϸ� Error �߻�
//		arr[6]=10;
		System.out.println("arr[5]=" + arr[5]); // ���� ���� ���� ���� ���� �ڵ� �ʱ�ȭ�� ���� ���´�.

		System.out.println("=================================");
		// �ϰ�ó��
		for (int i = 0; i < arr.length; i++) {// ���⼭ length�� method�� �ƴ� keyword��.
			System.out.printf("arr[%d]=%d \n", i, arr[i]);
		}
	}// UseArray1

	/**
	 * 1���� �迭�� �⺻�� ������ ���. new ��� X
	 */
	public void arrayPrimitive() {
		System.out.println("-----------------------------arrayPrimitive method ����---------------------------");
		System.out.println("------------------------------�⺻�� ������ ���------------------------------------");
		// 1. ���� : ��������[] �迭�� = {��0, ��1, ��2, ...};
		int[] arr = { 2018, 11, 27, 15, 20 };
		System.out.println("arr�� ���� �� :" + arr.length);
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 }; // ���� ������ �����ϸ� Error
		System.out.println("arr1�� ���� �� : " + arr1.length);

		arr[0] = 2019;
		System.out.println(arr[0] + " / " + arr[1]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		} // end for

		// ���� for : �迭�̳� Collection(List,set)�� ó�� ����� �������
		// ��� ���� ���� ���������� �ս��� ����� ��
		/*
		 * for(�迭���� ���� ������ ���� : �迭){ ������ } ������ }
		 */
		for (int value : arr1) {
			System.out.println(value);
		} // end for
		
		//arr1 �迭�� ����������� ó�� ����� ���
		for(int i = (arr1.length)-1; i > -1; i--) {
			System.out.printf("arr1[%d] = %d \n", i, arr1[i]);
		}
	}// arrayPrimitive

//	public void method() {
//		System.out.println("method");
//	}//method

	public static void main(String[] args) {
//		UseArray1 ua1=new UseArray1(); //ù��° ��üȭ ��� (�ν��Ͻ��� �����ؼ� ���¹��)
//		new UseArray1().method(); // �ι�° ��üȭ ��� (�ν��Ͻ�ȭ �����ʰ� ���� ���)
		new UseArray1().arrayPrimitive();
	}// main

}// class
