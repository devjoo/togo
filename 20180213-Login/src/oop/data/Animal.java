package oop.data;

/*
 * Animal클래스는 추상화 됨
 * 실제 객체화를 못하도록 금지
 * 현실세계에는  Animal이라는 생명체는 출현 할 수 없음
 */

public abstract class Animal {
	
	public double weight;
	public double height;
	
	public abstract void bark();
	
}
