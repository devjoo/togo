package exp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
 * 예외가 발생하는 대표적인 상황들을 코딩
 * 발생한 예외를 어떻게 처리하는지 문법
 */

public class MainDrive {

	public static void main(String[] args) {
		
		// Case 1. 배열의 없는 칸에 접근하려 하는 경우
		// ArrayIndexOutOfBoundsException
		
		// ♬사실 제대로 코딩을 하면 발생할 일이 없로 없는 예외
		
		// 배열 인덱스가 범위 밖인 예외 => 그런 칸 없다.
		
		// 예외 발생 시점 : i가 6일때 lottoArray[6] 접근.
		
		int[] lottoArray = new int[6];
		
		//예외가 발생할 수 있음을 미리 감지하고 try로 감싸줌
		//try로 감싸준 구문은 반드시 예외 처리를 해야함
		//예외 처리 : 실제로 Exeption이 발생하면 어떻게? => catch
		try {
			//for(int i = 0; i < 10; i++) {
			for(int i = 0; i < 10; i++) {
				lottoArray[i] = i * 2;
				
				System.out.println(lottoArray[i]);
			}
		}
		catch(Exception e){
			// try 블록 내부를 실행하다가 에러가 발생했을때만 실행.
			// 에러가 발생하면 어떻게 대처할지 알려줌
			// => 프로그램이 뻗지 않고 다음 코드를 진행 할 수 있게됨
			e.printStackTrace();
			System.out.println("배열에 문제 발생!");
		}
		
		System.out.println("값이 모두 들어갔습니다");
		
		
		
		/*
		 * Case2. 메모장에서 작성한 파일 불러오기
		 * => 아무것도 작성하지 않은 상태에서 불러오기
		 * 파일을 찾을 수 없다는 예외 발생.
		 */
		// 없는 파일명 .txt를 [찾아서] br에 저장.
		// => 찾아서 : 없을 수도 있다
		// 항상 파일이 없을 가능성 => 항상 위험성 따르는 일
		// 이클립스가 위험하다고 감지하고 try 안쓰면 에러 발생
		try {
			BufferedReader br = new BufferedReader(new FileReader("없는 파일명"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("파일을 찾아봤습니다.");
		
		
		/*
		 *  Case3. 숫자를 0으로 나눌때
		 *  => 나눗셈은 분모가 0이면 오류.
		 */
		//어떤 수의 연산 결과를 가지고 나눗셈을 하려 할때.
		//Ex. int result = a / ( b - c )
		//    b - c는 상황에 따라 0일수도 아닐수도 있다.
		try {
			int c = 4 / 0;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("숫자를 나누는데 문제 발생!");
		}
		
		/*
		 * Case2. : 심화
		 */
		//메모장 파일을 실행하려고 하는 경우 => 파일을 못찾는 예외
		// => Ex. 찾긴 찾았는데, 깨져서 읽을 수 없는 경우
		// 1개의 try에서 두개의 위험성 => catch를 두개
		try {
			BufferedReader br2 = new BufferedReader(new FileReader("없는파일명.txt"));
			br2.readLine(); //찾아낸 파일을 한줄 읽기
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 깨진듯");
//			e.printStackTrace();
		}
		
		// e.printStackTrace() : catch문을 이클립스가 자동으로 만들어주면 자동으로 작성되는 코드
		// 역할 : 예외의 정보를 콘솔에 빨간 글씨로 출력
		// 예외의 정보? => 빨간 글씨를 자세히 보면 어떤 종류의 문제인지 어떤코드를 실행하다가
		// 발생한 예외인지를 알려줌 => 바로 문제가 되는 코드를 탐색
		
		Test t1 = new Test();
		
		try {
			t1.PrintNickname("fool 임시닉네임");
		} catch (FoolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
