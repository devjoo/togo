package exp;

/* 회원가입시 닉네임을 다루는 클래스
 * 제약조건 : fool이란 단어가 들어가면 안됨
 */

public class Test {
	
	//화면에 닉네임을 출력
	//만약에 fool이라는 단어가 포함되어 있다면
	//코드를 작성할때 애초에 고려해서 try / catch로 감싸줘야한다
	//라는 사실을 명시
	public void PrintNickname(String inputNick) throws FoolException{
		
		if(inputNick.contains("fool")) {
			throw new FoolException();
		}
		//만약 if문에 걸린다면, throw문을 만나므로
		//이 syso문을 실행되지 못함 => throw에서 메쏘드가 종료
		//throw는 마치 return과 비슷한 역할을 함.
		System.out.println("나 : " + inputNick);

	}
}
