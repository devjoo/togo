package opt;

import java.util.Scanner;

public class Maindrive2 {
	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		int age = myScan.nextInt();
		
		// Q1. 성인 인가?
		// Q2. 성인이 아니면 고등학생인가? 17~19
		if(age >= 20) {
			System.out.println("성인입니다.");
		}else if(17 <= age) {
			System.out.println("고등학생입니다.");
		}else if(14 <= age) {
			System.out.println("중학생입니다.");
		}else if(8 <= age) {
			System.out.println("초등학생입니다.");
		}else {
			System.out.println("미취학아동입니다.");
		}
		// 범위를 걷어내간다. !중요
		
	}
}
