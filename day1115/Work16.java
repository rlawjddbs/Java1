package day1115;
/* 
 ����
1. ������ �Ҵ�� ���� ����϶��� 2������ ����ϰ� ������� ~�� ����Ͽ�
    ����� �����ϰ� �Էµ� �״���� 10������ ���.
    ��� ��)  "��� �ΰ��"  10 ��(��)  1010
                 "���� �ΰ��"  -10 ��(��) 10

2. 2147483647�� ������ ���� 2byte�� ���� 2byte ���� �и��Ͽ� ����غ�����. 
    ��� ��) ���� 2byte -> 32767
                ���� 2byte -> 65535

3. ||�� ������� �� ������ true��� ������ �������� �ʴ� ���� ������ �� �ִ�
     �ڵ带 �ۼ��ϼ���.


4. å�� ��������. p136 ~ 146
*/
class Work16{
	public static void main(String[] args) {
		// ���� 1
		int i = 10;
		System.out.println(i>=0 ? Integer.toBinaryString(i) : ~i+1);

		// ���� 2
		System.out.println("Integer�� ���� 2byte = "+(Integer.MAX_VALUE>>16));
		System.out.println("Integer�� ���� 2byte = "+(Integer.MAX_VALUE>>15));

		// ���� 3
		String s;
		System.out.println((1+1==2) || (1+1 == 0) ? (s="1 ���ϱ� 1�� 2") : (s="1 ���ϱ� 1�� 1"));
	}//main
}//class
