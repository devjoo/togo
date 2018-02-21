package opt;

public class MainDrive {
	public static void main(String[] args) {
		// 핸드폰 한달 요금  : 11만원
		// 기기값 한달 : 4만원
		// 사용 개월수 : 40개월
		// 월 데이터 사용량 : 5.7 기가
		
		int monthPay = 110000;
		int monthDevicePay = 40000;
		int useMonths = 40;
		double dataUseAmount = 5.7;
		
		// Q1.2년 약정이 끝났는가?
		boolean result1 = (useMonths / 12) >= 2;
		System.out.println("Q1. 2년 약정이 끝났는가? " + result1);
		
		// Q2. 한달 10만원 이상사용하고 3년이상 사용한 사람은 VIP 나는 VIP 입니까?
		boolean result2 = (useMonths / 12) >= 3 && monthPay >= 100000;
		System.out.println("Q2. 나는 VIP 입니까? " + result2);
				
		// Q3. 핸드폰 개통이래 통신사 지불한 총 금액?
		// 기기값은 약정(2년)이 끝나면 더이상 내지 않음
		int allPay = (useMonths - 24) * monthPay + 24 * (monthPay + monthDevicePay);
		System.out.println("Q3. 핸드폰 개통이래 통신사 지불한 총 금액? " + allPay);
		
	}
}
