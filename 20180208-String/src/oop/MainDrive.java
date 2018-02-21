package oop;

public class MainDrive {
	public static void main(String[] args) {
		
		// str01에 담겨있는  hellow World!!를 전부 대문자로 변환.
		// for문 => charAt => 소문자 => 대문자?
		String str01 = "hellow World!!";
		
		String upperStr01 = str01.toUpperCase();
		System.out.println(upperStr01);
		String lowerStr01 = str01.toLowerCase();
		System.out.println(lowerStr01);
		
		//사용자 정보를 공통된 양식의 String으로 전달받음.
		//첫 사람의 이름?
		//두번째 사람의 키는 얼마?
		String userInfo = "조경진/881020/180/80";
		String userInfo2 = "김성현/901122/170/70";
		
		String[] infos01 = userInfo.split("/");
		System.out.println(infos01[0]);
		
		//String쪼개는거 진짜 자주쓴다.
		String[] infos02 = userInfo2.split("/");
		System.out.println(infos02[0]);
		
		// http://www.naver.com
		// http://www.daum.net
		// http://www.google.com
		
		// 두번째 사이트는 어디? 다음.
		String url = "http://www.daum.net";
		String[] urls = url.split("://");
		
		System.out.println(urls[1]);
		
		
		
	}
}
