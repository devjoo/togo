package opt;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		// ���� �µ��� ȭ���� �?
		// 1. Ű����� ���� �Է� : ���� �µ��� �Է����ּ���.
		// 2. �Է¹��� �����µ��� ��� (������ ����) => ȭ�� �µ��� ���
		// 3. ȭ�� �µ��� ?? �Դϴ�. ���
		
		System.out.println("���� �µ��� �Է����ּ���.");
		Scanner myScanner = new Scanner(System.in);
		
		double celsius = myScanner.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println("ȭ���µ��� " + fahrenheit + "�Դϴ�.");
	}
}
