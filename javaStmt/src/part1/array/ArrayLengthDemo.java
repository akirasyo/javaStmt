package part1.array;

import java.util.Scanner;

public class ArrayLengthDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3���� ���ڸ� �Է��ϼ���");
		int sum = 0;
		int[] intArr =new int[3];
		for(int i=0;i<intArr.length;i++){	//��� ����Ʈ�� ä���
			intArr[i] = scanner.nextInt(); 	// 0 ��� �Է°� �Ҵ� �κ� �ϼ����ּ���.
		}
		for(int i=0;i<intArr.length;i++){	//��� ����Ʈ�� ä���
			sum += intArr[i];
		}
		scanner.close();
				System.out.println("�Է¹��� �迭���� �հ�� " + sum + "�Դϴ�.");
	}
	
}
