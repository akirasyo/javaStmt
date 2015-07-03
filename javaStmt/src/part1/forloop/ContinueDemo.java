package part1.forloop;

import java.util.Scanner;

/* 6.15
 * story : 1부터 입력값 사이의 짝수의 합을 구하는 프로그램
 * 			continue 기능 연습예제
 */
public class ContinueDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 합산하고자 하는 범위의 값을 입력하시오");
		System.out.println("짝수만 합산 됩니다.");
		int num = 0 , sum = 0 ; // 지역변수는 반드시 초기화
		num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i%2 == 1) {	//홀수
				continue; // 더하지 않고 다음으로 이동
			} else {
				sum += i ;
			}
		}
		scanner.close();
		System.out.println("입력하신 숫자 " + num + "까지의 짝수의 합 : " + sum);
	}
}
