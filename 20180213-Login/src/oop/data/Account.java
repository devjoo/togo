package oop.data;

/*
 * 은행 계좌 정보를 담는 클래스
 */

public class Account {
	// 계좌번호 620-203826-063
	public String accNum = "";
	// 잔고
	private int money = 0;
	// 계좌의 주인이 누군지?
	public User owner = null;
	
	// 변수는 일반적으로 모두 private으로 막는다.
	// 기능은 일반적으로 모두 public으로 열어준다.
	public void addMoney(int amount, User tryUser) {
		System.out.println(tryUser.name + "님이 입금합니다.");
		this.money += amount;
		
		System.out.println("현재 잔액은 " + this.money + "원 입니다.");
	};
}
