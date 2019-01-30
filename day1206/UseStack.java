package day1206;

import java.util.Stack;

/**
 *	Stack : LIFO(Last Input First Output)�� ������ Ŭ����.
 * @author owner
 */
public class UseStack {
	public UseStack() {
		
		// ���� )
		Stack<String> stk = new Stack<String>();
		
		//�� �Ҵ�
//		stk.add("�θ�"); //�θ� Ŭ������ �����ϴ� ����� ������� �ʴ´�.
		stk.push("�ϼ̽��ϴ�.");//ù ��° ��
		stk.push("����");//�� ��° ��
		stk.push("���õ�");//�� ��° ��
		System.out.println(stk);
		//�θ��� Vector�� �ڿ��� ������ ���� ������ ������ �ϳ� ������ �����ϰ� Stack ��ü�� size()�� ����.(ũ�⸦ ���� �ʿ䰡 �����ϱ�. == �ѹ� ���� ���� ������ϱ�)
		System.out.println("ũ�� : "+stk.size()); // �θ� Ŭ������ ��� 
//		System.out.println(stk.pop()); // Stack�� index ������ ����.
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
		
		//�θ� Ŭ������ �����ϴ� ���(get())�� ����ϸ� ������ ��������� ����� �� ���Եȴ�.
//		for(int i=0; i < stk.size(); i++) {
//			System.out.println(stk.get(i));
//		}//end for
		
		System.out.println(stk.empty());
		while(!stk.empty()) {
			System.out.print(stk.pop()); // Stack���� �����͸� ������ ���������� �� �����͸� ����� �� ����.
		}//end while
		
				
	}//UseStack
	
	public static void main(String[] args) {
		new UseStack();
	}//main

}//class
