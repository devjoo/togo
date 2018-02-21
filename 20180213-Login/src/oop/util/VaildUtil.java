package oop.util;

import oop.data.User;

public class VaildUtil {
	//비밀번호가 사용해도 좋은지 검사하는 긴으
	//비번이 8글자 이상인가?
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
