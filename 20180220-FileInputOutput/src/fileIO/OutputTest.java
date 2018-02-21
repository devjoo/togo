package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputTest {

	public void testOutput() {
		//���� ���� ����� �ۼ�
		String inputStr = "������,841108,����,7����";
		String inputStr2 = "A�����,841108,����,7����";
		String inputStr3 = "B�����,841108,����,7����";
		
		//try�� �ȿ� �ֱ� ���ϰ� �Ϸ��� ���� ���� ���� null�� ó��
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//����� ������ �̸��� outputFile.txt�� ����
			//���� �߻�? => ���� ������ �����ϴٰ� ����ٴ���
			fw = new FileWriter("C:\\Users\\Administrator\\leejiwoo\\@temp\\outputFile.csv");
			//fw�� ���� ������ �����ϴ� ���� �����ϴ� bw
			//�����ϴ� ���� �����͸� ��Ƽ� �ѹ��� ���� => ���پ�
			//�̷��� ���� ������, �ѱ��� �ѱ��� ����.
			bw = new BufferedWriter(fw); // � ���϶����͸� ������ ������ ����
			
			//inputStr�� ����� ������ bw�� ����
			//bw => fw�� ���ؼ� outputFile.txt�� ����
			bw.write(inputStr);
			
			//������ �������� ������ �ٹٲ� => �����ٷ� �̵�
			bw.newLine();
			
			//���� �ٲٰ� ���� �ι�° ����ڸ� ���
			bw.write(inputStr2);
			
			//������ �������� ������ �ٹٲ� => �����ٷ� �̵�
			bw.newLine();
			
			//���� �ٲٰ� ���� �ι�° ����ڸ� ���
			bw.write(inputStr3);
			
			//������ �� ����ߴٸ�, fw�� bw�� �ݾ������.
			//���߿� �� ������ ���� �ݴ´�.
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("������ ����1�Ǿ����ϴ�.");
	}
	
	
}