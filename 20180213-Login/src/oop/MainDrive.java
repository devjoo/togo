package oop;

import java.util.Scanner;

import oop.data.Account;
import oop.data.Animal;
import oop.data.Bank;
import oop.data.Dog;
import oop.data.Fund;
import oop.data.User;
import oop.util.VaildUtil;

public class MainDrive {
	
	// public : ���� ������ �� �������� Ȯ�� => ������ ���� ����
	// �ڹ� ���α׷��� ��𿡼��� ������ �� �ֵ��� ���
	
	// static : ��üȭ�� ��ġ�� �ʰ�, 
	// Ŭ���� Ÿ�� ��ü���� ���� ��ų �� �ֵ��� ���ִ� ����
	// MainDrive.main(); ������ �� �ֵ��� => ��üȭ ����.
	
	public static void main(String[] args) {
		
		// �ڵ��ϼ��� ���ϸ�, ����Ÿ�԰� �����ڰ� ���� ��
		// ��? ���� ��Ű��(oop) �ȿ��� User��, Scanner�� �����Ƿ�.
		// �̰� ���� Ŭ�������� �𸣰ڴ�. ���� �߻�
		
		//�ٸ� ��Ű�� �ȿ� ����ִ� Ŭ������ ������, �ݵ�� import
		// ��� ��Ű�� �ȿ� �ִ� Ŭ�������� ��ǻ�Ϳ��� ����.
		
		//Ctrl + Shift + o : auto import
		// 1) �ʿ������ import��� ã����
		// 2) �ʿ������ import�� ��� ��������
		
		User u1 = new User();
		Scanner scan = new Scanner(System.in);
		
		// Q1. u1�� �̸��� "A �����", id : "aaa@bbb.com",
		// pw : "qwer1234"
		
		
		// UserŬ������ �ٸ� ��Ű���� �ִ� Ŭ���� => �Ұ���
		// �⺻������ ������ �Ұ���
		// ������ �����Ϸ��� ? User�� ���������� => public
		// User���� ������ �տ� public�� ���̴� ���� ��������.
		u1.name = "������";
		u1.password = "qwer1234";
		u1.email = "aaa@bbb.com";
		
		// u1�� ��й�ȣ�� ����ص� ���ٸ�, "����� ��ȣ�մϴ�."
		// �ƴ϶�� "���ο� ��й�ȣ�� �������ּ���."
		VaildUtil vu = new VaildUtil();
		if(vu.isPwOk(u1)) {
			System.out.println("��ȣ");
		}else {
			System.out.println("����� �ʿ�");
		}
		
		// ���� �ϳ��� �ν��Ͻ�ȭ
		Account ac1 = new Account();
		// ���¹�ȣ�� 123-4567, �ܰ�� 100����
		ac1.accNum = "123-4567";
		//ac1.money = 1000000;
		ac1.owner = u1;
		
		// �����(bbb@ccc.com, asdf1234, B�����
		// ���� ( 987-6543, 5000000, u2 )�ѽ� �� ����.
		User u2 = new User();
		u2.email = "bbb@ccc.com";
		u2.password = "asdf1234";
		u2.name = "B�����";
		
		Account ac2 = new Account();
		ac2.accNum = "986-2134";
		//ac2.money = 500000;
		ac2.owner = u2;
		
		// �ι�° ������� �ܰ� 5�������� �ٲ���.
		//ac2.money = 500000;
		//���α׷��� �ڵ忡�� ���� �ܰ� ���� �������� �ٷ� ����
		// �� �ܰ� �� 5������ �Ǿ�����? ���� ������ �Ұ�����.
		
		// �ܰ�, ������� �����͵��� public���� �����ָ� ���Ȼ� ���.
		// ������ �Ժη� �ϸ� �ȵǴ� �������� ���� ��������� �ʿ�.
		// => private 
		
		// Q1. 2�� ����� 1�� ������� 300���� �۱�
		u1.myAccount = ac1;
		u2.myAccount = ac2;
		u1.deposit(3000000, u2);
		
		// Q2. ������ �ϳ� �����ؼ�, �̸��� �������, �ڵ�� 5
		// ���� ������ ��� ��ü�� ���� => ������� ����.
		// �����ϴ� ��� : setter
		Bank b1 = new Bank();
		b1.setBankname("�������");
		
		// �ڵ�� 5
		b1.setBankCode(5);
		System.out.println(b1.getBankName() + " �̴�");
		System.out.println(b1.getBankCode() + "��");
		
		Fund f1 = new Fund();
		// FundŬ������ �� �������? ���
		//System.out.println(f1.classDescription);
		// ���߿� �ٽ� ������, f1������ ���� ���� �ƴѰ���� ȥ���Ҽ��ִ�.
		
		// static ���� �������� ���°� �޾��ش�.
		System.out.println(Fund.classDescription);
		
		// FundŬ������ ������ ȭ�鿡 ���
		Fund.showClassInfo();
		
		printMessage();
		
		// PI������ ó�� �� �� ���ķδ� ���� �Ұ�. 
		final double PI = 3.14;
		//PI = 5.14; // ���̰��� �ٸ� ���� ���� �� ��ü�� �߸��� (���� ����)
		
		//�� �Ѹ��� ����, Ű 80, ������ 4.5
		Dog d1 = new Dog();
		
		d1.height = 80;
		d1.weight = 4.5;
		
		// �����̶�� ������ ����ü�� ���ڱ� ���� ����
		// ������ ���ǿ� Ƣ�� ������ ���ϰ� . => abstract
		Animal a1 = new Animal();
		a1.height = 90;
		a1.weight = 5.5;
		
	}
	
	static void printMessage() {
		System.out.println("ȣȣ");
	}
}
