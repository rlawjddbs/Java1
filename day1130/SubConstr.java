package day1130;


public class SubConstr extends SuperConstr{
	int i;
	
	public SubConstr() {
//		super(100);
		// 1��. �θ� �⺻, �θ� ���� 300, �ڽ� ���� 200, �ڽ� �⺻
//		this(200);
//		this(100);
		super();
		System.out.println("�ڽ� �⺻ ������");
		
	}//�ڽ��� �⺻ ������
	public SubConstr(int i) {
//		super(300);
//		super(100);
		this();
		System.out.println("�ڽ� ���� ������ "+i);
	}//�ڽ��� �����ִ� �⺻ ������
	
}//class
