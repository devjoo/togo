package test;

public class MainDrive {
	public static void main(String[] args) {
		String name = "이지우";
		int age = 28;
		double height = 190;
		double weight = 42;
		
		// 나이가 31살인가? => b1 변수 결과 저장
		
		boolean b1;
		b1 = (age == 31); //age 에 들어있는 값과 31이 같으면  true 아니면 false
		System.out.println("31살인가? " + b1);
		
		boolean b2;
		b2 = age != 31;
		System.out.println("31살이 아닌가? " + b2);
		
		boolean b3 = height > 180;
		System.out.println("키가 180보다 큰가? " + b3);
		
		boolean b4 = height <= 180;
		System.out.println("키가 180이하인가? " + b4);
		
		boolean b5 = (height >= 180) && (weight >= 80);
		System.out.println("키가 180이상이고 몸무게가 80이상인가? " + b5);
		
		boolean b6 = (height >= 180) || (weight >= 80);
		System.out.println("키가 180이상 또는 몸무게가 80이상인가? " + b6);
		
		// 참 거짓 뒤집기 : ~ 빼고 다  ok~ NOT
		// 31살만 아니면 괜찮다.
		boolean b7 = !(age == 31);
		System.out.println("31살만 아니면 괜찮다. " + b7);
		
		boolean meeting1 = height >= 180;
		System.out.println("키가 180이상이면 나갈수있을까? " + meeting1);
		
		boolean meeting2 = height >= 180 && age < 30;
		System.out.println("키 180이상 에 나이 20대 : " + meeting2);
		
		boolean meeting3 = age < 30 || weight < 70;
		System.out.println("나이 20대거나 몸무게 70미만 " + meeting3);
		
		boolean meeting4 = age >= 30 && height >= 180 && weight <= 80;
		System.out.println("모든 조건 일치? " + meeting4);
		
		//boolean meeting5 = age >= 30 && age < 40;
		boolean meeting5 = 30 <= age  && age < 40;
		System.out.println("나이 30대면 ok : " + meeting5);
		
		boolean meeting6 = (30 <= age && age < 40) || (180 <= height && height < 190);
		System.out.println("나이 30대거나 키가 180-190 " + meeting6);
	}
}
