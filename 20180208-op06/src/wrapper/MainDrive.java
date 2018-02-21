package wrapper;

public class MainDrive {
	public static void main(String[] args) {
		
		// 변수 / 클래스 => .을 통한 기능활용이 차이가 난다.
		
		String s = "이지우";
		
		int a = 10;
		//a. => 클래스가 아니라서 아무일도 없다..ㅜㅜ
		
		Integer i = 10;
		
		boolean b = true;
		Boolean b2 = true;
		
		//사정상 숫자를 String 형태에 저장
		String birthday ="881020";
		
		//Q. 이 사람의 나이는 몇살?
		
		// birthday를 int로 변환 필요함
		int tempBirthDay = Integer.parseInt(birthday);
		// Wrapper 클래스는 고유 기능으로
		// String을 각자의 변수형태로 변환하는 기능을 내장.
		
		// String -> int Integer.parseInt(str);
		// String -> double Double.parseDouble(str);
		int birthYear = tempBirthDay / 10000 + 1900;
		System.out.println(birthYear + "년생이다.");
		
		String height = "185.7";
		
		//두개의 변수를 이용하여 표준체중 계산.
		//공식 : (키 - 100) * 0.9
		double dh = Double.parseDouble(height);
		double result = (dh - 100) * 0.9;
	
		System.out.println(result);
	}
}
