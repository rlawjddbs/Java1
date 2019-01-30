package day1206;

import java.util.Random;

public class DataVo {
	private String name;
	private int score;
	Random r = new Random();
	
	public DataVo() {
		
	}//기본 생성자
	
	public DataVo(String name, int score) {
		this.name = name;
		this.score = score;
	}//DataVo
	
	public void setName(String name) {
		this.name = name;
	}//setName
	public void setScore(int score) {
		this.score = score;
	}//setScore
	
	public String getName() {
		return name;
	}//getName
	public int getScore() {
		return score;
	}//getScore
		
}//class
