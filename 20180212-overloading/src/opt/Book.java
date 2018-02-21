package opt;

public class Book {
	String title = "";
	int cost = 0;
	String authorName = "";
	
	// Q1. 생성자 3가지
	// - 아무 정보도 주지 않는 경우
	// - 제목만 입력할 경우 title에 대입
	// - 제목, 비용, 작가면 => 각각 대입
	
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
