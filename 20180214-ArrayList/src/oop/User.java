package oop;

public class User {
	
	public String name;
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		//������ �ƴ��� ����� ������ Object �� �����ذ� �ƴ϶� 
		//�̸��� ������ �ƴ��� ����ħ => �������̵�
		
		User otherUser = (User) obj;
		
		if(this.name.equals(otherUser.name)) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	
}