package opt;

import java.util.Scanner;

public class MainDrive4 {
	public static void main(String[] args) {
		// �ΰ��� ������ �Է¹޾� �� ���� ����ϴ� ���α׷�
		// ù��° ���ڸ� �Է��ϼ��� 12
		// �ι�° ���ڸ� �Է��ϼ��� 
		
		System.out.println("a�� �Է����ּ���.");
		Scanner myScan = new Scanner(System.in);
		int a = myScan.nextInt();
		
		System.out.println("b�� �Է����ּ���.");
		int b = myScan.nextInt(); // Scanner ���� ���� ���Ŀ��� �������� ��Ȱ���� ����
		
		System.out.println("���� : " + (a + b));
	}
}
