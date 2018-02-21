package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputTest {

	//����� ������ �ҷ�����
	//�ҷ��� ������ ȭ�鿡 ���
	public void testInput() {
		
		//�����Է� ����������
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			//������ ����� ������ ã�ƿ�
			fr = new FileReader("C:\\Users\\Administrator\\leejiwoo\\@temp\\outputFile.csv");
			//ã�ƿ� ������ �д°� ����.
			br = new BufferedReader(fr);
			
			//�о�� ���� ������ ���� str
			String str = null;
			//ã�Ƴ� ������ ������ ���������� �˼� ����
			//������ �������� => �ݺ� : while�� �̿��� �ݺ�
			
			//while�� ���鼭 br�� ���� �о ������ �ٷ� str�� ����
			//�߰��� ����� str�� null���� �ƴ��� Ȯ��
			// => ������ �� �о �� ���� ������ ���ٸ�str�� nullwjwkd
			// => str�� null�̶�� ������ �� �о���
			// �� br�� ��� ������ ������ ���� => ���� ���� str�� ����
			while((str = br.readLine()) != null) {
//				System.out.println(str);
				String[] infoArray = str.split(",");
				
				System.out.println("�̸� : " + infoArray[0] + ", �ź� : " + infoArray[3]);
			}
			//������ ���ϵ��� �ݵ�� �ݾƾ�
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}
}