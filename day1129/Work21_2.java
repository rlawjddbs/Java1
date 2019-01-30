package day1129;

/**
 * 숙제 1. 번호,이름,주소,나이,성별을 저장할 수 있는 클래스를 만들고<br>
 * 아래와 같은 값을 입력합니다.<br>
 * <br>
 * 입력값<br>
 * 1, 이재찬, 서울시 강남구 역삼동, 28,남자<br>
 * 2, 이재현, 서울시 동대문구 답십리동, 27,남자<br>
 * 3, 김정운, 수원시 영통구 영통동, 26,남자<br>
 * 4, 정택성, 서울시 구로구 구로동,27, 남자<br>
 * 5, 정택순, 서울시 동작구 상도동,29,여자<br>
 * 6, 김건하, 경기도 부천시 부천동,26,남자<br>
 * 7, 이재순, 서울시 광진구 광나루동,27,여자<br>
 * 서울시 거주자 x명<br>
 * 나이 합 x살<br>
 * 최고령자 "정택순(여자)"<br>
 * 
 * 1. 위의값을 배열에 입력하는 method를 작성할것.<br>
 * 2. 배열에 입력된 값을 출력하는 method 를 작성할것.<br>
 * 2번 method 에서 서울시에 살고 있는 인원수를 출력 할것.<br>
 * 2번 method 에서 나이의 합을 출력 할것.<br>
 * 2번 method 에서 가장 나이가 많은 사람의 이름을 출력 할 것.
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
		
	}//기본 생성자
	
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
		System.out.println("서울시 거주자 "+seoulCnt+"명");
		System.out.println("나이 합 "+sumOfAge+"살");
		System.out.printf("최고령자 \"%s(%s)\"",oldestName, oldestGen);
	}//printArr
	
	public void seoulCnt(Work21_2[] arr, int index) {
		if(arr[index].getAddr().startsWith("서울시")) {
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
