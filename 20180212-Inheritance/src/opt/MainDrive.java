package opt;

import java.util.Scanner;

import opt.data.Dog;
import opt.data.Flower;
import opt.data.Lion;
import opt.data.Monkey;
import opt.data.Tree;

/*
 * ������ ���α׷����� ����.
 * �� , �����, ����, ����, ������ => Ŭ����.
 * ������ Ŭ������ ���� �Ӽ� / ��� ����.
 */

public class MainDrive {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		
		//DogŬ���� ���ο��� �ƹ��ڵ嵵 ������ 
		// �̸�, ¢�� ��� ��� �Ӽ��� ������ �ִ�
		// �ֳĸ� extends�� Dog�� Animal�� ��ӹޱ� ����
		d1.name = "�ٵ���";
		d1.weight = 4.5; //Animal X => ������ weight�� ����.
		d1.bark();
		d1.breath(); // LivingThings���Լ� Animal�� ���� ���.
		
		Monkey m1 = new Monkey();
		m1.name = "��Ű";
		m1.bark();
		
		Lion l1 = new Lion();
		System.out.println("���ڰ� ���¢���ϴ�.");
		l1.bark();
		
		Flower f1 = new Flower();
		f1.breath();
		f1.perfume();
		
		Tree t1 = new Tree();
		t1.breath();
		
		Dog d2 = new Dog();
		d2.name = "�ٵ���";
		
		//������ ����
		if(d1.equals(d2)) {
			System.out.println("���� ��");
		}else {
			System.out.println("�ٸ� ��");
		}
		
		// toString => �ش� ��ü�� String���·� ����.
		// toString�� �������̵��ؼ� ������ ����ϰ�.
		System.out.println(d1.toString());
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		
	}
}
