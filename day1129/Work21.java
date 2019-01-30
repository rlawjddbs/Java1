package day1129;

/**
 * ���� 1. ��ȣ,�̸�,�ּ�,����,������ ������ �� �ִ� Ŭ������ �����<br>
 * �Ʒ��� ���� ���� �Է��մϴ�.<br>
 * <br>
 * �Է°�<br>
 * 1, ������, ����� ������ ���ﵿ, 28,����<br>
 * 2, ������, ����� ���빮�� ��ʸ���, 27,����<br>
 * 3, ������, ������ ���뱸 ���뵿, 26,����<br>
 * 4, ���ü�, ����� ���α� ���ε�,27, ����<br>
 * 5, ���ü�, ����� ���۱� �󵵵�,29,����<br>
 * 6, �����, ��⵵ ��õ�� ��õ��,26,����<br>
 * 7, �����, ����� ������ �����絿,27,����<br>
 * ����� ������ x��<br>
 * ���� �� x��<br>
 * �ְ���� "���ü�(����)"<br>
 * 
 * 1. ���ǰ��� �迭�� �Է��ϴ� method�� �ۼ��Ұ�.<br>
 * 2. �迭�� �Էµ� ���� ����ϴ� method �� �ۼ��Ұ�.<br>
 * 2�� method ���� ����ÿ� ��� �ִ� �ο����� ��� �Ұ�.<br>
 * 2�� method ���� ������ ���� ��� �Ұ�.<br>
 * 2�� method ���� ���� ���̰� ���� ����� �̸��� ��� �� ��.
 * 
 * @author owner
 */
public class Work21 {
	private String[][] arr = null;
	
	private int[] numbers = null;
	private String[] names = null;
	private String[] addrs = null;
	private int[] ages = null;
	private String[] gens = null;

	private int saveCnt = 0; // �迭�� ����� Ƚ�� ����

	public Work21() {
		arr = new String[7][5];
		
		numbers = new int[7];
		names = new String[7];
		addrs = new String[7];
		ages = new int[7];
		gens = new String[7];
	}

	public void Work21(int num, String name, String addr, int age, String gen) {
		if (saveCnt != 7) {
			numbers[saveCnt] = num;
			names[saveCnt] = name;
			addrs[saveCnt] = addr;
			ages[saveCnt] = age;
			gens[saveCnt] = gen;
			saveCnt++;
		} else {
			System.out.printf("�����͸� ������ �뷮�� �����մϴ�. �ִ�뷮[%d]�� ����뷮[%d��] - ������! \n", numbers.length, saveCnt);
		} // end else
	}// Work21

	public void addArr() {
		for(int i=0; i < arr.length; i++) {
			arr[i][0] = String.valueOf(numbers[i]);
			arr[i][1] = names[i];
			arr[i][2] = addrs[i];
			arr[i][3] = String.valueOf(ages[i]);
			arr[i][4] = gens[i];
		}//end for (i)
	}//addArr
	
	public void printArr() {
		int seoulCnt = 0;
		int totalAge = 0;
		int temp = 0;
		String oldest = "";
		for(int i=0; i < arr.length; i++) {
			
			if( arr[i][2].startsWith("�����") ) {
				seoulCnt++;
			}
			totalAge += Integer.parseInt(arr[i][3]);
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
				
				if( temp < Integer.parseInt(arr[j][3]) ) {
					temp = Integer.parseInt(arr[j][3]);
					oldest = "�ְ���� ["+arr[j][1]+"] ("+arr[j][4]+")";
				}//end if
				
			}//end for j
			System.out.println();
		}//end for i
		System.out.printf("����� ������ [%d]��\n", seoulCnt);
		System.out.printf("���� �� [%d]��\n", totalAge);
		System.out.println(oldest);
	}//printArr
	
	public static void main(String[] args) {
		Work21 work = new Work21();
		work.Work21(1, "������", "����� ������ ���ﵿ", 28, "����");
		work.Work21(2, "������", "���빮�� ��ʸ���", 27, "����");
		work.Work21(3, "������", "������ ���뱸 ���뵿", 26, "����");
		work.Work21(4, "���ü�", "����� ���α� ���ε�", 27, "����");
		work.Work21(5, "���ü�", "����� ���۱� �󵵵�", 29, "����");
		work.Work21(6, "�����", "����� ��õ�� ��õ��", 26, "����");
		work.Work21(7, "�����", "����� ������ �����絿", 27, "����");
		
		//1. ���ǰ��� �迭�� �Է��ϴ� method�� �ۼ��� ��.
		work.addArr();
		//2. �迭�� �Էµ� ���� ����ϴ� method�� �ۼ��� ��.
		work.printArr();
	}

}
