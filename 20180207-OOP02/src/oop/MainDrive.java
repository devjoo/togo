package oop;

public class MainDrive {
	public static void main(String[] args) {
		
		String s = "안녕하세요. 지우입니다";
		System.out.println(s);
		
		//s에 저장된 값이 지우 인가? 맞다면 ok 아니면 not
		if(s.equals("지우")) {
			System.out.println("Ok");
		}else {
			System.out.println("not Ok");
		}
		
		//s에 저장된 2번째 글자는 무엇인가?
		System.out.println(s.charAt(1));
		
		//s는 몇글자?
		System.out.println(s.length() + "글자");
	}
}
