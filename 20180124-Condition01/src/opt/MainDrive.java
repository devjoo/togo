package opt;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		// 20 살 이상이면 성인
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		int age = myScan.nextInt();
		if(age >= 20) {
			System.out.println("성인");
		}else {
			System.out.println("성인이 아닙니다.");
		}
		
		System.out.println("키를 입력해주세요");
		double height = myScan.nextDouble();
		if(height >= 180) {
			System.out.println("장신입니다");
		}
		
		System.out.println("몸무게를 입력해주세요.");
		double weight = myScan.nextDouble();
		if( weight >= 100) {
			System.out.println("과체중 입니다.");
		}else if(weight > (height - 100) * 0.9) {
			System.out.println("비만입니다.");
		}
		System.out.println("표준체중 : " + ((height - 100) * 0.9) );
		
	
	}
	
}
