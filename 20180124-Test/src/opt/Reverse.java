package opt;

public class Reverse {
	public static void main(String[] args) {
		int a = 50;
		int b = 7;
		
		int temp = a;
		
		a = b;
		b = temp;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}
