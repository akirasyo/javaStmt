package part1.test;

import java.util.Scanner;

public class GugudanScanner {
	public static void main(String[] args) {
		System.out.println("출력하고 싶은 단을 입력하세요");
		Scanner scanner = new Scanner(System.in);  // 스캐너 호출
		int dan = scanner.nextInt();
		scanner.close();
		if(dan>1){
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
			}
		}else{
			System.out.println("1이상의 정수값을 입력하세요");
		}
		
		
	}
}
