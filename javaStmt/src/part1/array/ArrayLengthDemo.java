package part1.array;

import java.util.Scanner;

public class ArrayLengthDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요");
		int sum = 0;
		int[] intArr =new int[3];
		for(int i=0;i<intArr.length;i++){	//가운데 리미트값 채우기
			intArr[i] = scanner.nextInt(); 	// 0 대신 입력값 할당 부분 완성해주세요.
		}
		for(int i=0;i<intArr.length;i++){	//가운데 리미트값 채우기
			sum += intArr[i];
		}
		scanner.close();
				System.out.println("입력받은 배열값의 합계는 " + sum + "입니다.");
	}
	
}
