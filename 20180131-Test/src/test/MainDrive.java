package test;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		/*
		A+ : 90�� �̻��̰� 5���̳� => 5���̳�����, 90�� ���ϸ�  A0 ����
		A0 : 10���̳�
		B : �׿��� ����� ����
		F : ������ 50 ���̸��̸� 
		Ex. (8��, 40��) => F
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		double score = scan.nextDouble();
		System.out.println("����� �Է����ּ���");
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
