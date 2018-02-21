package opt;

public class User {
	
	// 이름 / 나이 / 성별
	String name = "";
	int age = 0;
	boolean gender = false;
	
	// 생성자. Constructor
	public User(String inputName, int inputAge, boolean inputGender) {
		name = inputName;
		age = inputAge;
		gender = inputGender;
	}
	
	// 재료를 아무것도 넣지 않아도 User클래스를 객체화 하게 허용.
	// 오버로딩을 활용하여 허용.
	public User() {
		// 재료를 안넣은 경우엔 이름을 미입력 세팅
		name = "미입력";
		
	}
	
	
}
