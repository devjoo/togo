package test;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		/*
		2. ������ 5�� ȸ�� ���
		5x1=5.....5x9=45��� => �ݵ�� �ݺ��� ���
		*/
		
		for(int i = 1; i < 10; i++) {
			System.out.println("5 x " + i + " = " + (5*i));
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���� �Է��ϼ���.");
		int startNum = scan.nextInt();
		System.out.println("������ ���� �Է��ϼ���.");
		int lastNum = scan.nextInt();
		for(int i = startNum; i <= lastNum; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println( i + " x " + j + " = " + (i*j));
			}
			
		}
	}
}
