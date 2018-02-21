package var;

public class MainDrive {
	public static void main(String[] args) {
		int a; // 공간 : 정수 1개 저장 
		int b;
		
		a = 3;
		b = 5;
		a = 10;
		
		int result;
		
		result = a; // 우측에 있는 값을 왼쪽으로 복사.
		
		result = a = b;
		
		//ctrl + f11 실행
		System.out.println("a : " + a);
		System.out.println("result : " + result);
	}
}
