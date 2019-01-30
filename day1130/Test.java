package day1130;

import java.awt.Dialog;
import java.awt.Frame;

public class Test extends Dialog {
	public Test() { 
		super(new Frame(), "다이얼로그", true);
		//자식창이 떴을 때 부모창이 클릭이 되는 것을 "비모달"이라 한다.
		//자식창이 떴을 때 부모창이 클릭이 안되는 것을 "모달"이라 한다.
	}
}
