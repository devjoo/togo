package oop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import oop.data.User;

public class MainDrive {

	public static void main(String[] args) {
		
//		User[] phoneBookUsers = new User[10]; //사용자 목록을 저장할 사용자 배열 10칸 까지 지원
		ArrayList<User> phoneBookUsers = new ArrayList<User>();
		
		//=== 메뉴 입력===
		
		int inputMenuNum = -1; //아무것도 입력되지 않은 상태
		Scanner scan = new Scanner(System.in);
		
		//특정 상황 (0이 입력)이 될때까지 무한정 반복
		//무한 반복을 일단 걸고, 0이 입력되면 탈출
		//=> while 반복문 탈출 => break;
		while(true) {
			//Q1. 메뉴를 출력하고, 선택지를 입력받아 잘못된 입력일 경우에 대한 대처.
			//	  => 다시 메뉴를 출력, 재입력 (다시 => 반복 입력)
			
			//Q2.  0 번을 누르면 프로그램을 종료.
			System.out.println("메뉴 선택");
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전체 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------");
			System.out.println("번호 입력 : ");
			
			//메뉴 출력을 마친 후에 정수 입력
			inputMenuNum = scan.nextInt();
			
			//Q3. 전화번호를 추가하려면 고유번호는 자동으로 계산 1,2,3,4,...1씩 자동증가
			// => 입력 받을 필요 X
			// 그 외의 이름, 전화번호, 메모는 입력
			if(inputMenuNum == 1) {
				System.out.println("<새 사용자 추가>");
				scan.nextLine(); //다음 입력 받을 준비
				
				System.out.println("이름 : ");
				String inputName = scan.nextLine(); // 문장 입력
				
				System.out.println("전화번호 : ");
				String inputPhone = scan.nextLine();
				
				System.out.println("메모 : ");
				String inputMemo = scan.nextLine();
				
				User tempUser = new User();
				tempUser.setName(inputName);
				tempUser.setPhoneNum(inputPhone);
				tempUser.setMemo(inputMemo);
				tempUser.setId(phoneBookUsers.size() + 1);
				// 고유번호   => 저장된 친구가 2명  : 3번
				//        => 아무도 없다면        : 1번
				
				// 배열을 반복 => 내용물 추출
				/*for(int i = 0; i < phoneBookUsers.length; i++) {
					User currentUser = phoneBookUsers[i];
					
					//만약 뽑아낸 사용자 변수가 null이라면 => tempUser가 이번 칸에 들어가야함
					
					//자동으로 고유 넘버를 찾아내는 로직
					if(currentUser == null) {
						tempUser.setId( i + 1 );
						// 데이터 세팅이 완료된 사용자를 배열에 저장
						phoneBookUsers[i] = tempUser;
						break;
					}
					
//					System.out.println("이름 : " + currentUser.getName());
				}*/
				
				//ArrayList의 크기를 찾아내서 몇명이 들어가 있는지 확인
				//들어가있는 명수 + 값으로 id를 세팅
				
				//ArrayList의 마지막 자리에 세팅이 끝난 user변수를 추가
				phoneBookUsers.add(tempUser);
				
				//배열에 저장한 tempUser를 파일로도 기록
				// => 껐다 킨다 하더라도 데이터가 보존
				FileWriter fw = null;
				BufferedWriter bw = null;
				
				try {
					
					//기본적으로 파일 작성의 경우, 모든 내용 덮어쓰기
					//기존의 내용에서 추가로 이어주고 싶음
					//new FileWriter("경로", true);
					fw = new FileWriter("phoneBook.csv", true);
					bw = new BufferedWriter(fw);
					
					String userWriteStr = tempUser.getId() + "," +
							tempUser.getName() + "," +
							tempUser.getPhoneNum() + "," +
							tempUser.getMemo();
					bw.write(userWriteStr);
					bw.newLine();
					
					bw.close();
					fw.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//입력되었음을 알림
				System.out.println("전화번호를 저장했습니다.");
			}
			else if (inputMenuNum == 2){
				
				phoneBookUsers.clear();//기존 저장된것 날림
				
				//파일에 저장되어 있는 사용자 정보를 불러와서 phoneBookUser에 모두 추가
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					fr = new FileReader("phoneBook.csv");
					br = new BufferedReader(fr);
					
					//한줄씩 읽는 내용을 저장할 변수.
					String str = null;
					
					//파일은 몇줄이 작성되어 있을지 알 수 없음
					//그러나 끝까지 반복 => while
					//readLine메쏘드는 더 읽을게 없다면 null 뱉음
					while((str = br.readLine()) != null) {
						//받아온 str => 1. 조경진, 폰번, 메모, 형태
						//이 str을 , 기준으로 분해 => 스트링배열
						String[] infos = str.split(",");
						User tempUser = new User();
						tempUser.setId(Integer.parseInt(infos[0]));
						tempUser.setName(infos[1]);
						tempUser.setPhoneNum(infos[2]);
						tempUser.setMemo(infos[3]);
						
						phoneBookUsers.add(tempUser);
					}
					br.close();
					fr.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//저장된 모든 사용자 정보를 출력
				for(int i = 0; i < phoneBookUsers.size(); i++) {
					User u = phoneBookUsers.get(i);
					System.out.println(u.getId() + "번째");
					System.out.println("이름 : " + u.getName());
					System.out.println("폰번 : " + u.getPhoneNum());
					System.out.println("※ 특이사항");
					System.out.println("- " + u.getMemo());
				}
			}
			else if (inputMenuNum == 0){
				System.out.println("프로그램을 정지합니다.");
				break;
			}
			else {
				System.out.println("잘못된 입력입니다.");
				// 1,2,0 모두가 아닌 경우 => 잘못된 입력
			}
		}
		
		
		
	}
	
}
