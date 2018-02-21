package opt;

public class MainDrive {
	public static void main(String[] args) {
		
		// 25칸짜리 2차원(5x5)배열 생성.
		int[][] arr = new int[5][5];
		
		//arr[0][0] = 1;
		//arr[0][1] = 2;
		//arr[0][2] = 3;
		//arr[0][3] = 4;
		//arr[0][4] = 5;
		
		//arr[0][0] = 1;
		//arr[1][0] = 6;
		//arr[2][0] = 11;
		//arr[3][0] = 16;
		//arr[4][0] = 21;
		
		for(int i=0; i < 5; i++) {
			for(int j = 0; j<5; j++) {
				arr[i][j] = (5*i) + (j+1);
			}
		}
		
		for(int i=0; i < 5; i++) {
			for(int j = 0; j<5; j++) {
				//format 괄호 내부 => "%3d" : 어떤 숫자를 세칸으로
				//format 괄호 내부 => arr[i][j] 
				String s = String.format("%3d", arr[i][j]);
				System.out.print(s);
			}
			System.out.println("");
		}
		
		
		int[][] arr2 = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j< 5; j++) {
				arr2[i][j] = (j*5) + (i+1);
			}
		}
		
		for(int i=0; i < 5; i++) {
			for(int j = 0; j<5; j++) {
				//format 괄호 내부 => "%3d" : 어떤 숫자를 세칸으로
				//format 괄호 내부 => arr2[i][j] 
				String k = String.format("%3d", arr2[i][j]);
				System.out.print(k);
			}
			System.out.println("");
		}
		
	}
}
