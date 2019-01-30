package day1127;

/**
 *	문자열 저장소의 주소를 저장하고, 문자열을 다루는 기능을 제공하는
 *	String class의 사용<br>
 *	Java에서 제공하는 클래스의 이름과 내가 만든 클래스의 이름이 같다면 내가만든 클래스를 먼저 사용하게 되며,
 *	그로 인해 Java에 정의된 String 클래스를 사용할 수 없게 될 수도 있다.
 *	Java에서 제공하는 클래스를 사용할 때 마다 full path(패키지명을 모두 기술하여 클래스를 사용하는 것)로 사용해야 한다.<br>
 *	패키지명.클래스명
 * @author owner
 */
public class UseString {

	public static void main(java.lang.String[] args) { // 클래스명을 String 에서 UseString으로 변경, 클래스명이 겹치지 않기 때문에 java.lang.String 이라는 full path를 사용하지 않아도 된다.
		//기본형 형식 사용. String s="문자열";
		String str = "AbcdEfg";
		//참조형 형식 사용. String s=new String("문자열");
		String mail = new String("kjy20020@hanmail.net");
		System.out.println(str);
		System.out.println(mail);
		
		System.out.println(str+"의 길이 ["+str.length()+"]자");
		System.out.println(mail+"의 길이 ["+mail.length()+"]자");
		
		System.out.println(str+"을 모두 대문자 "+str.toUpperCase());
		System.out.println(mail+"을 모두 대문자 "+mail.toUpperCase());
		System.out.println(str+"을 모두 소문자 "+str.toLowerCase());
		System.out.println(mail+"을 모두 소문자 "+mail.toLowerCase());
		//"AbcdEfg"
		// 0 123456
		//indexOf는 L -> R 으로 진행하며 가장 처음 찾아지는 문자열의 인덱스를 얻는다.
		System.out.println(str+"에서 'def'의 인덱스 : "+str.indexOf("dEf"));
		System.out.println(str+"에서 'd'의 인덱스 : "+str.indexOf("d"));
		System.out.println(str+"에서 'z'의 인덱스 : "+str.indexOf("z"));
		
		System.out.println(mail+"에서 \"@\"의 인덱스 : "+mail.indexOf("@"));
		str = "AbcdEfAg";
		//lastIndexOf는 R -> L으로 진행하면서 가장 처음 찾아지는 문자열의 인덱스를 얻는다.
		System.out.println(str+"에서 뒤로부터 'A'의 인덱스 : "+str.lastIndexOf("A"));
		
		//특정 인덱스의 문자얻기
		char temp=str.charAt(2);
//		char temp=str.charAt(200); //없는 것을 넣으면 안된다.
		System.out.println(str+"에서 2번째 인덱스에 해당하는 문자"+temp);
		
		// 자식 문자열 자르기
		// str="AbcdEfAg";
		//		  01234567
		System.out.println(str+"에서 인덱스가 2~5번째에 해당하는 문자열 "+str.substring(2, 5));
		
		//kjy20020@hanmail.net
		//012345678901234567890
		System.out.println(mail+"에서 메일 주소만 얻기 "+mail.substring(0, 8));
		System.out.println(mail+"에서 메일 주소만 얻기 "+mail.substring(0, mail.indexOf("@")));
		
		System.out.println(mail+"에서 도메인 주소만 얻기 "+mail.substring(9, 20));
		System.out.println(mail+"에서 도메인 주소만 얻기 "+mail.substring((mail.indexOf("@")+1), mail.length()));
		//substring은 시작 인덱스만 넣으면 끝까지 잘라낸다
		System.out.println(mail+"에서 도메인 주소만 얻기 "+mail.substring(mail.indexOf("@")+1));
		
		//앞 뒤 공백 자르기
		str="   A BC   ";
		System.out.println("["+str+"]에서 앞뒤 공백제거 ["+str.trim()+"]");
		
		//문자열 붙이기
		str="Abcd";
		String str1 = str.concat("Efg"); // concat() 으로 붙이기
		String str2 = str+"Efg";	// 산술연산자로 붙이기
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		//문자열이 완벽하게 같은지 비교
		str="이재찬";
		str1="정택찬";
		System.out.println(str+"은(는) "+(str.equals("이재찬")?"반장":"평민"));
		System.out.println(str1+"은(는) "+(str1.equals("이재찬")?"반장":"평민"));
		
		//문자열이 이 문자열로 시작하는지
		str="피씨방";
		if(str.startsWith("씨방")) {
			System.out.println("욕은 사용하실 수 없습니다.");
		}else {
			System.out.println(str);
		}//else
		
		str = "서울시 강남구";
		str1 = "수원시 팔달구";
		System.out.println(str+"은(는) "+(str.startsWith("서울")?"특별시":"서울이 아닙니다."));
		System.out.println(str1+"은(는) "+(str1.startsWith("서울")?"특별시":"서울이 아닙니다."));
		
		//특정 문자열로 끝났는지
		str="서울시 강남구 역삼동";
		str1="경기도 김포리";
		System.out.println(str+"은(는)"+(str.endsWith("동")?"도시":"시골"));
		System.out.println(str1+"은(는)"+(str1.endsWith("동")?"도시":"시골"));
		
		//치환 : 문자열 내의 모든 문자열 찾아서 치환
		str="나 지금 피씨방인데 넌 어디니 씨 방새야!";
		//method를 연결해서 호출 하는 것을 method chain이라 한다.
//		System.out.println(str.replaceAll("씨방", "*"));
		System.out.println(str.replaceAll("씨", "*").replaceAll("방", "*")); //replace 또는 replaceAll
		
		str="   A BC   ";
		System.out.println(str.replaceAll(" ", ""));
		
		int i=27;
//		str=i; int는 String으로 할당 될 수 없다.
		// 기본형 데이터형을 문자열로 변환
		str=String.valueOf(i);
		System.out.println(str);
		double d=11.27;
		str=d+"";
		System.out.println(str);
		System.out.println(String.valueOf(d)); //valueOf()를 쓰는게 더 나은 방법
		
		str="";
		System.out.println(str.isEmpty());
		
		//객체 생성을 하지 않았을 때 그 클래스가 제공하는 method를
		//사용할 수 없다. Error
//		str=null;
//		System.out.println(str.isEmpty());
		
		/////////////////////////////// 11-28-2018 split 사용 코드 추가 /////////////////////////////
		String data="이재찬, 이재현, 정택성~공선의~김건하.최지우,노진경,김정운.김정윤";
		//split은 한번에 하나의 문자로 구분하여 자른다.
		String[] arr = data.split(","); //마침표"."는 그냥 쓰면 구분되지 않고 대괄호[ ] 로 묶어서 쓴다.
		System.out.println("구분된 배열 방의 개수 : "+arr.length);
		for(String name : arr) {
			System.out.println(name);
		}//end for
		
		for(int j = 0;  j < arr.length; j++) {
			System.out.println(arr[j]);
		}//end for
		
		
		
	}//main
}//class
