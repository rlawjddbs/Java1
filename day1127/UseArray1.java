package day1127;

/**
 * 1차원 배열 : 행 하나에 열로만 구성된 배열<br>
 * 배열 - 메모리에 동일 데이터형으로 나열된 데이터형<br>
 * 참조형 데이터형, 고정길이 형<br>
 * 일괄처리시 사용<br>
 * 방의 수를 얻기 (배열명.length)
 * 
 * @author owner
 */
public class UseArray1 {

	public UseArray1() {// 생성자
		// 1. 배열 선언) 데이터형[] 배열명=null;
		int[] arr = null;
		// 2. 배열 생성) 배열명 = new 데이터형[방의개수];
		// 배열을 생성하면 모든 방의 값이 초기화된다.
		arr = new int[6];
		System.out.println(arr); // 배열이 생성됨과 동시에 객체화되기 때문에 주소가 출력된다.
		// 선언과 생성) 데이터형[] 배열명 = new 데이터형[방의개수];
		int[] arr1 = new int[8];
		System.out.println(arr + " / " + arr1);
		System.out.println("arr배열 방의 개수 " + arr.length + ", arr1배열 방의 개수 : " + arr1.length);
		// 3. 값 할당) 배열명[방의 인덱스] = 값;
		arr[0] = 11;
		arr[1] = 27;
		arr[2] = 14;
		arr[3] = 46;
		// 4. 값 사용)
		System.out.printf("arr[0]=%d, arr[1]=%d, arr[2]=%d", arr[0], arr[1], arr[2]);
		// 배열에 없는 인덱스를 사용하면 Error 발생
//		arr[6]=10;
		System.out.println("arr[5]=" + arr[5]); // 값을 넣지 않은 방의 값은 자동 초기화된 값이 나온다.

		System.out.println("=================================");
		// 일괄처리
		for (int i = 0; i < arr.length; i++) {// 여기서 length는 method가 아닌 keyword다.
			System.out.printf("arr[%d]=%d \n", i, arr[i]);
		}
	}// UseArray1

	/**
	 * 1차원 배열의 기본형 형식의 사용. new 사용 X
	 */
	public void arrayPrimitive() {
		System.out.println("-----------------------------arrayPrimitive method 실행---------------------------");
		System.out.println("------------------------------기본형 형식의 사용------------------------------------");
		// 1. 선언 : 데이터형[] 배열명 = {값0, 값1, 값2, ...};
		int[] arr = { 2018, 11, 27, 15, 20 };
		System.out.println("arr의 방의 수 :" + arr.length);
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 }; // 방의 개수를 정의하면 Error
		System.out.println("arr1의 방의 수 : " + arr1.length);

		arr[0] = 2019;
		System.out.println(arr[0] + " / " + arr[1]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		} // end for

		// 향상된 for : 배열이나 Collection(List,set)의 처음 방부터 끝방까지
		// 모든 방의 값을 순차적으로 손쉽게 출력할 때
		/*
		 * for(배열방의 값을 저장한 변수 : 배열){ 변수명 } 변수명 }
		 */
		for (int value : arr1) {
			System.out.println(value);
		} // end for
		
		//arr1 배열의 마지막방부터 처음 방까지 출력
		for(int i = (arr1.length)-1; i > -1; i--) {
			System.out.printf("arr1[%d] = %d \n", i, arr1[i]);
		}
	}// arrayPrimitive

//	public void method() {
//		System.out.println("method");
//	}//method

	public static void main(String[] args) {
//		UseArray1 ua1=new UseArray1(); //첫번째 객체화 방법 (인스턴스를 저장해서 쓰는방법)
//		new UseArray1().method(); // 두번째 객체화 방법 (인스턴스화 하지않고 쓰는 방법)
		new UseArray1().arrayPrimitive();
	}// main

}// class
