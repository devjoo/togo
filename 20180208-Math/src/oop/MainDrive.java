package oop;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		
		// ���밪. 5�� ���밪? 5 -5�� ���밪? 5
		// � ���� ��ȣ�� �����Ѱ�.
		
		//Q1. ���ڸ� �ϳ� �Է¹ް�, ���밪�� ����ϴ� ���α׷�.
		Scanner scan = new Scanner(System.in);
		System.out.println("���밪�� �˰���� ���ڸ� �Է� : ");
		int inputNum = scan.nextInt();
		
		int result = 0;
		
		//result�� �����ؼ� ���밪�� ���
		if(inputNum > 0) {
			result = inputNum;
		}else {
			result = inputNum * -1;
		}
		System.out.println("���밪 : " + result);
		
		//Math Ŭ������ ��üȭ�� ���� ���� �ʾƵ� ��� Ȱ�� ����.
		//Math �ڷ������� ��ٷ� ��� Ȱ�� ��Ŵ.
		//static �̹� Ȱ��.
		int absInputNum = Math.abs(inputNum);
		System.out.println("Math.abs(inputNum) : " + absInputNum);
		
		// 2. ceil => �ø�. floor => ������.
		
		// 3. pow(input, ����) => input�� ����ŭ ����.
		
		// Ex. 2�� 14��? ��?
		int result2 = (int) Math.pow(2, 14);
		System.out.println("2�� 14�� : " + result2);
		
		// !! ����. Math.random() => 0���� 1������ ������ �Ҽ��� ���.
		double d = Math.random();
		System.out.println(d);
		
		//�������� ����Ǿ���ϴ� ���� ��� ��ɿ� Ȱ��.
		
		
	}
}
