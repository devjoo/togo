package opt;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		
		Scanner ageScanner = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = ageScanner.nextInt();
		
		// Q1. 당신의 출생 년도 는 ?? 년입니다 31 => 1988년
		int date = 2018 - age + 1;
		System.out.println("당신의 출생 년도 는 " + date + " 년입니다");
		
		// Q2. 당신은 30대 이상이 맞나요? true / flase
		boolean result = age >= 30;
		System.out.println("당신은 30대 이상이 맞나요? " + result );
		
		// Q3. 당신은 20대가 맞나요? true / flase
		boolean result2 = (20 <= age) && (age < 30);
		System.out.println("당신은 30대 이상이 맞나요? " + result2 );
		
		// Q4. 당신은 ??년대생입니다. (10의 자리 몇인가)
		// 1. 100으로 나눈 나머지가 몇? X % 100 = 뒤 두자리
		// 2. (정수와 정수의 나눗셈)
		int dateAll = ((date % 100)/10)*10;
		System.out.println("당신은 " + dateAll + "년대생입니다.");
	}
}
