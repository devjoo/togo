package oop.data;

public final class Bank {
	private String BankName;
	private int bankCode;
	
	// bankName ������ ���� setter ����
	public void setBankname(String bankName) {
		this.BankName = bankName;
		
	}
	
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankName() {
		return this.BankName;
	}
	
	public int getBankCode() {
		return this.bankCode;
	}
	
	public void getBankInfo() {
		System.out.println("�������" + BankName + " / �ڵ����" + bankCode);
	}
}
