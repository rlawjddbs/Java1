package day1203;

public class TestSub2 extends TestSuper {
	int i;
	public TestSub2(){
		System.out.println("�ڽ��� ������222222222");
	}//TestSub
	
	public void subMethod() {
		System.out.println("�ڽ��� subMethod222222222");
	}//subMethod
	
	@Override
	public void printI() {
		System.out.println("�ڽ�22222222 Override�� method "+this.i+", �θ��� i "+super.i);
	}//printI
	
	public static void main(String[] args) {
		// ��� ���迡���� �ڽ�Ŭ������ ��üȭ�� �Ѵ�.
		
	}//main

}//class
