package study;

public class TestMaxInteger {

	public static void main(String[] args) {
		int MaxIntegerTest = Integer.MAX_VALUE+1;
		int MinIntegerTest = Integer.MIN_VALUE-1;
		float MaxFloatTest = Float.MAX_VALUE;
		float MinFloatTest = Float.MIN_VALUE;
		System.out.println(MaxIntegerTest);
		System.out.println(MinIntegerTest);
		System.out.println(MaxFloatTest);
		System.out.println(MinFloatTest);
		System.out.println((float)(MaxFloatTest+MinFloatTest));
		System.out.println(-MinFloatTest-MinFloatTest);
		
	}

}
