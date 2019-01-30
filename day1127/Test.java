package day1127;

public class Test {

	public static void main(String[] args) {
		String ssn = "880101-1234567";

		int[] arrSsn = new int[13];
		int total = 0;
		int j = 2;
		for (int i = 0; i < arrSsn.length; i++) {
			if (j > 9) {
				j = 2;
			}
			if (i > 5) {
				arrSsn[i] = Integer.parseInt(ssn.substring(i + 1, i + 2));
			} else {
				arrSsn[i] = Integer.parseInt(ssn.substring(i, i + 1));
			} // end else
			if(i < 12) {
				total += arrSsn[i] * j;	
			}
			System.out.println("arrSsn[" + i + "]ÀÇ °ª : " + arrSsn[i]);
			System.out.println(total);
			j++;
		} // end for

		total = (11 - total % 11) % 10;
		System.out.println(total);
	}// main
}// class
