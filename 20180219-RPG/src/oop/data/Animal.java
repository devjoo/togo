package oop.data;

public class Animal {

// 이름, 나이, 성별, 키, 무게 => 속성
	String name;
	int age;
	boolean gender;
	
	public Animal() {
	}
	
	// 울다(bark)
	public void bark() {
		System.out.println("왈왈!");
	}
	
}
