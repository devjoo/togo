package test;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		/*
		3. 입력한 숫자까지의 총 합 구하기
		하나의 정수 입력 : 10 => 1+2+3...+10 => 1부터 입력한 수까지의 총합 : 55
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력한 숫자까지의 총합 구하기 예 ) 10 은 55");
		int num = scan.nextInt();
		int sum = 0;
		/*while(num != 0) {
			sum += num;
			num--;
		}*/
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 1부터 입력한 수까지 모든 홀수의 합
		System.out.println("입력한 수까지 모든 홀수의 합 숫자를 입력해주세요.");
		int num2 = scan.nextInt();
		int sum2 = 0;
		/*while(num2 != 0) {
			if(num2 % 2 == 1) {
				sum2 += num2;	
			}
			num2--;
		}*/
		for(int i = 1; i <= num2; i++) {
			if( i % 2 == 1) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
		
		//하나의 정수 입력해서 1~ 입력한 수까지의 3과 4의 공배수의 합
		System.out.println("입력한 수까지의 3과 4의 공배수의 합 숫자를 입력해주세요.");
		int num3 = scan.nextInt();
		int sum3 = 0;
		while(num3 != 0) {
			if(num3 % 12 == 0) {
				sum3 += num3;	
			}
			num3--;
		}
		System.out.println(sum3);
		
	}
}
