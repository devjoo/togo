package oop;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		// 레고를 쌓을 공간 생성.
		
		//정의된 사람 => 실제로 생성.
		Person p1 = new Person();
		
		//비교.
		// Scanner? 사용자 키보드 입력을 받도록 도와주는 클래스.
		// Person? 사람의 고유데이터를 저장하고 묶어두는 클래스.
		
		// scan => scan.nextInt();
		// 객체화한 스캐너 변수를 다시 찾고싶을때 찾는 이름. scan.
		// Scanner 타입의 변수 scan.
		// int a = 1; => int 타입의 변수 a.와 유사함.
		// Person 타입의 변수 p1.
		// p1 => 사람의 고유 데이터를 저장한 Person 종류의 클래스.
		
		//Person p1 = new Person();
		// new Person() : 사람 객체를 실제로 생성.
		// 레고에 비유 : 실제로 블록 한개를 가져옴.
		// 실제로 가져온 사람객체 1개는  p1에 저장됨.
		
		// 만든 클래스를 활용
		p1.name = "아이유";
		
		// 사람 한명만 있는 레고
		
		// 두번째 사람도 생성.
		Person p2 = new Person();
		p2.name = "이지우";
		p2.gender = true;
		
		// 두명 사람 추가 생성 => p3, p4
		Person p3 = new Person();
		p3.name = "사람3";
		Person p4 = new Person();
		p4.name = "사람4";
		
		// 첫번째 사람의 생년월일 => 930102
		p1.birthDay = 990102;
		// 두번째 사람으미 키 => 175로 설정
		p2.height = 175;
		
		//첫번째 사람에게 [자신의 정보] 출력하도록 시키기
		p1.printUserInfo();
		
		//두번째 사람에게 생년월일을 991020으로 세팅
		p2.birthDay = 991020;
		
		//두번째 사람의 정보도 출력
		p2.printUserInfo();
		
		// 첫번째 사람 나이
		p1.printMyAge();
		
		// 책한권 => 제목 : 먼나라 이웃나라, 이용가능 나이: 5
		// 책한권 => 제목 : 사채꾼 우시지마, 이용가능 나이: 19
		Book b1 = new Book();
		b1.title = "먼나라 이웃나라";
		b1.availAge = 5;
		
		Book b2 = new Book();
		b2.title = "사채꾼 우시지마";
		b2.availAge = 35;
		
		//아이유(p1)는 먼나라 이웃나라를 읽어도 되는가?
		boolean iuB1Ok = p1.isBookOk(b1);
		if(iuB1Ok) {
			System.out.println("아이유는 괜찮다.");
		}else{
			System.out.println("아이유는 읽으면 안된다.");
		}
		
		Scanner scan = new Scanner(System.in);
		//int inputNum = scan.nextInt();
		// scan이 키보드 입력을 받음 => 결과를  inputNum에 저장
		
		// 아이유는 사채꾼 우시지마를 읽어도 되는가?
		// 아이유는 99년생이다. 
		boolean iuOk2 = p1.isBookOk(b2);
		if(iuOk2) {
			System.out.println("아이유는 우시지마 괜찮다.");
		}else{
			System.out.println("아이유는 우시지마 읽으면 안된다.");
		}
		
		
	}
}
