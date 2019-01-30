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
//		char grade=' '; 	//char는 문자를 저장한다. ''는 코드셋에 문자 없음. 
								//' '로 white space를 입력하면 코드셋에 존재하는 문자이므로
								//공백처리가 된다.
								// ' ' : 공백문자(white space) - unicode \u0000 ~ \uFFFF
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
			System.out.println(score + " 점의 학점은 "+ grade);
		}else {
			System.out.println("점수는 0~100점 사이만 입력 가능!!!");
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
		//break; default는 아랫줄에 실행될 코드가 없으므로 분기문을 사용하지 않는다.
		//}end switch
	}//main
}//class
