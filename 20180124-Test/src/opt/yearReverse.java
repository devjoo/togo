package opt;

import java.util.Scanner;

public class yearReverse {
	public static void main(String[] args) {
		// �Է��ϴ� ������ �������� �ƴ��� ����ϱ�
		// 1997 => �����ΰ�? false
		// 2016 => �����ΰ�? true
		// ���� ��� ����� ���� �����ؼ� ã�Ƽ� ����
		
		System.out.println("������ �Է����ּ���.");
		Scanner myScanner = new Scanner(System.in);
		
		int year = myScanner.nextInt();
		boolean result;
		result = year%4==0 && ( year%100!=0 || year%400==0 );
		// 4�� ���, 100���� �������� �ʴ� �������� 400�� ��� �� �����̴�.
		
		System.out.println("�����ΰ�? " + result);
	}
}
