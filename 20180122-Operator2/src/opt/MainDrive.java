package opt;

public class MainDrive {
	public static void main(String[] args) {
		// 실수 이용한 사칙 연산
		
		double d1 = 10;
		double d2 = 3;
		
		// 연산 모두 출력 
		double result; // 실수를 정수형 변수에 대입하려고 하면 에러 발생한다.
		
		result = d1 + d2;
		System.out.println(d1 +" + " + d2 + " = " + result);
		result = d1 - d2;
		System.out.println(d1 +" - " + d2 + " = " + result);
		result = d1 * d2;
		System.out.println(d1 +" * " + d2 + " = " + result);
		result = d1 / d2;
		System.out.println(d1 +" / " + d2 + " = " + result);
		result = d1 % d2;
		System.out.println(d1 +" % " + d2 + " = " + result);
	}
}
