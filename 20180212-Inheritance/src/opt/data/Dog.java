package opt.data;

public class Dog extends Animal {

	public Dog() {
		// 부모 클래스가 생성될때 필요로 하는 재료를 삽입.
		super("미입력");
	}
	
	void run () {
		super.breath(); // 부모가 물려준 breath를 실행
		System.out.println("뛴다");
	}
	
	 @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		 
		 boolean result = false;
		 
		 Dog otherDog = (Dog) obj;
		 if(this.name.equals(otherDog.name)) {
			 result = true;
		 }else {
			 result = false;
		 }
		 
		 return result;
	}
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		 
		 String result = "";
		 result = "이 개의 이름은 " + this.name + "입니다";
		 return result;
	}
	
}
