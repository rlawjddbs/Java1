package day1126;

/**
 *	method�� ȣ���ϴ� ��ü�� �ּҷ� ����Ǿ� ���Ǵ� this Ű����.
 * @author owner
 */
public class ThisKeyword {
	int i;
	/**
	 * parameter�� �̸��� instance������ �̸��� ���� ��
	 * this�� ������� �ʰ� parameter�� ���� �ν��Ͻ� ������ ������ ��.
	 * @param i ������ ��
	 * @param t ��ü���� �Է�
	 */
	public void useInstance(int i, ThisKeyword t) {
//		i=100; //parameter�� ����(������ ���� Ȯ��)
		t.i=i; // �Ķ����(stack)������ ���� �ν��Ͻ�(heap)������ �Ҵ� �ϰڽ��ϴ�. ��� ��
		System.out.println("���޹��� ��ü "+t);
	}//useInstance
	
	/**
	 * �Ķ������ �̸��� �ν��Ͻ� ������ �̸��� ���� ������ ��ü�� �ѱ��
	 * �޾Ƽ� ����Ϸ��� �ڵ��� �������� ����´�. �̸� �����ϱ� ���� this�� �����ȴ�.
	 * @param i ������ ��
	 */
	public void useThis(int i) {
//		i=100; //instance variable�� ����(������ ���� Ȯ��)
		//this�� method�� ȣ���ϴ� ��ü�� �ּҷ� ��ȯ�Ǵ� Ű����
		//�Ű������� ��ü�� ���� �ʿ䰡 ����
		this.i=i; //tk.i = i �� ����.
		System.out.println("method�� ȣ���� ��ü�� �ּ� :"+ this);
	}//useThis
	
	public static void test() { // static : ����, Ư�� �ν��Ͻ��� �Ҽӵ� ���� �ƴϴ�.
		System.out.println("static method!!");
//		this.i=10; //static method �ȿ����� this keyword�� ����� �� ����.
	}
	
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		System.out.println("������ ��ü "+tk);
		tk.useInstance(300,  tk);
		System.out.println("������ ��ü�� �ν��Ͻ� ������ �� "+tk.i);
		System.out.println("================================");
		tk.useThis(900);
		System.out.println("this�� ����Ͽ� ������ �ν��Ͻ� ������ �� "+tk.i);
		
		ThisKeyword.test();
		
	}//main
}//class
