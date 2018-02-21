package oop;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		
		// 절대값. 5의 절대값? 5 -5의 절대값? 5
		// 어떤 수던 부호를 제거한것.
		
		//Q1. 숫자를 하나 입력받고, 절대값을 출력하는 프로그램.
		Scanner scan = new Scanner(System.in);
		System.out.println("절대값을 알고싶은 숫자를 입력 : ");
		int inputNum = scan.nextInt();
		
		int result = 0;
		
		//result를 가공해서 절대값을 계산
		if(inputNum > 0) {
			result = inputNum;
		}else {
			result = inputNum * -1;
		}
		System.out.println("절대값 : " + result);
		
		//Math 클래스는 객체화를 굳이 하지 않아도 기능 활용 가능.
		//Math 자료형에게 곧바로 기능 활용 시킴.
		//static 이미 활용.
		int absInputNum = Math.abs(inputNum);
		System.out.println("Math.abs(inputNum) : " + absInputNum);
		
		// 2. ceil => 올림. floor => 내림값.
		
		// 3. pow(input, 조작) => input을 수만큼 제곱.
		
		// Ex. 2의 14승? 몇?
		int result2 = (int) Math.pow(2, 14);
		System.out.println("2의 14승 : " + result2);
		
		// !! 랜덤. Math.random() => 0에서 1사이의 랜덤한 소수값 출력.
		double d = Math.random();
		System.out.println(d);
		
		//무작위로 실행되어야하는 거의 모든 기능에 활용.
		
		
	}
}
