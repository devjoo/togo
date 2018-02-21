package bookstore;

public class Book {
	String title;
	int availAge; //??세 이용가
	int cost; //대여료
	People currentRentalUser = null; // null :: 데이터가 없다. 
	
	public Book(String title, int availAge, int cost) {
		super();
		this.title = title;
		this.availAge = availAge;
		this.cost = cost; //대여료
	}
	
	void increaseCost(int incCost) {
		//인상될 금액 : 매개변수
		cost += incCost;
	}
	
	boolean isUserRentalOk(People inputUser) {
		boolean result = false;
		//책을 빌려도 되는지 아닌지 판단해서  result에 대입.
		//사용자의 나이에 따라 달라지는 판단
		//사용자가 10살, 책은 15세? 안됨
		//사용자가 25살, 책은 15세? 됨
		
		if(inputUser.getMyAge() >= availAge) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	
	void rentBookToUser(People rentUser) {
		//rentUser : 책을 빌려갈 사람.
		
		//일단 책이 서점에 있나?
		//=> 빌려간 사람이 없다. 확인
		if(currentRentalUser == null) {
			//현재 빌려간 사람없는상태
			System.out.println("책 ready");
			
			if(isUserRentalOk(rentUser)) {
				//빌려줘도 괜찮다. (나이)
				//사용자의 소지금에서 대여료 만큼을 차감.
				//조경진:3000원 => 1000원 책 => 2000
				
				if(rentUser.currentMoney >= cost) {
					//대여료 이상의 돈을 들고온 손님.
					//나이도 괜찮고 동도 있으니 대여 Ok
					rentUser.currentMoney -= cost;
					currentRentalUser = rentUser; //이책은 이제 빌려간 사람이 얘야
					
					System.out.println(rentUser.name + " " + title + "대여 성공");
					//이 책의 대여자 : 빌려갈 사람  rentUser로 기록(덮어쓰기)
				}else {
					System.out.println("잔액 부족 대여 불가!!");
				}
			
			}else {
				System.out.println(rentUser.name + "의 나이가 어림 " + title + "을 대여불가!!!");
			}
		}else {
			//이미 빌려간 책
			System.out.println("책이 서점에 없습니다.");
		}
		
		
	}
	
	void returnBookToStore() {
		//빌려갈 사람 같은 추가 재료 필요 X
		currentRentalUser = null;
		//빌려간 사람이 없다고 기록
	}
	
	//책의 현재 상태를 출력 가능 기능 만들자
	void showBooksStatus() {
		System.out.println(title + "");
		System.out.println("=======도서정보출력=======");
		System.out.println("제목 : " + title);
		System.out.println("연령가 : " + availAge + "세 이용가");
		
		if(currentRentalUser == null) {
			System.out.println("대여 상태 : 대여 안됨.");
		}else {
			System.out.println("대여 상태 : 대출된 상태");
			System.out.println(currentRentalUser.name + "가 빌려갔습니다.");
		}
	}
	
	
}
