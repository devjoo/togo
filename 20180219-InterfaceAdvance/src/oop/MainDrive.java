package oop;

import oop.components.LoginActivity;

public class MainDrive {
	public static void main(String[] args) {
		
		//�α��� ��Ƽ��Ƽ�� ������ ���� => ȭ�� ����
		
		LoginActivity la = new LoginActivity();
		
		//�α��� ȭ�� ������� ����
		la.initActivity();
		
		//�α��� ȭ���� �α��� ��ư Ŭ��
		la.loginBtn.performClick();
		//�˻� ȭ���� �α��� ��ư Ŭ��
		la.searchBtn.performClick();
		
		la.emailBtn.performClick();
	}
}