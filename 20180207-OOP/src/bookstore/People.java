package bookstore;

public class People {
	String name;
	int birthday;
	boolean gender;
	int currentMoney = 0; //현재 얼마를 들고있는지?
	
	public People(String inputName, int inputBirthDay, boolean inputGender) {
		/* Constructor :: 생성자 */
		//클래스를 만들때 애초에 필요한 정보를 같이 입력하도록,
		//입력한 정보를 변수에 곧바로 저장
		name = inputName;
		birthday = inputBirthDay;
		gender = inputGender;
	}
	
	void printUserInfo() {
		System.out.println("제 이름은 " + name + "이고,"+ getGender() + "이고,"+ " 생년월일은 " + birthday + "입니다. 나이는 " + getMyAge() + " 입니다");
		System.out.println("저의 소지금은 " + currentMoney + "원 입니다.");
	}
	
	int getMyAge() {
		int result = 0;
		int year = birthday / 10000;
		result = 2018 - year - 1900 + 1;
				
		return result;
	}
	
	String getGender() {
		if(gender) {
			return "남성";
		}else {
			return "여성";
		}
	}
}
