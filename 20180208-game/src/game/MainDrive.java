package game;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		// Math.random() => 0~1������ �Ҽ�����.
		//(int) ĳ���� => �Ҽ����� �� ����.
		
		// 0~999�� �ϳ��� ���ڸ� ����.
		
		// ������ �� ������ ����.
		// �ϴ� 100���� Ŀ���� => ���ڸ�
		// �ߺ��� ���ڰ� ������ �ȵ�. 488 X
		
		// ���� ��� ������ ���ö����� ��� ������ ����.
		int questionNum = 0;
		int[] questionNumArray = new int[3];
		
		while (true) {
			questionNum = (int) (Math.random()*999);
			if(questionNum >= 100) {
				//���ڸ� ����.
				
				//100�� �ڸ�, 10�� �ڸ�, 1�� �ڸ��� ��� ����.
				//100�� �ڸ� != 10�� �ڸ� &&
				//10�� �ڸ� != 1�� �ڸ� &&
				//1�� �ڸ� != 100�� �ڸ�
				
				//100�� �ڸ�����.  892 -> 8 100���� ������
				int num100 = questionNum / 100;
				int num10 = questionNum / 10 % 10;
				int num1 = questionNum % 10;
				
				if(num100 != num10 && num10 != num1 && num1 != num100) {
					
					questionNumArray[0] = num100;
					questionNumArray[1] = num10;
					questionNumArray[2] = num1;
					
					break;
				}
				
			}
		}
		
//		System.out.println("������ �����Ǿ����ϴ� : " + questionNum);
		
		//�⺻�� : 0S 0B
		int strikeCount = 0;
		int ballCount = 0;
		
		Scanner scan = new Scanner(System.in);
		//3S �޼��ϸ� ������ ����.
		while (strikeCount < 3) {
			
			strikeCount = 0;
			ballCount = 0;
			
			System.out.println("���� �Է� : ");
			int inputNum = scan.nextInt();
			
			int[] inputNumArr = new int[3];
			int num100 = inputNum / 100;
			int num10 = inputNum / 10 % 10;
			int num1 = inputNum % 10;
			
			inputNumArr[0] = num100;
			inputNumArr[1] = num10;
			inputNumArr[2] = num1;
			
			// �Է��� ���ڸ� ��ĭ�� �迭�� ������.
			// ���� �迭 / �Է� �迭 ������ ?S ?B �Ǵ�.
			
			//�Է��� ���ڸ� ����ϴ� for
			for(int i = 0; i < 3; i++) {
				//���� ���ڸ� ���ڸ��� üũ�ϴ� for
				for(int j = 0; j < 3; j++) {
					//�ϴ� ���ڰ� ������?
					if(inputNumArr[i] == questionNumArray[j]) {
						
						// i : 1 j : 1 => �Է� :10�� �ڸ�,���� : 10�� �ڸ�
						//�� ���� ���� => ��ġ�� ���� => strike
						if(i == j) {
							strikeCount++;
						}else {
							ballCount++;
						}
						
					}
				}
			}
			
			System.out.println(strikeCount + "S " + ballCount + "B");
			
		}
		
		System.out.println("������ ���߼̽��ϴ�! �����մϴ�!");
	}
}
