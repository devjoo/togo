package oop.components;

/* �α��� ��� ȭ�� ���� 
 * Activity : �ȵ���̵� ���� ȭ�� �� ��Ƽ��Ƽ��� �θ�
 * */


//�α��� ȭ���� ��ư�� Ŭ���Ǹ� �����ϴ� ������ �ο�.
public class LoginActivity implements ClickEvent {

	public Button loginBtn;
	public Button searchBtn;
	
	public Button newsBtn;
	public Button emailBtn;
	
	//ȭ�� ���� �ʱ�ȭ ��� -> loginBtn searchBtn ��üȭ
	public void initActivity() {
		loginBtn = new Button();
		searchBtn = new Button();
		newsBtn = new Button();
		emailBtn= new Button();
		
		//�α��� ��ư, ��ġ ��ư�� ǥ�ù��� ����
		loginBtn.setText("�α���");
		searchBtn.setText("�˻�");
		newsBtn.setText("����");
		emailBtn.setText("����");
		
		//�α��� ��ư�� ������ ���� ó�����ٰ� ����
		loginBtn.setOnClickEventer(this);
		//�˻� ��ư�� ������ ���� ó���Ѵ�. ����
		searchBtn.setOnClickEventer(this);
		
		newsBtn.setOnClickEventer(new ClickEvent() {
			//���� ��ư���� ���� 
			@Override
			public void doSomthing(Button b) {
				System.out.println("���� ��ư ����!");
			}
		});
		
		emailBtn.setOnClickEventer(new ClickEvent() {
			@Override
			public void doSomthing(Button b) {
				System.out.println("email ȭ�� �̵�!");
			}
		});
		
		//Q1. �α��� ��ư�� ������ ���. 
		loginBtn.showBtnInfo();
	}
	
	@Override
	public void doSomthing(Button b) {
		
		if(b.getText().equals("�α���")) {
			System.out.println("�α��� ȭ������ �̵���!");
		}else if(b.getText().equals("�˻�")) {
			System.out.println("�˻� ȭ������ �̵���!");
		}
		
	}
	
}