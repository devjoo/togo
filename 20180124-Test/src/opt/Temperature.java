package opt;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		// 섭씨 온도는 화씨로 몇도?
		// 1. 키보드로 숫자 입력 : 섭씨 온도를 입력해주세요.
		// 2. 입력받은 섭씨온도를 계산 (데이터 가공) => 화씨 온도를 계산
		// 3. 화씨 온도는 ?? 입니다. 출력
		
		System.out.println("섭씨 온도를 입력해주세요.");
		Scanner myScanner = new Scanner(System.in);
		
		double celsius = myScanner.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println("화씨온도는 " + fahrenheit + "입니다.");
	}
}
