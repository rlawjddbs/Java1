package day1206;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class DataProcess {
	Random r = new Random();
	private int ranStudent;
	private int ranCnt;
	private List<DataVo> result;
	
	public DataProcess(){
		ranStudent = (r.nextInt(4))+2;
		
	}//�⺻ ������
	
	public List<DataVo> getData() {
		ArrayList<DataVo> dv = new ArrayList<DataVo>();
		Random r = new Random();
		DataVo dataVo = new DataVo("������", r.nextInt(100));
		dv.add(dataVo);
		return dv;
	}//getData
	
	public static void main(String[] args) {
//		List<DataVo> dv = new List<DataVo>();
		
	}//main
}//class
