package part1.test;

import java.util.Scanner;

public class GetTime {
	public static void main(String[] args) {
		/*
		int time = 5000; // ��
		int second = 0 , minute = 0 , hour = 0 ;
		second = time % 60; // 500�� 60���� ���� �������� ��
		minute = (time/60) % 60 ; // 500�ʸ� 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		hour = ((time/60)/60) % 60 ;
		System.out.println(hour + "��" + minute + "��" + second + "��");
		 */
		System.out.println("����ϰ� ���� �ʸ� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		long time = scanner.nextLong();
		//int time = 5000; // ��
		long second = 0 , minute = 0 , hour = 0 ;
		second = time % 60; // 500�� 60���� ���� �������� ��
		minute = (time/60) % 60 ; // 500�ʸ� 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		hour = (time/60)/60 ;
		scanner.close();
		System.out.println(hour + "��" + minute + "��" + second + "��");
	}
}
