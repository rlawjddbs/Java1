package day1128;

public class Test {
	private int room = 0;
	
	public int[][] scoreData() {
		int[][] score = { { 85, 86, 81 }, { 95, 91, 100 }, { 89, 71, 59 }, { 97, 96, 91 }, { 78, 74, 77 },
				{ 100, 95, 68 } };
		return score;
	}//scoreData
	
	public void checkRoom(int[][] score) {
		for(int i=0; i < score[i].length; i++) {
			room = i+1;
		}//end for
		System.out.println(room);
	}//checkRoom
	
	public void test(int[][] score) {
		for(int i=0; i< score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("[%d][%d]의 값 : %d\t", i, j, score[i][j]);
			}//end for
			System.out.println();
		}//end for
		
		System.out.println();
		
		for(int i=0; i< score[i].length; i++) {
			for(int j=0; j<score.length; j++) {
				System.out.printf("[%d][%d]의 값 : %d\t", j, i, score[j][i]);
			}//end for
			System.out.println();
		}//end for
	}//test
	
	public static void main(String[] args) {
		Test t = new Test();
		int[][] score = t.scoreData();
		
		t.test(score);
		t.checkRoom(score);
	}

}
