package oop.data;

import oop.itf.Hunter;
import oop.itf.Pet;

public class Cat extends Animal implements Hunter, Pet{

	@Override
	public void befriend() {
		System.out.println("고양이가 놀아달라고 합니다");
	}

	@Override
	public void hunt() {
		System.out.println("고양이가 쥐를 사냥합니다");
	}

	@Override
	public void eatMeat() {
		System.out.println("고양이가 사료를 먹습니다");
	}

}
