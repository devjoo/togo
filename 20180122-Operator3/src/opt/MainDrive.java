package opt;

/*
 * ������ ��� ���� + ����
 */

public class MainDrive {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		
		int result;
		
		result = i1 + i2 + i3;
		System.out.println(result);
		
		result = i1 + i2 - i3;
		System.out.println(result);
		
		result = i1 + i2 * i3;
		System.out.println(result);
		
		result = (i1 + i2) * i3;
		System.out.println(result);
		
		//3�� ���� c1 c2 c3 �� ���
		int c1 = 3;
		int c2 = 6;
		int c3 = 12;
		
		int resultC = (c1 + c2 + c3) / 3;
		System.out.println("resultC : " + resultC);
		
		
		//ö���� 10,20�� ��� ����� 40,30 ��ǥ�� ��� ���� �������� ������ ��ġ
		int[] ch = new int[] {10,20};
		int[] yh = new int[] {40,30};
	
		int result1 = (ch[0] + yh[0]) / 2;
		int result2 = (ch[1] + yh[1]) / 2;
		
		System.out.println("�߰� ��ǥ : " + result1 + "," + result2);
		
		//�ﰢ���� ���� 
		// ���� : 20 ���� : 10 �ﰢ���� ���̴� ��? 
		
		int width = 20;
		int height = 10;
		
		int result4 = width * height / 2;
		
		System.out.println(result4);
		
		// String �� ������ �����ϴ� �����ε� 
		// String ������ �ٸ� ��������� ��� �Ұ��� �ѵ� + �� ���� ����
	}
}
