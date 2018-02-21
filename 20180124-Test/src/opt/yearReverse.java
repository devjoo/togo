package opt;

import java.util.Scanner;

public class yearReverse {
	public static void main(String[] args) {
		// 입력하는 연도가 윤년인지 아닌지 출력하기
		// 1997 => 윤년인가? false
		// 2016 => 윤년인가? true
		// 윤년 계산 방법을 직접 구글해서 찾아서 적용
		
		System.out.println("연도를 입력해주세요.");
		Scanner myScanner = new Scanner(System.in);
		
		int year = myScanner.nextInt();
		boolean result;
		result = year%4==0 && ( year%100!=0 || year%400==0 );
		// 4의 배수, 100으로 나눠지지 않는 나머지나 400의 배수 면 윤년이다.
		
		System.out.println("윤년인가? " + result);
	}
}
