package opt;

/*
 *   ��� ������ �������� ����,
 *   �������� ����.
 */

public class MainDrive {
	public static void main(String[] args) {
		// �ǿ����� (Operand)�� ���� �ΰ��� ���� ����
		int a = 10;
		int b = 3;

		int result; // ��� ������ ����

		result = a + b;
		System.out.println("a�� b�� �� : " + result);

		result = a * b;
		System.out.println("a�� b�� �� : " + result);

		result = a - b;
		System.out.println("a���� b�� ���� : " + result);

		result = a / b;
		System.out.println("a�� b�� ���� �� : " + result);

		result = a % b;
		System.out.println("a�� b�� ���� ������ : " + result);
		
		//ctrl + shift + f �� ���� ����Ű
	}
}
