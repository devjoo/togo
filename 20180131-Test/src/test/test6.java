package test;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		// 초(Second)를 입력하세요 : 10000 =>? 시간 분 초 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("초를 입력하세요");
		int time = scan.nextInt();
		int hour;
		int min;
		int sec;
		
		//10000초 > /60 초 = 분
		// x분 / 60분 = 시
		sec = time % 60;
		hour = time / 60 / 60;
		min = (time - hour * 60 * 60) / 60;
		System.out.println(hour + "시간" + min + "분" + sec + "초");
		
	}
}
