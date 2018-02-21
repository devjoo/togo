package oop;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		// ������ ���� ���� ����.
		
		//���ǵ� ��� => ������ ����.
		Person p1 = new Person();
		
		//��.
		// Scanner? ����� Ű���� �Է��� �޵��� �����ִ� Ŭ����.
		// Person? ����� ���������͸� �����ϰ� ����δ� Ŭ����.
		
		// scan => scan.nextInt();
		// ��üȭ�� ��ĳ�� ������ �ٽ� ã�������� ã�� �̸�. scan.
		// Scanner Ÿ���� ���� scan.
		// int a = 1; => int Ÿ���� ���� a.�� ������.
		// Person Ÿ���� ���� p1.
		// p1 => ����� ���� �����͸� ������ Person ������ Ŭ����.
		
		//Person p1 = new Person();
		// new Person() : ��� ��ü�� ������ ����.
		// ������ ���� : ������ ���� �Ѱ��� ������.
		// ������ ������ �����ü 1����  p1�� �����.
		
		// ���� Ŭ������ Ȱ��
		p1.name = "������";
		
		// ��� �Ѹ��� �ִ� ����
		
		// �ι�° ����� ����.
		Person p2 = new Person();
		p2.name = "������";
		p2.gender = true;
		
		// �θ� ��� �߰� ���� => p3, p4
		Person p3 = new Person();
		p3.name = "���3";
		Person p4 = new Person();
		p4.name = "���4";
		
		// ù��° ����� ������� => 930102
		p1.birthDay = 990102;
		// �ι�° ������� Ű => 175�� ����
		p2.height = 175;
		
		//ù��° ������� [�ڽ��� ����] ����ϵ��� ��Ű��
		p1.printUserInfo();
		
		//�ι�° ������� ��������� 991020���� ����
		p2.birthDay = 991020;
		
		//�ι�° ����� ������ ���
		p2.printUserInfo();
		
		// ù��° ��� ����
		p1.printMyAge();
		
		// å�ѱ� => ���� : �ճ��� �̿�����, �̿밡�� ����: 5
		// å�ѱ� => ���� : ��ä�� �������, �̿밡�� ����: 19
		Book b1 = new Book();
		b1.title = "�ճ��� �̿�����";
		b1.availAge = 5;
		
		Book b2 = new Book();
		b2.title = "��ä�� �������";
		b2.availAge = 35;
		
		//������(p1)�� �ճ��� �̿����� �о �Ǵ°�?
		boolean iuB1Ok = p1.isBookOk(b1);
		if(iuB1Ok) {
			System.out.println("�������� ������.");
		}else{
			System.out.println("�������� ������ �ȵȴ�.");
		}
		
		Scanner scan = new Scanner(System.in);
		//int inputNum = scan.nextInt();
		// scan�� Ű���� �Է��� ���� => �����  inputNum�� ����
		
		// �������� ��ä�� ��������� �о �Ǵ°�?
		// �������� 99����̴�. 
		boolean iuOk2 = p1.isBookOk(b2);
		if(iuOk2) {
			System.out.println("�������� ������� ������.");
		}else{
			System.out.println("�������� ������� ������ �ȵȴ�.");
		}
		
		
	}
}