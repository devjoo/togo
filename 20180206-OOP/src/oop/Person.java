package oop;

/*
 * ���α׷����� Ȱ��� ��� Ŭ����
 * ����� ���� ���� �Ӽ�,
 * ����� �ϴ� �ൿ���� �����ϴ� ����.
 * 
 * �Ӽ� : �� ��ü�� ���� ������.
 * �ൿ : ���� �⺻ ������ ����(����)
 * 
 * ������ ��� ���ϰ��� ����.
 * 
 */
public class Person {
	// �̸� - String
	// ������� - int
	// Ű - double
	// ������ - double
	// ���� - boolean (t:��/f:��)
	
	String name;
	int birthDay;
	double height;
	double weight;
	boolean gender;
	
	
	// å�̶�� ������ ����ϰ� �ʹ�. 
	//Ŭ���� ����� �ʿ�Ӽ� ���� 
	
	// ����� å����� �ý��ۿ��� �Ҹ��� �ൿ?
	// 1) �����������
	//- �ڽ��� ���� (�̸�, ������� ���)
	// �ൿ => method ���·� ����
	void printUserInfo() {
		//�ڽ��� ������ ����ϴ� �κ�,
		System.out.println("�̸� : " + this.name);
		System.out.println("������� : " + this.birthDay);
		System.out.println("Ű : " + this.height);
		if(gender) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
	}
	
	// 2) �ڽ��� ���̸� ��� + ����� �����ֱ�
	int printMyAge() {
		//����? ������� �� ���ڸ� => �⵵.
		//2018�� ���� - �⵵ + 1
		int year = this.birthDay / 10000; //88.1020 => 88
		int age = 2018 - year - 1900 + 1;
		System.out.println("�� ���̴� " + age + "�Դϴ�");
		
		return age;
	}
	
	
	// 3) �뿩��Ȳ ��� (����)
	
	//1. ���(method)�� ���? boolean
	//2. �޽���� �̸�? isBookOk
	//3. ���? Book book1
	boolean isBookOk(Book b1) {
		// ������� ������ ������ ��� ����?
		// ����� boolean�� ���شٰ� �س��� ���ֱ� ����.
		// ����� ���ִ� ���� : return
		
		boolean isOk = false; // ���� �ȱ������ɷ� ����.
		
		//�޽���� ���� �� �ٽ��� �ؾ��� �ϵ��� ������ �ۼ�.
		//�޽�带 �����ϴ� ��� => ���� ���� Ȱ��
		
		int myAge = printMyAge(); // �������� ����� myAge�� ����
		
		//���� ����� ���̰� å�� ���ɰ����� ũ�ų� ���ٸ�
		//�� å�� ������, �׷��� �ʴٸ� �Ұ�.
		if(myAge >= b1.availAge) {
			//���̰� ���� ���� å�� ���´� �̻��̹Ƿ�, �о��
			//Ex. 88���, b1�� 19�� �̻� �̿� ����
			isOk = true;
		}else {
			isOk = false;
		}
		
		return isOk; //���������� ������ isOk�� ����� ����.
	}
	
}