package oop;

import oop.components.LoginActivity;

public class MainDrive {
	public static void main(String[] args) {
		
		//로그인 액티비티를 실제로 생성 => 화면 띄우기
		
		LoginActivity la = new LoginActivity();
		
		//로그인 화면 구성요소 세팅
		la.initActivity();
		
		//로그인 화면의 로그인 버튼 클릭
		la.loginBtn.performClick();
		//검색 화면의 로그인 버튼 클릭
		la.searchBtn.performClick();
		
		la.emailBtn.performClick();
	}
}
