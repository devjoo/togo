package opt;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		
		/*System.out.println("���ڸ� �Է��ϼ���. �������� 0");
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[100];
		
		int i = 0;
		int sum = 0; 
		while(true) {
			if(scan.nextInt() == 0 )
				break;
			arr[i] = scan.nextInt();
			sum += arr[i];
			System.out.println(sum);
			i++;
		}*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int inputNum = scan.nextInt();
		int backupNum = inputNum; // ����Ҷ� ����Ϸ��� ����
		int sum = 0; // �ڼ��� ��� ĥ�� �����ϴ� ����.
		
		while(inputNum > 0) {
			//�Է��� ���ڰ� 0���� �پ��� ��� �ڸ����� ���� ���� �Ϸ�.
			int lastDigit = inputNum % 10; // 1�� �ڸ� �����ϴ� ȿ��
			sum += lastDigit;
			inputNum = inputNum / 10; // ������ �ڸ� �Ǵ� �������� �ʿ���� �ڸ��� ����
		}
		System.out.println(sum);
		
	}
}
