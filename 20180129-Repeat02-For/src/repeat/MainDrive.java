package repeat;

public class MainDrive {
	public static void main(String[] args) {
		// Q1. Hello ����  5�� ���
		for(int i = 0; i < 5; i++){
			System.out.println("Hello " + i);
		}
		
		// Q2. 1~5���� ����ϴ� ���α׷�.
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			//i�� �߰�ȣ ���ο��� Ȱ���� �����ϴ�.
		}
		
		//Q3. 2,4,6,...10���� ���
		for(int i = 1; i <= 5; i++) {
			System.out.println(i*2);
			//��ȭ�ϴ� i���� ����ؾ��� �ݺ� ��������� ��Ģ ã�� ����.
		}
		
		//Q4. 1,3,5,7,19 (1���� 20������ Ȧ��)
		for(int i = 0; i <= 9; i++) {
			System.out.println(i*2 + 1);
		}
		System.out.println("------------");
		//Q5. 2,5,8,11,...20 (3�� ��� -1) ==> 3�� ���� �ϴϱ� ���� ����
		for(int i = 0; i < 7; i++ ) {
			System.out.println(i*3 + 2);
		}
		
		System.out.println("------------");
		//Q6. 2�� 1��? 2�� 2��? 4 2�� 10��? 1024 2�� 18��?
		int result = 1;
		for(int i = 0; i < 10; i++) {
			result = result * 2;
		}
		System.out.println(result);
	}
}
