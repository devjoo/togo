package oop.data;

public class User {
	public String email;
	public String name;
	public String password;
	public Account myAccount;
	
	// ����ڰ� �ڽ��� ���¿� ���� �Ա� ���.
	public void deposit(int amount, User sendUser) {
		
		myAccount.addMoney(amount, sendUser);
		
	}
}
