package opt;

public class Book {
	String title = "";
	int cost = 0;
	String authorName = "";
	
	// Q1. ������ 3����
	// - �ƹ� ������ ���� �ʴ� ���
	// - ���� �Է��� ��� title�� ����
	// - ����, ���, �۰��� => ���� ����
	
	public Book() {
		
	}
	
	public Book(String inputTitle) {
		title = inputTitle;
	}
	
	public Book(String inputTitle, int inputCost, String inputAuthor) {
		title = inputTitle;
		cost = inputCost;
		authorName = inputAuthor;
	}
	
}
