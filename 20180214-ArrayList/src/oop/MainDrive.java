package oop;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class MainDrive {
	public static void main(String[] args) {
		
		// ģ�� ����� �����ϱ� ���� 100ĭ¥�� �迭.
		User[] myFriends = new User[100];
		
		// ���� ģ���� 500�� => ģ����Ͽ� 500���� ����
		// ������ 100ĭ �ڿ� ���⶧���� 101��° ģ���� ������ �ϸ� ���� . �迭�� ���� ū ������
		/*for(int i = 0; i < 500; i++) {
			myFriends[i] = new User();
		}*/
		
		// ģ���� ������� �ɾ�� �𸣹Ƿ� ������ �������� ArrayList ����
		ArrayList<User> myFriendsList = new ArrayList<User>();
		
		for(int i = 0; i< 500; i++) {
			myFriendsList.add(new User());
		}
		
		int randomNum = (int) (Math.random()*100); 
		for(int i = 0; i < randomNum; i++) {
			
			// ����� �����ϰ� �̸��� ����
			User u = new User();
			u.name = "�����" + i;
			
			//������ �Ϸ�� ����ڸ� ģ���� ���
			myFriendsList.add(u);
		}
		
		// �� �տ� A��� ģ���� �����ֱ�
		User aUser = new User();
		aUser.name = "A";
		//0��° ĭ�� ���
		myFriendsList.add(0, aUser);
		
		//Q1. �� ģ���� �� ���? 
		//ArrayList�� ����մ� ������ ����? length
		
		System.out.println("�� ģ���� �� " + myFriendsList.size());
				
		//Q1. 501�� ĭ�� ����ִ� ģ���� �̸�?
		//-> ArrayList �ȿ� ����մ� �����͸� �޾ƿ��� ���? get(index)
		User tempUser = myFriendsList.get(0);
		System.out.println("�̸� : " + tempUser.name);
		
		User tempUser2 = myFriendsList.get(505);
		System.out.println("�̸� : " + tempUser2.name);
		
		//Q3. �� ���� ģ���� ����.
//		myFriendsList.remove(0);
		
		//Q4. ģ���� �����ϰ� �ʹ�. "������" ģ���� ����
		
		// �����ϰ� ���� ����� ������ ����.
		User removeUser = new User();
		removeUser.name = "A";
		
		// ������ ������ �Ϸ�� ����� �����ش޶�� ��û
//		myFriendsList.remove(removeUser);
		
		System.out.println("ù��° ģ���� �̸� : " + myFriendsList.get(0).name);
		// ã�� ������ �̸��� �ƴ϶� ������ �ȵǾ���. �̸����� ã�� ����������Ѵ�.
		
		// ���� ģ���� ã�´�? removeUser�� ���� ģ���� ������
		//removeUser �� ���ƾ� ������ -> equals()�� true�϶� ����
		
		//Object => equals �� �⺻������  "������"�� ������� ����. 
		//User�� Object�� ��ӹް� ����.
		
		
		//Q5. A�� ���� ���° ģ��?
		int indexOfA = myFriendsList.indexOf(removeUser);
		System.out.println(indexOfA + "�� ° ��");
		
		//���� indexOf()�� -1�� ���´ٸ� => ã�ƺô��� ������.
		
		
		//myFriendsList �� ������ �ϳ��ϳ� tempFriend�� �����鼭 �ݺ��� ������
		// ArrayList���� ��� ������ �ϳ��ϳ� ������ for��
		for(User tempFriend : myFriendsList) {
			System.out.println(tempFriend.name);
		}
		
		
		// HashMap ����.
		HashMap<String, Object> myInfo = new HashMap<String, Object>();
		
		myInfo.put("name", "������");
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.YEAR, 1988);
		myInfo.put("�������", birthday);
		myInfo.put("����", true);
		
		//�� �̸���?
		System.out.println(myInfo.get("name"));
		
	}
}