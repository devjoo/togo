package oop.data;

/*
 * ���� ���� ������ ��� Ŭ����
 */

public class Account {
	// ���¹�ȣ 620-203826-063
	public String accNum = "";
	// �ܰ�
	private int money = 0;
	// ������ ������ ������?
	public User owner = null;
	
	// ������ �Ϲ������� ��� private���� ���´�.
	// ����� �Ϲ������� ��� public���� �����ش�.
	public void addMoney(int amount, User tryUser) {
		System.out.println(tryUser.name + "���� �Ա��մϴ�.");
		this.money += amount;
		
		System.out.println("���� �ܾ��� " + this.money + "�� �Դϴ�.");
	};
}
