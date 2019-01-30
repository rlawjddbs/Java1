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
public class Work21 {
	private String[][] arr = null;
	
	private int[] numbers = null;
	private String[] names = null;
	private String[] addrs = null;
	private int[] ages = null;
	private String[] gens = null;

	private int saveCnt = 0; // 배열에 저장될 횟수 저장

	public Work21() {
		arr = new String[7][5];
		
		numbers = new int[7];
		names = new String[7];
		addrs = new String[7];
		ages = new int[7];
		gens = new String[7];
	}

	public void Work21(int num, String name, String addr, int age, String gen) {
		if (saveCnt != 7) {
			numbers[saveCnt] = num;
			names[saveCnt] = name;
			addrs[saveCnt] = addr;
			ages[saveCnt] = age;
			gens[saveCnt] = gen;
			saveCnt++;
		} else {
			System.out.printf("데이터를 저장할 용량이 부족합니다. 최대용량[%d]개 현재용량[%d개] - 가득참! \n", numbers.length, saveCnt);
		} // end else
	}// Work21

	public void addArr() {
		for(int i=0; i < arr.length; i++) {
			arr[i][0] = String.valueOf(numbers[i]);
			arr[i][1] = names[i];
			arr[i][2] = addrs[i];
			arr[i][3] = String.valueOf(ages[i]);
			arr[i][4] = gens[i];
		}//end for (i)
	}//addArr
	
	public void printArr() {
		int seoulCnt = 0;
		int totalAge = 0;
		int temp = 0;
		String oldest = "";
		for(int i=0; i < arr.length; i++) {
			
			if( arr[i][2].startsWith("서울시") ) {
				seoulCnt++;
			}
			totalAge += Integer.parseInt(arr[i][3]);
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
				
				if( temp < Integer.parseInt(arr[j][3]) ) {
					temp = Integer.parseInt(arr[j][3]);
					oldest = "최고령자 ["+arr[j][1]+"] ("+arr[j][4]+")";
				}//end if
				
			}//end for j
			System.out.println();
		}//end for i
		System.out.printf("서울시 거주자 [%d]명\n", seoulCnt);
		System.out.printf("나이 합 [%d]살\n", totalAge);
		System.out.println(oldest);
	}//printArr
	
	public static void main(String[] args) {
		Work21 work = new Work21();
		work.Work21(1, "이재찬", "서울시 강남구 역삼동", 28, "남자");
		work.Work21(2, "이재현", "동대문구 답십리동", 27, "남자");
		work.Work21(3, "김정운", "수원시 영통구 영통동", 26, "남자");
		work.Work21(4, "정택성", "서울시 구로구 구로동", 27, "남자");
		work.Work21(5, "정택순", "서울시 동작구 상도동", 29, "여자");
		work.Work21(6, "김건하", "서울시 부천시 부천동", 26, "남자");
		work.Work21(7, "이재순", "서울시 광진구 광나루동", 27, "여자");
		
		//1. 위의값을 배열에 입력하는 method를 작성할 것.
		work.addArr();
		//2. 배열에 입력된 값을 출력하는 method를 작성할 것.
		work.printArr();
	}

}
