package part1.test;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// ��ĳ�� Ŭ������ ��ü�� scanner �� ����
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");
		int a = scanner.nextInt();
		System.out.println("�Է��Ͻ� ���ڴ� " + a + "�Դϴ�."); */
		
		//Q. for������ �Էµ� �� ��ŭ�� ���� ���ϴ� ������� �����Ͻÿ�
		System.out.println("���� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		int scan = scanner.nextInt();
		int sum =0 ;
		for(int i = 0;i<=scan;i++){
			sum += i ;
		}
		scanner.close();
		System.out.println(scan + "������ ����" + sum );
	}
}
