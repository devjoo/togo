package opt;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		// 20 �� �̻��̸� ����
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("���̸� �Է����ּ���");
		int age = myScan.nextInt();
		if(age >= 20) {
			System.out.println("����");
		}else {
			System.out.println("������ �ƴմϴ�.");
		}
		
		System.out.println("Ű�� �Է����ּ���");
		double height = myScan.nextDouble();
		if(height >= 180) {
			System.out.println("����Դϴ�");
		}
		
		System.out.println("�����Ը� �Է����ּ���.");
		double weight = myScan.nextDouble();
		if( weight >= 100) {
			System.out.println("��ü�� �Դϴ�.");
		}else if(weight > (height - 100) * 0.9) {
			System.out.println("���Դϴ�.");
		}
		System.out.println("ǥ��ü�� : " + ((height - 100) * 0.9) );
		
	
	}
	
}
