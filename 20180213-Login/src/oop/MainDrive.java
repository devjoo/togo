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
	
	// public : 접근 제어자 중 공공성을 확보 => 누구나 접근 가능
	// 자바 프로그램이 어디에서든 접근할 수 있도록 허용
	
	// static : 객체화를 거치지 않고, 
	// 클래스 타입 자체에게 일을 시킬 수 있도록 해주는 역할
	// MainDrive.main(); 실행할 수 있도록 => 객체화 생략.
	
	public static void main(String[] args) {
		
		// 자동완성을 안하면, 변수타입과 생성자가 에러 뜸
		// 왜? 같은 패키지(oop) 안에는 User도, Scanner도 없으므로.
		// 이게 무슨 클래스인지 모르겠다. 에러 발생
		
		//다른 패키지 안에 들어있는 클래스를 쓰려면, 반드시 import
		// 어느 패키지 안에 있는 클래스인지 컴퓨터에게 설명.
		
		//Ctrl + Shift + o : auto import
		// 1) 필요없어진 import모두 찾아줌
		// 2) 필요없어진 import는 모두 제거해줌
		
		User u1 = new User();
		Scanner scan = new Scanner(System.in);
		
		// Q1. u1의 이름은 "A 사용자", id : "aaa@bbb.com",
		// pw : "qwer1234"
		
		
		// User클래스는 다른 패키지에 있는 클래스 => 불가능
		// 기본적으로 접근이 불가능
		// 접근이 가능하려면 ? User가 허용해줘야함 => public
		// User에서 변수들 앞에 public을 붙이니 접근 가능해짐.
		u1.name = "이지우";
		u1.password = "qwer1234";
		u1.email = "aaa@bbb.com";
		
		// u1의 비밀번호가 사용해도 좋다면, "비번이 양호합니다."
		// 아니라면 "새로운 비밀번호를 설정해주세요."
		VaildUtil vu = new VaildUtil();
		if(vu.isPwOk(u1)) {
			System.out.println("양호");
		}else {
			System.out.println("재생성 필요");
		}
		
		// 계좌 하나를 인스턴스화
		Account ac1 = new Account();
		// 계좌번호는 123-4567, 잔고는 100만원
		ac1.accNum = "123-4567";
		//ac1.money = 1000000;
		ac1.owner = u1;
		
		// 사용자(bbb@ccc.com, asdf1234, B사용자
		// 계좌 ( 987-6543, 5000000, u2 )한쌍 더 생성.
		User u2 = new User();
		u2.email = "bbb@ccc.com";
		u2.password = "asdf1234";
		u2.name = "B사용자";
		
		Account ac2 = new Account();
		ac2.accNum = "986-2134";
		//ac2.money = 500000;
		ac2.owner = u2;
		
		// 두번째 사용자의 잔고를 5만원으로 바꾸자.
		//ac2.money = 500000;
		//프로그램의 코드에서 은행 잔고를 변수 대입으로 바로 세팅
		// 이 잔고가 왜 5만원이 되었는지? 전혀 추적이 불가능함.
		
		// 잔고, 비번같은 데이터들은 public으로 열어주면 보안상 취약.
		// 수정을 함부로 하면 안되는 변수들은 전부 막아줘야할 필요.
		// => private 
		
		// Q1. 2번 사람이 1번 사람에게 300만원 송금
		u1.myAccount = ac1;
		u2.myAccount = ac2;
		u1.deposit(3000000, u2);
		
		// Q2. 은행을 하나 생성해서, 이름은 기업은행, 코드는 5
		// 값을 세팅할 방법 자체가 없다 => 기능으로 열자.
		// 세팅하는 기능 : setter
		Bank b1 = new Bank();
		b1.setBankname("기업은행");
		
		// 코드는 5
		b1.setBankCode(5);
		System.out.println(b1.getBankName() + " 이다");
		System.out.println(b1.getBankCode() + "번");
		
		Fund f1 = new Fund();
		// Fund클래스는 왜 만든건지? 출력
		//System.out.println(f1.classDescription);
		// 나중에 다시 읽으면, f1변수에 대한 설명 아닌가라고 혼동할수있다.
		
		// static 으로 공용으로 쓰는건 달아준다.
		System.out.println(Fund.classDescription);
		
		// Fund클래스의 설명을 화면에 출력
		Fund.showClassInfo();
		
		printMessage();
		
		// PI변수는 처음 들어간 값 이후로는 변경 불가. 
		final double PI = 3.14;
		//PI = 5.14; // 파이값에 다른 값이 들어가는 것 자체가 잘못됨 (에러 뱉음)
		
		//개 한마리 생성, 키 80, 몸무게 4.5
		Dog d1 = new Dog();
		
		d1.height = 80;
		d1.weight = 4.5;
		
		// 동물이라는 미지의 생명체가 갑자기 세상에 출현
		// 동물은 현실에 튀어 나오지 못하게 . => abstract
		Animal a1 = new Animal();
		a1.height = 90;
		a1.weight = 5.5;
		
	}
	
	static void printMessage() {
		System.out.println("호호");
	}
}
