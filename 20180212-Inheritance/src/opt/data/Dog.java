package opt.data;

public class Dog extends Animal {

	public Dog() {
		// �θ� Ŭ������ �����ɶ� �ʿ�� �ϴ� ��Ḧ ����.
		super("���Է�");
	}
	
	void run () {
		super.breath(); // �θ� ������ breath�� ����
		System.out.println("�ڴ�");
	}
	
	 @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		 
		 boolean result = false;
		 
		 Dog otherDog = (Dog) obj;
		 if(this.name.equals(otherDog.name)) {
			 result = true;
		 }else {
			 result = false;
		 }
		 
		 return result;
	}
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		 
		 String result = "";
		 result = "�� ���� �̸��� " + this.name + "�Դϴ�";
		 return result;
	}
	
}
