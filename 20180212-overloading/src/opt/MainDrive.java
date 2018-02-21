package opt;

public class MainDrive {
	public static void main(String[] args) {
		
		printUserInfo1(31);
		
		// 사용자 한명 생성 => 조경진, 31, true
		User person = new User();
		System.out.println(person.name);
		
		User person2 = new User("조경진", 31, true);
		
		Book book1 = new Book();
		System.out.println(book1.title);
		
		Book book2 = new Book("내책");
		System.out.println(book2.title);
		
		Book book3 = new Book("드래곤볼", 12 , "심슨");
		System.out.println(book3.title + book3.cost + book3.authorName);
		
	}
	
	//재료의 갯수가 같더라도 종류가 하나라도 다르면 OK
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
		System.out.println("사용자 정보 출력");	
	}
	
	
	static void printUserInfo1(String name) {
		System.out.println("사용자 정보 출력" + name);	
	}
	
	//재료의 종류가 다른 예시
	//String 과 int의 차이 => 파라미터 변수의 type이 다름!
	static void printUserInfo1(int count) {
		for(int i = 0; i < count; i++) {
			System.out.println("사용자 정보 출력" + i + " qjs cnffur");	
		}
	}
	
	// 잘못된 예시
	// 사용하려는 용도는 다르지만, 결과적으로 int를 한개만 받는 메쏘드.
	// 이전에 이미 int한개를 받는 메쏘드가 구현되어 있으므로 에러.
	// 중복 발생 처리.
	/*void printUserInfo1(int age) {
		System.out.println("사용자 정보 출력" + age + "세");	
	}*/
}
