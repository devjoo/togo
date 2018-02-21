package oop.components;

public class Button {

	private String text;

	//Ŭ�� �̺�Ʈ �������̽� ������ ����
	private ClickEvent onClickEvent;
	
	public ClickEvent getCe() {
		return onClickEvent;
	}

	public void setOnClickEventer(ClickEvent ce) {
		this.onClickEvent = ce;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	//Ŭ�� �̺�Ʈ => Ŭ���ϸ� ����Ǵ� ���
	public void performClick() {
		//Q1. �α��� ��ư�� ������? => ���� ȭ�� �̵�
		
		//Q2. �˻� ��ư�� ������? => �˻� ��� �̵�
		
		// �� ��ư�� ���ȴٴ� �͸� ����
		onClickEvent.doSomthing(this);
	}
	
	public void showBtnInfo() {
		System.out.println("��ư ���� ���");
	}
}