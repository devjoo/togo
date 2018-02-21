package opt;

import java.util.Scanner;

/*
 * 단항 연산자 사용법
 * 프로그램이 싱핼된 상태에서 키보드로 입력받기
 */

public class MainDrive {
	public static void main(String[] args) {
		
		int i = 1;
		int j = 10;
		int result = i + j;
		
		// 지금까지 배운 모든 연산자는 피연산자의 값은 변화시키지 않음
		System.out.println("i : " + i + " j : " + j);
		
		i++;
		j--;
		System.out.println("i : " + i + " j : " + j);
		
		++i;
		--j; // 연산자를 앞에 써도 같은 동작
		System.out.println("i : " + i + " j : " + j);
		
		// 뒤에쓰면 끝난다음 증감되고 앞에 쓰면 증감하고 연산한다
		result = i + j;
		System.out.println(result);
		result = i++ + j;
		System.out.println(result); // 11;
		result = ++i + j;
		System.out.println(result); // 13;
		result = ++i + j--;
		System.out.println(result); // 14
		
		// 1. 스캐너 변수 생성 (객체지향 문법 => 일단 숙지) 
		Scanner myScanner = new Scanner(System.in);
		
		// 2. 입력 안내 메세지 출력
		System.out.println("당신의 나이를 입력하세요.");
		
		// 3. 키보드 입력 받는 코드 정수 받아서  int 에 저장
		int age = myScanner.nextInt(); // 키보드로 숫자 치고 엔터 치면 그 값이 age에 저장
		
		// 4. 입력 받은 숫자를 가지고 연산 (데이터 가공)
		System.out.println("당신의 나이는 : " + age + "살 입니다.");
		
		
	}
}
