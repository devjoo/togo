package oop;

import java.util.Calendar;

public class User {
	
	private String name;
	private boolean gender;
	
	// 생년월일 ? int 881020 => 00년 이후의 출생 취급 불가.
	// int ==> 001020 => 1020 String?
	
	// 날짜와 시간 => Date, Calendar(☆)
	private Calendar birthday;
	
	//회원 가입 일시 => 2018년 2월 14일 오후 7시 38분
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
