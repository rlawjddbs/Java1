package day1218;

public class Data implements Cloneable {

	private String school;

	public Data() {
	}//Data �⺻������

	public Data(String school) {
		this.school = school;
	}//Data ���ڰ� �ִ� ������

	public String getSchool() {
		return school;
	}//getSchool

	public void setSchool(String school) {
		this.school = school;
	}//setSchool
	
	public Data getData() throws CloneNotSupportedException {
		Data data = (Data)this.clone(); 
		// clone()�� protected���������ڸ� ������ �־� �ܺ� Ŭ��������
		// �ٸ� Ŭ������ clone()�� ȣ���� �� ����.
		return data;
	}//getData
	
}//class
