package day1129;

/**
 * ���� 1. ��ȣ,�̸�,�ּ�,����,������ ������ �� �ִ� Ŭ������ �����<br>
 * �Ʒ��� ���� ���� �Է��մϴ�.<br>
 * <br>
 * �Է°�<br>
 * 1, ������, ����� ������ ���ﵿ, 28,����<br>
 * 2, ������, ����� ���빮�� ��ʸ���, 27,����<br>
 * 3, ������, ������ ���뱸 ���뵿, 26,����<br>
 * 4, ���ü�, ����� ���α� ���ε�,27, ����<br>
 * 5, ���ü�, ����� ���۱� �󵵵�,29,����<br>
 * 6, �����, ��⵵ ��õ�� ��õ��,26,����<br>
 * 7, �����, ����� ������ �����絿,27,����<br>
 * ����� ������ x��<br>
 * ���� �� x��<br>
 * �ְ���� "���ü�(����)"<br>
 * 
 * 1. ���ǰ��� �迭�� �Է��ϴ� method�� �ۼ��Ұ�.<br>
 * 2. �迭�� �Էµ� ���� ����ϴ� method �� �ۼ��Ұ�.<br>
 * 2�� method ���� ����ÿ� ��� �ִ� �ο����� ��� �Ұ�.<br>
 * 2�� method ���� ������ ���� ��� �Ұ�.<br>
 * 2�� method ���� ���� ���̰� ���� ����� �̸��� ��� �� ��.
 * 
 * @author owner
 */
public class Work21_2 {
	private int num;
	private String name;
	private String addr;
	private int age;
	private String gen;
	
	private int seoulCnt;
	private int sumOfAge;
	private int oldestAge;
	private String oldestName;
	private String oldestGen;
	
	public Work21_2() {
		
	}//�⺻ ������
	
	public Work21_2(int num, String name, String addr, int age, String gen) {
			this.num = num;
			this.name = name;
			this.addr = addr;
			this.age = age;
			this.gen = gen;
	}// Work21_2
	
	public void setNum(int num) {
		this.num=num;
	}//setNum
	public void setName(String name) {
		this.name=name;
	}//setName
	public void setAddr(String addr) {
		this.addr=addr;
	}//setAddr
	public void setAge(int age) {
		this.age=age;
	}//setAge
	public void setGen(String gen) {
		this.gen=gen;
	}//setGen
	
	public int getNum() {
		return num;
	}//getNum
	public String getName() {
		return name;
	}//getNum
	public String getAddr() {
		return addr;
	}//getAddr
	public int getAge() {
		return age;
	}//getAge
	public String getGen() {
		return gen;
	}//getGen
	
	public String toString() {
		return num+", \t"+name+", \t"+addr+", \t"+age+", \t"+gen;
	}//toString
	
	public void printArr(Work21_2[] arr) {
		for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				seoulCnt(arr, i);
				sumOfAge(arr, i);
				oldestPerson(arr, i);
		}//end for
		System.out.println("����� ������ "+seoulCnt+"��");
		System.out.println("���� �� "+sumOfAge+"��");
		System.out.printf("�ְ���� \"%s(%s)\"",oldestName, oldestGen);
	}//printArr
	
	public void seoulCnt(Work21_2[] arr, int index) {
		if(arr[index].getAddr().startsWith("�����")) {
			seoulCnt++;
		}//end if
	}//seoulCnt
	
	public void sumOfAge(Work21_2[] arr, int index) {
		sumOfAge += arr[index].getAge();
	}//sumOfAge
	
	public void oldestPerson(Work21_2[] arr, int index) {
		if(oldestAge < arr[index].getAge()) {
			oldestAge = arr[index].getAge();
			oldestName = arr[index].getName();
			oldestGen = arr[index].getGen();
		}//end if
	}//oldestPerson
	
	public static void main(String[] args) {
		
	}//main
}//class
