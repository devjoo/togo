package oop.data;

public class Fund {
	
	//Fund��� Ŭ������ �� ��������� ������ �޾Ƶ�.
	public static String classDescription = "Fund : ���࿡�� ����ϴ� �ݵ忡 ���� ������ ����մϴ�.";
	
	
	// �ݵ��� �̸�, �ݵ��� ��ݾ�, ������ͷ�(5.4%)
	// MainDrive : �ؿܺ����, 10����, 3.2% f1����
	// ȭ�鿡 �̸� / ��ݾ� / ���ͷ� ������� ���.
	private String fundName;
	private int fundMount;
	private double fundPersent;
	// �ڵ� �߰��� ���ο� ������ �߰�.
	private User[] users;
	
	
	public static void showClassInfo() {
		System.out.println("�� Ŭ������ �ݵ� ������ ��� �ֽ��ϴ�.");
	}
	
	public User[] getUsers() {
		return users;
	}



	public void setUsers(User[] users) {
		this.users = users;
	}



	public String getFundName() {
		return fundName;
	}



	public void setFundName(String fundName) {
		this.fundName = fundName;
	}



	public int getFundMount() {
		return fundMount;
	}



	public void setFundMount(int fundMount) {
		this.fundMount = fundMount;
	}



	public double getFundPersent() {
		return fundPersent;
	}



	public void setFundPersent(double fundPersent) {
		this.fundPersent = fundPersent;
	}
	
	
}
