package oop;

public class MainDrive {
	public static void main(String[] args) {
		
		String s = "�ȳ��ϼ���. �����Դϴ�";
		System.out.println(s);
		
		//s�� ����� ���� ���� �ΰ�? �´ٸ� ok �ƴϸ� not
		if(s.equals("����")) {
			System.out.println("Ok");
		}else {
			System.out.println("not Ok");
		}
		
		//s�� ����� 2��° ���ڴ� �����ΰ�?
		System.out.println(s.charAt(1));
		
		//s�� �����?
		System.out.println(s.length() + "����");
	}
}
