package work1217;

import javax.swing.JOptionPane;

public class DataVo {

	private String name;
	private int javaScore, oracleScore;
	private Process pr;
	
	public DataVo() {
		pr = new Process();
	}//DataVo(기본생성자)
	
	public DataVo(String name, int javaScore, int oracleScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
	}//DataVo(인자가있는 생성자)
	
	public String getName() {
		return name;
	}//getName
	public int getJavaScore() {
		return javaScore;
	}//getJavaScore
	public int getOracleScore() {
		return oracleScore;
	}//getOracleScore
	
	public void setName(String name) {
		this.name = name;
	}//setName
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}//setJavaScore
	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}//setOracleScore
	
//	public 
	
	
}//class
