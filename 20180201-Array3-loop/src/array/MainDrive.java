package array;

public class MainDrive {
	public static void main(String[] args) {
		//100ĭ ���� �迭����
		int[] num = new int[100];
		
		//1~100�� ����
		for(int i = 0; i< num.length; i++) {
			num[i] = i + 1;
		}
		
		//���
		for(int i = 0; i< num.length; i++) {
			System.out.println(num[i]);
		}
		
		// char �迭 �빮�� �ִٸ� �ҹ��ڷ� �ٲ��ֱ�
		// ASCII CODE Ȱ�� ����
		char[] letters = {'a','C','o','B'};
		for(int i = 0; i < letters.length; i++) {
			//�빮��?  = �ҹ��ڷ� ����
			if(65 <= letters[i] && letters[i] <= 90 ) {
				// A~Z�� �ҹ��ڷ� ��ȯ
				// �ҹ��ڴ� => �빮�� + 32
				letters[i] = (char)(letters[i] + 32);
				// 32 => ���� : int + letters[i] => ���� : char
				// �ٸ� �� ������ ������ ���ϸ� => �� ū �������� ���
				//(char)���� => ���ڸ� ������ char �������� ����.
				
				//������ ���� ��ȯ => ����ȯ => ĳ����(Casting)
				
			}
		}
		// �ҹ��ڷ� ��� �ٲ������ Ȯ��
		for(int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
		
		
		// �����͸� ������ �־���� ���� ���� => �ϳ��ϳ� ��鼭 Ȯ��. for + �迭
		
		// �迭 => 50,78,97,13,45,62,31
		// �ְ� ������ �����ΰ�?
		int max = 0; //�ִ밪�� �ϴ� �ſ� ���� ������ ���� �����.
		int maxIndex = 0;
		int[] findMaxArr = {50,78,97,13,45,62,31};
		for(int i = 0; i < findMaxArr.length; i++ ) {
			if(max < findMaxArr[i]) {
				max = findMaxArr[i]; // ���ݱ��� �� �ִ밪���� �� ū �ִ밪 �߰�!
				maxIndex = i;
			}
		}
		System.out.println("�ִ밪�� : "+ max + "���ĭ : "+ maxIndex);
		
		// ���� ������ ?
		// ���ĭ?
		int min = findMaxArr[0];
		int minIndex = 0;
		for(int i = 0; i < findMaxArr.length; i++) {
			if(findMaxArr[i] < min) {
				min = findMaxArr[i];
				minIndex = i;
			}
		}
		System.out.println("�ּҰ��� : "+ min + "���ĭ : "+ minIndex);
		
	}
	
}
