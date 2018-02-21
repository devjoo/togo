package repeat;

public class MainDrive {
	public static void main(String[] args) {
		
		//Q1. 구구단 2단 출력 : 
		for(int i = 1; i < 10; i++) {
			System.out.println("2 x " + i + " = " + 2 * i);
		}
		
		System.out.println("\n 2단에서 9단");
		//Q1. 구구단 2~9단 출력 : 
		//천천히 도는 반복을 더 겉에(먼저) 작성 (단수)
		for(int i = 2; i < 10; i++) {
			System.out.println("----------------------------");
			// 빨리빨리 도는 반복을 더 안쪽에(나중에) 작성
			for(int j = 1; j < 10; j++) {
				System.out.println( i + " x " + j + " = " + (i * j));	
			}
		}
		
		// 가로줄로 출력
		String result = "";
		for(int i = 1; i < 10; i++) {
			// 빨리빨리 도는 반복을 더 안쪽에(나중에) 작성
			for(int j = 1; j < 10; j++) {
				result += i + " x " + j + " = " + (i * j) + " | ";	
			}
			System.out.println(result);	
			result = "";
		}
		
		//별찍기
		//삼각형, 역삼각형 , 삼각형 오른쪽 정렬
		String star = "";
		for(int i = 0; i < 5; i++) {
			star += "*";
			System.out.println(star);
		}
		
		System.out.println("별찍기 - 정사각형");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("별찍기 - 삼각형 기본");
		for(int i = 0; i < 5; i++) { // 세로
			for(int j = 0; j <= i; j++) { //가로
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("별찍기 - 삼각형 역순");
		for(int i = 5; i > 0; i--) { // 세로
			for(int j = 0; j < i; j++) { //가로
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("별찍기 - 삼각형 10줄");
		for(int i = 0; i < 10; i++) { // 세로
			for(int j = 0; j <= i; j++) { //가로
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("별찍기 - 삼각형 우측 정렬");
		for(int i = 5; i > 0; i--) { // 세로
			for(int j = 1; j <= 5; j++) { //가로
				if(i > j) {
					System.out.print(" ");
				}else {
					System.out.print("*");	
				}
			}
			System.out.println("");
		}
		
		System.out.println("별찍기 - 삼각형 우측 정렬 선생님");
		for(int i = 0; i < 5; i++) { // 세로
			for(int j = 0; j < 4 - i; j++) { //가로 공백
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) { //가로 별
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("별찍기 - 5/4/3/2/1");
		//미
		
	}
}
