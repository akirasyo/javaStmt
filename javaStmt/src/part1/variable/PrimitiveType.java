package part1.variable;
/*
 �⺻�� Ÿ�� 8 ����
 1. ���� (1 byte) = true, false ����
 	boolean - 1byte
 2. ����Ʈ (1 byte) = ����� ����
 	byte - 1byte
 3. ���� ( 2byte)
 	char - 2byte
 4. ���� (2,4,8 byte)
 	short - 2byte
 	int - 4byte
 	long - 8byte
 5. �Ǽ� (4,8 byte)
 	float - 4byte
 	double - 8byte
 */
public class PrimitiveType {
	public static void main(String[] args) {
		/*
		 * // ���� 1����Ʈ, �ʱⰪ : false;
		boolean result = true;
		// ������ char : 2����Ʈ , �ʱⰪ = \u0000 , \ = ��������
		char c = 'C'; // ���ĺ� �ѱ��ڸ� ��Ÿ���� ��ҹ��ڸ� �����Ѵ�. ����!! - �̱����͸� ���
		// ������
		byte varByte = 100;  //8��Ʈ
		short varShort = 10000; //16��Ʈ
		int varInt = 100000000; //32��Ʈ
		long varLong = 100L; 	//64��Ʈ	  ���ڰ� �ڿ� L�� ǥ����. �ٸ� l ���� L�� ��õ
		//�Ǽ��� = �ε��Ҽ��� Ÿ��
		float varFloat = 100.00f ;  // 32��Ʈ ���ڰ� �ڿ� f or F �� ǥ����.
		double varDouble = 100.00d; //64��Ʈ  ���ڰ� �ڿ� d or D �� ǥ����.
		//1����Ʈ = 8��Ʈ , 1��Ʈ = ���� 0 �� 1�� �̷����
		// �޸� �뷮�� �þ ������ boolean, int, double ��� 
		*/
		// Q. 3.14�� �ֿܼ� ���
		double d = 3.14d;
		System.out.println("3.14�� ����� �� : " + d);
	}
}
