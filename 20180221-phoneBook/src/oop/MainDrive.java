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
		
//		User[] phoneBookUsers = new User[10]; //����� ����� ������ ����� �迭 10ĭ ���� ����
		ArrayList<User> phoneBookUsers = new ArrayList<User>();
		
		//=== �޴� �Է�===
		
		int inputMenuNum = -1; //�ƹ��͵� �Էµ��� ���� ����
		Scanner scan = new Scanner(System.in);
		
		//Ư�� ��Ȳ (0�� �Է�)�� �ɶ����� ������ �ݺ�
		//���� �ݺ��� �ϴ� �ɰ�, 0�� �ԷµǸ� Ż��
		//=> while �ݺ��� Ż�� => break;
		while(true) {
			//Q1. �޴��� ����ϰ�, �������� �Է¹޾� �߸��� �Է��� ��쿡 ���� ��ó.
			//	  => �ٽ� �޴��� ���, ���Է� (�ٽ� => �ݺ� �Է�)
			
			//Q2.  0 ���� ������ ���α׷��� ����.
			System.out.println("�޴� ����");
			System.out.println("1. ��ȭ��ȣ �߰�");
			System.out.println("2. ��ü ��ȸ");
			System.out.println("0. ���α׷� ����");
			System.out.println("--------------------");
			System.out.println("��ȣ �Է� : ");
			
			//�޴� ����� ��ģ �Ŀ� ���� �Է�
			inputMenuNum = scan.nextInt();
			
			//Q3. ��ȭ��ȣ�� �߰��Ϸ��� ������ȣ�� �ڵ����� ��� 1,2,3,4,...1�� �ڵ�����
			// => �Է� ���� �ʿ� X
			// �� ���� �̸�, ��ȭ��ȣ, �޸�� �Է�
			if(inputMenuNum == 1) {
				System.out.println("<�� ����� �߰�>");
				scan.nextLine(); //���� �Է� ���� �غ�
				
				System.out.println("�̸� : ");
				String inputName = scan.nextLine(); // ���� �Է�
				
				System.out.println("��ȭ��ȣ : ");
				String inputPhone = scan.nextLine();
				
				System.out.println("�޸� : ");
				String inputMemo = scan.nextLine();
				
				User tempUser = new User();
				tempUser.setName(inputName);
				tempUser.setPhoneNum(inputPhone);
				tempUser.setMemo(inputMemo);
				tempUser.setId(phoneBookUsers.size() + 1);
				// ������ȣ   => ����� ģ���� 2��  : 3��
				//        => �ƹ��� ���ٸ�        : 1��
				
				// �迭�� �ݺ� => ���빰 ����
				/*for(int i = 0; i < phoneBookUsers.length; i++) {
					User currentUser = phoneBookUsers[i];
					
					//���� �̾Ƴ� ����� ������ null�̶�� => tempUser�� �̹� ĭ�� ������
					
					//�ڵ����� ���� �ѹ��� ã�Ƴ��� ����
					if(currentUser == null) {
						tempUser.setId( i + 1 );
						// ������ ������ �Ϸ�� ����ڸ� �迭�� ����
						phoneBookUsers[i] = tempUser;
						break;
					}
					
//					System.out.println("�̸� : " + currentUser.getName());
				}*/
				
				//ArrayList�� ũ�⸦ ã�Ƴ��� ����� �� �ִ��� Ȯ��
				//���ִ� ���� + ������ id�� ����
				
				//ArrayList�� ������ �ڸ��� ������ ���� user������ �߰�
				phoneBookUsers.add(tempUser);
				
				//�迭�� ������ tempUser�� ���Ϸε� ���
				// => ���� Ų�� �ϴ��� �����Ͱ� ����
				FileWriter fw = null;
				BufferedWriter bw = null;
				
				try {
					
					//�⺻������ ���� �ۼ��� ���, ��� ���� �����
					//������ ���뿡�� �߰��� �̾��ְ� ����
					//new FileWriter("���", true);
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
				
				
				//�ԷµǾ����� �˸�
				System.out.println("��ȭ��ȣ�� �����߽��ϴ�.");
			}
			else if (inputMenuNum == 2){
				
				phoneBookUsers.clear();//���� ����Ȱ� ����
				
				//���Ͽ� ����Ǿ� �ִ� ����� ������ �ҷ��ͼ� phoneBookUser�� ��� �߰�
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					fr = new FileReader("phoneBook.csv");
					br = new BufferedReader(fr);
					
					//���پ� �д� ������ ������ ����.
					String str = null;
					
					//������ ������ �ۼ��Ǿ� ������ �� �� ����
					//�׷��� ������ �ݺ� => while
					//readLine�޽��� �� ������ ���ٸ� null ����
					while((str = br.readLine()) != null) {
						//�޾ƿ� str => 1. ������, ����, �޸�, ����
						//�� str�� , �������� ���� => ��Ʈ���迭
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
				
				//����� ��� ����� ������ ���
				for(int i = 0; i < phoneBookUsers.size(); i++) {
					User u = phoneBookUsers.get(i);
					System.out.println(u.getId() + "��°");
					System.out.println("�̸� : " + u.getName());
					System.out.println("���� : " + u.getPhoneNum());
					System.out.println("�� Ư�̻���");
					System.out.println("- " + u.getMemo());
				}
			}
			else if (inputMenuNum == 0){
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
				// 1,2,0 ��ΰ� �ƴ� ��� => �߸��� �Է�
			}
		}
		
		
		
	}
	
}