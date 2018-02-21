package oop.data;

public class Fund {
	
	//Fund라는 클래스를 왜 만들었는지 설명을 달아둠.
	public static String classDescription = "Fund : 은행에서 취급하는 펀드에 대한 정보를 기록합니다.";
	
	
	// 펀드의 이름, 펀드의 모금액, 현재수익률(5.4%)
	// MainDrive : 해외비과세, 10만원, 3.2% f1변수
	// 화면에 이름 / 모금액 / 수익률 순서대로 출력.
	private String fundName;
	private int fundMount;
	private double fundPersent;
	// 코딩 중간에 새로운 변수를 추가.
	private User[] users;
	
	
	public static void showClassInfo() {
		System.out.println("이 클래스는 펀드 정보를 담고 있습니다.");
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
