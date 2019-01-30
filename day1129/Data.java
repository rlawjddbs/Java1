package day1129;

/**
 *	�̸�, ����, �̸���, ���� �̴ϼ� �� �ڸ� �����ϴ� Ŭ����
 * @author owner
 */
public class Data {
	private String name;
	private int age;
	private String email;
	private char initial;
	
	public Data() {
		System.out.println("Data Default Constructor");
	}//Data
	
	public Data(String name, int age, String email, char initial) {
		System.out.println("Data Constructor");
		this.name = name;
		this.age = age;
		this.email = email;
		this.initial = initial;
	}//Data
	
	public void setName(String name) {
		this.name=name;
	}//setName
	public void setAge(int age) {
		this.age=age;
	}//setAge
	public void setEmail(String email) {
		this.email=email;
	}//setEmail
	public void setInitial(char initial) {
		this.initial=initial;
	}//setInitial
	
	public String getName() {
		return name;
	}//getName
	public int getAge() {
		return age;
	}//getAge
	public String getEmail() {
		return email;
	}//getEmail
	public char getInitial() {
		return initial;
	}//getInitial
	
	public String toString() {
		return "�̸� : "+ name + ", ���� : "+age+", �̸��� : "+email+", �̴ϼ� : "+initial;
	}
	
}//Data
