package repeat;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		int i = 0;
		while( i < 10 ) {
			System.out.println(i);
			i++;
		}
		if( i < 20 ) {
			System.out.println(i);
		}
		//while �� if �� ���������� �ſ� �����ϴ�.
		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		//for������ ������Ű�� �ɰ��� while���� �ϳ��ϳ� ���� ì������Ѵ�.
		
		//while�� Ȱ���ϴ� ���� �ٸ���.
		
		// Q1. 1,2,3,4,...����� ���ڸ� ���� ���̴�.
		// ���� ���ϴ� ���� 100���� Ŀ����?
		int result = 0;
		int index = 1;
		while( result < 100) {
			result = result + index;
			index++;
		}
		System.out.println(index - 1 + "�� ���Ҷ� 100�� �Ѿ");
		
		// Q2. 8192�� 2�� ���?
		// 8192�� 2�� ��� ����������
		// 1�� ������ ��� ��������? 8 => 8 /2/2/2 = 1 2�� 3��
		// 1�� ������ ��� ��������? 4 => 4 /2/2 = 1 2�� 2��
		int questionNum = 8192;
		int count = 0;
		while( questionNum > 1 ) {
			questionNum = questionNum / 2;
			System.out.println(questionNum);
			count++;
		}
		System.out.println(count + "�� �ݺ��ߴ�. 2�� " + count + "���̴�");
		
		// Q3. 1,2,3...��� ���� ���س���
		// 1000�� �Ѿ�� ����� ���ڴ� ��?
		int result3 = 1;
		int count2 = 0;
		while(result3 < 1000) {
			count2++;
			result3 = result3 * count2;
		}
		System.out.println("1000�� �Ѿ�� ����� ���ڴ� ��?" + count2);
		
		//0�� �Է��ϸ� "���α׷��� �����մϴ�. "�޽��� ���, �ݺ��� Ż��
		//0 �̿��� ���ڸ� �Է��ϸ� �Է��� ���ڸ� ��� �����ִ� ���α׷�
		
		Scanner scan = new Scanner(System.in);
		int numInit= 0;
		int keyInput = -1;
		while(keyInput != 0) {
			System.out.println("���ڸ� �Է��ϼ���. ��������0");
			keyInput = scan.nextInt();
			numInit = numInit + keyInput;
			System.out.println("���ϱ� : " + numInit);
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}
