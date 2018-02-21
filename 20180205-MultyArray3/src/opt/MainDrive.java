package opt;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		
		/*System.out.println("숫자를 입력하세요. 나가려면 0");
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[100];
		
		int i = 0;
		int sum = 0; 
		while(true) {
			if(scan.nextInt() == 0 )
				break;
			arr[i] = scan.nextInt();
			sum += arr[i];
			System.out.println(sum);
			i++;
		}*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int inputNum = scan.nextInt();
		int backupNum = inputNum; // 출력할때 사용하려는 변수
		int sum = 0; // 박수를 몇번 칠지 저장하는 변수.
		
		while(inputNum > 0) {
			//입력한 숫자가 0까지 줄어들면 모든 자리수에 대한 검토 완료.
			int lastDigit = inputNum % 10; // 1의 자리 추출하는 효과
			sum += lastDigit;
			inputNum = inputNum / 10; // 마지막 자리 판단 끝났으니 필요없는 자리는 제거
		}
		System.out.println(sum);
		
	}
}
