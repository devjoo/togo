package array;

public class MainDrive {
	public static void main(String[] args) {
		//�迭�� ����� �ʱ�ȭ ����
		int[] intArray01; //1. ���� ����� ������ �迭Ÿ������ ���
		int intArray02[]; //2. ����Ÿ�� ���� -> ������ �迭
		
		int[] intArray03;
		double[] doubleArray01;
		float[] floatArray01;
		char[] charArray01; // �������� ���� ���ĺ� �����.
		String[] stringArray01;
		
		int[] intArray = new int[5];
		
		int[] intArray2 = {10,20,30};
		
		intArray2[0] = 12;
		
		//Q1. 1~5������ ����(5��)�� ����� �迭 arr02������
		//Q2. ���� 10���� ������ �� �ִ� �迭 arr03
		//Q3. arr02 3��° ĭ�� ���� 10�� ����
		//Q4. arr03�� 5��° ĭ�� ���� 5����
		//Q5. arr02 ù���� ����ִ� ���ڴ�?
		//Q6. arr03�� 9�� ĭ�� ����ִ� ���ڴ�?
		
		int[] arr02 = {1,2,3,4,5};
		int[] arr03 = new int[10];
		arr02[2] = 10;
		arr03[4] = 5;
		System.out.println(arr02[0]);
		System.out.println(arr03[9]);
		
		System.out.println(arr02.length);
		
		
	}
}
