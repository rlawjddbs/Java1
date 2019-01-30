package day1206;

import java.util.Stack;

/**
 *	Stack : LIFO(Last Input First Output)을 구현한 클래스.
 * @author owner
 */
public class UseStack {
	public UseStack() {
		
		// 생성 )
		Stack<String> stk = new Stack<String>();
		
		//값 할당
//		stk.add("부모"); //부모 클래스가 제공하는 기능은 사용하지 않는다.
		stk.push("하셨습니다.");//첫 번째 값
		stk.push("수고를");//두 번째 값
		stk.push("오늘도");//세 번째 값
		System.out.println(stk);
		//부모인 Vector의 자원을 가져와 쓰면 개수가 나오긴 하나 실제로 순수하게 Stack 자체는 size()가 없다.(크기를 얻을 필요가 없으니까. == 한번 값을 쓰면 사라지니까)
		System.out.println("크기 : "+stk.size()); // 부모 클래스의 기능 
//		System.out.println(stk.pop()); // Stack은 index 개념이 없다.
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
		
		//부모 클래스가 제공하는 기능(get())을 사용하면 스택의 고유기능을 사용할 수 없게된다.
//		for(int i=0; i < stk.size(); i++) {
//			System.out.println(stk.get(i));
//		}//end for
		
		System.out.println(stk.empty());
		while(!stk.empty()) {
			System.out.print(stk.pop()); // Stack에서 데이터를 꺼내면 다음번에는 그 데이터를 사용할 수 없다.
		}//end while
		
				
	}//UseStack
	
	public static void main(String[] args) {
		new UseStack();
	}//main

}//class
