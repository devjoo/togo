package opt;

import java.util.Scanner;

public class Maindrive2 {
	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("���̸� �Է����ּ���");
		int age = myScan.nextInt();
		
		// Q1. ���� �ΰ�?
		// Q2. ������ �ƴϸ� ����л��ΰ�? 17~19
		if(age >= 20) {
			System.out.println("�����Դϴ�.");
		}else if(17 <= age) {
			System.out.println("����л��Դϴ�.");
		}else if(14 <= age) {
			System.out.println("���л��Դϴ�.");
		}else if(8 <= age) {
			System.out.println("�ʵ��л��Դϴ�.");
		}else {
			System.out.println("�����оƵ��Դϴ�.");
		}
		// ������ �Ⱦ����. !�߿�
		
	}
}
