package exp;

/* ȸ�����Խ� �г����� �ٷ�� Ŭ����
 * �������� : fool�̶� �ܾ ���� �ȵ�
 */

public class Test {
	
	//ȭ�鿡 �г����� ���
	//���࿡ fool�̶�� �ܾ ���ԵǾ� �ִٸ�
	//�ڵ带 �ۼ��Ҷ� ���ʿ� �����ؼ� try / catch�� ��������Ѵ�
	//��� ����� ����
	public void PrintNickname(String inputNick) throws FoolException{
		
		if(inputNick.contains("fool")) {
			throw new FoolException();
		}
		//���� if���� �ɸ��ٸ�, throw���� �����Ƿ�
		//�� syso���� ������� ���� => throw���� �޽�尡 ����
		//throw�� ��ġ return�� ����� ������ ��.
		System.out.println("�� : " + inputNick);

	}
}