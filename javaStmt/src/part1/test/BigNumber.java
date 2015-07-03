package part1.test;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("A의 값을 입력하시오 : ");
		// A 값을 입력받는 로직
		int a = scan.nextInt();
		System.out.print("B의 값을 입력하시오 : ");
		// B 값을 입력받는 로직
		int b = scan.nextInt();
		System.out.print("C의 값을 입력하시오 : ");
		// C 값을 입력받는 로직
		int c = scan.nextInt();
		scan.close();
		if(a>b && a>c){
			System.out.println("가장 큰 수는 A 값인 "+ a + " 입니다.");
		} else if (a<b && b>c){
			System.out.println("가장 큰 수는 B 값인 "+ b + " 입니다.");
		}
		else {
			System.out.println("가장 큰 수는 C 값인 "+ c + " 입니다.");
		}
	}
}
