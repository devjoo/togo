package opt;

import java.util.Scanner;

import opt.data.Dog;
import opt.data.Flower;
import opt.data.Lion;
import opt.data.Monkey;
import opt.data.Tree;

/*
 * 동물원 프로그램으로 구현.
 * 개 , 고양이, 여우, 사자, 원숭이 => 클래스.
 * 각각의 클래스가 갖는 속성 / 기능 정의.
 */

public class MainDrive {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		
		//Dog클래스 내부에는 아무코드도 없지만 
		// 이름, 짖기 등등 모든 속성을 가지고 있다
		// 왜냐면 extends로 Dog가 Animal을 상속받기 때문
		d1.name = "바둑이";
		d1.weight = 4.5; //Animal X => 생물이 weight를 소유.
		d1.bark();
		d1.breath(); // LivingThings에게서 Animal을 거쳐 상속.
		
		Monkey m1 = new Monkey();
		m1.name = "몽키";
		m1.bark();
		
		Lion l1 = new Lion();
		System.out.println("사자가 울부짖습니다.");
		l1.bark();
		
		Flower f1 = new Flower();
		f1.breath();
		f1.perfume();
		
		Tree t1 = new Tree();
		t1.breath();
		
		Dog d2 = new Dog();
		d2.name = "바둑이";
		
		//포인터 개념
		if(d1.equals(d2)) {
			System.out.println("같은 개");
		}else {
			System.out.println("다른 개");
		}
		
		// toString => 해당 객체를 String형태로 가공.
		// toString은 오버라이딩해서 정보를 출력하게.
		System.out.println(d1.toString());
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		
	}
}
