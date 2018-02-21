package opt.data;

/*
 * 모든 동물이 공통적으로 갖는 기능, 속성을 모아둔
 * 동물이라는 상위 개념 정의
 * 이 클래스를 상속받는 모든 자식 클래스는 
 * 이름 / 나이 / 성별 / 키 / 몸무게, 울다 메쏘드를 기본적으로 갖게됨.
 * 기본적으로 : 코딩하지 않아도
 */

public class Animal extends LivingThings {
	// 이름, 나이, 성별, 키, 무게 => 속성
	String name;
	int age;
	boolean gender;
	
	public Animal(String inputName) {
		this.name = inputName;
	}
	
	// 울다(bark)
	void bark() {
		System.out.println("왈왈!");
	}
	
	@Override
	void breath() {
		// TODO Auto-generated method stub
		//super.breath();
		System.out.println("휴우우");
	}
}
