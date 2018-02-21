package repeat;

public class MainDrive {
	public static void main(String[] args) {
		//1. break문 사용문법 예시
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.out.println("5번 까지만 출력");
				
				break;
				// 반복문을 강제 종료
			}
		}
		
		// break 실제 활용 예시
		// Ex. 123은 소수인가? 아님 3나눠짐
		boolean isPrime = true; //나눠지는 경우 없으면 true유지
		int divideNum = 0; //나눠떨어지는 숫자 보관 
		int inputNum = 123;
		
		for(int i = 2; i<inputNum; i++) {
			//2~122까지 모든 숫자를 123으로 나눠봄 
			
			if(inputNum % i == 0) {
				isPrime = false;
				divideNum = i;
				
			}
			System.out.println("소수인가?" + isPrime);
			
			//isPrime이 true가 아닐때 실행
			if(!isPrime) {
				System.out.println(divideNum + "으로 나눠짐");

				break;
			}
			// 소수를 찾는 프로그램 => 속도를 2배 상향 방법
			// 어떤방법? Hint? 
		}
		
		//2. continue 문의 사용 문법 예시
		// 1~20까지 수 중 3의 배수를 제외한 모든 숫자 출력
		for(int i= 0; i < 20; i++) {
			if(i % 3 == 0) {
				continue;
				//3으로 나눠떨어지면 그 루프는 그냥 통과
			}
			System.out.println(i);
		}
	}
}
