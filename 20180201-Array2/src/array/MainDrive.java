package array;

public class MainDrive {
	public static void main(String[] args) {
		int[] studentRanks = {5,2,3,4,1,6,3,4,1,6,3,4,1,6};
		
		//��� �л�?
		System.out.println(studentRanks.length);
		
		// �ݺ����� �̿��ؼ� ���� Ȱ��, length , index�� ���� Ȱ��
		for(int i = 0; i < studentRanks.length; i++) {
			//���� �� �� ������ ���� 1���� ����
			if(studentRanks[i] == 1) {
				System.out.println(i+"�� �л��� 1��");
				break;
			}
		}
		
		//Q1. 1~5���� ���ڰ� ����ִ� �迭 array�� ������.
		//Q2. array �?������
		// �ι�°ĭ � ��?
		// ���� ����ִ� ��� �����
		// - ���� ����ִ� ��� Ȧ�� ���
		// - ���� �ִ� ���� 0,10,20,30,40���� ��ü
		int[] numArray = {1,2,3,4,5};
		System.out.println(numArray.length + "�� - numArray");
		for(int i = 0; i < numArray.length; i++) {
			System.out.println("numArray["+ i + "] : " + numArray[i]);
		}
		System.out.println("Ȧ�� ��� ���� : --------------");
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] % 2 == 1) {
				System.out.println("numArray["+ i + "] : " + numArray[i]);
			}
		}
		System.out.println("ġȯ ���� : --------------");
		int[] numArray2 = {0,10,20,30,40};
		for(int i = 0; i < numArray.length; i++) {
			//numArray[i] = numArray2[i];
			numArray[i] = i * 10;
		}
		System.out.println("��� : ---------------");
		for(int i = 0; i < numArray.length; i++) {
			System.out.println("numArray["+ i + "] : " + numArray[i]);
		}
		
		// Exception
		// �ڵ带 �ۼ��ϴ� �ܰ迡���� �ľ��Ҽ� ���� ����
		// ������ ���� ���� ĭ ���� ������ ����
		// ������ �� ���¿����� �߻��ϴ� ���� =>  Exception (Runtime Error)
		// �迭�� �ٷ궧�� �ݵ�� ������ ũ�⺸�� �� ū  index�� ����ϴ� ���� X
		
		// �迭 1) ��ü ���� 2)Exception ����
		// ������ ����� �а� Ȱ��
		// Spring �����ߵ��� => java������ �߱�
		
		//����ġ ���� ������ �߻��Ͽ� ���� ���� => Exception
		
		
		
		
	}
}
