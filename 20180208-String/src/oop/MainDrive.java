package oop;

public class MainDrive {
	public static void main(String[] args) {
		
		// str01�� ����ִ�  hellow World!!�� ���� �빮�ڷ� ��ȯ.
		// for�� => charAt => �ҹ��� => �빮��?
		String str01 = "hellow World!!";
		
		String upperStr01 = str01.toUpperCase();
		System.out.println(upperStr01);
		String lowerStr01 = str01.toLowerCase();
		System.out.println(lowerStr01);
		
		//����� ������ ����� ����� String���� ���޹���.
		//ù ����� �̸�?
		//�ι�° ����� Ű�� ��?
		String userInfo = "������/881020/180/80";
		String userInfo2 = "�輺��/901122/170/70";
		
		String[] infos01 = userInfo.split("/");
		System.out.println(infos01[0]);
		
		//String�ɰ��°� ��¥ ���־���.
		String[] infos02 = userInfo2.split("/");
		System.out.println(infos02[0]);
		
		// http://www.naver.com
		// http://www.daum.net
		// http://www.google.com
		
		// �ι�° ����Ʈ�� ���? ����.
		String url = "http://www.daum.net";
		String[] urls = url.split("://");
		
		System.out.println(urls[1]);
		
		
		
	}
}
