package part1.test;

import java.util.Scanner;

public class GugudanScanner {
	public static void main(String[] args) {
		System.out.println("����ϰ� ���� ���� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);  // ��ĳ�� ȣ��
		int dan = scanner.nextInt();
		scanner.close();
		if(dan>1){
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
			}
		}else{
			System.out.println("1�̻��� �������� �Է��ϼ���");
		}
		
		
	}
}
