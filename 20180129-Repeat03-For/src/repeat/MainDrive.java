package repeat;

public class MainDrive {
	public static void main(String[] args) {
		// for�� ������ ������ ����. 
		
		// Q1. 1~10���� ������ 3�� ����� ��� ȭ�鿡 ���
		for(int i = 1; i <= 10; i++ ) {
			//i�� �ݺ������� ������Ű�鼭 �Ź� ���� �ϴ� ȿ��,
			//for �߰�ȣ ���ο� if ���
			if(i % 3 == 0) {
				System.out.println(i);
			}else if(i % 3 == 1) {
				System.out.println("��������" + i);
			}else {
				System.out.println("�������� ~: " + i);
			}
		}
		
		//Q1. 1~10���� ¦���� ¦���Դϴ�. Ȧ���� �׳� ���ڸ� ���
		for(int i = 1; i <= 10; i++) {
			if( i % 2 == 0) {
				System.out.println("¦���Դϴ�.");
			}else {
				System.out.println(i);
			}
		}
		
		//Q2. 1~50���� ������ 3�� 5�� ����� ���
		// : �����. 3�� 5�� ���ÿ� �������°�
		System.out.println("3,5�� ����� ���");
		for(int i = 1; i <= 50; i++) {
			if(i % 3 == 0 && i % 5 ==0) {
				System.out.println(i);
			}
		}
		
		//���� �ݺ��� : ������������� ���길 ��� > ����� ����� ȭ�鿡 ���
		
		//Q1. 1~10 ���� ��? 55
		int result = 0; // ������ ������� ���� 0 ���� �ʱ�ȭ �����Ѵ�.
		for(int i = 1; i <= 10; i++) {
			result = result + i;
		}
		System.out.println("1~10 ���� ��? " + result);
		
		//1~10���� ������ ��?
		int result2 = 1; // ������ ������� ���� 1�� �ʱ�ȭ �����Ѵ�.
		for(int i = 1; i <= 10; i++) {
			result2 = result2 * i;
		}
		System.out.println(result2);
		
		// �ζ� 1� ��÷�� Ȯ���� ���ϱ��?
		// �ζǸ� �̴� ��� ����� ��?
		// 6C45 =? (45*44*43*42*41*40) / ( 6* ~ *1 )
		// Ȯ��? 1) ����� / 2)����� => 800������ 1
		long loto = 1; //45~40 ��
		long temp2 = 1; // 6~1 ��
		for(int i = 45; i >= 40; i--) {
			loto = loto * i;
		}
		for(int i = 6; i >= 1; i--){
			temp2 = temp2 * i;
		}
		
		long lottoResult = loto / temp2;
		System.out.println("�� ����� �� : " + lottoResult);
		System.out.println("��÷Ȯ�� : 1/" + lottoResult);
		
		//�ζ� �ùķ����� => 10�� �ζ�
		//1�� 50��, 2�� 5õ��, ...5�� 5õ��
		//10���� ��ƺξ����� �󸶸� ���°�?
		
		
		// ���� 3. �Ҽ� �Ǻ���.
		// 2,3,5,7,...,23 => 125621
		
		// �Ҽ��ΰ� �ƴѰ�? 2~125620������ ��� ���ڸ� ������ 
		// �ϳ��� �����������ٸ� �Ҽ��� �ƴ�.
		// �ϳ��� ���� �������� ��찡 ����߸� �Ҽ�.
		int okNum = 0; //������������ ���ڸ� ����
		boolean isPrimeNum = true; // �ϴ� �Ҽ��� �´ٰ� �����ϰ� ���
		for(int i = 2; i < 125620; i++) {
			if(125620 % i == 0) {
				isPrimeNum = false;
				okNum = i;
			}
			
		}
		System.out.println("125620�� �Ҽ��ΰ� ? " + isPrimeNum);
		if(isPrimeNum == false) {
			System.out.println(okNum + "���� ��������");
		}
		
	}
}
