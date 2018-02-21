package oop.data;

/* ���� ����
 * 1. ����ڿ� ���õ� ������ �� ���� �ٷ�� Ŭ����
 */

public class User {

	//������� �Ӽ� => private, public���� getter / setter
	private int id = 0; //������� ���� ��ȣ.
	private String name = null; //�̸��� ����� ����
	private String phoneNum = null; //���� ���� ����
	private String memo = null; //�޸�
	

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public User() {
		super();
	}
	public User(int id, String name, String phoneNum, String memo) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNum = phoneNum;
		this.memo = memo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	
}