package opt;

public class MainDrive {
	public static void main(String[] args) {
		//  ������ �迭���� ������ �ϳ��� ���� ������ �迭
		//int[][] arr = new int[����][ȣ��];
		
		int[][] arr01 = {{1,2,3},{4,5},{6,7,8}};
		System.out.println(arr01[2][0]);
		
		int[][] arr05 = new int[3][1];
		//ù���� 10ĭ
		arr05[0] = new int[10];
		//��° ���� 5ĭ
		arr05[1] = new int[5];
		//3° ���� 1ĭ
		arr05[2] = new int[1];
	}
}
