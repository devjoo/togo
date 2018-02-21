package bookstore;

public class People {
	String name;
	int birthday;
	boolean gender;
	int currentMoney = 0; //���� �󸶸� ����ִ���?
	
	public People(String inputName, int inputBirthDay, boolean inputGender) {
		/* Constructor :: ������ */
		//Ŭ������ ���鶧 ���ʿ� �ʿ��� ������ ���� �Է��ϵ���,
		//�Է��� ������ ������ ��ٷ� ����
		name = inputName;
		birthday = inputBirthDay;
		gender = inputGender;
	}
	
	void printUserInfo() {
		System.out.println("�� �̸��� " + name + "�̰�,"+ getGender() + "�̰�,"+ " ��������� " + birthday + "�Դϴ�. ���̴� " + getMyAge() + " �Դϴ�");
		System.out.println("���� �������� " + currentMoney + "�� �Դϴ�.");
	}
	
	int getMyAge() {
		int result = 0;
		int year = birthday / 10000;
		result = 2018 - year - 1900 + 1;
				
		return result;
	}
	
	String getGender() {
		if(gender) {
			return "����";
		}else {
			return "����";
		}
	}
}
