package repeat;

public class MainDrive {
	public static void main(String[] args) {
		
		//Q1. ������ 2�� ��� : 
		for(int i = 1; i < 10; i++) {
			System.out.println("2 x " + i + " = " + 2 * i);
		}
		
		System.out.println("\n 2�ܿ��� 9��");
		//Q1. ������ 2~9�� ��� : 
		//õõ�� ���� �ݺ��� �� �ѿ�(����) �ۼ� (�ܼ�)
		for(int i = 2; i < 10; i++) {
			System.out.println("----------------------------");
			// �������� ���� �ݺ��� �� ���ʿ�(���߿�) �ۼ�
			for(int j = 1; j < 10; j++) {
				System.out.println( i + " x " + j + " = " + (i * j));	
			}
		}
		
		// �����ٷ� ���
		String result = "";
		for(int i = 1; i < 10; i++) {
			// �������� ���� �ݺ��� �� ���ʿ�(���߿�) �ۼ�
			for(int j = 1; j < 10; j++) {
				result += i + " x " + j + " = " + (i * j) + " | ";	
			}
			System.out.println(result);	
			result = "";
		}
		
		//�����
		//�ﰢ��, ���ﰢ�� , �ﰢ�� ������ ����
		String star = "";
		for(int i = 0; i < 5; i++) {
			star += "*";
			System.out.println(star);
		}
		
		System.out.println("����� - ���簢��");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("����� - �ﰢ�� �⺻");
		for(int i = 0; i < 5; i++) { // ����
			for(int j = 0; j <= i; j++) { //����
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("����� - �ﰢ�� ����");
		for(int i = 5; i > 0; i--) { // ����
			for(int j = 0; j < i; j++) { //����
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("����� - �ﰢ�� 10��");
		for(int i = 0; i < 10; i++) { // ����
			for(int j = 0; j <= i; j++) { //����
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("����� - �ﰢ�� ���� ����");
		for(int i = 5; i > 0; i--) { // ����
			for(int j = 1; j <= 5; j++) { //����
				if(i > j) {
					System.out.print(" ");
				}else {
					System.out.print("*");	
				}
			}
			System.out.println("");
		}
		
		System.out.println("����� - �ﰢ�� ���� ���� ������");
		for(int i = 0; i < 5; i++) { // ����
			for(int j = 0; j < 4 - i; j++) { //���� ����
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) { //���� ��
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("����� - 5/4/3/2/1");
		//��
		
	}
}
