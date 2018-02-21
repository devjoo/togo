package array;

public class MainDrive {
	public static void main(String[] args) {
		//100칸 정수 배열생성
		int[] num = new int[100];
		
		//1~100수 저장
		for(int i = 0; i< num.length; i++) {
			num[i] = i + 1;
		}
		
		//출력
		for(int i = 0; i< num.length; i++) {
			System.out.println(num[i]);
		}
		
		// char 배열 대문자 있다면 소문자로 바꿔주기
		// ASCII CODE 활용 예시
		char[] letters = {'a','C','o','B'};
		for(int i = 0; i < letters.length; i++) {
			//대문자?  = 소문자로 변경
			if(65 <= letters[i] && letters[i] <= 90 ) {
				// A~Z면 소문자로 변환
				// 소문자는 => 대문자 + 32
				letters[i] = (char)(letters[i] + 32);
				// 32 => 정수 : int + letters[i] => 문자 : char
				// 다른 두 종류의 변수를 더하면 => 더 큰 공간으로 결과
				//(char)숫자 => 숫자를 강제로 char 형식으로 변경.
				
				//변수의 형태 변환 => 형변환 => 캐스팅(Casting)
				
			}
		}
		// 소문자로 모두 바뀌었는지 확인
		for(int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
		
		
		// 데이터를 여러가 넣어놓고 전수 조사 => 하나하나 까보면서 확인. for + 배열
		
		// 배열 => 50,78,97,13,45,62,31
		// 최고 점수는 몇점인가?
		int max = 0; //최대값을 일단 매우 작은 값으로 공간 만든다.
		int maxIndex = 0;
		int[] findMaxArr = {50,78,97,13,45,62,31};
		for(int i = 0; i < findMaxArr.length; i++ ) {
			if(max < findMaxArr[i]) {
				max = findMaxArr[i]; // 지금까지 본 최대값보다 더 큰 최대값 발견!
				maxIndex = i;
			}
		}
		System.out.println("최대값은 : "+ max + "몇번칸 : "+ maxIndex);
		
		// 최저 점수는 ?
		// 몇번칸?
		int min = findMaxArr[0];
		int minIndex = 0;
		for(int i = 0; i < findMaxArr.length; i++) {
			if(findMaxArr[i] < min) {
				min = findMaxArr[i];
				minIndex = i;
			}
		}
		System.out.println("최소값은 : "+ min + "몇번칸 : "+ minIndex);
		
	}
	
}
