package repeat;

public class MainDrive {
	public static void main(String[] args) {
		//1. break�� ��빮�� ����
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.out.println("5�� ������ ���");
				
				break;
				// �ݺ����� ���� ����
			}
		}
		
		// break ���� Ȱ�� ����
		// Ex. 123�� �Ҽ��ΰ�? �ƴ� 3������
		boolean isPrime = true; //�������� ��� ������ true����
		int divideNum = 0; //������������ ���� ���� 
		int inputNum = 123;
		
		for(int i = 2; i<inputNum; i++) {
			//2~122���� ��� ���ڸ� 123���� ������ 
			
			if(inputNum % i == 0) {
				isPrime = false;
				divideNum = i;
				
			}
			System.out.println("�Ҽ��ΰ�?" + isPrime);
			
			//isPrime�� true�� �ƴҶ� ����
			if(!isPrime) {
				System.out.println(divideNum + "���� ������");

				break;
			}
			// �Ҽ��� ã�� ���α׷� => �ӵ��� 2�� ���� ���
			// ����? Hint? 
		}
		
		//2. continue ���� ��� ���� ����
		// 1~20���� �� �� 3�� ����� ������ ��� ���� ���
		for(int i= 0; i < 20; i++) {
			if(i % 3 == 0) {
				continue;
				//3���� ������������ �� ������ �׳� ���
			}
			System.out.println(i);
		}
	}
}
