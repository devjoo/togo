package test;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		/*
		3. �Է��� ���ڱ����� �� �� ���ϱ�
		�ϳ��� ���� �Է� : 10 => 1+2+3...+10 => 1���� �Է��� �������� ���� : 55
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Է��� ���ڱ����� ���� ���ϱ� �� ) 10 �� 55");
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
		
		// 1���� �Է��� ������ ��� Ȧ���� ��
		System.out.println("�Է��� ������ ��� Ȧ���� �� ���ڸ� �Է����ּ���.");
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
		
		//�ϳ��� ���� �Է��ؼ� 1~ �Է��� �������� 3�� 4�� ������� ��
		System.out.println("�Է��� �������� 3�� 4�� ������� �� ���ڸ� �Է����ּ���.");
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
