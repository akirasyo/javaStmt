package part1.forloop;

import java.util.Scanner;

/* 6.15
 * story : 1���� �Է°� ������ ¦���� ���� ���ϴ� ���α׷�
 * 			continue ��� ��������
 */
public class ContinueDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1���� �ջ��ϰ��� �ϴ� ������ ���� �Է��Ͻÿ�");
		System.out.println("¦���� �ջ� �˴ϴ�.");
		int num = 0 , sum = 0 ; // ���������� �ݵ�� �ʱ�ȭ
		num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i%2 == 1) {	//Ȧ��
				continue; // ������ �ʰ� �������� �̵�
			} else {
				sum += i ;
			}
		}
		scanner.close();
		System.out.println("�Է��Ͻ� ���� " + num + "������ ¦���� �� : " + sum);
	}
}
