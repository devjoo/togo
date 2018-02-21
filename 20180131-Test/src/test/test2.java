package test;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		/*
		2. 구구단 5단 회면 출력
		5x1=5.....5x9=45출력 => 반드시 반복문 사용
		*/
		
		for(int i = 1; i < 10; i++) {
			System.out.println("5 x " + i + " = " + (5*i));
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("시작할 단을 입력하세요.");
		int startNum = scan.nextInt();
		System.out.println("마지막 단을 입력하세요.");
		int lastNum = scan.nextInt();
		for(int i = startNum; i <= lastNum; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println( i + " x " + j + " = " + (i*j));
			}
			
		}
	}
}
