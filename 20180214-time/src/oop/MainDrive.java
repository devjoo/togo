package oop;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainDrive {
	public static void main(String[] args) {
		
		//사용자 한명 생성
		User u1 = new User();
		
		u1.setName("A 사용자");
		u1.setGender(true); // 남성
		
		// 생년월일 세팅 => Calendar 타입
		
		// Calendar 변수 생성 : new를 사용하지 않음.
		// 디자인 패턴 => 고급과정
		Calendar u1BirthDay = Calendar.getInstance();
		
		// 현재 시간을 기록 
		// 1988 10 20 => 세팅 setter활용
		u1BirthDay.set(Calendar.YEAR, 1988);
		
		//set을 이용해서 모든 항목을 세팅 => 어떤 항목?, 어떤 값?
		//항목 설정 => Calendar.항목이름
		u1BirthDay.set(Calendar.MONTH, 10-1);//월은 항상 -1 해준다
		// 자바 캘린더에서 월은 항상 0~11값을 가짐
		u1BirthDay.set(Calendar.DAY_OF_MONTH, 20);
		
		//화면에 u1의 생년월일을 출력.
		// 1988년 10월 20일
		System.out.println(u1BirthDay);
		int year = u1BirthDay.get(Calendar.YEAR);
		int month = u1BirthDay.get(Calendar.MONTH);
		int day = u1BirthDay.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		// 88-10-20
		// 날짜/시간은 상황에 따라서 표현하는 양식이 매우 다양함.
		// Ex. 1988/10/20, 881020, 10월 20일 오후 3시
		// 날짜의 출력 양식을 지정하는 클래스도 존대
		// SimpleDateFormat 클래스 활용.
		SimpleDateFormat sdf01 = new SimpleDateFormat("yy-MM-dd");
		System.out.println(sdf01.format(u1BirthDay.getTime()));
		
		SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf02.format(u1BirthDay.getTime()));
		
		// 날짜를 이용한 다영한 질문의 해결, 그에 따른 추가 기능.
		// Q1. 생년월일(84-11-08) 은 무슨 요일?
		int myDayOfWeek = u1BirthDay.get(Calendar.DAY_OF_WEEK);
		System.out.println(myDayOfWeek);
		
		System.out.println("월요일의 값 : "+ Calendar.MONDAY);
		System.out.println("일요일의 값 : "+ Calendar.SUNDAY);
		System.out.println("토요일의 값 : "+ Calendar.SATURDAY);
		
		Calendar u2BirthDay = Calendar.getInstance();
		u2BirthDay.set(Calendar.YEAR, 2000);
		u2BirthDay.set(Calendar.MONTH, 5);
		u2BirthDay.set(Calendar.DAY_OF_MONTH, 5);
		
		//두번째 사용자의 생년월일 ? 2000년 5월 5일
		
		//Q2. 두번째 사용자는 인증을 제시하고 술을 먹을 수 있는가?
		// 생년 월일이 2000년 1월 1일 보다 이전.
		// 년도가 1999보다 작거나 같으면 됨
		
		if(u2BirthDay.get(Calendar.YEAR) <= 1999) {
			System.out.println("음주가 가능하다");
		}else {
			System.out.println("미성년자는 음주 불가");
		}
		
		// 시간의 비교. u1과 u2중에 더 먼저 태어난 사람?
		// 시간을 절대적인 양으로 표현 가능. 나중일수록 더 많은 시간 지남
		
		long u1TimeAmount = u1BirthDay.getTimeInMillis();
		// 특정시점(1970년1월1일)로 부터 시간이 지나간 양
		long u2TimeAmount = u2BirthDay.getTimeInMillis();
		// 특정시점(1970년1월1일)로 부터 시간이 지나간 양
		
		//getTimeInMillis가 클수록 더 나중 시간
		if(u1TimeAmount > u2TimeAmount) {
			System.out.println("첫 사용자가 더 어림");
		}else {
			System.out.println("둘째 사용자가 더 어림");
		}
		
		
		
		
		
		
		
	}
}
