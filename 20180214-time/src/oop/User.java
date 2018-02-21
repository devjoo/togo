package oop;

import java.util.Calendar;

public class User {
	
	private String name;
	private boolean gender;
	
	// ������� ? int 881020 => 00�� ������ ��� ��� �Ұ�.
	// int ==> 001020 => 1020 String?
	
	// ��¥�� �ð� => Date, Calendar(��)
	private Calendar birthday;
	
	//ȸ�� ���� �Ͻ� => 2018�� 2�� 14�� ���� 7�� 38��
	private Calendar signUpDateTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Calendar getBirthday() {
		return birthday;
	}

	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	public Calendar getSignUpDateTime() {
		return signUpDateTime;
	}

	public void setSignUpDateTime(Calendar signUpDateTime) {
		this.signUpDateTime = signUpDateTime;
	}
	
	
}
