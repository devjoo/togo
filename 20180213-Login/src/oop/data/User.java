package oop.data;

public class User {
	public String email;
	public String name;
	public String password;
	public Account myAccount;
	
	// 사용자가 자신의 계좌에 돈을 입금 기능.
	public void deposit(int amount, User sendUser) {
		
		myAccount.addMoney(amount, sendUser);
		
	}
}
