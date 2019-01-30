package day1217t;

public class ScoreVO {

	private String name;
	private int javaScore, oracleScore;
	
	public ScoreVO(String name, int javaScore, int oracleScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
	}//ScoreVO

	public String getName() {
		return name;
	}//getName

	public int getJavaScore() {
		return javaScore;
	}//getJavaScore

	public int getOracleScore() {
		return oracleScore;
	}//getOracleScore
	
}//class
