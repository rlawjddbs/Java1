package day1115;
/*
	Java ���α׷� �ܺο��� Java ���α׷� ���η� ����
	������ �� main method�� Arguments�� ����Ѵ�.
	���� ) java bytecode��(Ŭ�������ϸ�) �� �� ��...
	Arguments(��)�� �ִ� ��� ������ �� 21�ﰳ��.
*/
class  MainArguments{
	public static void main(String[] args)	{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]);
		// System.out.println(args[0]*args[1]); // ���ڿ� ���� ���ϸ� Error �߻�
		
		// ���ڿ��� ������ ��ȯ
		// Integer.parseInt( ���ڿ� ); ���ڿ��� �����Ͽ� int������ 
		// ��ȯ�� �� �� ���� ��ȯ�ϴ� �޼ҵ�
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);

		System.out.println(i * j);

		System.out.println(args[2]+"�� �ȳ��ϼ���.");
	}//main
}//class