package repeat;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		int i = 0;
		while( i < 10 ) {
			System.out.println(i);
			i++;
		}
		if( i < 20 ) {
			System.out.println(i);
		}
		//while 과 if 는 문법적으로 매우 유사하다.
		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		//for문에서 문법지키면 될것을 while에서 하나하나 직접 챙겨줘야한다.
		
		//while은 활용하는 곳이 다르다.
		
		// Q1. 1,2,3,4,...등등의 숫자를 더할 것이다.
		// 몇을 더하는 순간 100보다 커질까?
		int result = 0;
		int index = 1;
		while( result < 100) {
			result = result + index;
			index++;
		}
		System.out.println(index - 1 + "를 더할때 100을 넘어섬");
		
		// Q2. 8192는 2의 몇승?
		// 8192를 2로 계속 나눠봤을때
		// 1이 됬을때 몇번 나눴는지? 8 => 8 /2/2/2 = 1 2의 3승
		// 1이 됬을때 몇번 나눴는지? 4 => 4 /2/2 = 1 2의 2승
		int questionNum = 8192;
		int count = 0;
		while( questionNum > 1 ) {
			questionNum = questionNum / 2;
			System.out.println(questionNum);
			count++;
		}
		System.out.println(count + "번 반복했다. 2의 " + count + "승이다");
		
		// Q3. 1,2,3...계속 수를 곱해나감
		// 1000을 넘어서게 만드는 숫자는 몇?
		int result3 = 1;
		int count2 = 0;
		while(result3 < 1000) {
			count2++;
			result3 = result3 * count2;
		}
		System.out.println("1000을 넘어서게 만드는 숫자는 몇?" + count2);
		
		//0을 입력하면 "프로그램을 종료합니다. "메시지 출력, 반복문 탈출
		//0 이외의 숫자를 입력하면 입력한 숫자를 계속 더해주는 프로그램
		
		Scanner scan = new Scanner(System.in);
		int numInit= 0;
		int keyInput = -1;
		while(keyInput != 0) {
			System.out.println("숫자를 입력하세요. 나가려면0");
			keyInput = scan.nextInt();
			numInit = numInit + keyInput;
			System.out.println("더하기 : " + numInit);
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
