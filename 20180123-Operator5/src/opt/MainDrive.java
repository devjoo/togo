package opt;

public class MainDrive {
	public static void main(String[] args) {
		// �ڵ��� �Ѵ� ���  : 11����
		// ��Ⱚ �Ѵ� : 4����
		// ��� ������ : 40����
		// �� ������ ��뷮 : 5.7 �Ⱑ
		
		int monthPay = 110000;
		int monthDevicePay = 40000;
		int useMonths = 40;
		double dataUseAmount = 5.7;
		
		// Q1.2�� ������ �����°�?
		boolean result1 = (useMonths / 12) >= 2;
		System.out.println("Q1. 2�� ������ �����°�? " + result1);
		
		// Q2. �Ѵ� 10���� �̻����ϰ� 3���̻� ����� ����� VIP ���� VIP �Դϱ�?
		boolean result2 = (useMonths / 12) >= 3 && monthPay >= 100000;
		System.out.println("Q2. ���� VIP �Դϱ�? " + result2);
				
		// Q3. �ڵ��� �����̷� ��Ż� ������ �� �ݾ�?
		// ��Ⱚ�� ����(2��)�� ������ ���̻� ���� ����
		int allPay = (useMonths - 24) * monthPay + 24 * (monthPay + monthDevicePay);
		System.out.println("Q3. �ڵ��� �����̷� ��Ż� ������ �� �ݾ�? " + allPay);
		
	}
}
