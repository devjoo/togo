package test;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		/*
		A+ : 90점 이상이고 5등이내 => 5등이내여도, 90점 이하면  A0 강등
		A0 : 10등이내
		B : 그외의 등수는 전부
		F : 점수가 50 점미만이면 
		Ex. (8등, 40점) => F
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수을 입력해주세요.");
		double score = scan.nextDouble();
		System.out.println("등수를 입력해주세요");
		int rank = scan.nextInt();
		
		if(score >= 90 && rank < 5) {
			System.out.println("A+");
		}else if(score < 50){
			System.out.println("F");
		}else if(rank < 10) {
			System.out.println("A0");
		}else{
			System.out.println("B");
		}
		
		String grade = "";
		if(score < 50) {
			grade = "F";
		}else {
			if(score > 90 && rank < 5) {
				grade = "A+";
			}else if(rank < 10) {
				grade = "A0";
			}else{
				grade = "B";
			}
		}
		System.out.println(grade);
		
		
		
		
		
	}
}
