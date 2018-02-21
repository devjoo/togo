package test;

import java.util.Scanner;

/*
 * 반복문에 관한 종합 연습 문제
 * 문제 => 어떤 반복문? 어떻게 코딩해야?
 * 문제는 트렐로 반복문 응용문제 3번부터
 */

public class MainDrive {
	public static void main(String[] args) {
		
		// Q1. 3과 5의 공배수 목록 출력하기
		// 정수 하나를 입력받아 입력한 정수보다 작은 모든 3과 5의 공배수를 출력
		// Ex. 숫자를 입력하세요 : 100 => 15,30,45,60,75,90
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = scan.nextInt();
		for(int i = 1; i <= num; i++) {
			if( i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		
		
		
		// Q2. 게시판에 총 1500개의 게시물이 등록되어 있다.
		// 한페이지에는 30개의 게시물을 보여줌. 
		// 숫자입력 => 해당 페이지의 게시물 시작 번호와 끝 번호를 출력
		// Ex. 몇페이지의 게시물? 1500~1471까지 입니다.
		/*
		 * 1p: 1500~1471
		 * 2p: 1470~1441
		 * 3p: 1440~1411
		 * 11p: 1200~1171
		 * */
		
		//시작점 : 1500(전체) - (페이지 -1) * 30
		//종료점 : 시작점 - 29
		System.out.println("궁금한 페이지를 입력하세요");
		int inputPageNumber = scan.nextInt();
		int startPostNumber = 1500 - (inputPageNumber - 1) * 30;
		int endPostNumber = startPostNumber - 29;
		
		System.out.println(startPostNumber + " ~ " + endPostNumber);
	
		
		// Q3. Hailstone문제
		// 예시 임의수 숫자 입력받음 > 17 (홀수)
		// 홀수면 3배 + 1
		// 짝수는 반을 나눈다.
		// 17 => 52 => 26=> 13 => 40 => 
		// 반복하다가 보면 언젠가 1이 됨
		//10에서 20까지의 숫자중 제일 많은 단계를 거쳐 1이 되는 숫자는 무엇?
		// 10>5>16>8>4>2>1 6단계
		// 한 페이지에는 30개의 게시물이 보여줌
		
		//System.out.println("헬스톤? 숫자를 입력하세요");
		//int inputNum2 = scan.nextInt();
		
		int maxHNum = 10; // 일단 10이 제일 오래걸리는 숫자라고 가정
		int maxStep = 0; // 제일 긴단계는 일단 0단계라고 가정함
		
		// 10~20까지 반복으로 헬스톤을 수행해 보자
		for(int i = 10; i < 21; i++) {
			int inputNum2 = i;
			int originNum = inputNum2;
			
			System.out.print(inputNum2 + " 측정 : ");
			
			int count = 0;
			while( inputNum2 != 1 ) {
				//숫자를 변경하러 들어온 순간 count를 증가
				count++;
				if( inputNum2 % 2 == 1 ) {
					inputNum2 = inputNum2 * 3 + 1;
				}else {
					inputNum2 = inputNum2 / 2;
				}
				// System.out.println(count + "단계 : " + inputNum2);
			}
			//System.out.print(count + "단계를 거쳐 1이 된다.");
			if(maxStep < count ) {
				// => New record 더 긴 숫자를 찾았다!
				maxHNum = originNum; //숫자 갱신
				maxStep = count; // 단계 갱신
			}
			System.out.println(maxHNum + "이 " + maxStep + "단계로 제일 길다");
			System.out.println(" ");
		}
		
		
		
		
		// Q4. 369계산기
		// 도전문제
		// 숫자를 입력? 박수를 몇번 쳐야하는지?
		// Ex. 123 => 짝!
		// 36 => 짝!짝!
		// 12 => 12!
		// 12345678 =>
		
		//각각 자리마다 3,6,9,가 있는가? 있다면? 박수를 칠 횟수를 1회 증가
		System.out.println("판단할 숫자를 입력하세요.");
		int inputNum3 = scan.nextInt();
		//int inputNum3 = 1234569; // 판단할 숫자.
		int backupNum = inputNum3; // 출력할때 사용하려는 변수
		int clapCount = 0; // 박수를 몇번 칠지 저장하는 변수.

		// 5,4,3,2,1 -> 코드 짜기가 편함.
		// 1의 자리, 10, 100 숫자 마지막 자리까지
		// 12345 % 10 -> 5판단
		// 12345 / 10 -> 1234
		// 1234 % 10 -> 4판단
		// 1234 / 10 -> 123
		// 123 % 10 -> 3판단
		// ...
		// 1 / 10 -> 0
		//결과가 0만 남았다 : 모든 자리수에 대한 판단이 종료
		while(inputNum3 != 0) {
			//입력한 숫자가 0까지 줄어들면 모든 자리수에 대한 검토 완료.
			int lastDigit = inputNum3 % 10; // 1의 자리 추출하는 효과
			if(lastDigit == 3 || lastDigit == 6 || lastDigit == 9) {
				clapCount++; // 추출한 자리가 3/6/9 clapCount 증가
			}
			inputNum3 = inputNum3 / 10; // 마지막 자리 판단 끝났으니 필요없는 자리는 제거
		}
		if(clapCount == 0) {
			System.out.println(backupNum);
			//안쳐야 할때는 보관한 숫자를 출력
		}else {
			// 박수를 1회 이상 쳐야함.
			// 몇번 쳐야하는지? clapCount에 보관
			for(int i=0; i< clapCount; i++) {
				System.out.print("짝!");
			}
		}
		
		
	}
}
