package day1120;

/**
 *
 * @author owner
 */
public class TestSwitchCase {
	public static final int GRADE_A_PLUS=10;
	public static final int GRADE_A=9;
	public static final int GRADE_B=8;
	public static final int GRADE_C=7;
	public static final int GRADE_D=6;
	
	
	public static void main(String[] args) {
		int score=50;
//		char grade=' '; 	//char�� ���ڸ� �����Ѵ�. ''�� �ڵ�¿� ���� ����. 
								//' '�� white space�� �Է��ϸ� �ڵ�¿� �����ϴ� �����̹Ƿ�
								//����ó���� �ȴ�.
								// ' ' : ���鹮��(white space) - unicode \u0000 ~ \uFFFF
//		System.out.println((int)Character.MIN_VALUE + " / " +(int)Character.MAX_VALUE);
//		System.out.println(Character.MIN_VALUE + " / " +Character.MAX_VALUE);
		char grade=64;
		if(score >= 0 && score <= 100) {
			switch (score/10) {
				case TestSwitchCase.GRADE_D : grade++;
				case TestSwitchCase.GRADE_C : grade++; 
				case TestSwitchCase.GRADE_B : grade++; 
				case TestSwitchCase.GRADE_A :	
				case TestSwitchCase.GRADE_A_PLUS: grade++; break;
				default : grade+=6;
			}
//			switch (score/10) {
//			case TestSwitchCase.GRADE_A_PLUS: grade++; break;
//			case TestSwitchCase.GRADE_A :	
//			case TestSwitchCase.GRADE_B : grade++; 
//			case TestSwitchCase.GRADE_C : grade++; 
//			case TestSwitchCase.GRADE_D : grade++;
//			
//			default : grade+=6;
//		}
			System.out.println(score + " ���� ������ "+ grade);
		}else {
			System.out.println("������ 0~100�� ���̸� �Է� ����!!!");
		}
		/*switch (score/10) {
		case 6 : grade++; break;
		case 7 : grade++; break;
		case 8 : grade++; break;
		case 9 : grade++;	break;
		case 10 : grade++;	break;
		default : grade+=6;*/
		/*switch (score/10) {
		case 10 : grade='A'; break;
		case 9 : grade='B'; break;
		case 8 : grade='C'; break;
		case 7 : grade='D';	break;
		case 6 : grade='E';	break;
		default : grade='F';*/
		//break; default�� �Ʒ��ٿ� ����� �ڵ尡 �����Ƿ� �б⹮�� ������� �ʴ´�.
		//}end switch
	}//main
}//class
