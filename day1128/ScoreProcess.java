package day1128;

/**
 * 4������ �л����� ����ó�� ���α׷�
 * 
 * @author owner
 */
public class ScoreProcess {

	public ScoreProcess() {
		String[] nameArr = { "������", "���ü�", "������", "��ǿ�", "������" };
		int[] scoreArr = { 89, 76, 99, 64, 50 };
		int totalScore = 0; // ������ ���� ��
		int maxScore = scoreArr[0]; // �ְ�����
		int minScore = 101; // ��������
		int temp=0; // ���İ��� �ӽ÷� ����
		
		System.out.println("��ȣ\t�̸�\t����");
		System.out.println("-------------------------------------------");
		
		for(int i=0; i < nameArr.length; i++) {
			System.out.printf("%d\t%s\t%d\n", i+1, nameArr[i], scoreArr[i]);
			totalScore += scoreArr[i];
			
			// �ְ������� ���� ��ȯ���� ���� ������ �۴ٸ�
			// ���� ��ȯ���� ���� ������ �ְ������� �������ش�.
			if( maxScore < scoreArr[i]) {
				maxScore = scoreArr[i];
			}//end if
			// ���������� ���� ��ȯ���� ���� ������ ũ�ٸ�
			// ���� ��ȯ���� ���� ������ ���������� �������ش�.
			if( minScore > scoreArr[i]) {
				minScore = scoreArr[i];
			}//end if
		}//end for
		
		System.out.println("-------------------------------------------");
		System.out.println("�����ο� : "+nameArr.length+"��");
		System.out.println("���� ["+totalScore+"] ��� ["+(totalScore/nameArr.length)+"]");
		System.out.printf("���� [%5d] ��� [%.2f]\n",totalScore, (totalScore/(double)nameArr.length));
		System.out.printf("�ְ��� [%d] ������[%d]\n", maxScore, minScore);
//		System.out.println(totalScore/nameArr.length);
		
		for(int i = 0; i < scoreArr.length-1; i++) {
			for(int j = i + 1; j < scoreArr.length; j++) {
				if(scoreArr[i] < scoreArr[j]) {//�չ��� ���� �޹溸�� �۴ٸ�
					temp = scoreArr[i];
					scoreArr[i] = scoreArr[j];
					scoreArr[j] = temp;
				}//end if
			}//end for
		}//end for
		
		for(int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%4d", scoreArr[i]);
		}//end for
		
		System.out.println();
		
		for(int i = 0; i < scoreArr.length-1; i++) {
			for(int j = i + 1; j < scoreArr.length; j++) {
				if(scoreArr[i] > scoreArr[j]) {//�չ��� ���� �޹溸�� ũ�ٸ�
					temp = scoreArr[i];
					scoreArr[i] = scoreArr[j];
					scoreArr[j] = temp;
				}//end if
			}//end for
		}//end for
		
		for(int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%4d", scoreArr[i]);
		}//end for
		
		
		System.out.println();
		
	}// ScoreProcess

	public static void main(String[] args) {
		new ScoreProcess();
		System.out.println("----------------------------------------------------");
		int birth=1988;
		String[] zodiac = {"������","��","��","����","��","��","ȣ����","�䳢","��","��","��","��"};
		System.out.println(zodiac[birth%12]);
		
	}// main

}// class
