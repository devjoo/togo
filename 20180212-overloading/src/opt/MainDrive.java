package opt;

public class MainDrive {
	public static void main(String[] args) {
		
		printUserInfo1(31);
		
		// ����� �Ѹ� ���� => ������, 31, true
		User person = new User();
		System.out.println(person.name);
		
		User person2 = new User("������", 31, true);
		
		Book book1 = new Book();
		System.out.println(book1.title);
		
		Book book2 = new Book("��å");
		System.out.println(book2.title);
		
		Book book3 = new Book("�巡�ﺼ", 12 , "�ɽ�");
		System.out.println(book3.title + book3.cost + book3.authorName);
		
	}
	
	//����� ������ ������ ������ �ϳ��� �ٸ��� OK
	static int sum(int num1, int num2) {
		int result = 0; 
		return result;
	}
	
	static int sum(int num1, double num2) {
		int result = 0; 
		return result;
	}
	
	static int sum(double num1, int num2) {
		int result = 0; 
		return result;
	}
	
	static void printUserInfo1() {
		System.out.println("����� ���� ���");	
	}
	
	
	static void printUserInfo1(String name) {
		System.out.println("����� ���� ���" + name);	
	}
	
	//����� ������ �ٸ� ����
	//String �� int�� ���� => �Ķ���� ������ type�� �ٸ�!
	static void printUserInfo1(int count) {
		for(int i = 0; i < count; i++) {
			System.out.println("����� ���� ���" + i + " qjs cnffur");	
		}
	}
	
	// �߸��� ����
	// ����Ϸ��� �뵵�� �ٸ�����, ��������� int�� �Ѱ��� �޴� �޽��.
	// ������ �̹� int�Ѱ��� �޴� �޽�尡 �����Ǿ� �����Ƿ� ����.
	// �ߺ� �߻� ó��.
	/*void printUserInfo1(int age) {
		System.out.println("����� ���� ���" + age + "��");	
	}*/
}
