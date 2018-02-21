package test;

import java.util.Scanner;

/*
 * �ݺ����� ���� ���� ���� ����
 * ���� => � �ݺ���? ��� �ڵ��ؾ�?
 * ������ Ʈ���� �ݺ��� ���빮�� 3������
 */

public class MainDrive {
	public static void main(String[] args) {
		
		// Q1. 3�� 5�� ����� ��� ����ϱ�
		// ���� �ϳ��� �Է¹޾� �Է��� �������� ���� ��� 3�� 5�� ������� ���
		// Ex. ���ڸ� �Է��ϼ��� : 100 => 15,30,45,60,75,90
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		int num = scan.nextInt();
		for(int i = 1; i <= num; i++) {
			if( i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		
		
		
		// Q2. �Խ��ǿ� �� 1500���� �Խù��� ��ϵǾ� �ִ�.
		// ������������ 30���� �Խù��� ������. 
		// �����Է� => �ش� �������� �Խù� ���� ��ȣ�� �� ��ȣ�� ���
		// Ex. ���������� �Խù�? 1500~1471���� �Դϴ�.
		/*
		 * 1p: 1500~1471
		 * 2p: 1470~1441
		 * 3p: 1440~1411
		 * 11p: 1200~1171
		 * */
		
		//������ : 1500(��ü) - (������ -1) * 30
		//������ : ������ - 29
		System.out.println("�ñ��� �������� �Է��ϼ���");
		int inputPageNumber = scan.nextInt();
		int startPostNumber = 1500 - (inputPageNumber - 1) * 30;
		int endPostNumber = startPostNumber - 29;
		
		System.out.println(startPostNumber + " ~ " + endPostNumber);
	
		
		// Q3. Hailstone����
		// ���� ���Ǽ� ���� �Է¹��� > 17 (Ȧ��)
		// Ȧ���� 3�� + 1
		// ¦���� ���� ������.
		// 17 => 52 => 26=> 13 => 40 => 
		// �ݺ��ϴٰ� ���� ������ 1�� ��
		//10���� 20������ ������ ���� ���� �ܰ踦 ���� 1�� �Ǵ� ���ڴ� ����?
		// 10>5>16>8>4>2>1 6�ܰ�
		// �� ���������� 30���� �Խù��� ������
		
		//System.out.println("�ｺ��? ���ڸ� �Է��ϼ���");
		//int inputNum2 = scan.nextInt();
		
		int maxHNum = 10; // �ϴ� 10�� ���� �����ɸ��� ���ڶ�� ����
		int maxStep = 0; // ���� ��ܰ�� �ϴ� 0�ܰ��� ������
		
		// 10~20���� �ݺ����� �ｺ���� ������ ����
		for(int i = 10; i < 21; i++) {
			int inputNum2 = i;
			int originNum = inputNum2;
			
			System.out.print(inputNum2 + " ���� : ");
			
			int count = 0;
			while( inputNum2 != 1 ) {
				//���ڸ� �����Ϸ� ���� ���� count�� ����
				count++;
				if( inputNum2 % 2 == 1 ) {
					inputNum2 = inputNum2 * 3 + 1;
				}else {
					inputNum2 = inputNum2 / 2;
				}
				// System.out.println(count + "�ܰ� : " + inputNum2);
			}
			//System.out.print(count + "�ܰ踦 ���� 1�� �ȴ�.");
			if(maxStep < count ) {
				// => New record �� �� ���ڸ� ã�Ҵ�!
				maxHNum = originNum; //���� ����
				maxStep = count; // �ܰ� ����
			}
			System.out.println(maxHNum + "�� " + maxStep + "�ܰ�� ���� ���");
			System.out.println(" ");
		}
		
		
		
		
		// Q4. 369����
		// ��������
		// ���ڸ� �Է�? �ڼ��� ��� �ľ��ϴ���?
		// Ex. 123 => ¦!
		// 36 => ¦!¦!
		// 12 => 12!
		// 12345678 =>
		
		//���� �ڸ����� 3,6,9,�� �ִ°�? �ִٸ�? �ڼ��� ĥ Ƚ���� 1ȸ ����
		System.out.println("�Ǵ��� ���ڸ� �Է��ϼ���.");
		int inputNum3 = scan.nextInt();
		//int inputNum3 = 1234569; // �Ǵ��� ����.
		int backupNum = inputNum3; // ����Ҷ� ����Ϸ��� ����
		int clapCount = 0; // �ڼ��� ��� ĥ�� �����ϴ� ����.

		// 5,4,3,2,1 -> �ڵ� ¥�Ⱑ ����.
		// 1�� �ڸ�, 10, 100 ���� ������ �ڸ�����
		// 12345 % 10 -> 5�Ǵ�
		// 12345 / 10 -> 1234
		// 1234 % 10 -> 4�Ǵ�
		// 1234 / 10 -> 123
		// 123 % 10 -> 3�Ǵ�
		// ...
		// 1 / 10 -> 0
		//����� 0�� ���Ҵ� : ��� �ڸ����� ���� �Ǵ��� ����
		while(inputNum3 != 0) {
			//�Է��� ���ڰ� 0���� �پ��� ��� �ڸ����� ���� ���� �Ϸ�.
			int lastDigit = inputNum3 % 10; // 1�� �ڸ� �����ϴ� ȿ��
			if(lastDigit == 3 || lastDigit == 6 || lastDigit == 9) {
				clapCount++; // ������ �ڸ��� 3/6/9 clapCount ����
			}
			inputNum3 = inputNum3 / 10; // ������ �ڸ� �Ǵ� �������� �ʿ���� �ڸ��� ����
		}
		if(clapCount == 0) {
			System.out.println(backupNum);
			//���ľ� �Ҷ��� ������ ���ڸ� ���
		}else {
			// �ڼ��� 1ȸ �̻� �ľ���.
			// ��� �ľ��ϴ���? clapCount�� ����
			for(int i=0; i< clapCount; i++) {
				System.out.print("¦!");
			}
		}
		
		
	}
}
