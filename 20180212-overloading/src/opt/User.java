package opt;

public class User {
	
	// �̸� / ���� / ����
	String name = "";
	int age = 0;
	boolean gender = false;
	
	// ������. Constructor
	public User(String inputName, int inputAge, boolean inputGender) {
		name = inputName;
		age = inputAge;
		gender = inputGender;
	}
	
	// ��Ḧ �ƹ��͵� ���� �ʾƵ� UserŬ������ ��üȭ �ϰ� ���.
	// �����ε��� Ȱ���Ͽ� ���.
	public User() {
		// ��Ḧ �ȳ��� ��쿣 �̸��� ���Է� ����
		name = "���Է�";
		
	}
	
	
}
