package day1203;

public class TestSub extends TestSuper {
	int i;
	public TestSub(){
		System.out.println("�ڽ��� ������");
	}//TestSub
	
	public void subMethod() {
		System.out.println("�ڽ��� subMethod");
	}//subMethod
	
	@Override
	public void printI() {
		System.out.println("�ڽ��� Override�� method "+this.i+", �θ��� i "+super.i);
	}//printI
	
	public static void main(String[] args) {
		// ��� ���迡���� �ڽ�Ŭ������ ��üȭ�� �Ѵ�.
		
	}//main

}//class
