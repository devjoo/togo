package var;

public class MainDrive {
	public static void main(String[] args) {
		int a; // ���� : ���� 1�� ���� 
		int b;
		
		a = 3;
		b = 5;
		a = 10;
		
		int result;
		
		result = a; // ������ �ִ� ���� �������� ����.
		
		result = a = b;
		
		//ctrl + f11 ����
		System.out.println("a : " + a);
		System.out.println("result : " + result);
	}
}
