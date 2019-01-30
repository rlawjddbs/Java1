package day1127;

/**
 *	���ڿ� ������� �ּҸ� �����ϰ�, ���ڿ��� �ٷ�� ����� �����ϴ�
 *	String class�� ���<br>
 *	Java���� �����ϴ� Ŭ������ �̸��� ���� ���� Ŭ������ �̸��� ���ٸ� �������� Ŭ������ ���� ����ϰ� �Ǹ�,
 *	�׷� ���� Java�� ���ǵ� String Ŭ������ ����� �� ���� �� ���� �ִ�.
 *	Java���� �����ϴ� Ŭ������ ����� �� ���� full path(��Ű������ ��� ����Ͽ� Ŭ������ ����ϴ� ��)�� ����ؾ� �Ѵ�.<br>
 *	��Ű����.Ŭ������
 * @author owner
 */
public class UseString {

	public static void main(java.lang.String[] args) { // Ŭ�������� String ���� UseString���� ����, Ŭ�������� ��ġ�� �ʱ� ������ java.lang.String �̶�� full path�� ������� �ʾƵ� �ȴ�.
		//�⺻�� ���� ���. String s="���ڿ�";
		String str = "AbcdEfg";
		//������ ���� ���. String s=new String("���ڿ�");
		String mail = new String("kjy20020@hanmail.net");
		System.out.println(str);
		System.out.println(mail);
		
		System.out.println(str+"�� ���� ["+str.length()+"]��");
		System.out.println(mail+"�� ���� ["+mail.length()+"]��");
		
		System.out.println(str+"�� ��� �빮�� "+str.toUpperCase());
		System.out.println(mail+"�� ��� �빮�� "+mail.toUpperCase());
		System.out.println(str+"�� ��� �ҹ��� "+str.toLowerCase());
		System.out.println(mail+"�� ��� �ҹ��� "+mail.toLowerCase());
		//"AbcdEfg"
		// 0 123456
		//indexOf�� L -> R ���� �����ϸ� ���� ó�� ã������ ���ڿ��� �ε����� ��´�.
		System.out.println(str+"���� 'def'�� �ε��� : "+str.indexOf("dEf"));
		System.out.println(str+"���� 'd'�� �ε��� : "+str.indexOf("d"));
		System.out.println(str+"���� 'z'�� �ε��� : "+str.indexOf("z"));
		
		System.out.println(mail+"���� \"@\"�� �ε��� : "+mail.indexOf("@"));
		str = "AbcdEfAg";
		//lastIndexOf�� R -> L���� �����ϸ鼭 ���� ó�� ã������ ���ڿ��� �ε����� ��´�.
		System.out.println(str+"���� �ڷκ��� 'A'�� �ε��� : "+str.lastIndexOf("A"));
		
		//Ư�� �ε����� ���ھ��
		char temp=str.charAt(2);
//		char temp=str.charAt(200); //���� ���� ������ �ȵȴ�.
		System.out.println(str+"���� 2��° �ε����� �ش��ϴ� ����"+temp);
		
		// �ڽ� ���ڿ� �ڸ���
		// str="AbcdEfAg";
		//		  01234567
		System.out.println(str+"���� �ε����� 2~5��°�� �ش��ϴ� ���ڿ� "+str.substring(2, 5));
		
		//kjy20020@hanmail.net
		//012345678901234567890
		System.out.println(mail+"���� ���� �ּҸ� ��� "+mail.substring(0, 8));
		System.out.println(mail+"���� ���� �ּҸ� ��� "+mail.substring(0, mail.indexOf("@")));
		
		System.out.println(mail+"���� ������ �ּҸ� ��� "+mail.substring(9, 20));
		System.out.println(mail+"���� ������ �ּҸ� ��� "+mail.substring((mail.indexOf("@")+1), mail.length()));
		//substring�� ���� �ε����� ������ ������ �߶󳽴�
		System.out.println(mail+"���� ������ �ּҸ� ��� "+mail.substring(mail.indexOf("@")+1));
		
		//�� �� ���� �ڸ���
		str="   A BC   ";
		System.out.println("["+str+"]���� �յ� �������� ["+str.trim()+"]");
		
		//���ڿ� ���̱�
		str="Abcd";
		String str1 = str.concat("Efg"); // concat() ���� ���̱�
		String str2 = str+"Efg";	// ��������ڷ� ���̱�
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		//���ڿ��� �Ϻ��ϰ� ������ ��
		str="������";
		str1="������";
		System.out.println(str+"��(��) "+(str.equals("������")?"����":"���"));
		System.out.println(str1+"��(��) "+(str1.equals("������")?"����":"���"));
		
		//���ڿ��� �� ���ڿ��� �����ϴ���
		str="�Ǿ���";
		if(str.startsWith("����")) {
			System.out.println("���� ����Ͻ� �� �����ϴ�.");
		}else {
			System.out.println(str);
		}//else
		
		str = "����� ������";
		str1 = "������ �ȴޱ�";
		System.out.println(str+"��(��) "+(str.startsWith("����")?"Ư����":"������ �ƴմϴ�."));
		System.out.println(str1+"��(��) "+(str1.startsWith("����")?"Ư����":"������ �ƴմϴ�."));
		
		//Ư�� ���ڿ��� ��������
		str="����� ������ ���ﵿ";
		str1="��⵵ ������";
		System.out.println(str+"��(��)"+(str.endsWith("��")?"����":"�ð�"));
		System.out.println(str1+"��(��)"+(str1.endsWith("��")?"����":"�ð�"));
		
		//ġȯ : ���ڿ� ���� ��� ���ڿ� ã�Ƽ� ġȯ
		str="�� ���� �Ǿ����ε� �� ���� �� �����!";
		//method�� �����ؼ� ȣ�� �ϴ� ���� method chain�̶� �Ѵ�.
//		System.out.println(str.replaceAll("����", "*"));
		System.out.println(str.replaceAll("��", "*").replaceAll("��", "*")); //replace �Ǵ� replaceAll
		
		str="   A BC   ";
		System.out.println(str.replaceAll(" ", ""));
		
		int i=27;
//		str=i; int�� String���� �Ҵ� �� �� ����.
		// �⺻�� ���������� ���ڿ��� ��ȯ
		str=String.valueOf(i);
		System.out.println(str);
		double d=11.27;
		str=d+"";
		System.out.println(str);
		System.out.println(String.valueOf(d)); //valueOf()�� ���°� �� ���� ���
		
		str="";
		System.out.println(str.isEmpty());
		
		//��ü ������ ���� �ʾ��� �� �� Ŭ������ �����ϴ� method��
		//����� �� ����. Error
//		str=null;
//		System.out.println(str.isEmpty());
		
		/////////////////////////////// 11-28-2018 split ��� �ڵ� �߰� /////////////////////////////
		String data="������, ������, ���ü�~������~�����.������,������,������.������";
		//split�� �ѹ��� �ϳ��� ���ڷ� �����Ͽ� �ڸ���.
		String[] arr = data.split(","); //��ħǥ"."�� �׳� ���� ���е��� �ʰ� ���ȣ[ ] �� ��� ����.
		System.out.println("���е� �迭 ���� ���� : "+arr.length);
		for(String name : arr) {
			System.out.println(name);
		}//end for
		
		for(int j = 0;  j < arr.length; j++) {
			System.out.println(arr[j]);
		}//end for
		
		
		
	}//main
}//class
