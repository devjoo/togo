package repeat;

public class MainDrive {
	public static void main(String[] args) {
		// for문 내부의 복잡한 실행. 
		
		// Q1. 1~10까지 숫자중 3의 배수인 경우 화면에 출력
		for(int i = 1; i <= 10; i++ ) {
			//i를 반복적으로 증가시키면서 매번 질문 하는 효과,
			//for 중괄호 내부에 if 사용
			if(i % 3 == 0) {
				System.out.println(i);
			}else if(i % 3 == 1) {
				System.out.println("나머지가" + i);
			}else {
				System.out.println("나머지가 ~: " + i);
			}
		}
		
		//Q1. 1~10까지 짝수는 짝수입니다. 홀수는 그냥 숫자만 출력
		for(int i = 1; i <= 10; i++) {
			if( i % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println(i);
			}
		}
		
		//Q2. 1~50까지 숫자중 3과 5의 공배수 출력
		// : 공배수. 3과 5로 동시에 나눠지는것
		System.out.println("3,5의 공배수 출력");
		for(int i = 1; i <= 50; i++) {
			if(i % 3 == 0 && i % 5 ==0) {
				System.out.println(i);
			}
		}
		
		//실전 반복문 : 결과얻을때까지 연산만 담당 > 얻어진 결과만 화면에 출력
		
		//Q1. 1~10 까지 합? 55
		int result = 0; // 덧셈의 결과값은 보통 0 으로 초기화 셋팅한다.
		for(int i = 1; i <= 10; i++) {
			result = result + i;
		}
		System.out.println("1~10 까지 합? " + result);
		
		//1~10까지 숫자의 곱?
		int result2 = 1; // 곱셈의 결과값은 보통 1로 초기화 셋팅한다.
		for(int i = 1; i <= 10; i++) {
			result2 = result2 * i;
		}
		System.out.println(result2);
		
		// 로또 1등에 당첨될 확률은 얼마일까요?
		// 로또를 뽑는 모든 경우의 수?
		// 6C45 =? (45*44*43*42*41*40) / ( 6* ~ *1 )
		// 확률? 1) 결과값 / 2)결과값 => 800만분의 1
		long loto = 1; //45~40 곱
		long temp2 = 1; // 6~1 곱
		for(int i = 45; i >= 40; i--) {
			loto = loto * i;
		}
		for(int i = 6; i >= 1; i--){
			temp2 = temp2 * i;
		}
		
		long lottoResult = loto / temp2;
		System.out.println("총 경우의 수 : " + lottoResult);
		System.out.println("당첨확률 : 1/" + lottoResult);
		
		//로또 시뮬레이터 => 10억 로또
		//1등 50억, 2등 5천만, ...5등 5천원
		//10억을 쏟아부었을때 얼마를 버는가?
		
		
		// 응용 3. 소수 판별기.
		// 2,3,5,7,...,23 => 125621
		
		// 소수인가 아닌가? 2~125620까지의 모든 숫자를 나눠서 
		// 하나라도 나눠떨어진다면 소수가 아님.
		// 하나도 나눠 떨어지는 경우가 없어야만 소수.
		int okNum = 0; //나눠떨어지는 숫자를 저장
		boolean isPrimeNum = true; // 일단 소수가 맞다고 가정하고 출발
		for(int i = 2; i < 125620; i++) {
			if(125620 % i == 0) {
				isPrimeNum = false;
				okNum = i;
			}
			
		}
		System.out.println("125620은 소수인가 ? " + isPrimeNum);
		if(isPrimeNum == false) {
			System.out.println(okNum + "으로 나눠진다");
		}
		
	}
}
