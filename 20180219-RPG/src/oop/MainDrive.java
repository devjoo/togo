package oop;

import oop.data.Cat;
import oop.data.Dog;
import oop.data.Elephant;
import oop.data.Lion;

public class MainDrive {
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Elephant e1 = new Elephant();
		Lion l1 = new Lion();
		Cat c1 = new Cat();
		l1.hunt();

		c1.bark();
		c1.befriend();
		c1.eatMeat();
		c1.hunt();
		
		d1.bark();
		e1.bark();
		
	}
}
