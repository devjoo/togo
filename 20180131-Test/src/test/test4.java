package test;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		// 두개의 숫자를 입력 
		// 1. 두 숫자의 최소 공배수 : 3과 4의 최소 공배수 => 3의 배수이면서 4의 배수인수 중에 제일 작은 것
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력하세요.");
		int firstNum = scan.nextInt();
		System.out.println("두번째 숫자 입력하세요.");
		int secondNum = scan.nextInt();
		
		int i = 1;
		
		// ~가 될때까지 : ~가 아닌동안 반복
		/*while (!(i % firstNum == 0 && i % secondNum == 0)) {
			// i가 두수의 공배수가 아니라면, 1증가 => 계속 반복
			i++;
		}*/
		
		while(true) {
			i++;
			if(i % firstNum == 0 && i % secondNum == 0) {
				break;
			}
		}
		System.out.println("최소 공배수 : "+i);
		
		
		// Q2. 두 숫자의 최대 공약수 : 12와 15의 최대 공약수 => 3 두 숫자를 동시에 나눠떨어뜨리는 최대 숫자
		// 1. 1부터 반복해서 검사. 반복문
		// 2. 둘중에 더 작은수 까지만 검사를 하면 그 뒤는 검사 필요X
		// 3. 반복문은 찾아낸 작은" 수까지" 만 => for 문
		// 1은 모든수의 약수 : 항상 공약수 => 1까지 검사한 결과로의 초대 공약수는 1
		// 1부터 하나하나 늘려가며 검사하다가 => 만약 3이 공약수. => 3이 최대공약수
		
		int smallNum = 0; //둘중에 더 작은 수를 기록할 변수.
		if(firstNum > secondNum) {
			// 첫재가 더 크면 둘째를 작은 수로 기록
			smallNum = secondNum;
		}else {
			smallNum = firstNum;
		}
		
		//최대값 찾는 요령
		// 초기 최대값은 작은 값으로 미리 세팅
		// 반복을 돌면서(증가 방향) 조건을 만족하는 값이 나타나면
		// 기존에 세팅된 최대값을 갱신. => 기존의 값보다 더 큰 맞는 값이 저장
		int gcd = 1; //최대 공약수의 값을 기록할 변수
		
		for(int j=1; j <= smallNum; j++) {
			//1부터 둘중에 작은 수까지 증가하며 반복ㅂ.
			//두 수를 동시에 나눠떨어뜨리는지?
			if(firstNum % j == 0 && secondNum % j == 0) {
				// 새로운 공약수를 찾아냄!
				// 이전의 공약수보다 무조건 더 큰 공약수를 찾아낸 샘
				gcd = j;
			}
		}
		// 반복문이 종료되면, gcd에는 지금까지 찾아낸 공약수중 제일 큰 값 저장.
		// => 제일 큰 공약수 이므로 최대 공약수라는 결론.
		System.out.println("최대 공약수 : "+ gcd);
		
		
		
	}
}
