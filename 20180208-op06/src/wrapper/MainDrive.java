package wrapper;

public class MainDrive {
	public static void main(String[] args) {
		
		// ���� / Ŭ���� => .�� ���� ���Ȱ���� ���̰� ����.
		
		String s = "������";
		
		int a = 10;
		//a. => Ŭ������ �ƴ϶� �ƹ��ϵ� ����..�̤�
		
		Integer i = 10;
		
		boolean b = true;
		Boolean b2 = true;
		
		//������ ���ڸ� String ���¿� ����
		String birthday ="881020";
		
		//Q. �� ����� ���̴� ���?
		
		// birthday�� int�� ��ȯ �ʿ���
		int tempBirthDay = Integer.parseInt(birthday);
		// Wrapper Ŭ������ ���� �������
		// String�� ������ �������·� ��ȯ�ϴ� ����� ����.
		
		// String -> int Integer.parseInt(str);
		// String -> double Double.parseDouble(str);
		int birthYear = tempBirthDay / 10000 + 1900;
		System.out.println(birthYear + "����̴�.");
		
		String height = "185.7";
		
		//�ΰ��� ������ �̿��Ͽ� ǥ��ü�� ���.
		//���� : (Ű - 100) * 0.9
		double dh = Double.parseDouble(height);
		double result = (dh - 100) * 0.9;
	
		System.out.println(result);
	}
}
