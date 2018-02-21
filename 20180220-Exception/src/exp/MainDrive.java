package exp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
 * ���ܰ� �߻��ϴ� ��ǥ���� ��Ȳ���� �ڵ�
 * �߻��� ���ܸ� ��� ó���ϴ��� ����
 */

public class MainDrive {

	public static void main(String[] args) {
		
		// Case 1. �迭�� ���� ĭ�� �����Ϸ� �ϴ� ���
		// ArrayIndexOutOfBoundsException
		
		// �ݻ�� ����� �ڵ��� �ϸ� �߻��� ���� ���� ���� ����
		
		// �迭 �ε����� ���� ���� ���� => �׷� ĭ ����.
		
		// ���� �߻� ���� : i�� 6�϶� lottoArray[6] ����.
		
		int[] lottoArray = new int[6];
		
		//���ܰ� �߻��� �� ������ �̸� �����ϰ� try�� ������
		//try�� ������ ������ �ݵ�� ���� ó���� �ؾ���
		//���� ó�� : ������ Exeption�� �߻��ϸ� ���? => catch
		try {
			//for(int i = 0; i < 10; i++) {
			for(int i = 0; i < 10; i++) {
				lottoArray[i] = i * 2;
				
				System.out.println(lottoArray[i]);
			}
		}
		catch(Exception e){
			// try ���� ���θ� �����ϴٰ� ������ �߻��������� ����.
			// ������ �߻��ϸ� ��� ��ó���� �˷���
			// => ���α׷��� ���� �ʰ� ���� �ڵ带 ���� �� �� �ְԵ�
			e.printStackTrace();
			System.out.println("�迭�� ���� �߻�!");
		}
		
		System.out.println("���� ��� �����ϴ�");
		
		
		
		/*
		 * Case2. �޸��忡�� �ۼ��� ���� �ҷ�����
		 * => �ƹ��͵� �ۼ����� ���� ���¿��� �ҷ�����
		 * ������ ã�� �� ���ٴ� ���� �߻�.
		 */
		// ���� ���ϸ� .txt�� [ã�Ƽ�] br�� ����.
		// => ã�Ƽ� : ���� ���� �ִ�
		// �׻� ������ ���� ���ɼ� => �׻� ���輺 ������ ��
		// ��Ŭ������ �����ϴٰ� �����ϰ� try �Ⱦ��� ���� �߻�
		try {
			BufferedReader br = new BufferedReader(new FileReader("���� ���ϸ�"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("������ ã�ƺý��ϴ�.");
		
		
		/*
		 *  Case3. ���ڸ� 0���� ������
		 *  => �������� �и� 0�̸� ����.
		 */
		//� ���� ���� ����� ������ �������� �Ϸ� �Ҷ�.
		//Ex. int result = a / ( b - c )
		//    b - c�� ��Ȳ�� ���� 0�ϼ��� �ƴҼ��� �ִ�.
		try {
			int c = 4 / 0;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("���ڸ� �����µ� ���� �߻�!");
		}
		
		/*
		 * Case2. : ��ȭ
		 */
		//�޸��� ������ �����Ϸ��� �ϴ� ��� => ������ ��ã�� ����
		// => Ex. ã�� ã�Ҵµ�, ������ ���� �� ���� ���
		// 1���� try���� �ΰ��� ���輺 => catch�� �ΰ�
		try {
			BufferedReader br2 = new BufferedReader(new FileReader("�������ϸ�.txt"));
			br2.readLine(); //ã�Ƴ� ������ ���� �б�
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������ ������");
//			e.printStackTrace();
		}
		
		// e.printStackTrace() : catch���� ��Ŭ������ �ڵ����� ������ָ� �ڵ����� �ۼ��Ǵ� �ڵ�
		// ���� : ������ ������ �ֿܼ� ���� �۾��� ���
		// ������ ����? => ���� �۾��� �ڼ��� ���� � ������ �������� ��ڵ带 �����ϴٰ�
		// �߻��� ���������� �˷��� => �ٷ� ������ �Ǵ� �ڵ带 Ž��
		
		Test t1 = new Test();
		
		try {
			t1.PrintNickname("fool �ӽôг���");
		} catch (FoolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}