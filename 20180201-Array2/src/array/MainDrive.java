package array;

public class MainDrive {
	public static void main(String[] args) {
		int[] studentRanks = {5,2,3,4,1,6,3,4,1,6,3,4,1,6};
		
		//몇명 학생?
		System.out.println(studentRanks.length);
		
		// 반복문을 이용해서 많이 활용, length , index가 같이 활용
		for(int i = 0; i < studentRanks.length; i++) {
			//내부 든 값 빼내서 값이 1인지 질문
			if(studentRanks[i] == 1) {
				System.out.println(i+"번 학생이 1등");
				break;
			}
		}
		
		//Q1. 1~5까지 숫자가 들어있는 배열 array를 만들자.
		//Q2. array 몇개?데이터
		// 두번째칸 어떤 값?
		// 내부 들어있는 모든 값출력
		// - 내부 들어있는 모든 홀수 출력
		// - 내부 있는 값을 0,10,20,30,40으로 교체
		int[] numArray = {1,2,3,4,5};
		System.out.println(numArray.length + "개 - numArray");
		for(int i = 0; i < numArray.length; i++) {
			System.out.println("numArray["+ i + "] : " + numArray[i]);
		}
		System.out.println("홀수 출력 시작 : --------------");
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] % 2 == 1) {
				System.out.println("numArray["+ i + "] : " + numArray[i]);
			}
		}
		System.out.println("치환 시작 : --------------");
		int[] numArray2 = {0,10,20,30,40};
		for(int i = 0; i < numArray.length; i++) {
			//numArray[i] = numArray2[i];
			numArray[i] = i * 10;
		}
		System.out.println("출력 : ---------------");
		for(int i = 0; i < numArray.length; i++) {
			System.out.println("numArray["+ i + "] : " + numArray[i]);
		}
		
		// Exception
		// 코드를 작성하는 단계에서는 파악할수 없는 에러
		// 실제로 방을 빌린 칸 수에 영향을 받음
		// 실행이 된 상태에서만 발생하는 에러 =>  Exception (Runtime Error)
		// 배열을 다룰때는 반드시 빌려둔 크기보다 더 큰  index를 사용하는 일은 X
		
		// 배열 1) 객체 지향 2)Exception 예외
		// 남들이 만들어 둔걸 활용
		// Spring 웹개발도구 => java웹개발 중급
		
		//예상치 못한 에러가 발생하여 앱을 종료 => Exception
		
		
		
		
	}
}
