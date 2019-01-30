package day1119;

/**
 * 숙제 <br>
 * 1. 출퇴근 시간을 입력받아 아래의 조건으로 출력하세요. <br>
 * 출력 : 출퇴근 시간은 최대 2시간의 제한이 있으며 60분을 넘는 다면 "장거리" <br>
 * 60분 이하라면 "단거리"를 출력하세요. <br>
 * 120분을 넘어가면 7H멀어<br>
 * 
 * 
 * 2. 이름, 교통수단과 출퇴근 거리를 입력받아 아래와 같이 출력하세요. <br>
 * 교통수단은 "버스,지하철,택시,도보"로 제한한다. <br>
 * 버스요금 1200원, 지하철 요금 1250원, 택시요금 3800원 입니다. <br>
 * 요금은 10키로 까지는 기본요금, 매 5키로 초과시 마다 100원씩 증가 합니다. <br>
 * <br>
 * - 출력 : xxx님 출퇴근 교통수단은 xx이며 거리는 xx 키로 입니다. <br>
 * 편도 이용 요금 xx원이고, 왕복이용 요금 xx원이며, 한달 20일기준 <br>
 * 교통비는 총: xxxx원 입니다. <br>
 * 
 * @author owner
 */
public class Work17 {
	public static final int LIMIT_TIME=120;
	public static void main(String[] args) {
		// 1번 문제
		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		if (sum <= 60) {
			System.out.println("단거리");
		} else if (sum > 60 && sum <= LIMIT_TIME) {
			System.out.println("장거리");
		} else {
			System.out.println("7H멀어");
		} //end if
		
		// 2번 문제
		int tax = 0;
		String traff=args[3];
		int km = Integer.parseInt(args[4]);
		
		switch(traff) {
		case "버스":tax=1200;
			if(km>=10) {
				tax=1200+((km-10)/5)*100;
			}
		break;
		case "지하철":tax=1250;
			if(km>=10) {
				tax=1250+((km-10)/5)*100;
			}
		break;
		case "택시":tax=3800;
			if(km>=10) {
				tax=3800+((km-10)/5)*100;
			}
		break;
		case "도보":tax=0;
		break;
		default:System.out.println("버스, 지하철, 택시, 도보 중 하나를 입력하세요.");
		}
		
		System.out.println(args[2]+"님 출퇴근 교통수단은 "+traff+"이며 거리는 "+km+"키로 입니다.");
		System.out.println("편도 이용요금 "+tax+"원이고, 왕복이용 요금 "+(tax*2)+"원이며, 한달 20일 기준");
		System.out.println("교통비는 총 : "+(tax*40)+"원 입니다.");
	}

}
