package game;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		// Math.random() => 0~1사이의 소수랜덤.
		//(int) 캐스팅 => 소수점을 다 버림.
		
		// 0~999중 하나의 숫자를 랜덤.
		
		// 문제가 될 숫자의 조건.
		// 일단 100보다 커야함 => 세자리
		// 중복된 숫자가 있으면 안됨. 488 X
		
		// 맘에 드는 문제가 나올때까지 계속 랜덤을 돌림.
		int questionNum = 0;
		int[] questionNumArray = new int[3];
		
		while (true) {
			questionNum = (int) (Math.random()*999);
			if(questionNum >= 100) {
				//세자리 만족.
				
				//100의 자리, 10의 자리, 1의 자리를 모두 추출.
				//100의 자리 != 10의 자리 &&
				//10의 자리 != 1의 자리 &&
				//1의 자리 != 100의 자리
				
				//100의 자리추출.  892 -> 8 100으로 나눈수
				int num100 = questionNum / 100;
				int num10 = questionNum / 10 % 10;
				int num1 = questionNum % 10;
				
				if(num100 != num10 && num10 != num1 && num1 != num100) {
					
					questionNumArray[0] = num100;
					questionNumArray[1] = num10;
					questionNumArray[2] = num1;
					
					break;
				}
				
			}
		}
		
//		System.out.println("문제가 출제되었습니다 : " + questionNum);
		
		//기본값 : 0S 0B
		int strikeCount = 0;
		int ballCount = 0;
		
		Scanner scan = new Scanner(System.in);
		//3S 달성하면 게임을 종료.
		while (strikeCount < 3) {
			
			strikeCount = 0;
			ballCount = 0;
			
			System.out.println("정답 입력 : ");
			int inputNum = scan.nextInt();
			
			int[] inputNumArr = new int[3];
			int num100 = inputNum / 100;
			int num10 = inputNum / 10 % 10;
			int num1 = inputNum % 10;
			
			inputNumArr[0] = num100;
			inputNumArr[1] = num10;
			inputNumArr[2] = num1;
			
			// 입력한 숫자를 세칸의 배열로 분할함.
			// 정답 배열 / 입력 배열 가지고 ?S ?B 판단.
			
			//입력한 숫자를 담당하는 for
			for(int i = 0; i < 3; i++) {
				//정답 숫자를 한자리씩 체크하는 for
				for(int j = 0; j < 3; j++) {
					//일단 숫자가 같은지?
					if(inputNumArr[i] == questionNumArray[j]) {
						
						// i : 1 j : 1 => 입력 :10의 자리,정답 : 10의 자리
						//두 값이 같다 => 위치도 같다 => strike
						if(i == j) {
							strikeCount++;
						}else {
							ballCount++;
						}
						
					}
				}
			}
			
			System.out.println(strikeCount + "S " + ballCount + "B");
			
		}
		
		System.out.println("정답을 맞추셨습니다! 축하합니다!");
	}
}
