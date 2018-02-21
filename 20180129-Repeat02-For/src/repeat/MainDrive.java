package repeat;

public class MainDrive {
	public static void main(String[] args) {
		// Q1. Hello 문장  5번 출력
		for(int i = 0; i < 5; i++){
			System.out.println("Hello " + i);
		}
		
		// Q2. 1~5까지 출력하는 프로그램.
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			//i는 중괄호 내부에서 활용이 가능하다.
		}
		
		//Q3. 2,4,6,...10숫자 출력
		for(int i = 1; i <= 5; i++) {
			System.out.println(i*2);
			//변화하는 i값과 출력해야할 반복 결과물간의 규칙 찾는 문제.
		}
		
		//Q4. 1,3,5,7,19 (1부터 20까지의 홀수)
		for(int i = 0; i <= 9; i++) {
			System.out.println(i*2 + 1);
		}
		System.out.println("------------");
		//Q5. 2,5,8,11,...20 (3의 배수 -1) ==> 3씩 증가 하니까 유추 가능
		for(int i = 0; i < 7; i++ ) {
			System.out.println(i*3 + 2);
		}
		
		System.out.println("------------");
		//Q6. 2의 1승? 2의 2승? 4 2의 10승? 1024 2의 18승?
		int result = 1;
		for(int i = 0; i < 10; i++) {
			result = result * 2;
		}
		System.out.println(result);
	}
}
