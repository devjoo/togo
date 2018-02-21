package rotto;

public class MainDrive {
	public static void main(String[] args) {
		//로또 당첨 번호가 저장될 배열
		int[] okLottoNumbers = new int[6];
		
		//6개의 숫자가 저잘될때까지 반복
		for (int i = 0; i < 6 ; i++) {
			while (true) {
				//1~45의 숫자 랜덤. => 45.9999 => int캐스팅 : 45
				int num = (int) (Math.random() * 46);
				
				// 당첨번호로 이미 뽑혀있는가? 결과 저장
				// 일단 아니다 라고 전재.
				boolean isDuplNum = false;
				for(int j = 0; j < 6; j++) {
					if(okLottoNumbers[j] == num) {
						//당첨번호중 하나가 지금 뽑은 번호와 같다.
						//지금 뽑은 번호는 중복이다!
						isDuplNum = true;
					}
				}
				
				//중복이 아니라고 확정되면 && 0도 아니라면
				if(!isDuplNum && num != 0) {
					//숫자를 당첨번호로 저장
					okLottoNumbers[i] = num;
					//while문을 빠져나와 다음 숫자를 뽑으러 넘어감.
					break;
				}
				
				System.out.println(num);
			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(okLottoNumbers[i]);
		}
	}
}
