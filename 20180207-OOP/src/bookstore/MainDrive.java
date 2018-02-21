package bookstore;

public class MainDrive {
	public static void main(String[] args) {
		/*Book b1 = new Book();
		b1.title = "������ ���� �뷡";
		b1.availAge = 24;
		b1.cost = 10000;*/
		Book b1 = new Book("������ ���� �뷡",12,10000);
		
		People u1 = new People("ȫ�浿",990203,true);
		u1.currentMoney += 1000; //������ : 1000��
		
		//����ڰ� �ڽ� ������ ����ϴ� ���
		System.out.println("�� �̸��� " + u1.name + "�̰�, ���̴� " + u1.getMyAge() + "�Դϴ�.");
		//����ڸ� �θ� �� ����
		//�ι�° : �����2, 901101, ���� ����
		//����° : �����3, 991202, ���� ����
		People u2 = new People("������",841108,false);
		u2.currentMoney += 500;
		/*u2.name = "������";
		u2.birthday = 841108;
		u2.gender = false;*/
		
		u2.printUserInfo();
		
		People u3 = new People("������", 901101, false);
		u3.currentMoney += 5000000;//500���� ��
		
		People u4 = new People("user3", 990804, false);
		
		//��ҳ�(b1)�� �뿩�Ḧ 500�� �ø���.
		System.out.println("���� : " + b1.cost + "��");
		b1.increaseCost(500);
		System.out.println(b1.cost + "��");
		
		// �ι�° å ���� : ���󿡸�, 12��, 500��
		Book b2 = new Book("���󿡸�", 24, 500);
		
		//ù��° å ������ 300�� �߰� ����
		b2.increaseCost(300);
		System.out.println(b2.title + b2.cost);
		
		//ù��° ������� ��ҳ�� ����޸� �������ִ� ���
		System.out.println("��ҳ� ����? ù���" + u1.name + " : " + b1.isUserRentalOk(u1));
		System.out.println("���󿡸� ����? ù���" + u1.name + " : " + b2.isUserRentalOk(u1));
		
		b1.showBooksStatus();
		//��ҷθ� �����쿡�� �뿩�غ�����
		b1.rentBookToUser(u2);
		b1.showBooksStatus();
		//��ҳ븦 �ݳ� ����
		b1.returnBookToStore();
		
		//ù ����ڿ��� ���󿡸� �뿩
		b2.rentBookToUser(u1);
		b2.showBooksStatus();
		
		b2.showBooksStatus();
		//������(u3)�� ���󿡸�(b2)�� �������Դ�.
		b2.rentBookToUser(u3);
		b2.showBooksStatus();
		u3.printUserInfo();
		
	}
}
