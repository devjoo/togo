package opt;

public class MainDrive {
	public static void main(String[] args) {
		//  기존의 배열들을 묶어준 하나의 상위 개념의 배열
		//int[][] arr = new int[동수][호수];
		
		int[][] arr01 = {{1,2,3},{4,5},{6,7,8}};
		System.out.println(arr01[2][0]);
		
		int[][] arr05 = new int[3][1];
		//첫동은 10칸
		arr05[0] = new int[10];
		//둘째 동은 5칸
		arr05[1] = new int[5];
		//3째 동은 1칸
		arr05[2] = new int[1];
	}
}
