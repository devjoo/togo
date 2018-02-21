package opt;

/*
 * 복잡한 산술 연산 + 응용
 */

public class MainDrive {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		
		int result;
		
		result = i1 + i2 + i3;
		System.out.println(result);
		
		result = i1 + i2 - i3;
		System.out.println(result);
		
		result = i1 + i2 * i3;
		System.out.println(result);
		
		result = (i1 + i2) * i3;
		System.out.println(result);
		
		//3개 정수 c1 c2 c3 의 평균
		int c1 = 3;
		int c2 = 6;
		int c3 = 12;
		
		int resultC = (c1 + c2 + c3) / 3;
		System.out.println("resultC : " + resultC);
		
		
		//철수는 10,20에 살고 영희는 40,30 좌표에 산다 줄이 만나려면 공평한 위치
		int[] ch = new int[] {10,20};
		int[] yh = new int[] {40,30};
	
		int result1 = (ch[0] + yh[0]) / 2;
		int result2 = (ch[1] + yh[1]) / 2;
		
		System.out.println("중간 좌표 : " + result1 + "," + result2);
		
		//삼각형의 넓이 
		// 가로 : 20 세로 : 10 삼각형의 넓이는 몇? 
		
		int width = 20;
		int height = 10;
		
		int result4 = width * height / 2;
		
		System.out.println(result4);
		
		// String 은 문장을 저장하는 변수인데 
		// String 간에는 다른 산술연산은 모두 불가능 한데 + 는 실행 가능
	}
}
