package bookstore;

public class MainDrive {
	public static void main(String[] args) {
		/*Book b1 = new Book();
		b1.title = "얼음과 불의 노래";
		b1.availAge = 24;
		b1.cost = 10000;*/
		Book b1 = new Book("얼음과 불의 노래",12,10000);
		
		People u1 = new People("홍길동",990203,true);
		u1.currentMoney += 1000; //소지금 : 1000원
		
		//사용자가 자신 정보를 출력하는 기능
		System.out.println("제 이름은 " + u1.name + "이고, 나이는 " + u1.getMyAge() + "입니다.");
		//사용자를 두명 더 생성
		//두번째 : 사용자2, 901101, 성별 남성
		//세번째 : 사용자3, 991202, 성별 여성
		People u2 = new People("이지우",841108,false);
		u2.currentMoney += 500;
		/*u2.name = "이지우";
		u2.birthday = 841108;
		u2.gender = false;*/
		
		u2.printUserInfo();
		
		People u3 = new People("아이유", 901101, false);
		u3.currentMoney += 5000000;//500만원 줌
		
		People u4 = new People("user3", 990804, false);
		
		//얼불노(b1)의 대여료를 500원 올리자.
		System.out.println("원래 : " + b1.cost + "원");
		b1.increaseCost(500);
		System.out.println(b1.cost + "원");
		
		// 두번째 책 생성 : 도라에몽, 12세, 500원
		Book b2 = new Book("도라에몽", 24, 500);
		
		//첫번째 책 가격을 300원 추가 과금
		b2.increaseCost(300);
		System.out.println(b2.title + b2.cost);
		
		//첫번째 사용자의 얼불노와 도라메몽 빌릴수있는 출력
		System.out.println("얼불노 가능? 첫사람" + u1.name + " : " + b1.isUserRentalOk(u1));
		System.out.println("도라에몽 가능? 첫사람" + u1.name + " : " + b2.isUserRentalOk(u1));
		
		b1.showBooksStatus();
		//얼불로를 이지우에게 대여해보겠음
		b1.rentBookToUser(u2);
		b1.showBooksStatus();
		//얼불노를 반납 받음
		b1.returnBookToStore();
		
		//첫 사용자에게 도라에몽 대여
		b2.rentBookToUser(u1);
		b2.showBooksStatus();
		
		b2.showBooksStatus();
		//아이유(u3)도 도라에몽(b2)을 빌리러왔다.
		b2.rentBookToUser(u3);
		b2.showBooksStatus();
		u3.printUserInfo();
		
	}
}
