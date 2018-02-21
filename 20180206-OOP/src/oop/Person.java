package oop;

/*
 * 프로그램에서 활용될 사람 클래스
 * 사람이 가진 고유 속성,
 * 사람이 하는 행동들을 정의하는 공간.
 * 
 * 속성 : 그 객체에 대한 데이터.
 * 행동 : 여러 기본 명령의 묶음(차후)
 * 
 * 레고의 사람 블록같은 개념.
 * 
 */
public class Person {
	// 이름 - String
	// 생년월일 - int
	// 키 - double
	// 몸무게 - double
	// 성별 - boolean (t:남/f:여)
	
	String name;
	int birthDay;
	double height;
	double weight;
	boolean gender;
	
	
	// 책이라는 개념을 사용하고 싶다. 
	//클래스 만들고 필요속성 정의 
	
	// 사람이 책방관리 시스템에서 할만한 행동?
	// 1) 고객정보출력
	//- 자신의 정보 (이름, 생년월일 출력)
	// 행동 => method 형태로 구현
	void printUserInfo() {
		//자신의 정보를 출력하는 부분,
		System.out.println("이름 : " + this.name);
		System.out.println("생년월일 : " + this.birthDay);
		System.out.println("키 : " + this.height);
		if(gender) {
			System.out.println("남");
		}else {
			System.out.println("여");
		}
	}
	
	// 2) 자신의 나이를 출력 + 결과로 돌려주기
	int printMyAge() {
		//나이? 생년월일 앞 두자리 => 년도.
		//2018년 현재 - 년도 + 1
		int year = this.birthDay / 10000; //88.1020 => 88
		int age = 2018 - year - 1900 + 1;
		System.out.println("제 나이는 " + age + "입니다");
		
		return age;
	}
	
	
	// 3) 대여현황 출력 (차후)
	
	//1. 기능(method)의 결과? boolean
	//2. 메쏘드의 이름? isBookOk
	//3. 재료? Book book1
	boolean isBookOk(Book b1) {
		// 여기까지 했을때 에러를 뱉는 이유?
		// 결과로 boolean을 내준다고 해놓고 안주기 때문.
		// 결과를 내주는 행위 : return
		
		boolean isOk = false; // 아직 안괜찮은걸로 전재.
		
		//메쏘드의 정의 중 핵심은 해야할 일들을 실제로 작성.
		//메쏘드를 정의하는 방법 => 기초 문법 활용
		
		int myAge = printMyAge(); // 돌려받은 결과를 myAge에 저장
		
		//만약 사람의 나이가 책의 연령가보다 크거나 같다면
		//이 책은 괜찮음, 그렇지 않다면 불가.
		if(myAge >= b1.availAge) {
			//나이가 재료로 들어온 책의 연력대 이상이므로, 읽어도됨
			//Ex. 88년생, b1은 19세 이상 이용 가능
			isOk = true;
		}else {
			isOk = false;
		}
		
		return isOk; //최종적으로 가공된 isOk를 결과로 제시.
	}
	
}
