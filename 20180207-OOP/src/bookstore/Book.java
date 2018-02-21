package bookstore;

public class Book {
	String title;
	int availAge; //??�� �̿밡
	int cost; //�뿩��
	People currentRentalUser = null; // null :: �����Ͱ� ����. 
	
	public Book(String title, int availAge, int cost) {
		super();
		this.title = title;
		this.availAge = availAge;
		this.cost = cost; //�뿩��
	}
	
	void increaseCost(int incCost) {
		//�λ�� �ݾ� : �Ű�����
		cost += incCost;
	}
	
	boolean isUserRentalOk(People inputUser) {
		boolean result = false;
		//å�� ������ �Ǵ��� �ƴ��� �Ǵ��ؼ�  result�� ����.
		//������� ���̿� ���� �޶����� �Ǵ�
		//����ڰ� 10��, å�� 15��? �ȵ�
		//����ڰ� 25��, å�� 15��? ��
		
		if(inputUser.getMyAge() >= availAge) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	
	void rentBookToUser(People rentUser) {
		//rentUser : å�� ������ ���.
		
		//�ϴ� å�� ������ �ֳ�?
		//=> ������ ����� ����. Ȯ��
		if(currentRentalUser == null) {
			//���� ������ ������»���
			System.out.println("å ready");
			
			if(isUserRentalOk(rentUser)) {
				//�����൵ ������. (����)
				//������� �����ݿ��� �뿩�� ��ŭ�� ����.
				//������:3000�� => 1000�� å => 2000
				
				if(rentUser.currentMoney >= cost) {
					//�뿩�� �̻��� ���� ���� �մ�.
					//���̵� ������ ���� ������ �뿩 Ok
					rentUser.currentMoney -= cost;
					currentRentalUser = rentUser; //��å�� ���� ������ ����� ���
					
					System.out.println(rentUser.name + " " + title + "�뿩 ����");
					//�� å�� �뿩�� : ������ ���  rentUser�� ���(�����)
				}else {
					System.out.println("�ܾ� ���� �뿩 �Ұ�!!");
				}
			
			}else {
				System.out.println(rentUser.name + "�� ���̰� � " + title + "�� �뿩�Ұ�!!!");
			}
		}else {
			//�̹� ������ å
			System.out.println("å�� ������ �����ϴ�.");
		}
		
		
	}
	
	void returnBookToStore() {
		//������ ��� ���� �߰� ��� �ʿ� X
		currentRentalUser = null;
		//������ ����� ���ٰ� ���
	}
	
	//å�� ���� ���¸� ��� ���� ��� ������
	void showBooksStatus() {
		System.out.println(title + "");
		System.out.println("=======�����������=======");
		System.out.println("���� : " + title);
		System.out.println("���ɰ� : " + availAge + "�� �̿밡");
		
		if(currentRentalUser == null) {
			System.out.println("�뿩 ���� : �뿩 �ȵ�.");
		}else {
			System.out.println("�뿩 ���� : ����� ����");
			System.out.println(currentRentalUser.name + "�� ���������ϴ�.");
		}
	}
	
	
}
