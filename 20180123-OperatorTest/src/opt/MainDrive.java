package opt;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		
		Scanner ageScanner = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���.");
		int age = ageScanner.nextInt();
		
		// Q1. ����� ��� �⵵ �� ?? ���Դϴ� 31 => 1988��
		int date = 2018 - age + 1;
		System.out.println("����� ��� �⵵ �� " + date + " ���Դϴ�");
		
		// Q2. ����� 30�� �̻��� �³���? true / flase
		boolean result = age >= 30;
		System.out.println("����� 30�� �̻��� �³���? " + result );
		
		// Q3. ����� 20�밡 �³���? true / flase
		boolean result2 = (20 <= age) && (age < 30);
		System.out.println("����� 30�� �̻��� �³���? " + result2 );
		
		// Q4. ����� ??�����Դϴ�. (10�� �ڸ� ���ΰ�)
		// 1. 100���� ���� �������� ��? X % 100 = �� ���ڸ�
		// 2. (������ ������ ������)
		int dateAll = ((date % 100)/10)*10;
		System.out.println("����� " + dateAll + "�����Դϴ�.");
	}
}
