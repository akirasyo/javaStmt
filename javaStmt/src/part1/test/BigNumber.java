package part1.test;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("A�� ���� �Է��Ͻÿ� : ");
		// A ���� �Է¹޴� ����
		int a = scan.nextInt();
		System.out.print("B�� ���� �Է��Ͻÿ� : ");
		// B ���� �Է¹޴� ����
		int b = scan.nextInt();
		System.out.print("C�� ���� �Է��Ͻÿ� : ");
		// C ���� �Է¹޴� ����
		int c = scan.nextInt();
		scan.close();
		if(a>b && a>c){
			System.out.println("���� ū ���� A ���� "+ a + " �Դϴ�.");
		} else if (a<b && b>c){
			System.out.println("���� ū ���� B ���� "+ b + " �Դϴ�.");
		}
		else {
			System.out.println("���� ū ���� C ���� "+ c + " �Դϴ�.");
		}
	}
}
