package day1130;

/**
 * 
 * @author owner
 */
public class TestSub extends TestSuper {
	int p_j;

	@Override
	public void method() {
		p_i = 400;// �ڵ��� ���뼺 //�θ��� ����
		super.p_j = 500;// ���� �̸��� ������ �����ϸ� �ڽ��� ���� ���

		System.out.println("�ڽ��� Method p_i : " + this.p_i + ", p_j : " + this.p_j);
		super.method();
		
		System.out.println(this);
//		System.out.println(super); // super�� �ּҴ� ����� �� ����.
		
	}// method

	public static void main(String[] args) {
		TestSub ts = new TestSub();
		ts.method();
	}// main

}// class
