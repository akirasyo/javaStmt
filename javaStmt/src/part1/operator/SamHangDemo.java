package part1.operator;

public class SamHangDemo {
	public static void main(String[] args) {
		int x = 1 , y = 0 , z = 0;
		boolean bool = true; // boolean �� �� ������
		z = bool ? x : y ;
		System.out.println("���׿����� ��� ��� : " + z);
		// bool �� true �� ��� x ���� 1 �� ���
		bool =  false;
		z = bool ? x : y ;
		System.out.println("���׿����� ��� ��� : " + z);
		// bool �� false �� ��� y ���� 0 �� ���
		//Q. ������ Ÿ�� flag �� 10 , ������ Ÿ�� flag2 �� 20 ,
		//	�־��� ���� () ? "flag �� flag2 ���� Ů�ϴ�" | "flag �� flag2 ���� �۽��ϴ�"
		// �϶� �� ���� ��� �ǵ��� �����Ͻÿ�.
		int flag = 10 , flag2 = 20 ;
		boolean bol = flag < flag2 ;
		String result = (bol) ? "flag �� flag2 ���� Ů�ϴ�" : "flag �� flag2 ���� �۽��ϴ�" ;
		/* ��°�(���ϰ�)�� �������̸� ������� �ش��ϴ� ���� Ÿ���� int �� �ְ�
		   ��°�(���ϰ�)�� ���ͷ��̸� ������� �ش��ϴ� ���� Ÿ���� String �̶�� �ش�
		 */
		System.out.println(result);
	}
}
