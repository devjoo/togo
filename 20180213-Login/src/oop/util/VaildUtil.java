package oop.util;

import oop.data.User;

public class VaildUtil {
	//��й�ȣ�� ����ص� ������ �˻��ϴ� ����
	//����� 8���� �̻��ΰ�?
	public boolean isPwOk(User u) {
		boolean result = false;
		
		if(u.password.length() >= 8) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
}
