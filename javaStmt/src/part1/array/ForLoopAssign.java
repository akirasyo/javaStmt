package part1.array;

import java.util.Scanner;
//1~10������ ��
public class ForLoopAssign {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] intArr = new int[10];
		int sum = 0;
		for(int i = 0 ; i<intArr.length;i++){
			// �Ʒ��� ?�� ���� �־�� for �� �ε��� ���� Ȱ���� ���� ���� ���� �� �ֳ���?
			intArr[i] = i+1 ; // ���� ������ �ּ�ȭ �Ϸ��� ����� ��ȯ
			sum += intArr[i] ;
		}
		scanner.close();
		System.out.println(sum);
	}
}
/*	���� �迭 ���� ���
	intArr[0] = 1 ;
	intArr[1] = 2 ;
	....
	intArr[9] = 10;
*/