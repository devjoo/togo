package test;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		// ��(Second)�� �Է��ϼ��� : 10000 =>? �ð� �� �� ���
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ʸ� �Է��ϼ���");
		int time = scan.nextInt();
		int hour;
		int min;
		int sec;
		
		//10000�� > /60 �� = ��
		// x�� / 60�� = ��
		sec = time % 60;
		hour = time / 60 / 60;
		min = (time - hour * 60 * 60) / 60;
		System.out.println(hour + "�ð�" + min + "��" + sec + "��");
		
	}
}
