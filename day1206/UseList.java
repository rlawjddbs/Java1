package day1206;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * List : <br>
 * 중복값을 허용하며 검색의 기능이 있고, 순서대로 값을 입력하는 가변길이형.
 * 
 * @author owner
 */
public class UseList {

	public UseList() {
		// JDK1.4에서는 Generic이 제공되지 않고 객체만 저장된다.
//		List list = new ArrayList();
//		//값 추가 : JDK 1.5 이하 에서는 객체로만 값을 넣을 수 있다.
//		list.add(new Integer(10));
//		list.add(new Short((short)10));
//		list.add("공선의");

//		System.out.println(list.size());
//		System.out.println( ((Integer)list.get(0)).intValue()+10);
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));

		// JDK1.5+ 에서 사용 : Generic, auto boxing, unboxing

//		List list = new ArrayList(); //Generic 설정을 권장
		List<Integer> list = new ArrayList<Integer>();
		list.add(10); // autoboxing
		list.add(20);
		list.add(new Integer(30));// autoboxing이 나오기전 방식.
		// Generic을 Integer로 설정했기 때문에 문자열 리터럴은 list에 할당될 수 없다.
//		list.add("김건하"); // Generic으로 설정된 형이 아닌 데이터형을 추가할 수 없다.

		System.out.println("list의 크기 : " + list.size());
		System.out.println((Integer) list.get(0) + 10);
		System.out.println((Integer) list.get(1) + 10);
