package opt;

import java.util.Scanner;

/*
 * ���� ������ ����
 * ���α׷��� ���۵� ���¿��� Ű����� �Է¹ޱ�
 */

public class MainDrive {
	public static void main(String[] args) {
		
		int i = 1;
		int j = 10;
		int result = i + j;
		
		// ���ݱ��� ��� ��� �����ڴ� �ǿ������� ���� ��ȭ��Ű�� ����
		System.out.println("i : " + i + " j : " + j);
		
		i++;
		j--;
		System.out.println("i : " + i + " j : " + j);
		
		++i;
		--j; // �����ڸ� �տ� �ᵵ ���� ����
		System.out.println("i : " + i + " j : " + j);
		
		// �ڿ����� �������� �����ǰ� �տ� ���� �����ϰ� �����Ѵ�
		result = i + j;
		System.out.println(result);
		result = i++ + j;
		System.out.println(result); // 11;
		result = ++i + j;
		System.out.println(result); // 13;
		result = ++i + j--;
		System.out.println(result); // 14
		
		// 1. ��ĳ�� ���� ���� (��ü���� ���� => �ϴ� ����) 
		Scanner myScanner = new Scanner(System.in);
		
		// 2. �Է� �ȳ� �޼��� ���
		System.out.println("����� ���̸� �Է��ϼ���.");
		
		// 3. Ű���� �Է� �޴� �ڵ� ���� �޾Ƽ�  int �� ����
		int age = myScanner.nextInt(); // Ű����� ���� ġ�� ���� ġ�� �� ���� age�� ����
		
		// 4. �Է� ���� ���ڸ� ������ ���� (������ ����)
		System.out.println("����� ���̴� : " + age + "�� �Դϴ�.");
		
		
	}
}
