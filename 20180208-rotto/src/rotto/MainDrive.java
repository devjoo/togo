package rotto;

public class MainDrive {
	public static void main(String[] args) {
		//�ζ� ��÷ ��ȣ�� ����� �迭
		int[] okLottoNumbers = new int[6];
		
		//6���� ���ڰ� ���ߵɶ����� �ݺ�
		for (int i = 0; i < 6 ; i++) {
			while (true) {
				//1~45�� ���� ����. => 45.9999 => intĳ���� : 45
				int num = (int) (Math.random() * 46);
				
				// ��÷��ȣ�� �̹� �����ִ°�? ��� ����
				// �ϴ� �ƴϴ� ��� ����.
				boolean isDuplNum = false;
				for(int j = 0; j < 6; j++) {
					if(okLottoNumbers[j] == num) {
						//��÷��ȣ�� �ϳ��� ���� ���� ��ȣ�� ����.
						//���� ���� ��ȣ�� �ߺ��̴�!
						isDuplNum = true;
					}
				}
				
				//�ߺ��� �ƴ϶�� Ȯ���Ǹ� && 0�� �ƴ϶��
				if(!isDuplNum && num != 0) {
					//���ڸ� ��÷��ȣ�� ����
					okLottoNumbers[i] = num;
					//while���� �������� ���� ���ڸ� ������ �Ѿ.
					break;
				}
				
				System.out.println(num);
			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(okLottoNumbers[i]);
		}
	}
}
