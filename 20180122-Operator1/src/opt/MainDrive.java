package opt;

/*
 *   산술 연산의 여러가지 예시,
 *   변수와의 조합.
 */

public class MainDrive {
	public static void main(String[] args) {
		// 피연산자 (Operand)로 쓰일 두개의 정수 변수
		int a = 10;
		int b = 3;

		int result; // 결과 저장할 변수

		result = a + b;
		System.out.println("a와 b의 합 : " + result);

		result = a * b;
		System.out.println("a와 b의 곱 : " + result);

		result = a - b;
		System.out.println("a에서 b를 뺀값 : " + result);

		result = a / b;
		System.out.println("a를 b로 나눈 몫 : " + result);

		result = a % b;
		System.out.println("a를 b로 나눈 나머지 : " + result);
		
		//ctrl + shift + f 줄 정렬 단축키
	}
}
