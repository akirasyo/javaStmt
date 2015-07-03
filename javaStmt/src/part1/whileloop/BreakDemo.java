package part1.whileloop;

import java.util.Scanner;

/* @ 6.15
 * @Story : 더하려는 숫자를 입력후 브레이크 기능을 두는 구문
 */
public class BreakDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("더하려는 정수값을 입력하세요");
		// 지금까지는 결정된 숫자의 카운트 값 만큼만 입력했는데
		// 이제부터는 동적으로 스톱기능을 부여합니다.
		System.out.println("멈추시려면 -1을 입력하세요");
		int num = 0, sum =0 ;
		while (true) { // while 문에서 condition 에 true 라고 주면, 무한루프 구문이 된다.
			num = scanner.nextInt();
			if (num == -1 ) {
				break; // -1 이 입력되면 반복을 종료한다.
			}
			sum += num ;
		}
		scanner.close();
		System.out.println(sum);
	}
}
