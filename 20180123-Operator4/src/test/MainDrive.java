package test;

public class MainDrive {
	public static void main(String[] args) {
		String name = "������";
		int age = 28;
		double height = 190;
		double weight = 42;
		
		// ���̰� 31���ΰ�? => b1 ���� ��� ����
		
		boolean b1;
		b1 = (age == 31); //age �� ����ִ� ���� 31�� ������  true �ƴϸ� false
		System.out.println("31���ΰ�? " + b1);
		
		boolean b2;
		b2 = age != 31;
		System.out.println("31���� �ƴѰ�? " + b2);
		
		boolean b3 = height > 180;
		System.out.println("Ű�� 180���� ū��? " + b3);
		
		boolean b4 = height <= 180;
		System.out.println("Ű�� 180�����ΰ�? " + b4);
		
		boolean b5 = (height >= 180) && (weight >= 80);
		System.out.println("Ű�� 180�̻��̰� �����԰� 80�̻��ΰ�? " + b5);
		
		boolean b6 = (height >= 180) || (weight >= 80);
		System.out.println("Ű�� 180�̻� �Ǵ� �����԰� 80�̻��ΰ�? " + b6);
		
		// �� ���� ������ : ~ ���� ��  ok~ NOT
		// 31�츸 �ƴϸ� ������.
		boolean b7 = !(age == 31);
		System.out.println("31�츸 �ƴϸ� ������. " + b7);
		
		boolean meeting1 = height >= 180;
		System.out.println("Ű�� 180�̻��̸� ������������? " + meeting1);
		
		boolean meeting2 = height >= 180 && age < 30;
		System.out.println("Ű 180�̻� �� ���� 20�� : " + meeting2);
		
		boolean meeting3 = age < 30 || weight < 70;
		System.out.println("���� 20��ų� ������ 70�̸� " + meeting3);
		
		boolean meeting4 = age >= 30 && height >= 180 && weight <= 80;
		System.out.println("��� ���� ��ġ? " + meeting4);
		
		//boolean meeting5 = age >= 30 && age < 40;
		boolean meeting5 = 30 <= age  && age < 40;
		System.out.println("���� 30��� ok : " + meeting5);
		
		boolean meeting6 = (30 <= age && age < 40) || (180 <= height && height < 190);
		System.out.println("���� 30��ų� Ű�� 180-190 " + meeting6);
	}
}
