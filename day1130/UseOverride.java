package day1130;
import day1129.HongGilDong;

public class UseOverride {

	public static void main(String[] args) {
		
		OverrideToString ots = new OverrideToString();
		HongGilDong gd = new HongGilDong();
		String str = new String("巩磊凯历厘家");
		
//		System.out.println(ots.toString());
//		System.out.println(gd.toString());// 林家
//		System.out.println(str.toString());
//		System.out.println(str);
		
		System.out.println(ots);
		System.out.println(gd);
		System.out.println(str);
		
	}//main

}//class
