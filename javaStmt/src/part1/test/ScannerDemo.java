package part1.test;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// 스캐너 클래스의 객체인 scanner 를 생성
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int a = scanner.nextInt();
		System.out.println("입력하신 숫자는 " + a + "입니다."); */
		
		//Q. for문으로 입력된 값 만큼의 합을 구하는 연산식을 구현하시오
		System.out.println("수를 입력하시오");
		Scanner scanner = new Scanner(System.in);
		int scan = scanner.nextInt();
		int sum =0 ;
		for(int i = 0;i<=scan;i++){
			sum += i ;
		}
		scanner.close();
		System.out.println(scan + "까지의 합은" + sum );
	}
}
