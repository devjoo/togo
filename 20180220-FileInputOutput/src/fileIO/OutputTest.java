package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputTest {

	public void testOutput() {
		//파일 저장 기능을 작성
		String inputStr = "이지우,841108,여성,7년차";
		String inputStr2 = "A사용자,841108,여성,7년차";
		String inputStr3 = "B사용자,841108,여성,7년차";
		
		//try문 안에 넣기 편하게 하려고 변수 생성 단은 null로 처리
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//저장될 파일의 이름은 outputFile.txt로 저장
			//예외 발생? => 만약 파일을 저장하다가 끊긴다던지
			fw = new FileWriter("C:\\Users\\Administrator\\leejiwoo\\@temp\\outputFile.csv");
			//fw를 통해 파일을 저장하는 것을 보조하는 bw
			//버퍼하는 곳에 데이터를 모아서 한번에 저장 => 한줄씩
			//이렇게 하지 않으면, 한글자 한글자 저장.
			bw = new BufferedWriter(fw); // 어떤 파일라이터를 보조할 것인지 명시
			
			//inputStr에 저장된 문장을 bw를 통해
			//bw => fw를 통해서 outputFile.txt로 저장
			bw.write(inputStr);
			
			//내용을 적고나서 파일의 줄바꿈 => 다음줄로 이동
			bw.newLine();
			
			//줄을 바꾸고 나서 두번째 사용자를 기록
			bw.write(inputStr2);
			
			//내용을 적고나서 파일의 줄바꿈 => 다음줄로 이동
			bw.newLine();
			
			//줄을 바꾸고 나서 두번째 사용자를 기록
			bw.write(inputStr3);
			
			//파일을 다 기록했다면, fw와 bw를 닫아줘야함.
			//나중에 연 변수를 먼저 닫는다.
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("파일이 저장1되었습니다.");
	}
	
	
}
