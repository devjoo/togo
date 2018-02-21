package oop.data;

import oop.itf.Hunter;
import oop.itf.Pet;

public class Cat extends Animal implements Hunter, Pet{

	@Override
	public void befriend() {
		System.out.println("�����̰� ��ƴ޶�� �մϴ�");
	}

	@Override
	public void hunt() {
		System.out.println("�����̰� �㸦 ����մϴ�");
	}

	@Override
	public void eatMeat() {
		System.out.println("�����̰� ��Ḧ �Խ��ϴ�");
	}

}