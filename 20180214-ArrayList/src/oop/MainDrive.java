package oop;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class MainDrive {
	public static void main(String[] args) {
		
		// 친구 목록을 저장하기 위한 100칸짜리 배열.
		User[] myFriends = new User[100];
		
		// 실제 친구는 500명 => 친구목록에 500명을 삽입
		// 공간이 100칸 박에 없기때문에 101번째 친구를 넣으려 하면 에러 . 배열의 제일 큰 문제점
		/*for(int i = 0; i < 500; i++) {
			myFriends[i] = new User();
		}*/
		
		// 친구가 몇명까지 능어날지 모르므로 공간이 무제한인 ArrayList 생성
		ArrayList<User> myFriendsList = new ArrayList<User>();
		
		for(int i = 0; i< 500; i++) {
			myFriendsList.add(new User());
		}
		
		int randomNum = (int) (Math.random()*100); 
		for(int i = 0; i < randomNum; i++) {
			
			// 사용자 생성하고 이름을 설정
			User u = new User();
			u.name = "사용자" + i;
			
			//설정이 완료된 사용자를 친구로 등록
			myFriendsList.add(u);
		}
		
		// 맨 앞에 A라는 친구를 끼워넣기
		User aUser = new User();
		aUser.name = "A";
		//0번째 칸에 등록
		myFriendsList.add(0, aUser);
		
		//Q1. 내 친구는 총 몇명? 
		//ArrayList에 들어잇는 데이터 개수? length
		
		System.out.println("내 친구는 총 " + myFriendsList.size());
				
		//Q1. 501번 칸에 들어있는 친구의 이름?
		//-> ArrayList 안에 들어잇는 데이터를 받아오는 방법? get(index)
		User tempUser = myFriendsList.get(0);
		System.out.println("이름 : " + tempUser.name);
		
		User tempUser2 = myFriendsList.get(505);
		System.out.println("이름 : " + tempUser2.name);
		
		//Q3. 맨 앞의 친구를 삭제.
//		myFriendsList.remove(0);
		
		//Q4. 친구를 삭제하고 싶다. "조경진" 친구를 삭제
		
		// 삭제하고 싶은 사람이 누군지 명시.
		User removeUser = new User();
		removeUser.name = "A";
		
		// 데이터 세팅이 완료된 사람을 삭제해달라고 요청
//		myFriendsList.remove(removeUser);
		
		System.out.println("첫번째 친구의 이름 : " + myFriendsList.get(0).name);
		// 찾는 기준이 이름이 아니라 삭제가 안되었음. 이름으로 찾게 설정해줘야한다.
		
		// 지울 친구를 찾는다? removeUser와 같은 친구가 누군지
		//removeUser 와 같아야 지워짐 -> equals()가 true일때 삭제
		
		//Object => equals 는 기본적으로  "포인터"를 기반으로 동작. 
		//User는 Object를 상속받고 잇음.
		
		
		//Q5. A는 나의 몇번째 친구?
		int indexOfA = myFriendsList.indexOf(removeUser);
		System.out.println(indexOfA + "번 째 임");
		
		//만약 indexOf()가 -1로 나온다면 => 찾아봤더니 없더라.
		
		
		//myFriendsList 의 내용을 하나하나 tempFriend에 담으면서 반복을 돌아줌
		// ArrayList에서 모든 내용을 하나하나 빼보는 for문
		for(User tempFriend : myFriendsList) {
			System.out.println(tempFriend.name);
		}
		
		
		// HashMap 예시.
		HashMap<String, Object> myInfo = new HashMap<String, Object>();
		
		myInfo.put("name", "조경진");
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.YEAR, 1988);
		myInfo.put("생년월일", birthday);
		myInfo.put("성별", true);
		
		//내 이름은?
		System.out.println(myInfo.get("name"));
		
	}
}
