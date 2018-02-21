package opt;

import java.util.Scanner;

public class MainDrive4 {
	public static void main(String[] args) {
		// 두개의 정수를 입력받아 그 합을 출력하는 프로그램
		// 첫번째 숫자를 입력하세요 12
		// 두번째 숫자를 입력하세요 
		
		System.out.println("a를 입력해주세요.");
		Scanner myScan = new Scanner(System.in);
		int a = myScan.nextInt();
		
		System.out.println("b를 입력해주세요.");
		int b = myScan.nextInt(); // Scanner 변수 생성 이후에는 언제든지 재활용이 가능
		
		System.out.println("합은 : " + (a + b));
	}
}
