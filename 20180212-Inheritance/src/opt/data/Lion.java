package opt.data;

public class Lion extends Animal{
	public Lion() {
		// 부모 클래스가 생성될때 필요로 하는 재료를 삽입.
		super("미입력");
	}

	@Override // 부모에게서 물려받은 메소드 임을 명시.
	// Annotation => 어노테이션. JAVA 기능중 하나.
	void bark() {
		// TODO Auto-generated method stub
		//super.bark(); // 부모(Animal)의 bark를 그대로 실행.
		//super : 부모
		
		System.out.println("어흥");
	}
	
}
