package part1.test;

import java.util.Scanner;

public class ArrayMax {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("3���� ���ڸ� �Է��Ͻÿ�." + "\n�Էµ� ���ڵ� �� ���� ū ���� ��ȯ�մϴ�.");
		int[] intArr = new int[3];
		int max = 0;
		for(int i =0;i<intArr.length;i++){
			intArr[i]=scanner.nextInt();
			if(intArr[i]>max){
				max = intArr[i];
			}
		}
		scanner.close();
		System.out.println("�Էµ� ���ڵ��� ���� ū ���� " + max + "�Դϴ�.");
	}
}
