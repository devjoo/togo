package opt.data;

public class Lion extends Animal{
	public Lion() {
		// �θ� Ŭ������ �����ɶ� �ʿ�� �ϴ� ��Ḧ ����.
		super("���Է�");
	}

	@Override // �θ𿡰Լ� �������� �޼ҵ� ���� ���.
	// Annotation => ������̼�. JAVA ����� �ϳ�.
	void bark() {
		// TODO Auto-generated method stub
		//super.bark(); // �θ�(Animal)�� bark�� �״�� ����.
		//super : �θ�
		
		System.out.println("����");
	}
	
}
