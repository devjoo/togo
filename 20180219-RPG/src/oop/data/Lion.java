package oop.data;

import oop.itf.Hunter;

public class Lion extends Animal implements Hunter{

	@Override
	public void hunt() {
		System.out.println("암사자만 사냥을 합니다");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eatMeat() {
		System.out.println("먹는건 같이 먹습니다.");
		// TODO Auto-generated method stub
		
	}
	
}
