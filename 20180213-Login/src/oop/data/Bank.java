package oop.data;

public final class Bank {
	private String BankName;
	private int bankCode;
	
	// bankName 변수에 대한 setter 생성
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
		System.out.println("은행명은" + BankName + " / 코드명은" + bankCode);
	}
}
