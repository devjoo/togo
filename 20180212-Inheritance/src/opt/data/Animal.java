package opt.data;

/*
 * ��� ������ ���������� ���� ���, �Ӽ��� ��Ƶ�
 * �����̶�� ���� ���� ����
 * �� Ŭ������ ��ӹ޴� ��� �ڽ� Ŭ������ 
 * �̸� / ���� / ���� / Ű / ������, ��� �޽�带 �⺻������ ���Ե�.
 * �⺻������ : �ڵ����� �ʾƵ�
 */

public class Animal extends LivingThings {
	// �̸�, ����, ����, Ű, ���� => �Ӽ�
	String name;
	int age;
	boolean gender;
	
	public Animal(String inputName) {
		this.name = inputName;
	}
	
	// ���(bark)
	void bark() {
		System.out.println("�п�!");
	}
	
	@Override
	void breath() {
		// TODO Auto-generated method stub
		//super.breath();
		System.out.println("�޿��");
	}
}