//		System.out.println((Integer)list.get(2)+10); // 문자열과 정수를 연산하면 Error 발생.

		System.out.println("list의 크기 : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + 1);
		} // end for

	}// UseList

	/**
	 * ArrayList 사용 : Multi Thread환경에서 동시 접근 가능.(동기화 x)
	 */
	public void useArrayList() {
		// 1. 생성
		ArrayList<String> al = new ArrayList<String>(); // 방 0개
		List<String> al1 = new ArrayList<String>(100);// 방 100개, 값이 없는 상태에서 size()로 크기 출력시 0개로 나옴. (size()는 데이터의 크기를
														// 반환함)

		System.out.println(al + " / " + al1); // 주소가 안나오는 이유는 오버라이딩했기 때문이다.
		// 2. 값추가
		al.add("이재현");
		al.add("정택성");
		al.add("김정윤");
		al.add("김건하");
		al.add("김정윤"); // ArrayList는 중복값을 허용한다.
		al.add("노진경"); // ArrayList는 중복값을 허용한다.
		al.add("김정윤"); // ArrayList는 중복값을 허용한다.
		al.add("공선의");
		System.out.println(al + " / " + al1);
		// size() : 데이터의 크기
		System.out.println("al의 크기 : " + al.size() + ", al1의 크기 : " + al1.size());

		// 배열에 복사
		String[] names = new String[al.size()];
		al.toArray(names);

		// 방의 값 삭제
		// index로 삭제 : 특정 index방의 값이 삭제됨
		al.remove(4);
		System.out.println("al의 크기 : " + al.size());
		// 방의 내용으로 삭제
		al.remove("김정윤"); // 왼쪽 -> 오른쪽으로 검색하여 일치하는 첫번째 방의 값만 삭제한다.
		System.out.println("al의 크기 : " + al.size());

		for (String name : al) {
			System.out.printf(name + "\t");
		} // end for
		System.out.println();

		// 모든 방의 값 삭제 :
		al.clear();
		System.out.println("전체 삭제 후 : " + al.size() + " / " + al);

		// 배열의 값
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s\t", names[i]);
		} // end for
		System.out.println();

	}// useArrayList

	public void useVector() {
		// 1. 생성
		Vector<String> vec = new Vector<String>(); // 방 0개
		List<String> vec1 = new ArrayList<String>(100);// 방 100개, 값이 없는 상태에서 size()로 크기 출력시 0개로 나옴. (size()는 데이터의 크기를
														// 반환함)

		System.out.println(vec + " / " + vec1); // 주소가 안나오는 이유는 오버라이딩했기 때문이다.
		// 2. 값추가
		vec.add("이재현");
		vec.add("정택성");
		vec.add("김정윤");
		vec.add("김건하");
		vec.add("김정윤"); // ArrayList는 중복값을 허용한다.
		vec.add("노진경"); // ArrayList는 중복값을 허용한다.
		vec.add("김정윤"); // ArrayList는 중복값을 허용한다.
		vec.add("공선의");
		System.out.println(vec + " / " + vec1);
		// size() : 데이터의 크기
		System.out.println("vec의 크기 : " + vec.size() + ", vec1의 크기 : " + vec1.size());

		// 배열에 복사
		String[] names = new String[vec.size()];
		vec.toArray(names);

		// 방의 값 삭제
		// index로 삭제 : 특정 index방의 값이 삭제됨
		vec.remove(4);
		System.out.println("vec의 크기 : " + vec.size());
		// 방의 내용으로 삭제
		vec.remove("김정윤"); // 왼쪽 -> 오른쪽으로 검색하여 일치하는 첫번째 방의 값만 삭제한다.
		System.out.println("vec의 크기 : " + vec.size());

		for (String name : vec) {
			System.out.printf(name + "\t");
		} // end for
		System.out.println();

		// 모든 방의 값 삭제 :
		vec.clear();
		System.out.println("전체 삭제 후 : " + vec.size() + " / " + vec);

		// 배열의 값
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s\t", names[i]);
		} // end for
		System.out.println();

	}// useVector

	public void useLinkedList() {
		// 1. 생성
				LinkedList<String> ll = new LinkedList<String>(); // 방 0개
				List<String> ll1 = new ArrayList<String>(100);// 방 100개, 값이 없는 상태에서 size()로 크기 출력시 0개로 나옴. (size()는 데이터의 크기를 반환함)

				System.out.println(ll + " / " + ll1); // 주소가 안나오는 이유는 오버라이딩했기 때문이다.
				// 2. 값추가
				ll.add("이재현");
				ll.add("정택성");
				ll.add("김정윤");
				ll.add("김건하");
				ll.add("김정윤"); // ArrayList는 중복값을 허용한다.
				ll.add("노진경"); // ArrayList는 중복값을 허용한다.
				ll.add("김정윤"); // ArrayList는 중복값을 허용한다.
				ll.add("공선의");
				System.out.println(ll + " / " + ll1);
				// size() : 데이터의 크기
				System.out.println("ll의 크기 : " + ll.size() + ", ll1의 크기 : " + ll1.size());

				// 배열에 복사
				String[] names = new String[ll.size()];
				ll.toArray(names);

				// 방의 값 삭제
				// index로 삭제 : 특정 index방의 값이 삭제됨
				ll.remove(4);
				System.out.println("ll의 크기 : " + ll.size());
				// 방의 내용으로 삭제
				ll.remove("김정윤"); // 왼쪽 -> 오른쪽으로 검색하여 일치하는 첫번째 방의 값만 삭제한다.
				System.out.println("ll의 크기 : " + ll.size());

				for (String name : ll) {
					System.out.printf(name + "\t");
				} // end for
				System.out.println();

				// 모든 방의 값 삭제 :
				ll.clear();
				System.out.println("전체 삭제 후 : " + ll.size() + " / " + ll);

				// 배열의 값
				for (int i = 0; i < names.length; i++) {
					System.out.printf("%s\t", names[i]);
				} // end for
				System.out.println();

	}// useLinkedList

	public static void main(String[] args) {
		UseList ul = new UseList();
		System.out.println("----------------------------ArrayList--------------------------------");
		ul.useArrayList();
		System.out.println("-------------------------------Vector-----------------------------");
		ul.useVector();
		System.out.println("------------------------------LinkedList------------------------------");
		ul.useLinkedList();
		
		
	}// main
}// UseList
