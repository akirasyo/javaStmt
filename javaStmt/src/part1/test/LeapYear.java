package part1.test;
/* Date : 6월16일
 * Author : 구로
 * Story : 입력받는 년도를 보고 윤년인지 아닌지를 판별하는 판독 프로그램
 */
import java.util.Scanner;
public class LeapYear {
		public static void main(String[] args) {
			/* 연도를 4로 나눈 값이 0 이면 윤녀일수 있다.
			 * 그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
			 * 평년이라 해도 다시 400 으로 나누어 지는 연도는 윤년이다.
			 */
			System.out.println("알고자 하는 년도를 입력하시오");
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			scanner.close();
			String msg = "";
			if (a%400==0) { //필터링 if문에서 차례대로 연산식을 거쳐 참 거짓을 판별하면서 하부로 값을 전달하는 행위
								//필터링 방식은 결과값을 크게 주는 범위부터 작은 방향으로 진행.
				msg = "윤년입니다.";
			}else if (a%100 == 0) {
				msg = "평년입니다.";
			}else if (a%4 == 0) {
				msg = "윤년입니다.";
			}else{
				msg = "평년입니다.";
			}
			System.out.println(msg);
		}
}